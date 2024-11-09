/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mikegrep.easypos.DataProvider;

import com.mikegrep.easypos.Models.Order;
import com.mikegrep.easypos.Models.OrderProduct;
import com.mikegrep.easypos.Models.Product;
import com.mikegrep.easypos.Models.User;
import com.mikegrep.easypos.Models.User.UserType;
import com.github.anastaciocintra.output.PrinterOutputStream;
import com.github.anastaciocintra.output.TcpIpOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;

public class DataProvider {
    
    //Users and products
    public ArrayList<Product> productsList;
    public ArrayList<User> usersList;
    public ArrayList<Order> orderList = new ArrayList();
    public ArrayList<OrderProduct> tempSells;
    //All Sales Database
    public ArrayList<OrderProduct> allSalesDataBase;
    //Mail
    public String [] smtpData;
    //public boolean isSalseCalculated = false;

    public Order currentOrderProvider;
    public User currentUser;
    
    public Map<String, String> currencySigns;
    
    //Printer
    //normal printer
    public String printerName = "";
    public PrintService printService;
    // tcp ip printer
    public String tcpHost;
    public int tcpPort;
    //public TcpIpOutputStream tcpOutputStream;
    public String configuredPrinter;

    //h2 databse
    public Statement st;
    public Connection conn;
    public ResultSet rset;
    public PreparedStatement stmt;
    
    // General
    public String businessName;
    public String businessAddress;
    public String currency;

    //Charts
    public Map<String, Double> dailyValues;
    public Map<Double, String> monthlyValues;

    //Invoice
    public int count;
    
    public void createDatabase() throws SQLException {
        productsList = new ArrayList();
        usersList = new ArrayList();
        configuredPrinter = "";
        currency = "";
        smtpData = new String[5];
        allSalesDataBase = new ArrayList();
        tempSells = new ArrayList();
        dailyValues = new HashMap<>();
        monthlyValues = new HashMap<>();


        conn = DriverManager.getConnection("jdbc:h2:~/data/eposdb");
        st = conn.createStatement();
        
//        st.execute("DROP TABLE IF EXISTS products");
//        st.execute("DROP TABLE IF EXISTS users");
//        st.execute("DROP TABLE IF EXISTS smtp_data");
//        st.execute("DROP TABLE IF EXISTS normal_printer");
//        st.execute("DROP TABLE IF EXISTS tcpip_printer");
//        st.execute("DROP TABLE IF EXISTS general");
//        st.execute("DROP TABLE IF EXISTS daily_summary");
//        st.execute("DROP TABLE IF EXISTS monthly_summary");


        try {
            //Load product
            rset = st.executeQuery("select * from products");

            while (rset.next()) {
                productsList.add(new Product(rset.getString(2), rset.getString(3), (rset.getInt(4)), rset.getDouble(5)));
            }

            //Load users
            rset = st.executeQuery("select * from users");
            while (rset.next()) {
                UserType type = null;
                if (rset.getString(4).equals("Manager")) {
                    type = UserType.Manager;
                } else if (rset.getString(4).equals("Employee")) {
                    type = UserType.Employee;
                }
                usersList.add(new User(rset.getString(2), rset.getString(3), type));
            }

            //Load smtp settings
            rset = st.executeQuery("select * from smtp_data");
            while (rset.next()) {
                System.out.println(rset.getString(2));
                smtpData[0] = rset.getString(2);
                smtpData[1] = rset.getString(3);
                smtpData[2] = rset.getString(4);
                smtpData[3] = rset.getString(5);
                smtpData[4] = rset.getString(6);
            }

            // Load printer settings
            try{
                rset = st.executeQuery("SELECT * FROM normal_printer");
                rset.next();
                if(rset.getBoolean(3) == true) {
                    configuredPrinter = "normalPrinter";
                    printerName = rset.getString(2);
                    printService = PrinterOutputStream.getPrintServiceByName(printerName);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            try{
                rset = st.executeQuery("SELECT * FROM tcpip_printer");
                rset.next();
                if(rset.getBoolean(3) == true) {
                    configuredPrinter = "tcpIp";
                    tcpHost = rset.getString(2);
                    tcpPort = rset.getInt(3);
                }
            }catch (Exception e) {
                System.out.println(e);
            }

            // Load general setting
            try{
                rset = st.executeQuery("select * from general");
                while (rset.next()) {
                    businessName = rset.getString(2);
                    businessAddress = rset.getString(3);
                    currency = rset.getString(4);
                }
            } catch(Exception e) {
                System.out.println(e);
            }

            //Load charts
            // Weekly chart
            rset = st.executeQuery("select * from daily_summary");
            while(rset.next()){
               Double daylyAmount = rset.getDouble(2);
               String daysSumaryDay = rset.getString(3);
               dailyValues.put(daysSumaryDay, daylyAmount);
            }
            //Monthly Chart

            String[] months = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
            rset = st.executeQuery("select * from monthly_summary WHERE `year` = YEAR(CURRENT_DATE)");
            while(rset.next()){
                Double monthlyAmount = rset.getDouble(2);
                int n = rset.getInt(3);
                String month = months[n -1];
                monthlyValues.put(monthlyAmount, month);
            }



        } catch (Exception e) {
            System.out.println(e);
            st.execute("create table if not exists users(id int primary key auto_increment, username varchar(50) not null, password_code varchar(50) not null, user_type varchar(20) not null, unique (username)) ");
            System.out.println("table users created");
            st.execute("create table if not exists products(id int primary key auto_increment, product_code varchar(100) not null, product_name varchar(100) not null, product_qty int not null, product_price double)");
            System.out.println("table products created");
            st.execute("create table if not exists smtp_data(id int primary key auto_increment, smtp_server varchar(100) not null, smtp_username varchar(100) not null, smtp_password varchar(100) not null, smtp_from varchar(100) not null, smtp_to varchar(100) not null )");
            System.out.println("table smtp_data created");
            st.execute("create table if not exists normal_printer(id int primary key auto_increment, printer_name varchar(255) not null, status boolean)");
            System.out.println("table normal_printer created");
            st.execute("create table if not exists tcpip_printer(id int primary key auto_increment, host varchar(255) not null, port int not null, status boolean)");
            System.out.println("table tcpip_printer created");
            st.execute("create table if not exists general(id int primary key auto_increment, business_name varchar(255) not null, business_address varchar(255) not null, currency varchar(255))");
            System.out.println("table tcpip_printer  general");
            st.execute("create table if not exists daily_summary(id int primary key auto_increment, amount decimal(65,2) not null, `date` varchar(255) not null);");
            System.out.println("table daily_summary created");
            st.execute("create table if not exists monthly_summary(id int primary key auto_increment, amount decimal(65.2) not null, `month` int not null, `year` int not null);");
            System.out.println("table monthly_summary created");

        // Load users
            usersList.add(new User("admin", "admin", UserType.Manager));
            for(User user: usersList) {
                String typeStr = null;
                if(user.type == UserType.Employee) {
                    typeStr = "Employee";
                } else if (user.type == UserType.Manager) {
                    typeStr = "Manager";
                }
                st.execute("INSERT  INTO users(username, password_code, user_type) VALUES ('" + user.username +"', '" + user.getPasswordCode() + "', '" + typeStr + "');");
            }
            //load products
            productsList.add(new Product("2332","Demo product 1", 1,12.50));
            productsList.add(new Product("2336","Demo product 2", 1,1.50));
            for(Product product : productsList) {
                st.execute("INSERT  INTO products(product_code, product_name, product_qty, product_price) VALUES ('" + product.productCode +"', '" + product.productName + "', '" + product.productQty +"', '" + product.productPrice +"');");
            }
            //Load smtp
            stmt = conn.prepareStatement("INSERT  INTO smtp_data(smtp_server, smtp_username, smtp_password, smtp_from, smtp_to) VALUES (?, ?, ?, ?, ?);");
            stmt.setString(1, "demo.smtp.com");
            stmt.setString(2,"demousername");
            stmt.setString(3,"demo password");
            stmt.setString(4,"from@mail.com");
            stmt.setString(5,"to@mail.com");
            stmt.execute();

            // enter general
            st.execute("INSERT  INTO general(business_name, business_address, currency) VALUES ('My Market', 'lourem str 3', 'US dollar USD');");

            //Load dummy data charts
            st.execute("INSERT INTO daily_summary(amount, `date`) VALUES (0.00, '11.11.2020');");
            st.execute("INSERT INTO monthly_summary(amount, `month`, `year`) VALUES (0.00, MONTH(CURRENT_DATE), YEAR(CURRENT_DATE));");

        }
    }

    public void updateSmtpDb() throws SQLException {
        stmt = conn.prepareStatement("UPDATE smtp_data SET smtp_server = ?, smtp_username = ?, smtp_password = ?, smtp_from = ?, smtp_to = ? WHERE ID = 1;");
        stmt.setString(1, smtpData[0].trim());
        stmt.setString(2,smtpData[1].trim());
        stmt.setString(3,smtpData[2].trim());
        stmt.setString(4,smtpData[3].trim());
        stmt.setString(5,smtpData[4].trim());
        stmt.execute();
    }

    public void updatePrinterConf(String printerType) throws SQLException {
        if(printerType.equals("normalPrinter")) {
            st.execute("DELETE FROM normal_printer");
            st.execute("INSERT INTO normal_printer(printer_name, status) VALUES ('" + printerName + "', '" + true + "');");
            try{
                ResultSet rest = st.executeQuery("SELECT * FROM tcpip_printer");
                if(rest.getBoolean(4) == true) {
                    st.execute("UPDATE tcpip_printer SET(status = '" + false + "');");
                }
            } catch(Exception e) {
                return;
            }
        } else if(printerType.equals("tcpIp")) {
            st.execute("DELETE from tcpip_printer");
            st.execute("INSERT INTO tcpip_printer(host, port, status) VALUES ('" + tcpHost + "', '" + tcpPort +"', '" + true + "');");
            try{
                ResultSet rest = st.executeQuery("SELECT * FROM normal_printer");
                if(rest.getBoolean(3) == true) {
                    st.execute("UPDATE tcpip_printer SET(status = '" + false + "');");
                }
            } catch(Exception e) {
                return;
            }
        }

    }

    public void addProductDb(String productCode, String productName, Integer productQty, Double productPrice) throws SQLException {
        st.execute("INSERT INTO products(product_code, product_name, product_qty, product_price) VALUES ('" + productCode +"', '" + productName + "', '" + productQty +"', '" + productPrice +"');");
    }

    public void mangeUserDb(String username, String password, UserType type) throws SQLException {
        if(type == UserType.Employee) {
            st.execute("INSERT  INTO users(username, password_code, user_type) VALUES ('" + username +"', '" + password + "', '" + "Employee" +"');");
        } else if (type == UserType.Manager) {
            st.execute("UPDATE users SET username = '" + username + "', password_code = '" + password +"' WHERE user_type = 'Manager';");
        }
    }
    public void delUserDb(String username) throws SQLException {
        st.execute("DELETE FROM users WHERE username = '" + username + "';");
    }

    public void bussinesDb(String name, String address, String currency) throws SQLException {
        st.execute("DELETE from general");
        st.execute("INSERT  INTO general(business_name, business_address, currency) VALUES ('" + name +"', '" + address + "', '" + currency + "');");
    }

    public void updateDailySummary(Double amount, String date) throws SQLException {
        ResultSet rest = st.executeQuery("SELECT * FROM daily_summary ORDER BY ID DESC LIMIT 1;");
        rest.next();
        if(rest.getString(3).equals(date)) {
            Double oldAmount = rest.getDouble(2);
            st.execute("UPDATE daily_summary SET amount =" + (oldAmount + amount) + "WHERE `date` = '" + date + "';");
        } else {
            st.execute("INSERT INTO daily_summary(amount, `date`) VALUES (" + amount + ",'" + date +"');");
        }
    }
    public void updateMonthlySummary(Double amount, String date) throws SQLException, ParseException {
        //Set date handler       
        String datePattern = "dd.MM.yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(datePattern);
        java.util.Date dateNow = formatter.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateNow);
        

        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);

        //Update or insert if different month
        ResultSet rest = st.executeQuery("SELECT * FROM monthly_summary ;");

        while(rest.next()) {

            if(rest.getInt(3) == month && rest.getInt(4) == year) {
                double oldAmount = rest.getDouble(2);
                conn.createStatement().execute("UPDATE monthly_summary SET amount =" + (oldAmount + amount) + "WHERE `month` =" + month + ";");
            } else {
               conn.createStatement().execute("INSERT INTO monthly_summary(amount, `month`, `year`) VALUES (" + amount + "," + month  + "," + year + ");");

            }
        }

    }
    
    public void loadData() {
        currencySigns = new HashMap<>();
        currencySigns.put("US dollar USD", "$");
        currencySigns.put("Euro EUR", "EUR");
        currencySigns.put("Pounds sterling GBP", "GBP");
        currencySigns.put("Bulgarian lev BGN", "BGN");
        currencySigns.put("Swiss franc CHF", "CHF");
        currencySigns.put("Czech koruna CZK", "CZK");
        currencySigns.put("Danish krone DKK", "DKK");
        currencySigns.put("Croatian Kuna HRK", "HRK");
        currencySigns.put("Polish zloty PLN", "PLN");
        currencySigns.put("Russian ruble RUB", "v");
        currencySigns.put("Romanian leu RON", "lei");
        currencySigns.put("Swedish krona SEK", "SEK");
        currencySigns.put("Canadian dollars", "CAD");
        currencySigns.put("No currency", "");       
        
        count = 0;
    }
    
}

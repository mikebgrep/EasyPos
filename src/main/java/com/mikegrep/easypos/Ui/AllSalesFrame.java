/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.Order;
import com.mikegrep.easypos.Models.OrderProduct;
import com.mikegrep.easypos.Models.Product;
import com.opencsv.CSVWriter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mike
 */
public class AllSalesFrame extends javax.swing.JFrame {

    /**
     * Creates new form allSalesFrame
     */   
    
    public AppFrame frame;
    private DefaultTableModel tableModel;
    public ArrayList<OrderProduct> sortedProducts;
    public JScrollPane scroll1;
    public Date date;
    public String dateFormated;
    public boolean isEmailConfigured = false;
    
    public AllSalesFrame(AppFrame frame) {
        this.frame = frame;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        date = new Date();
        dateFormated = new SimpleDateFormat("dd-MM-yyyy").format(date);
        
        initalizeTable();
        loadTableData();
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        showItemsTable = new javax.swing.JTable();
        sendToEmailButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        showItemsTable.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(showItemsTable);

        sendToEmailButton.setText("Send file to Email");
        sendToEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToEmailButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(sendToEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendToEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void sendToEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToEmailButtonActionPerformed
        
        sendEmail();
        if(isEmailConfigured){
            JOptionPane.showMessageDialog(null, "Message send to email", "Information", JOptionPane.INFORMATION_MESSAGE);
             return;
        } else if(!isEmailConfigured && this.frame.provider.smtpData[4] != null) {
            JOptionPane.showMessageDialog(null, "Problem sending email check your settings", "Error", JOptionPane.ERROR_MESSAGE);
        }
           
        
    }//GEN-LAST:event_sendToEmailButtonActionPerformed

    
    public void initalizeTable() {
        scroll1 = new JScrollPane();
        showItemsTable.add(scroll1);
        tableModel = new DefaultTableModel();
        String [] tableColumns = {"Code", "Name", "Qty", "Total Price"};
        tableModel.setColumnIdentifiers(tableColumns);
        showItemsTable.setModel(tableModel);


    }
    
    public void loadTableData() {
        boolean isProductAdded = false;
        sortedProducts = new ArrayList();
        for(OrderProduct product: this.frame.provider.allSalesDataBase) {
           OrderProduct sameProduct = new OrderProduct(product.productCode, product.productName, product.productQty, product.productPrice);
           for(OrderProduct product2: sortedProducts) {
               if(sameProduct.productName.equals(product2.productName)){
                   product2.productQty += sameProduct.productQty;
                   product2.productPrice += sameProduct.productPrice;
                   isProductAdded = true;
               }
           }
           if(!isProductAdded) {
              sortedProducts.add(sameProduct);    
           }
           
           isProductAdded = false;
            
            } 
                       
        loadToTable(sortedProducts);
        
    }
          
    

    
    public void loadToTable(ArrayList<OrderProduct> sortedProducts){
        tableModel.setRowCount(0);        
        for(OrderProduct product: sortedProducts) {
            String[] row = new String[4];
            row[0] = product.productCode;
            row[1] = product.productName;
            row[2] = Integer.toString(product.productQty);
            String productPriceStr = String.format("%.2f", product.productPrice);
            row[3] = productPriceStr;
            tableModel.addRow(row);
        }
        
    }
        public void createCsv() {
            File file = new File(dateFormated + ".csv");
            try {
                // create FileWriter object with file as parameter
                FileWriter outputfile = new FileWriter(file);

                // create CSVWriter object filewriter object as parameter
                CSVWriter writer = new CSVWriter(outputfile);

                // adding header to csv
                String[] header = { "Code", "Name", "Qty", "Total Price" };
                writer.writeNext(header);

                // add data to csv
                int count = 0;
                for(OrderProduct product: sortedProducts){
                    String[] data = { product.productCode, product.productName, Integer.toString(product.productQty), String.format("%.2f", product.productPrice)};
                    writer.writeNext(data);
                }
                String[] summaryHeaders = {"Date", "Sub Total", "Tax", "Total"};
                writer.writeNext(summaryHeaders);
                double total = 0;
                for(OrderProduct product: sortedProducts) {
                    total += product.productPrice;
                }
                double tax = (total / 10) * 2;
                double sub = total - tax;
                String[] summaryData = {this.frame.main.dateFormated,Double.toString(sub), String.format("%.2f",tax ), String.format("%.2f",total)};
                writer.writeNext(summaryData);
                // closing writer connection
                writer.close();
            } catch (IOException e) {
            e.printStackTrace();
                 }
    }
    
 
    public void sendEmail() {
        createCsv();
        if(this.frame.provider.smtpData[0] == null) {
            JOptionPane.showMessageDialog(null, "You must configure Smtp in settings menu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
     // Recipient's email ID needs to be mentioned.
      String to = frame.provider.smtpData[4];

      // Sender's email ID needs to be mentioned
      String from = frame.provider.smtpData[3];

      // Assuming you are sending email from localhost
      String host = this.frame.provider.smtpData[0];

      // Get system properties
      Properties properties = System.getProperties();
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.ssl.enable", "true");
      properties.put("mail.smtp.auth", "true");
      properties.setProperty("mail.smtp.host", host);
      properties.put("mail.smtp.starttls.enable", "true");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(frame.provider.smtpData[1], frame.provider.smtpData[2]);
                            }
                        }
                        );

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Sales Report for: " + dateFormated);

         // Create the message part 
         BodyPart messageBodyPart = new MimeBodyPart();

         // Fill the message
         messageBodyPart.setText("Report file attached to email");
         
         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);

         // Part two is attachment
         messageBodyPart = new MimeBodyPart();
         String filename = dateFormated +".csv";
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);

         // Send the complete message parts
         message.setContent(multipart );

         // Send message
         Transport.send(message);
         isEmailConfigured = true;
         System.out.println("Sent message successfully....");
         
      } catch (MessagingException mex) {
         mex.printStackTrace();
         isEmailConfigured = false;
         
      }
    }
  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sendToEmailButton;
    private javax.swing.JTable showItemsTable;
    // End of variables declaration//GEN-END:variables



}

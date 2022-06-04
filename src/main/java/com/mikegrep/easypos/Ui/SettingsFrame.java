package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.User;
import com.mikegrep.easypos.Models.User.UserType;
import com.github.anastaciocintra.output.PrinterOutputStream;
import com.github.anastaciocintra.escpos.EscPos;
import com.github.anastaciocintra.output.TcpIpOutputStream;
import com.mikegrep.easypos.Ui.AppFrame;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.PrintService;
import javax.swing.JOptionPane;

public class SettingsFrame extends javax.swing.JFrame {
    
    public AppFrame frame;
    public boolean isSmtpSaved = false;
    public String delUserChmboBoxItem;
    public String themeComboBoxItem;
    public boolean isUserCreated = false;
    public String printerChmboBoxItem;
    public boolean isTcpConfigured = false;
    public String currencyChomboBoxItem;
    public boolean isGeneralSet = false;

    
    public SettingsFrame(AppFrame frame) {
        this.frame = frame;
        initComponents();
        setLocationRelativeTo(null);
        loadDataUserChmboBox();
        loadDataCurrencyChombo();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        showData();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        smtpField = new javax.swing.JTextField();
        smtpUsernameField = new javax.swing.JTextField();
        smtpSaveButton = new javax.swing.JButton();
        smtpPasswordField = new javax.swing.JPasswordField();
        smtpBackButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        smtpFromField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        smtpToField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userUsernameField = new javax.swing.JTextField();
        userCreateButton = new javax.swing.JButton();
        userCancelButton = new javax.swing.JButton();
        userPasswordField = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        managerSaveButtton = new javax.swing.JButton();
        managerCancelButton = new javax.swing.JButton();
        managerPasswordField = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        managerUsernameField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        delUserChmboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        delUserSaveButton = new javax.swing.JButton();
        delUserCancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        searchPrinterButton = new javax.swing.JButton();
        printerComboBox = new javax.swing.JComboBox<>();
        testPrinterButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        savePrinterButton = new javax.swing.JButton();
        cancelPrinterButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        hostTcpIP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        portTcpIp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        testTcpIp = new javax.swing.JButton();
        saveTcpIp = new javax.swing.JButton();
        cancelTcpIp = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        businessNameField = new javax.swing.JTextField();
        currencyChomboBox = new javax.swing.JComboBox<>();
        saveGeneralButton = new javax.swing.JButton();
        cancelGeneralButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter SMTP server:");

        jLabel2.setText("Enter username:");

        jLabel3.setText("Enter password:");

        smtpSaveButton.setText("Save");
        smtpSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    smtpSaveButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        smtpBackButton.setText("Back");
        smtpBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smtpBackButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("To Email");

        jLabel5.setText("From Email ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(smtpPasswordField)
                    .addComponent(smtpUsernameField)
                    .addComponent(smtpField)
                    .addComponent(smtpFromField)
                    .addComponent(smtpToField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(smtpBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smtpSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smtpField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smtpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smtpUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smtpSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(smtpFromField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smtpBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(smtpToField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Email Settings", jPanel1);

        jLabel6.setText("Enter Username:");

        jLabel7.setText("Enter Password:");

        userCreateButton.setText("Create User");
        userCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    userCreateButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        userCancelButton.setText("Cancel");
        userCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userUsernameField)
                    .addComponent(userPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Create Users", jPanel5);

        managerSaveButtton.setText("Save");
        managerSaveButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    managerSaveButttonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        managerCancelButton.setText("Cancel");
        managerCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerCancelButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("New Manager Username:");

        jLabel12.setText("New Manager  Password:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(managerUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(managerPasswordField))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(managerSaveButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerSaveButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Edit Manager", jPanel6);

        delUserChmboBox.setEditable(true);
        delUserChmboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delUserChmboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delUserChmboBoxActionPerformed(evt);
            }
        });

        jLabel10.setText("Select User  From Menu");

        delUserSaveButton.setText("Delete");
        delUserSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    delUserSaveButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        delUserCancelButton.setText("Cancel");
        delUserCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delUserCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delUserChmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delUserCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delUserSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delUserChmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(delUserSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(delUserCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delite User", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User Settings", jPanel3);

        searchPrinterButton.setText("Search for Printer");
        searchPrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPrinterButtonActionPerformed(evt);
            }
        });

        testPrinterButton.setText("Test Printer");
        testPrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testPrinterButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("2. Select Printer");

        jLabel9.setText("1. Search for printer");

        jLabel13.setText("3. Test printer");

        savePrinterButton.setText("Save");
        savePrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    savePrinterButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        cancelPrinterButton.setText("Cancel");
        cancelPrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPrinterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(testPrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelPrinterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savePrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchPrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(savePrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(cancelPrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(testPrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Printer", jPanel8);

        jLabel14.setText("1. Enter Host:");

        jLabel15.setText("2. Enter port:");

        jLabel16.setText("3. Test printer");

        testTcpIp.setText("Test Printer");
        testTcpIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTcpIpActionPerformed(evt);
            }
        });

        saveTcpIp.setText("Save");
        saveTcpIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveTcpIpActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        cancelTcpIp.setText("Cancel");
        cancelTcpIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTcpIpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(testTcpIp, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(portTcpIp, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hostTcpIP)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelTcpIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveTcpIp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(hostTcpIP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portTcpIp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(saveTcpIp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelTcpIp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(testTcpIp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("TCP/IP Priner", jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Printer Settings", jPanel2);

        jLabel17.setText("Business name:");

        jLabel18.setText("Currency:");

        jLabel19.setText("Address:");

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        businessNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessNameFieldActionPerformed(evt);
            }
        });

        currencyChomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyChomboBoxActionPerformed(evt);
            }
        });

        saveGeneralButton.setText("Save");
        saveGeneralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveGeneralButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        cancelGeneralButton.setText("Cancel");
        cancelGeneralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelGeneralButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(currencyChomboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(businessNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveGeneralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelGeneralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(saveGeneralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cancelGeneralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(businessNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currencyChomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General Settings", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delUserCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delUserCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_delUserCancelButtonActionPerformed

    private void delUserSaveButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_delUserSaveButtonActionPerformed
        deleteUser();
    }//GEN-LAST:event_delUserSaveButtonActionPerformed

    private void delUserChmboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delUserChmboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delUserChmboBoxActionPerformed

    private void managerCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_managerCancelButtonActionPerformed

    private void managerSaveButttonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_managerSaveButttonActionPerformed
        editManager();
    }//GEN-LAST:event_managerSaveButttonActionPerformed

    private void userCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCancelButtonActionPerformed
        if(isUserCreated) {
            dispose();
            return;
        }
        if(!userUsernameField.getText().isEmpty() || !String.valueOf(userPasswordField.getText()).isEmpty()) {
            int result =   JOptionPane.showConfirmDialog(null, "Do you want to cancel changes", "Warning", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                dispose();
            } else if(result == JOptionPane.NO_OPTION) {
                return;
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_userCancelButtonActionPerformed

    private void userCreateButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_userCreateButtonActionPerformed
        createNewUser();
    }//GEN-LAST:event_userCreateButtonActionPerformed

    private void smtpBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smtpBackButtonActionPerformed

        if(!isSmtpSaved && !isSmtpFieldEmpty()) {
            int result =  JOptionPane.showConfirmDialog(null, "You sure you want to cancel your information will not be saved", "Information", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                dispose();
            } else if(result == JOptionPane.CANCEL_OPTION) {
                return;
            }
        } else {
            dispose();
        }

    }//GEN-LAST:event_smtpBackButtonActionPerformed

    private void smtpSaveButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_smtpSaveButtonActionPerformed
        if(isSmtpFieldEmpty()) {
            JOptionPane.showMessageDialog(null, "You need to enter information in all text fields", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        this.frame.provider.smtpData[0] = smtpField.getText();
        this.frame.provider.smtpData[1] = smtpUsernameField.getText();
        this.frame.provider.smtpData[2] = String.valueOf(smtpPasswordField.getText());
        this.frame.provider.smtpData[3] = smtpFromField.getText();
        this.frame.provider.smtpData[4] = smtpToField.getText();
        this.frame.provider.updateSmtpDb();

        isSmtpSaved = true;

        JOptionPane.showMessageDialog(null, "Settings saved", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_smtpSaveButtonActionPerformed

    private void testTcpIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTcpIpActionPerformed
        tcpIpPrintConfigure();
        
    }//GEN-LAST:event_testTcpIpActionPerformed

    private void saveTcpIpActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_saveTcpIpActionPerformed
        if(isTcpConfigured) {
            this.frame.provider.tcpHost = hostTcpIP.getText();
            this.frame.provider.tcpPort = Integer.parseInt(portTcpIp.getText());
            //this.frame.provider.configuredPrinter = "tcpIp";
            this.frame.provider.updatePrinterConf("tcpIp");
            JOptionPane.showMessageDialog(null, "Successfully saved printer settings You must restart program to take changes", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else if(!isTcpConfigured) {
            JOptionPane.showMessageDialog(null, "You need to enter host and port in the fields and to test printer", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_saveTcpIpActionPerformed

    private void cancelTcpIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTcpIpActionPerformed
        if(isTcpConfigured) {
            dispose();
        } else if(!isTcpConfigured && isTcpFieldEmpty()) {
            dispose();
        } else if(!isTcpConfigured && !isTcpFieldEmpty()) {
         int result =   JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel", "Warrning", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_cancelTcpIpActionPerformed

    private void testPrinterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testPrinterButtonActionPerformed
        if(printerChmboBoxItem != null) {
            testPrinter();
        } else {
            JOptionPane.showMessageDialog(null, "You must to search and select printer", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_testPrinterButtonActionPerformed

    private void searchPrinterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPrinterButtonActionPerformed
        searchPrinterName();
    }//GEN-LAST:event_searchPrinterButtonActionPerformed

    private void savePrinterButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_savePrinterButtonActionPerformed
       this.frame.provider.printerName = printerChmboBoxItem;
       this.frame.provider.updatePrinterConf("normalPrinter");
    }//GEN-LAST:event_savePrinterButtonActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void businessNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_businessNameFieldActionPerformed

    private void currencyChomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyChomboBoxActionPerformed
        
    }//GEN-LAST:event_currencyChomboBoxActionPerformed

    private void saveGeneralButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_saveGeneralButtonActionPerformed
        if(isGeneralEmpty()) {
            JOptionPane.showMessageDialog(null, "You must enter Business name, address and select currency or leave currency blank", "Warring", JOptionPane.WARNING_MESSAGE);
        } else {
            this.frame.provider.businessName = businessNameField.getText().trim();
            this.frame.provider.businessAddress = addressField.getText().trim();
            if(currencyChomboBoxItem != null) {
                this.frame.provider.currency = currencyChomboBoxItem;
            }
            this.frame.provider.bussinesDb(businessNameField.getText().trim(), addressField.getText().trim(), currencyChomboBoxItem);
            isGeneralSet = true;
            JOptionPane.showMessageDialog(null, "Your settings are saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_saveGeneralButtonActionPerformed

    private void cancelGeneralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelGeneralButtonActionPerformed
        if (isGeneralEmpty() || isGeneralSet) {
            dispose();
        }
        else {
         int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel all settings will be lost", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
         if(result == JOptionPane.YES_OPTION){
             dispose();
         } else if(result == JOptionPane.NO_OPTION) {
             return;
         }
        }
    }//GEN-LAST:event_cancelGeneralButtonActionPerformed

    private void cancelPrinterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPrinterButtonActionPerformed
       dispose();
    }//GEN-LAST:event_cancelPrinterButtonActionPerformed


    public boolean isGeneralEmpty() {
        return businessNameField.getText().isEmpty() && addressField.getText().isEmpty();
    }
    public boolean isTcpFieldEmpty() {
        return hostTcpIP.getText().isEmpty() && portTcpIp.getText().isEmpty();
    }
    
    public boolean isSmtpFieldEmpty() {
        return smtpField.getText().isEmpty() && smtpUsernameField.getText().isEmpty()  && smtpFromField.getText().isEmpty() && smtpToField.getText().isEmpty();
    }
    
    public void showData() {
        if(this.frame.provider.smtpData[4] != null) {
            smtpField.setText(this.frame.provider.smtpData[0]);
            smtpUsernameField.setText(this.frame.provider.smtpData[1]);
            smtpPasswordField.setText(this.frame.provider.smtpData[2]);
            smtpFromField.setText(this.frame.provider.smtpData[3]);
            smtpToField.setText(this.frame.provider.smtpData[4]);
            isSmtpSaved = true;
        }
    }
    
    public void createNewUser() throws SQLException {
        if(!userUsernameField.getText().isEmpty() || !userPasswordField.getText().isEmpty()) {
            User newUser = new User(userUsernameField.getText(), String.valueOf(userPasswordField.getText()), UserType.Employee);
            this.frame.provider.usersList.add(newUser);
            this.frame.provider.mangeUserDb(userUsernameField.getText(), String.valueOf(userPasswordField.getText()), UserType.Employee);
            JOptionPane.showMessageDialog(null, "New User added to database", "Info", JOptionPane.INFORMATION_MESSAGE );
        } else {
            JOptionPane.showMessageDialog(null, "Username and password field can't be empty", "Warning", JOptionPane.WARNING_MESSAGE );
        }
        isUserCreated = true;
        loadDataUserChmboBox();
    }
    
    public void editManager() throws SQLException {
        if(managerUsernameField.getText().length() > 4 && String.valueOf(managerPasswordField.getText()).length() > 4 ) {
            this.frame.provider.mangeUserDb(managerUsernameField.getText(), String.valueOf(managerPasswordField.getText()), UserType.Manager);
            for(User user: this.frame.provider.usersList) {
                if(user.username.equals(this.frame.provider.currentUser)) {
                    user.username = managerUsernameField.getText();
                    user.setPasswordCode(String.valueOf(managerPasswordField.getText()));

                }
            }
            JOptionPane.showMessageDialog(null, "Manager username and password changed", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null, "Manager username must be min. 3 characters and password field min. 4", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void loadDataUserChmboBox() {
        String [] users = new String[this.frame.provider.usersList.size() - 1];
        int count = 0;
        for(User user: this.frame.provider.usersList) {
            if(!user.type.equals(UserType.Manager)) {
                users[count] = user.username;
                count += 1;
            }
        }       
        delUserChmboBox.setModel(new javax.swing.DefaultComboBoxModel<>(users));
        delUserChmboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                        delUserChmboBoxItem = (String) delUserChmboBox.getSelectedItem();
                    
            }
        });
    }
    
    
    public void deleteUser() throws SQLException {
        if(delUserChmboBoxItem == null) {
            JOptionPane.showMessageDialog(null, "You must select user from dropdown menu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.frame.provider.delUserDb(delUserChmboBoxItem);
        for(User user : this.frame.provider.usersList) {
            if(user.username.equals(delUserChmboBoxItem)) {
                this.frame.provider.usersList.remove(user);
                break;
            }
        }
        delUserChmboBox.removeItem(delUserChmboBoxItem);
        JOptionPane.showMessageDialog(null, "User deleted successful", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public void loadDataCurrencyChombo() {
        String [] currencys = new String[this.frame.provider.currencySigns.size()];
        int count = 0;
        for(Map.Entry<String,String> entry : this.frame.provider.currencySigns.entrySet()) {
                currencys[count] = entry.getKey();
                count += 1;           
        }       
        currencyChomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(currencys));
        currencyChomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                        currencyChomboBoxItem = (String) currencyChomboBox.getSelectedItem();
                    
            }
        });
    }
    
    
    public void searchPrinterName() {
        String[] printServicesNames = PrinterOutputStream.getListPrintServicesNames();
        printerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(printServicesNames));
        printerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    printerChmboBoxItem = (String) printerComboBox.getSelectedItem();
                    
            }
        });
    }
    
    public void testPrinter() {
        if(printerChmboBoxItem != null) {
            PrintService printService = PrinterOutputStream.getPrintServiceByName(printerChmboBoxItem);
            try {
                PrinterOutputStream printerOutputStream = new PrinterOutputStream(printService);
                EscPos escpos = new EscPos(printerOutputStream);
                escpos.info();
                escpos.close();
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problem configuring terminal printer", "ERROR", JOptionPane.ERROR_MESSAGE);
            }     
     }
     
    }
        
    public void tcpIpPrintConfigure() {
        if(!hostTcpIP.getText().isEmpty() && !portTcpIp.getText().isEmpty()) {
            try(TcpIpOutputStream outputStream = new TcpIpOutputStream(hostTcpIP.getText(),Integer.parseInt(portTcpIp.getText()))) {
                EscPos escpos = new EscPos(outputStream);
                escpos.info();
                isTcpConfigured = true;
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must enter host ip and port", "Warrning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField businessNameField;
    private javax.swing.JButton cancelGeneralButton;
    private javax.swing.JButton cancelPrinterButton;
    private javax.swing.JButton cancelTcpIp;
    private javax.swing.JComboBox<String> currencyChomboBox;
    private javax.swing.JButton delUserCancelButton;
    private javax.swing.JComboBox<String> delUserChmboBox;
    private javax.swing.JButton delUserSaveButton;
    private javax.swing.JTextField hostTcpIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton managerCancelButton;
    private javax.swing.JPasswordField managerPasswordField;
    private javax.swing.JButton managerSaveButtton;
    private javax.swing.JTextField managerUsernameField;
    private javax.swing.JTextField portTcpIp;
    private javax.swing.JComboBox<String> printerComboBox;
    private javax.swing.JButton saveGeneralButton;
    private javax.swing.JButton savePrinterButton;
    private javax.swing.JButton saveTcpIp;
    private javax.swing.JButton searchPrinterButton;
    private javax.swing.JButton smtpBackButton;
    private javax.swing.JTextField smtpField;
    private javax.swing.JTextField smtpFromField;
    private javax.swing.JPasswordField smtpPasswordField;
    private javax.swing.JButton smtpSaveButton;
    private javax.swing.JTextField smtpToField;
    private javax.swing.JTextField smtpUsernameField;
    private javax.swing.JButton testPrinterButton;
    private javax.swing.JButton testTcpIp;
    private javax.swing.JButton userCancelButton;
    private javax.swing.JButton userCreateButton;
    private javax.swing.JPasswordField userPasswordField;
    private javax.swing.JTextField userUsernameField;
    // End of variables declaration//GEN-END:variables
}

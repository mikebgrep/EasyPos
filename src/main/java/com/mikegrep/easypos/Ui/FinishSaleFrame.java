
package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.Order;
import com.mikegrep.easypos.Models.OrderProduct;
import com.github.anastaciocintra.escpos.EscPos;
import com.github.anastaciocintra.escpos.EscPosConst;
import com.github.anastaciocintra.escpos.Style;
import com.github.anastaciocintra.output.PrinterOutputStream;
import com.github.anastaciocintra.output.TcpIpOutputStream;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
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

public class FinishSaleFrame extends javax.swing.JFrame implements MouseListener {
    
    public AppFrame frame;
    public Date date;
    public String dateFormated;
    public String timeFormated;
    public Order order;
    public String businessName;
    public String businessAddress;
    public String symbol;
    
    public FinishSaleFrame(AppFrame frame, Order order) {
        this.frame = frame;
        this.order = order;
        initComponents();
        setLocationRelativeTo(null);
        setValues();

        this.frame.isFinal("yes");
        setDefaultCloseOperation(0);
        date = new Date();
        dateFormated = new SimpleDateFormat("dd-MM-yyyy").format(date);
        timeFormated = new SimpleDateFormat("hh:mm:ss").format(date);
        this.frame.provider.count += 1;
        invoiceNumLabel.setText("Invoice Number: INV/" + dateFormated + "/" + this.frame.provider.count);
        changeLabel.setText("Change: " + order.formatDouble(this.frame.voidFrame.change));
        emailTextField.addMouseListener(this);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        printInvoiceCheckBox = new javax.swing.JCheckBox();
        sendEmailCheckBox = new javax.swing.JCheckBox();
        emailTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changeLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        changeLabel.setText("Change: ");

        invoiceNumLabel.setText("Invoice number:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        printInvoiceCheckBox.setText("Print Invoie");
        printInvoiceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printInvoiceCheckBoxActionPerformed(evt);
            }
        });

        sendEmailCheckBox.setText("Send to Email");
        sendEmailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailCheckBoxActionPerformed(evt);
            }
        });

        emailTextField.setText("Enter email");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendEmailCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField))
                    .addComponent(printInvoiceCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoiceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printInvoiceCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendEmailCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if(sendEmailCheckBox.isSelected()) {
            if(this.frame.provider.smtpData[0] == null) {
               JOptionPane.showMessageDialog(null, "You must configure Smtp in settings menu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            sendEmail();
        }
        if(printInvoiceCheckBox.isSelected()) {
            if(this.frame.provider.configuredPrinter == null) {
                JOptionPane.showMessageDialog(null, "You must configure printer in settings menu.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            printRecipent();
        }
        this.frame.main.finishedSele(true);
        dispose();
        this.frame.isFinal("finish");
    }//GEN-LAST:event_okButtonActionPerformed

    private void printInvoiceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printInvoiceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printInvoiceCheckBoxActionPerformed

    private void sendEmailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendEmailCheckBoxActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed


    public void sendEmail() {
        if(!emailTextField.getText().equals("Enter email")){
        // Recipient's email ID needs to be mentioned.
        String to = emailTextField.getText();

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
           message.setSubject("Invoice: " + dateFormated);

           // Create the message part 
           BodyPart messageBodyPart = new MimeBodyPart();

           // Fill the message

          messageBodyPart.setText(businessName + "\n" + businessAddress + "\n" +
                                  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                                    + dateFormated  + "\n" +
                                     timeFormated + "\n" +
                                  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" +
                                  "Item                                  Price                                    Amount" + '\n' +
                                  "-------------------------------------------------------------------------------------" + "\n" +
                  order.products.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                                  "Total Price:"  + symbol + order.formatDouble(order.totalBillOrder())  + "\n" +
                                  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" +
                                  "Thank you for shoping with us" + "\n" +
                                  "Have a nice day");
     
         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);


         // Send the complete message parts
         message.setContent(multipart );

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
         
      } catch (MessagingException mex) {
         mex.printStackTrace();
         
      }
        }
    }
    
    public void printRecipent() {
        //PrintService printService = this.frame.provider.printService;
        
        
        EscPos escpos = null;
        PrinterOutputStream printerOutputStream;
        TcpIpOutputStream tcpOutputStream;
        try {
            if(this.frame.provider.configuredPrinter.equals("normalPrinter")) {
                printerOutputStream = new PrinterOutputStream(this.frame.provider.printService);
                escpos = new EscPos(printerOutputStream ); //System.out
            } else if(this.frame.provider.configuredPrinter.equals("tcpIp")) {
                tcpOutputStream = new TcpIpOutputStream(this.frame.provider.tcpHost,this.frame.provider.tcpPort);
                escpos = new EscPos(tcpOutputStream);
            }
            
            
            Style title = new Style()
                    .setFontSize(Style.FontSize._3, Style.FontSize._3)
                    .setJustification(EscPosConst.Justification.Center);

            Style subtitle = new Style(escpos.getStyle())
                    .setBold(true)
                    .setUnderline(Style.Underline.OneDotThick);
            Style bold = new Style(escpos.getStyle())
                    .setBold(true);
            
            
            escpos.writeLF(title,businessName)
                    .writeLF(title,"C o f f e e")
                    .feed(3)
                    .writeLF(subtitle.setJustification(EscPosConst.Justification.Center), "R E C E I P T")
                    .feed(2)
                    .writeLF("Item              Unit Price      Amount")
                    .writeLF("----------------------------------------")
                    .feed(2);
            order.totalPrice =0;
            for(OrderProduct product: order.products){
                escpos.writeLF(product.toString());
                order.totalPrice += product.getPrice(product.productQty);
            }

            String total = String.format("$ %.2f", order.totalPrice);
            escpos.writeLF("----------------------------------------")
                    .feed(2)
                    .writeLF(bold,
                            "TOTAL                         " + String.format("%10s",total))
                    .writeLF("----------------------------------------")
                    .writeLF("     Thank you for shopping with us     ")
                    .writeLF("            Have a nice day             ")

                    .feed(8)
                    .cut(EscPos.CutMode.FULL);

            
            escpos.close();

            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void setValues() {
        String symbolValue = null;
        String businessValue = this.frame.provider.businessName;
        String addressValue = this.frame.provider.businessAddress;
        
        for(Map.Entry<String,String> sign: this.frame.provider.currencySigns.entrySet()) {
                    if(this.frame.provider.currency.equals(sign.getKey())) {
                        symbolValue = sign.getValue();
                    }
                }
      
        symbol = symbolValue == null ? "" : symbolValue;
        businessName = businessValue == null ? "" : businessValue;
        businessAddress = addressValue == null ? "" : addressValue;
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changeLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JCheckBox printInvoiceCheckBox;
    private javax.swing.JCheckBox sendEmailCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(emailTextField.getText().equals("Enter email")) {
            emailTextField.setText("");
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        return; 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        return;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        return;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        return;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.Product;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class ProductFrame extends javax.swing.JFrame {


    public AppFrame frame;
    public int count = 0;
    public boolean isNewProduct = false;
    public String productComboBoxItemName = "";
    public String newNameStr = "";
    public String newPriceStr = "";

    public ProductFrame(AppFrame frame) {
        this.frame = frame;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        productComboBox.setEditable(true);
        handleProductsComboBox();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cancelButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        qtyField = new javax.swing.JTextField();
        infoLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        codeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        deliteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priceButton = new javax.swing.JButton();
        productComboBox = new javax.swing.JComboBox<>();
        ranameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Qty");

        jLabel7.setText("Product Name");

        qtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyFieldActionPerformed(evt);
            }
        });

        infoLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        addButton.setText("Add Product");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel8.setText("Price");

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });

        codeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Product Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Add Product", jPanel1);

        deliteButton.setText("Delite");
        deliteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliteButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        infoLabel.setText("Product:");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Choice Product");

        priceButton.setText("Change Price");
        priceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceButtonActionPerformed(evt);
            }
        });

        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        ranameButton.setText("Rename");
        ranameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ranameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ranameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Edit Product", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeFieldActionPerformed

    private void qtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_addButtonActionPerformed
        addAction();
        if (this.isNewProduct) {
          JOptionPane.showMessageDialog(null, "Product added", "Information", 1);
          this.frame.main.changeProductComboBox();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
       if(isTextsFieldsEmpty()) {
         dispose();  
       } else {
          int result = JOptionPane.showConfirmDialog(null, "Do you want to clese data will be lost", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
          if(result == JOptionPane.YES_OPTION){
              dispose();
          } else if(result == JOptionPane.NO_OPTION) {
              return;
          }
       }
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void deliteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliteButtonActionPerformed
        if(productComboBoxItemName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an item", "Select a product", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String msg = "Do you want to delete product: " + productComboBoxItemName + " ?";
        int result = JOptionPane.showConfirmDialog(null, msg, "Delete a product", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            for(Product product: this.frame.provider.productsList) {
                if(product.productName.equals(productComboBoxItemName)){
                    this.frame.provider.productsList.remove(product);
                    break;

                }
            }
            infoLabel.setText("Product " + productComboBoxItemName + " deleted.");
            this.frame.main.loadDataSearchComboBoxes();
            handleProductsComboBox();
        } else if(result == JOptionPane.NO_OPTION) {
            return;
        }

    }//GEN-LAST:event_deliteButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void priceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceButtonActionPerformed
        String message = "Enter new price in the box";
        JTextField renameField = new JTextField("");
        Object [] parms = {message, renameField};
        int result = JOptionPane.showConfirmDialog(null, parms, "Price Change", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            JTextField newPrice = (JTextField)parms[1];
            newPriceStr = newPrice.getText();
            changePriceAction();

        } else if (result == JOptionPane.NO_OPTION) {
            return;
        }

    }//GEN-LAST:event_priceButtonActionPerformed

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed

    }//GEN-LAST:event_productComboBoxActionPerformed

    private void ranameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranameButtonActionPerformed
        String message = "Enter new name in the box";
        JTextField renameField = new JTextField("");
        Object [] parms = {message, renameField};
        int result = JOptionPane.showConfirmDialog(null, parms, "Rename Product", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            JTextField newName = (JTextField)parms[1];
            newNameStr = newName.getText();
            renameAction();
            this.frame.main.changeProductComboBox();
            handleProductsComboBox();
        } else if (result == JOptionPane.NO_OPTION) {
            return;
        }
    }//GEN-LAST:event_ranameButtonActionPerformed



    public void addAction() throws SQLException {
        if(isTextsFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "You must to fill all fields to add product", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
       try {
           Integer.parseInt(qtyField.getText());
           Double.parseDouble(priceField.getText());
           
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Fields qty and price must be a numbers", "Error", JOptionPane.ERROR_MESSAGE);
       }
        Product product = new Product(codeField.getText(),productNameField.getText(),Integer.parseInt(qtyField.getText()), Double.parseDouble(priceField.getText()));
        this.frame.provider.productsList.add(product);
        this.frame.provider.addProductDb(codeField.getText().trim(), productNameField.getText().trim(), Integer.parseInt(qtyField.getText()), Double.parseDouble(priceField.getText()));
        isNewProduct = true; 
        infoLabel.setText("Product " + productNameField.getText() + " added to database!");
        codeField.setText("");
        priceField.setText("");
        productNameField.setText("");
        qtyField.setText("");
        
        
    }
    
    public boolean isTextsFieldsEmpty() {
        return codeField.getText().isEmpty() || productNameField.getText().isEmpty() || qtyField.getText().isEmpty() || priceField.getText().isEmpty();
    }
    public void handleProductsComboBox() {
        int count = 0;
        String[] data = new String[this.frame.provider.productsList.size()];
        for(Product product: this.frame.provider.productsList){
            data[count] = product.productName;
            count += 1;
        }

        productComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(data));
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxItemName = (String) productComboBox.getSelectedItem();

            }
        });
    }
    public void renameAction() {
        for(Product product: this.frame.provider.productsList) {
            if(product.productName.equals(productComboBoxItemName)){
                product.productName = newNameStr;
            }
        }
        infoLabel.setText("Product " + productComboBoxItemName + " renamed.");
    }

    public void changePriceAction() {
        for(Product product: this.frame.provider.productsList) {
            if(product.productName.equals(productComboBoxItemName)){
                product.productPrice = Double.parseDouble(newPriceStr);
            }
        }
        infoLabel.setText("Product " + productComboBoxItemName + " price changer " + newPriceStr + ".");
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JTextField codeField;
    private javax.swing.JButton deliteButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton priceButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JComboBox<String> productComboBox;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField qtyField;
    private javax.swing.JButton ranameButton;
    // End of variables declaration//GEN-END:variables


}

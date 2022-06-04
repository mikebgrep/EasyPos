package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.Order;
import com.mikegrep.easypos.Models.OrderProduct;
import com.mikegrep.easypos.Models.Product;

import java.awt.event.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.mikegrep.easypos.Models.User;


public class MainPanel extends BasePanel implements ActionListener {

    public DefaultTableModel tableModelMain;
    public Scanner scanner = new Scanner(System.in);
    public Order newOrder;
    public String chomboBoxSelectedItemName = "";
    public String chomboBoxSelectedTableNumber = "";
    public String currentTableNumber = "";
    public double totalPrice = 0.00;
    public double subTotalPrice = 0.00;
    public double taxPrice = 0.00;
    public int count = 0;
    public boolean isHaveOrder = false;
    public Date date;
    public String dateFormated;
    public String hourFormated;
  
    public MainPanel(AppFrame frame) {
        super(frame);
        initComponents();
        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mike/Downloads Backup/Pos logo/pos_main_white.png"));
        date = new Date();
        dateFormated = new SimpleDateFormat("dd-MM-yyyy").format(date);
        hourFormated = new SimpleDateFormat("HH.mm.ss").format(date);      
        operatorDataLabel.setText("Operator: " + this.frame.provider.currentUser.username + "  Date: " + dateFormated);
        
        if(this.frame.provider.currentUser.type == User.UserType.Employee) {
            mangeProductButton.setVisible(false);
            settingsButton.setVisible(false);
            showChartsButton.setVisible(false);
            xCancelButton.setVisible(false);
        };

        setTableContent();
        loadDataSearchComboBoxes();
        setButtonRound();
        AutoCompleteDecorator.decorate(searchItemComboBox);
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showChartsButton = new javax.swing.JButton();
        mangeProductButton = new javax.swing.JButton();
        allSalesButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        operatorDataLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        searchItemComboBox = new javax.swing.JComboBox<>();
        qtyTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchTableComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        subTotalLabel = new javax.swing.JLabel();
        xCancelButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        taxLebel = new javax.swing.JLabel();

        showChartsButton.setText("Show Charts");
        showChartsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.showChartsScreen();
            }
        });

        mangeProductButton.setText("Products");
        mangeProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        allSalesButton.setText("All Sales");
        allSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allSalesButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    exitButtonActionPerformed(evt);
                } catch (SQLException | ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        settingsButton.setIcon(new javax.swing.ImageIcon("/home/mike/NetBeansProjects/EasyPosMaven/Pos logo/settings_gradient.png")); // NOI18N
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mike/NetBeansProjects/EasyPosMaven/Pos logo/pos_main_ArcDark.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(operatorDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(mangeProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(showChartsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(allSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mangeProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showChartsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(operatorDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        centerPanel.setPreferredSize(new java.awt.Dimension(1200, 500));

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setPreferredSize(new java.awt.Dimension(400, 360));
        jScrollPane1.setViewportView(productsTable);

        searchItemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemComboBoxActionPerformed(evt);
            }
        });

        qtyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Item");

        jLabel6.setText("Qty.");

        jLabel7.setText("Table Number");

        jSeparator1.setPreferredSize(new java.awt.Dimension(1, 3));

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(centerPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(365, 365, 365)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(centerPanelLayout.createSequentialGroup()
                            .addComponent(searchItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(searchTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(centerPanelLayout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1886, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(centerPanelLayout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 493, Short.MAX_VALUE)))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 300));

        subTotalLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        subTotalLabel.setText("Subtotal:");
        subTotalLabel.setRequestFocusEnabled(false);

        xCancelButton.setText("X");
        xCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xCancelButtonActionPerformed(evt);
            }
        });

        totalButton.setText("TOTAL");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        totalLabel.setText("TOTAL:");
        totalLabel.setRequestFocusEnabled(false);

        taxLebel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        taxLebel.setText("Tax:");
        taxLebel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(xCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(totalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(subTotalLabel)
                        .addGap(21, 21, 21)
                        .addComponent(taxLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel)
                    .addComponent(totalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        this.frame.showAddProductScreen();
    }//GEN-LAST:event_addProductButtonActionPerformed

    private void allSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allSalesButtonActionPerformed

        if(this.frame.provider.allSalesDataBase == null) {
            JOptionPane.showMessageDialog(null,"No sales to show", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        this.frame.showAllSalesScreen();
    }//GEN-LAST:event_allSalesButtonActionPerformed

    public void endDaySummary() throws SQLException, ParseException {
        if(this.frame.provider.allSalesDataBase.size() > 0) {
            int endDay = JOptionPane.showConfirmDialog(null,"You need to end day before exit", "Information", JOptionPane.OK_CANCEL_OPTION);
            if(endDay == JOptionPane.OK_OPTION) {
                String currentDate = new SimpleDateFormat("dd.MM.yyyy").format(date);
                String ttAmount = String.format("%.2f",getProcutsAmount());
                this.frame.provider.updateDailySummary(Double.parseDouble(ttAmount), currentDate);
                this.frame.provider.updateMonthlySummary(Double.parseDouble(ttAmount), currentDate );
                this.frame.dispose();
            } else if(endDay == JOptionPane.CANCEL_OPTION) {
                return;
            }
        } else {
            this.frame.dispose();
        }

    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ParseException {//GEN-FIRST:event_exitButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Do you want to exit program?", "Warning",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            endDaySummary();
        } else {
            return;
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        this.frame.showSettingsScreen();
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void searchItemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemComboBoxActionPerformed

    private void qtyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextFieldActionPerformed

    }//GEN-LAST:event_qtyTextFieldActionPerformed

    private void xCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xCancelButtonActionPerformed
        if(this.frame.provider.currentOrderProvider == null) {
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete order", "Warning", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            this.frame.provider.orderList.remove(this.frame.provider.currentOrderProvider);
            this.frame.provider.currentOrderProvider = null;
            searchTableComboBox.removeItem(chomboBoxSelectedTableNumber);
            loadData(null);
            totalLabel.setText("TOTAL: ");
            subTotalLabel.setText("Subtotal: ");
            taxLebel.setText("Tax: ");

        } else if(result == JOptionPane.NO_OPTION) {
            return;
        }
    }//GEN-LAST:event_xCancelButtonActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        Order order = this.frame.provider.currentOrderProvider;
        if(order == null) {
            JOptionPane.showMessageDialog(null,"You need to select an order", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        this.frame.showVoidScreen(order);
    }//GEN-LAST:event_totalButtonActionPerformed

    public void finishedSele(boolean isFinished) {
        if(isFinished) {
            this.frame.provider.allSalesDataBase.addAll(this.frame.provider.tempSells);
            Order order = this.frame.provider.currentOrderProvider;
            loadData(null);
            this.frame.provider.orderList.remove(order);
            searchTableComboBox.removeItem(chomboBoxSelectedTableNumber);
            this.frame.provider.currentOrderProvider = null;
            totalLabel.setText("TOTAL: ");
            subTotalLabel.setText("Subtotal: ");
            taxLebel.setText("Tax: ");
        }
    }

    public double getProcutsAmount() {
        boolean isProductAdded = false;
        ArrayList<OrderProduct> sortedProducts = new ArrayList();
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
        double total = 0;
        for(OrderProduct product: sortedProducts) {
            total += product.productPrice;
        }
        return total;
    }
    public void loadDataSearchComboBoxes() {
        int count = 0;
        String [] products = new String[this.frame.provider.productsList.size()];
        
        for(Product product: this.frame.provider.productsList){
            products[count] = product.productName;
            count += 1;
        }
        
        searchItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(products));
        
        searchItemComboBox.addActionListener(this);


        //Handale table number
      
        searchTableComboBox.setEditable(true);
        searchTableComboBox.addActionListener(this);
        
    }

    public void changeLabelText(String chomboBoxSelectedTableNumber) {
        for(Order order : frame.provider.orderList) {
            if(order.tableNumber.equals(chomboBoxSelectedTableNumber)) {
                isHaveOrder = true;
                totalLabel.setText("TOTAL: " + order.formatDouble(order.totalBillOrder()));
                subTotalLabel.setText("Subtotal: " + order.formatDouble(order.subTotalOrder()));
                taxLebel.setText("Tax: " + order.formatDouble(order.taxOrder()));

                loadData(order);
                break;
            } 
        }
    }
   
    public void changeProductComboBox() {
        int count = 0;
        String [] products = new String[this.frame.provider.productsList.size()];
        
        for(Product product: this.frame.provider.productsList){
            products[count] = product.productName;
            count += 1;
        }
        searchItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(products));
        
    }

    public void setTableContent(){
           JScrollPane scrollMain = new JScrollPane();
           productsTable.add(scrollMain);
           tableModelMain = new DefaultTableModel();
           String [] tableColumns = {"Code", "Name", "Qty", " Price"};
           tableModelMain.setColumnIdentifiers(tableColumns);
           productsTable.setModel(tableModelMain);
           productsTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
           productsTable.setRowSorter(new TableRowSorter(tableModelMain));
           productsTable.setAutoCreateRowSorter(true);
         
           productsTable.addKeyListener(new KeyAdapter() {
                            @Override
                            public void keyReleased(KeyEvent keyEvent)
                            {
                                delitingRow(keyEvent, productsTable);
                            }
                        });

    }

    public void delitingRow(KeyEvent keyEvent, JTable table) {
        int keyCode = keyEvent.getKeyCode();
        int selectedRow = table.getSelectedRow();
        Order currentOrder = new Order(chomboBoxSelectedTableNumber);
        if (keyCode == KeyEvent.VK_DELETE && selectedRow != -1) {
                for(Order order : frame.provider.orderList) {
                    if(order.tableNumber.equals(chomboBoxSelectedTableNumber)) {
                        order.products.remove(table.getSelectedRow());
                        //frame.provider.allSalesProducts.remove(order.products.get(table.getSelectedRow()));
                        loadData(order);
                        break;
                }
                  
            }
    }
    
}
 

    public void loadData(Order currentOrder) {
        tableModelMain.setRowCount(0);
        if(currentOrder == null) {
            return;
        }
        if(this.frame.provider.currentOrderProvider == null) {
            this.frame.provider.currentOrderProvider = new Order(currentOrder.tableNumber);   
        }
        totalPrice = 0;
        taxPrice = 0;
        subTotalPrice = 0;

        for(OrderProduct product: currentOrder.products ) {
            String[] row = new String[4];
            row[0] = product.productCode;
            row[1] = product.productName;
            row[2] = Integer.toString(product.productQty);
            String totalStr = String.format("%.2f", product.productPrice);
            row[3] = totalStr;
            tableModelMain.addRow(row);

        }
            this.frame.provider.tempSells = new ArrayList<>(currentOrder.products);
            this.frame.provider.currentOrderProvider = currentOrder;


    }

    public void seachItemAction(String command) {
        if(command.equals("comboBoxEdited")) {
            chomboBoxSelectedItemName = (String) searchItemComboBox.getSelectedItem();
            for(Product product: frame.provider.productsList) {
                if(product.productName.equals(chomboBoxSelectedItemName)){

                    for(Order order: frame.provider.orderList) {
                        if(order.tableNumber.equals(currentTableNumber)) {
                            try{
                                Integer.parseInt(qtyTextField.getText());
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Qty must be a number starting from 1", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            boolean isSameProduct = false;
                            if(order.products.size() > 0 && order.products.get(order.products.size() -1).productName.equals(product.productName)) {
                                order.products.get(order.products.size() -1).productQty +=  Double.parseDouble(qtyTextField.getText());
                                order.products.get(order.products.size() -1).productPrice +=  (product.productPrice * Double.parseDouble(qtyTextField.getText()));
                                loadData(order);

                                isSameProduct = true;
                            }
                            if(!isSameProduct) {
                                OrderProduct orderProduct = new OrderProduct(product.productCode, product.productName, Integer.parseInt(qtyTextField.getText()),product.productPrice * Integer.parseInt(qtyTextField.getText()));
                                order.products.add(orderProduct);
                                loadData(order);

                            }

                        }

                        totalPrice += order.totalBillOrder();
                        subTotalPrice += order.subTotalOrder();
                        taxPrice += order.taxOrder();
                    }

                    String totalStr = String.format("%.2f", totalPrice);
                    totalLabel.setText("TOTAL: " + totalStr);

                    String subTotalStr = String.format("%.2f", subTotalPrice);
                    subTotalLabel.setText("Subtotal: " + subTotalStr);

                    String taxStr = String.format("%.2f", taxPrice);
                    taxLebel.setText("Tax: " + taxStr);

                    totalPrice = 0;
                    subTotalPrice = 0;
                    taxPrice = 0;
                }

            }
        }
    }

    public void searchTableAction(String command) {
        chomboBoxSelectedTableNumber = (String) searchTableComboBox.getSelectedItem();
        currentTableNumber =  chomboBoxSelectedTableNumber;

        if(command.equals("comboBoxChanged")) {

            changeLabelText(chomboBoxSelectedTableNumber);
        }
        if(command.equals("comboBoxEdited")) {
            if(((DefaultComboBoxModel)searchTableComboBox.getModel()).getIndexOf(chomboBoxSelectedTableNumber) < 0){
                searchTableComboBox.addItem(chomboBoxSelectedTableNumber);
            }
            isHaveOrder = false;
            changeLabelText(chomboBoxSelectedTableNumber);

            if(!isHaveOrder) {
                newOrder = new Order(chomboBoxSelectedTableNumber);
                frame.provider.orderList.add(newOrder);

            }
        }
    }

    public void setButtonRound() {
        showChartsButton.putClientProperty( "JButton.buttonType", "roundRect" );
        mangeProductButton.putClientProperty( "JButton.buttonType", "roundRect" );
        allSalesButton.putClientProperty( "JButton.buttonType", "roundRect" );
        exitButton.putClientProperty( "JButton.buttonType", "roundRect" );
        settingsButton.putClientProperty( "JButton.buttonType", "roundRect" );
        
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton mangeProductButton;
    private javax.swing.JButton allSalesButton;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton showChartsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel operatorDataLabel;
    private javax.swing.JTable productsTable;
    private javax.swing.JTextField qtyTextField;
    private javax.swing.JComboBox<String> searchItemComboBox;
    private javax.swing.JComboBox<String> searchTableComboBox;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JLabel taxLebel;
    private javax.swing.JButton totalButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton xCancelButton;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == searchItemComboBox){
            String command = e.getActionCommand();
            seachItemAction(command);
        } else if (e.getSource() == searchTableComboBox){
            String command = e.getActionCommand();
            searchTableAction(command);
        }

    }


}

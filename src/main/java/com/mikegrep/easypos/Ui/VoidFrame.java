package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.Order;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class VoidFrame extends javax.swing.JFrame implements  ActionListener {
    
    public AppFrame frame;
    public ArrayList<JButton> moneyButtons;
    public Order order;
    public double sumPrice = 0.00;
    public double tempCashIn = 0.00;
    public boolean isSubstracted = false;
    public boolean isPayed = false;
    public int count = 0;
    public double change;
    
    public VoidFrame(AppFrame frame, Order order) {
        this.frame = frame;
        this.order = order;
        initComponents();
        connectButtonListener();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setInvoiceTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceTotalLabe = new javax.swing.JLabel();
        twentyButton = new javax.swing.JButton();
        thenButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        oFiftyButton = new javax.swing.JButton();
        oTwentyButton = new javax.swing.JButton();
        oThenButton = new javax.swing.JButton();
        ofiveButton = new javax.swing.JButton();
        fiftyButton = new javax.swing.JButton();
        houndredButton = new javax.swing.JButton();
        changeLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        billsTextArea = new javax.swing.JTextArea();
        delBillButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTotalLabe.setText("Invoice Total: ");

        twentyButton.setText("20.00");

        thenButton.setText("10.00");

        fiveButton.setText("5.00");

        twoButton.setText("2.00");

        oneButton.setText("1.00");

        oFiftyButton.setText("0.50");

        oTwentyButton.setText("0.20");

        oThenButton.setText("0.10");

        ofiveButton.setText("0.5");

        fiftyButton.setText("50.00");

        houndredButton.setText("100.00");

        changeLabel.setText("Change:");

        confirmButton.setText("Confirm");

        cancelButton.setText("Cancel");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        billsTextArea.setEditable(false);
        billsTextArea.setColumns(20);
        billsTextArea.setRows(5);
        jScrollPane1.setViewportView(billsTextArea);

        delBillButton.setText("<--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oTwentyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oThenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ofiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oFiftyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twentyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(houndredButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fiftyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceTotalLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(invoiceTotalLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiftyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houndredButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twentyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oFiftyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oTwentyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oThenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ofiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billsTextArea;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton delBillButton;
    private javax.swing.JButton fiftyButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton houndredButton;
    private javax.swing.JLabel invoiceTotalLabe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton oFiftyButton;
    private javax.swing.JButton oThenButton;
    private javax.swing.JButton oTwentyButton;
    private javax.swing.JButton ofiveButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton thenButton;
    private javax.swing.JButton twentyButton;
    private javax.swing.JButton twoButton;
    // End of variables declaration//GEN-END:variables

    public void connectButtonListener() {
        moneyButtons = new ArrayList();
        oFiftyButton.addActionListener(this);
        moneyButtons.add(oFiftyButton);
        
        oThenButton.addActionListener(this);
        moneyButtons.add(oThenButton);
        
        ofiveButton.addActionListener(this);
        moneyButtons.add(ofiveButton);
        
        oTwentyButton.addActionListener(this);
        moneyButtons.add(oTwentyButton);
        
        oneButton.addActionListener(this);
        moneyButtons.add(oneButton);
        
        twoButton.addActionListener(this);
        moneyButtons.add(twoButton);
        
        fiveButton.addActionListener(this);
        moneyButtons.add(fiveButton);
        
        thenButton.addActionListener(this);
        moneyButtons.add(thenButton);
        
        twentyButton.addActionListener(this);
        moneyButtons.add(twentyButton);
        
        fiftyButton.addActionListener(this);
        moneyButtons.add(fiftyButton);
        
        houndredButton.addActionListener(this);
        moneyButtons.add(houndredButton);
        
        delBillButton.addActionListener(this);
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

        
    }
    
    public void setInvoiceTotal() {
        invoiceTotalLabe.setText(order.formatDouble(order.totalBillOrder()));
        changeLabel.setText("Change: " + order.formatDouble(order.totalNegative()));
    }
    
    public void delBillAction() {
        sumPrice -= tempCashIn;
        changeLabel.setText("Change: " + order.formatDouble(order.totalNegative() + sumPrice));
        billsTextArea.setText(billsTextArea.getText().replace(count + ". " + Double.toString(tempCashIn) + "  x   1" + "\n", "" ));
        count -= 1;
        isSubstracted = true;
    }
    
    public void changeAction(String buttonPrice) {
        double cashIn = Double.parseDouble(buttonPrice);
        sumPrice += cashIn;
        tempCashIn = cashIn;
        count += 1;
        change = order.totalNegative() + sumPrice;
        billsTextArea.append(count + ". " + Double.toString(cashIn) + "  x   1" + "\n");
        changeLabel.setText("Change: " + order.formatDouble(change));
        isSubstracted = false;
        if(change >= 0) {
            isPayed = true;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == delBillButton && !isSubstracted) {
            delBillAction();
            return;

        }
        if(e.getSource() == cancelButton) {
          int result =  JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel operation", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(result == JOptionPane.YES_OPTION) {
              dispose();
          } else if(result == JOptionPane.NO_OPTION) {
              return;
          }
        } else if(e.getSource() == confirmButton) {
            if (!isPayed) {
                JOptionPane.showMessageDialog(null, "You must enter more bills to continue", "Information", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            dispose();
            this.frame.showFinishScreen(order);

        }
        String buttonPrice = null;
        for(JButton button : moneyButtons) {
            if(e.getSource() == button) {
                buttonPrice =  button.getText();
            }
           
        }
        if(buttonPrice != null) {
            changeAction(buttonPrice);
        }
        
 
        
        }
}


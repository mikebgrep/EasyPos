package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.Models.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class LoginPanel extends BasePanel implements ActionListener, MouseListener{

    public LoginPanel(AppFrame frame) {
        super(frame);
        initComponents();
        addMouseListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(714, 479));

        usernameField.setText("Enter username");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //usernameFieldActionPerformed(evt)
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(this);

        passwordField.setText("jPasswordField1");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //passwordFieldActionPerformed(evt);
            }
        });
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/mike/NetBeansProjects/EasyPosMaven/Pos logo/pos_ArcDark.png"));;
        jLabel2.setText("Developed by Mihael H.");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField)
                                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                        .addGap(0, 360, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    public void addMouseListener() {
        usernameField.addMouseListener(this);
        passwordField.addMouseListener(this);
        
    }

    public void loginButtonAction() {
        for(User user: this.frame.provider.usersList) {
            if(user.username.equals(usernameField.getText()) && user.getPasswordCode().equals(String.valueOf(passwordField.getPassword()))) {
                this.frame.provider.currentUser = user;
                this.frame.showMainScreen();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Username or password are incorect","Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton) {
            loginButtonAction();
        }
           
     
    }
    public void mousePressed(MouseEvent e) {
            return;
    }

    public void mouseReleased(MouseEvent e) {
        return;
    }

    public void mouseEntered(MouseEvent e) {
        return;
    }

    public void mouseExited(MouseEvent e) {
        return;
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == usernameField){
            if(usernameField.getText().equals("Enter username")) {
                usernameField.setText("");
            }
            
        } else if(e.getSource() == passwordField) {
            if(String.valueOf(passwordField.getPassword()).equals("jPasswordField1")) {
                passwordField.setText("");
            }
            
        }
        
        
    }

}

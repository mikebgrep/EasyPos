
package com.mikegrep.easypos.Ui;

import com.mikegrep.easypos.DataProvider.DataProvider;
import com.mikegrep.easypos.Models.Order;
import com.mikegrep.easypos.Ui.MainPanel;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;


/**
 *
 * @author mike
 */
public class AppFrame extends javax.swing.JFrame implements WindowListener {

    public DataProvider provider;
    //public MainPanelBackUp main;
    public MainPanel main;
    public SettingsFrame settings;
    public ProductFrame productFrame;
    public ChartFrameFinal chartsFrame;
    public AllSalesFrame sales;
    public VoidFrame voidFrame;
    public FinishSaleFrame finishSale;
    boolean isFinal;
    
    public AppFrame() throws IOException, SQLException {
        super("Easy Pos - Future point of sale");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        provider = new DataProvider();
        provider.createDatabase();
        provider.loadData();

        showLoginScreen();
        addWindowListener(this);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setSize(new java.awt.Dimension(410, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    public void showLoginScreen() {
        LoginPanel login = new LoginPanel(this);
        setSize(430, 450);
        setContentPane(login);
        validate();
    }
    


    public void showMainScreen() {
        main = new MainPanel(this);
        setResizable(true);
        setSize(1300, 800);
        setLocationRelativeTo(null);
        setContentPane(main);
        validate();
    }
    public void showAddProductScreen() {
        productFrame = new ProductFrame(this);
        productFrame.setVisible(true);
        validate();
    }
    
    public void showAllSalesScreen() {
        sales = new AllSalesFrame(this);
        sales.setVisible(true);
        validate();
    }
    
    public void showChartsScreen() {
        chartsFrame = new ChartFrameFinal(this);
        chartsFrame.setVisible(true);
        validate();
    }
    
    public void showSettingsScreen() {
        settings = new SettingsFrame(this);
        settings.setVisible(true);
        validate();
    }
    
    public void showVoidScreen(Order order) {
        voidFrame = new VoidFrame(this, order);
        voidFrame.setVisible(true);
        validate();
    }

    public void showFinishScreen(Order order) {
        finishSale = new FinishSaleFrame(this, order);
        finishSale.setVisible(true);
        finishSale.setResizable(false);
        validate();
    }




    public void isFinal(String value) {
        isFinal = value.equals("yes") ?  true : false;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(isFinal) {
            setDefaultCloseOperation(0);
            return;
        }
      int result =  JOptionPane.showConfirmDialog(null, "Do you want to close the program?","Warning",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
      if(result == JOptionPane.YES_OPTION) {
          if(this.main != null) {
              try {
                  this.main.endDaySummary();
              } catch (SQLException ex) {
                  ex.printStackTrace();
              } catch (ParseException ex) {
                  ex.printStackTrace();
              }
          }
          System.exit(0);
      } else if(result == JOptionPane.CANCEL_OPTION) {
          return;
      }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

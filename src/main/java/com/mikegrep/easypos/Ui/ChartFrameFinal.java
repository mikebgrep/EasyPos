
package com.mikegrep.easypos.Ui;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

public class ChartFrameFinal extends javax.swing.JFrame  {
    public AppFrame frame;


    public ArrayList<String> dates;
    public ArrayList<Double> values;
    public CategoryChart barChart = new CategoryChartBuilder().width(800).height(600).title("Weekly chart").xAxisTitle("Dates").yAxisTitle("Amounts").build();
    public PieChart pieChart = new PieChartBuilder().width(800).height(600).title("Monthly chart").build();

    public ChartFrameFinal(AppFrame frame) {
        this.frame = frame;
        initComponents();
        dates = new ArrayList<>();
        values = new ArrayList<>();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        custWeeklyChart();
        createWeeklyChart();
        createMontlyChart();


    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        weeklyChartPanel = new XChartPanel<>(barChart);
        montlyChartPanel = new XChartPanel<>(pieChart);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout weeklyChartPanelLayout = new javax.swing.GroupLayout(weeklyChartPanel);
        weeklyChartPanel.setLayout(weeklyChartPanelLayout);
        weeklyChartPanelLayout.setHorizontalGroup(
            weeklyChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        weeklyChartPanelLayout.setVerticalGroup(
            weeklyChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Weekly Chart", weeklyChartPanel);

        javax.swing.GroupLayout montlyChartPanelLayout = new javax.swing.GroupLayout(montlyChartPanel);
        montlyChartPanel.setLayout(montlyChartPanelLayout);
        montlyChartPanelLayout.setHorizontalGroup(
            montlyChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        montlyChartPanelLayout.setVerticalGroup(
            montlyChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Monthly  Chart", montlyChartPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }



    public void createWeeklyChart(){
        barChart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        barChart.getStyler().setHasAnnotations(true);
        barChart.addSeries("Amount", dates , values);


    }
    public void custWeeklyChart() {
        LocalDate dateNow = LocalDate.now();
        LocalDate monday = dateNow.with(previousOrSame(MONDAY));
        String formated; // = new SimpleDateFormat("dd.MM.yyyy").format(date);

        for(int i = 0; i <= 6; i++) {
            boolean isDateFound = false;
            formated = new SimpleDateFormat("dd.MM.yyyy").format(Date.from(monday.plusDays(i).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
            dates.add(formated);
            for(Map.Entry<String, Double> entry : this.frame.provider.dailyValues.entrySet()) {
                if(entry.getKey().equals(formated)) {
                    values.add(entry.getValue());
                    isDateFound = true;
                }
            }
            if(!isDateFound) {
                values.add(null);
            }
        }

    }

    public void createMontlyChart() {
        Color[] sliceColors = new Color[] { new Color(0, 128, 255), new Color(51, 255, 153), new Color(153, 255, 153), new Color(243, 180, 159), new Color(246, 199, 182) };
        pieChart.getStyler().setSeriesColors(sliceColors);

        ArrayList<String> months = new ArrayList();
        ArrayList<Double> value = new ArrayList();
        ArrayList<Double> maxValues = new ArrayList<>();

        for(Map.Entry<Double,String> entry: this.frame.provider.monthlyValues.entrySet()) {
            value.add(entry.getKey());
        }

        for(int i = 0; i < value.size(); i++){
            double max = Collections.max(value);
            months.add(this.frame.provider.monthlyValues.get(max));
            maxValues.add(max);
            value.remove(max);
            i -= 1;
        }
        if(months.size() > 0) {
            ArrayList tempMonths = new ArrayList<>(); 
            for(int i = 0; i < months.size(); i++) {
                if(tempMonths.contains(months.get(i))) {
                    continue;
                }
                pieChart.addSeries(months.get(i), maxValues.get(i));
                tempMonths.add(months.get(i));
                if(i == 4) {
                    break;
                }
            }
        } else {
            pieChart.addSeries("None", 0);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel montlyChartPanel;
    private javax.swing.JPanel weeklyChartPanel;
    // End of variables declaration//GEN-END:variables
}

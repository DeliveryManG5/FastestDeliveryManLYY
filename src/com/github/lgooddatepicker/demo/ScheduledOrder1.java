package com.github.lgooddatepicker.demo;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeArea;
import static com.github.lgooddatepicker.demo.FullDemo.datePicker1;
import static com.github.lgooddatepicker.demo.FullDemo.rowMultiplier;
import com.github.lgooddatepicker.zinternaltools.InternalUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

import da.ScheduledOrderDA;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ScheduledOrder1 extends javax.swing.JFrame {
    
    ScheduledOrderDA scheduledOrderDA = new ScheduledOrderDA();

    /**
     * Creates new form ScheduledOrder1
     */
    public ScheduledOrder1() {
        initComponents();
        
        
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePickerBeanInfo1 = new com.github.lgooddatepicker.components.DateTimePickerBeanInfo();
        layoutMap1 = new com.privatejgoodies.forms.layout.LayoutMap();
        datePickerBeanInfo1 = new com.github.lgooddatepicker.components.DatePickerBeanInfo();
        datePickerBeanInfo2 = new com.github.lgooddatepicker.components.DatePickerBeanInfo();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        OrderDbPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("OrderDbPU").createEntityManager();
        locationQuery = java.beans.Beans.isDesignTime() ? null : OrderDbPUEntityManager.createQuery("SELECT l FROM Location l");
        locationList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : locationQuery.getResultList();
        locationQuery1 = java.beans.Beans.isDesignTime() ? null : OrderDbPUEntityManager.createQuery("SELECT l FROM Location l");
        locationList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : locationQuery1.getResultList();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        ViewOrder = new javax.swing.JButton();
        jtfResult = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        CheckBoxLoc = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewOrder.setText("View Order");
        ViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrderMouseClicked(evt);
            }
        });
        ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderActionPerformed(evt);
            }
        });

        jtfResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfResultActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer ID", "Date", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        CheckBoxLoc.setText("Soft by location");
        CheckBoxLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxLocActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PV10", "PV12", "PV13", "PV15", "PV16", "PV20", "PV21" }));
        jComboBox1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckBoxLoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ViewOrder)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewOrder)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxLoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderActionPerformed
        if(datePicker1.toString() == ""){
            jtfResult.setText("Warning PLease Select A Date\n");
        }else
        if(CheckBoxLoc.isSelected()){
            String DateTime = datePicker1.toString();
        //String[] Date = DateTime.split("T");
        
        //SimpleDateFormat firstFormatter = new SImpleDateFormat("yyyy-mm-dd")
        
        
        //jtfResult.setText("Selected order: " + Date[0] + "\n" + Date[1]);
        jtfResult.setText("Selected order group by location: " + DateTime + "\n");
        String selectedItem = (String) jComboBox1.getSelectedItem();
        //ResultSet rs = scheduledOrderDA.selectRecord(Date[0]);
        ResultSet rs = scheduledOrderDA.selectRecordWithLocation(DateTime,selectedItem);
        
        String[] tableColumnsName ={"OrderID", "CustomerID" , "Date", "Area", "Address"};
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        mode.setColumnIdentifiers(tableColumnsName);
        mode.setRowCount(0);
        
        try {                   
                ResultSetMetaData rsmd = rs.getMetaData();
                
                    int colNo = rsmd.getColumnCount();
                    while(rs.next()){
                        Object[] objects = new Object[colNo];
                        
                         for(int i = 0; i < colNo; i++){
                            objects[i] = rs.getObject(i+1);
                        }
                        
                        mode.addRow(objects);
                    }
                    jTable1.setModel(mode);

            } catch (SQLException ex) {
                //Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            String DateTime = datePicker1.toString();
        //String[] Date = DateTime.split("T");
        
        //SimpleDateFormat firstFormatter = new SImpleDateFormat("yyyy-mm-dd")
        
        
        //jtfResult.setText("Selected order: " + Date[0] + "\n" + Date[1]);
        jtfResult.setText("Selected order: " + DateTime + "\n");
        
        //ResultSet rs = scheduledOrderDA.selectRecord(Date[0]);
        ResultSet rs = scheduledOrderDA.selectRecord(DateTime);
        
        String[] tableColumnsName ={"OrderID", "CustomerID" , "Date", "Address"};
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        mode.setColumnIdentifiers(tableColumnsName);
        mode.setRowCount(0);
        
        try {                   
                ResultSetMetaData rsmd = rs.getMetaData();
                
                    int colNo = rsmd.getColumnCount();
                    while(rs.next()){
                        Object[] objects = new Object[colNo];
                        
                         for(int i = 0; i < colNo; i++){
                            objects[i] = rs.getObject(i+1);
                        }
                        
                        mode.addRow(objects);
                    }
                    jTable1.setModel(mode);

            } catch (SQLException ex) {
                //Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        

    }//GEN-LAST:event_ViewOrderActionPerformed

    private void ViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderMouseClicked
        
    }//GEN-LAST:event_ViewOrderMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // TODO add your handling code here:
        jButton2MouseClicked(evt);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        datePicker1.clear();
        jtfResult.setText("Reset selection");
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton2MouseClicked

    private void jtfResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfResultActionPerformed

    private void CheckBoxLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxLocActionPerformed
        // TODO add your handling code here: pivatoal updated 
        if(CheckBoxLoc.isSelected()){
            jComboBox1.setEnabled(true);
        }else{
            jComboBox1.setEnabled(false);
        }
        
    }//GEN-LAST:event_CheckBoxLocActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduledOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduledOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduledOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduledOrder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        DatePickerSettings dateSettings;
//        int row = rowMultiplier;
//        final LocalDate today = LocalDate.now();
//        
//        URL dateImageURL = FullDemo.class.getResource("/images/datepickerbutton1.png");
//        Image dateExampleImage = Toolkit.getDefaultToolkit().getImage(dateImageURL);
//        ImageIcon dateExampleIcon = new ImageIcon(dateExampleImage);
//        // Create the date picker, and apply the image icon.
//        dateSettings = new DatePickerSettings();
//        datePicker1 = new DatePicker(dateSettings);
//        datePicker1.setDateToToday();
//        JButton datePickerButton = datePicker1.getComponentToggleCalendarButton();
//        datePickerButton.setText("");
//        datePickerButton.setIcon(dateExampleIcon);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduledOrder1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxLoc;
    private javax.persistence.EntityManager OrderDbPUEntityManager;
    private javax.swing.JButton ViewOrder;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePickerBeanInfo datePickerBeanInfo1;
    private com.github.lgooddatepicker.components.DatePickerBeanInfo datePickerBeanInfo2;
    private com.github.lgooddatepicker.components.DateTimePickerBeanInfo dateTimePickerBeanInfo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private java.awt.TextField jtfResult;
    private com.privatejgoodies.forms.layout.LayoutMap layoutMap1;
    private java.util.List<com.github.lgooddatepicker.demo.Location> locationList;
    private java.util.List<com.github.lgooddatepicker.demo.Location> locationList1;
    private javax.persistence.Query locationQuery;
    private javax.persistence.Query locationQuery1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    private void jButton2MouseClicked(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

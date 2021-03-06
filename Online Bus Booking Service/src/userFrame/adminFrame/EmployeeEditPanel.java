/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userFrame.adminFrame;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafikhan
 */
public class EmployeeEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeEditPanel
     */
    JTable table;
    int row=0;
    public EmployeeEditPanel(JTable table) {
        initComponents();
        this.table = table;
        int row = table.getSelectedRow();
        if(this.table!=null&&row>-1){
            loadData();
        }else{
            clearData();
        }
    }
    
    private void loadData(){
        if(row>-1||row<table.getRowCount()){
            jTextField1.setText((String) table.getValueAt(row, 8));
            jTextField2.setText((String) table.getValueAt(row, 0));
            jTextField6.setText((String) table.getValueAt(row, 1));
            jTextField3.setText((String) table.getValueAt(row, 2));
            jTextField4.setText((String) table.getValueAt(row, 3));
            jTextField5.setText((String) table.getValueAt(row, 4));
            jTextField7.setText( String.valueOf(table.getValueAt(row, 5)) );
            jTextField8.setText( String.valueOf( table.getValueAt(row, 6)) );
            jTextField9.setText( String.valueOf(table.getValueAt(row, 7)) );
            jTextField10.setText((String) table.getValueAt(row, 9));
        }else
            clearData();
    }
    private void clearData(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.setLayout(new java.awt.GridLayout(12, 2));

        jLabel1.setText("ID");
        jPanel1.add(jLabel1);

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1);

        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jPanel1.add(jTextField2);

        jLabel3.setText("Cell");
        jPanel1.add(jLabel3);
        jPanel1.add(jTextField6);

        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jPanel1.add(jTextField3);

        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jPanel1.add(jTextField4);

        jLabel5.setText("Username");
        jPanel1.add(jLabel5);
        jPanel1.add(jTextField5);

        jLabel6.setText("Salary");
        jPanel1.add(jLabel6);
        jPanel1.add(jTextField7);

        jLabel8.setText("Daily Hour");
        jPanel1.add(jLabel8);
        jPanel1.add(jTextField8);

        jLabel9.setText("Monthly Days");
        jPanel1.add(jLabel9);
        jPanel1.add(jTextField9);

        jLabel10.setText("Digest Password");
        jPanel1.add(jLabel10);

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10);

        jButton10.setText("Previous");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton8.setText("Next");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setText("Save");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton1.setText("New");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(row>0){
            row--;
            loadData();
        }else{
            row=0;
            loadData();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(row<table.getRowCount()-1){
            row++;
            loadData();
        }else{
            row=table.getRowCount()-1;
            loadData();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        dm.addRow(new Object[]{
            jTextField2.getText(),
            jTextField6.getText(),
            jTextField3.getText(),
            jTextField4.getText(),
            jTextField5.getText(),
            jTextField7.getText(),
            jTextField8.getText(),
            jTextField9.getText(),
            "",
            jTextField10.getText()
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        table.setValueAt(jTextField2.getText() , row, 0);
        table.setValueAt(jTextField6.getText() , row, 1);
        table.setValueAt(jTextField3.getText() , row, 2);
        table.setValueAt(jTextField4.getText() , row, 3);
        table.setValueAt(jTextField5.getText() , row, 4);
        table.setValueAt(jTextField7.getText() , row, 5);
        table.setValueAt(jTextField8.getText() , row, 6);
        table.setValueAt(jTextField9.getText() , row, 7);
        table.setValueAt(jTextField1.getText() , row, 8);
        table.setValueAt(jTextField1.getText() , row, 8);
        table.setValueAt(jTextField10.getText() , row, 9);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

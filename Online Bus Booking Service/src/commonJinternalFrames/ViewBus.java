/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonJinternalFrames;

import classes.BusSchedule;
import operations.ReadSchudule;

/**
 *
 * @author rafikhan
 */
public class ViewBus extends javax.swing.JPanel {

    /**
     * Creates new form ViewBus
     */
    public ViewBus(String id) {
        BusSchedule bus = ReadSchudule.FindSchuduleById(id);
        initComponents();
        jTextField3.setText(bus.getDepartCity());
        jTextField4.setText(bus.getArriveCity());
        jTextField5.setText(bus.getDepart());
        jTextField6.setText(bus.getArriving());
        jTextField7.setText(bus.getBusReg());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(60, 74, 77));
        jPanel2.setLayout(new java.awt.GridLayout(6, 3));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Depart City :");
        jPanel2.add(jLabel4);

        jTextField3.setEditable(false);
        jPanel2.add(jTextField3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Arrive City :");
        jPanel2.add(jLabel5);

        jTextField4.setEditable(false);
        jPanel2.add(jTextField4);

        jLabel3.setText("Depart Time :");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel3);

        jTextField5.setEditable(false);
        jPanel2.add(jTextField5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arrive Time :");
        jPanel2.add(jLabel6);

        jTextField6.setEditable(false);
        jPanel2.add(jTextField6);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bus ID :");
        jPanel2.add(jLabel12);

        jTextField7.setEditable(false);
        jPanel2.add(jTextField7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}

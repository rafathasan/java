/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicLoginPage;

import classes.user.CustomJLabelButton;
import classes.user.User;
import commonJinternalFrames.MakePayment;
import deviceListener.LabelButtonListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import operations.MultipleWindowHandle;
import userFrame.adminFrame.TabContainer;

/**
 *
 * @author cis101
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    JFrame owner=this;
    JFrame parent;
    User user;
    private int screenX = 0;
    private int screenY = 0;
    private int myX = 0;
    private int myY = 0;
    
    public UserFrame(JFrame parent,User user) {
        this.user = user;
        this.parent = parent;
        initComponents();
        
        jLabel12.setVisible(false);
        
        jLabel14.setText(user.getUsername());
        
        ArrayList<String> tmp = user.getButton();
        
        for(int i=0;i<tmp.size();i++){
            CustomJLabelButton btn;
            btn = TabContainer.getButton(tmp.get(i),this.user);
            btn.setComponent(jDesktopPane1, jPanelButtonContainer);
            jPanelButtonContainer.add(btn);
        }
        
       jPanel5.addMouseListener(new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) { }

      @Override
      public void mousePressed(MouseEvent e) {
        screenX = e.getXOnScreen();
        screenY = e.getYOnScreen();

        myX = getX();
        myY = getY();
      }

      @Override
      public void mouseReleased(MouseEvent e) { }

      @Override
      public void mouseEntered(MouseEvent e) { }

      @Override
      public void mouseExited(MouseEvent e) { }

    });
       
    jPanel5.addMouseMotionListener(new MouseMotionListener() {

      @Override
      public void mouseDragged(MouseEvent e) {
        int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;
        setLocation(myX + deltaX, myY + deltaY);
      }

      @Override
      public void mouseMoved(MouseEvent e) { }

    });
        
        for(Component temp: jPanel6.getComponents()){
            temp.addMouseListener(new LabelButtonListener(temp,jPanel6));
        }
        
        jLabelCalculator.addMouseListener(new LabelButtonListener(){
            @Override
            public void mousePressed(MouseEvent me) {
                try {
                    Runtime.getRuntime().exec("calc");
                } catch (IOException ex) {
                }
            }
            
        });
        jLabelFacebook.addMouseListener(new LabelButtonListener(){
            @Override
            public void mousePressed(MouseEvent me) {
                try {                    
                    Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
                } catch (Exception ex) {
                }
            }
        });
        jLabelTwiter.addMouseListener(new LabelButtonListener(){
            @Override
            public void mousePressed(MouseEvent me) {
                try {                    
                    Desktop.getDesktop().browse(new URI("http://www.twitter.com"));
                } catch (Exception ex) {
                }
            }
        });
        jLabelInternetExpolrer.addMouseListener(new LabelButtonListener(){
            @Override
            public void mousePressed(MouseEvent me) {
                try {                    
                    Desktop.getDesktop().browse(new URI("http://www.google.com"));
                } catch (Exception ex) {
                }
            }
        });
        jLabel14.addMouseListener(new LabelButtonListener(jLabel14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelButtonContainer = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelInternetExpolrer = new javax.swing.JLabel();
        jLabelCalculator = new javax.swing.JLabel();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelAbout = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelTwiter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelButtonContainer.setBackground(new java.awt.Color(66, 182, 145));
        jPanelButtonContainer.setLayout(new java.awt.GridLayout(18, 1, 0, 1));
        jPanel1.add(jPanelButtonContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 640));

        jPanel3.setBackground(new java.awt.Color(66, 182, 145));

        jLabel14.setBackground(new java.awt.Color(56, 164, 115));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Male_User_48px.png"))); // NOI18N
        jLabel14.setText("ADMIN");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 700));

        jDesktopPane1.setBackground(new java.awt.Color(60, 74, 77));
        jDesktopPane1.setLayout(new javax.swing.BoxLayout(jDesktopPane1, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 960, 640));

        jPanel5.setBackground(new java.awt.Color(54, 153, 122));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Bus Booking Service");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 960, 60));

        jPanel6.setBackground(new java.awt.Color(54, 153, 122));

        jLabelInternetExpolrer.setBackground(new java.awt.Color(54, 153, 122));
        jLabelInternetExpolrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Google_48px.png"))); // NOI18N
        jLabelInternetExpolrer.setOpaque(true);

        jLabelCalculator.setBackground(new java.awt.Color(54, 153, 122));
        jLabelCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Calculator_48px.png"))); // NOI18N
        jLabelCalculator.setOpaque(true);

        jLabelFacebook.setBackground(new java.awt.Color(54, 153, 122));
        jLabelFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Facebook_48px.png"))); // NOI18N
        jLabelFacebook.setOpaque(true);

        jLabelAbout.setBackground(new java.awt.Color(54, 153, 122));
        jLabelAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Info_48px.png"))); // NOI18N
        jLabelAbout.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(54, 153, 122));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Back_To_48px.png"))); // NOI18N
        jLabel12.setOpaque(true);

        jLabelTwiter.setBackground(new java.awt.Color(54, 153, 122));
        jLabelTwiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon8/UserFrame/icons8_Twitter_48px.png"))); // NOI18N
        jLabelTwiter.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabelInternetExpolrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTwiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(163, 163, 163)
                .addComponent(jLabelInternetExpolrer)
                .addGap(18, 18, 18)
                .addComponent(jLabelFacebook)
                .addGap(18, 18, 18)
                .addComponent(jLabelTwiter)
                .addGap(18, 18, 18)
                .addComponent(jLabelCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabelAbout))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        if(JOptionPane.showOptionDialog(this, "You Want to Logout", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null)==JOptionPane.OK_OPTION){
            MultipleWindowHandle.disposeState(this, parent);
        }else{
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        JDialog dialog;
        dialog = new JOptionPane(new AccountInfo(user), -1, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null).createDialog("Account Info");
        //dialog.setBackground(new Color(60,74,77));
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_jLabel14MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelCalculator;
    private javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelInternetExpolrer;
    private javax.swing.JLabel jLabelTwiter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelButtonContainer;
    // End of variables declaration//GEN-END:variables
}
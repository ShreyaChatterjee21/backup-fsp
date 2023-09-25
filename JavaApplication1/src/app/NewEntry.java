/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Shubh
 */
public class NewEntry extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement pst;
    

    public NewEntry() {
        initComponents();
        DatabaseConn();
        
    }

    public void DatabaseConn() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "";
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Server Connected");
                 jLabel7.setVisible(true);
                 // Print a message when successfully connected
            } catch (SQLException ex) {
                Logger.getLogger(NewEntry.class.getName()).log(Level.SEVERE, null, ex);
                jLabel8.setVisible(true);
            }
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(NewEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void addData() {
        if(tfName.getText().isEmpty() || tfDept.getText().isEmpty() || tfRoll.getText().isEmpty() || tfSem.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(this,"Insufficient data provided"); 
            }
        String name = tfName.getText();
        String dept = tfDept.getText(); // Corrected the variable name
        int roll = Integer.parseInt(tfRoll.getText()); // Corrected the variable name
        int sem = Integer.parseInt(tfSem.getText());

        String query = "INSERT INTO infomation(name, department, roll_no, semester) VALUES (?, ?, ?, ?)";
        try {
            
            pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, dept); // Updated variable name
            pst.setInt(3, roll); // Updated variable name
            pst.setInt(4, sem);
            pst.executeUpdate();
            this.dispose();
            Success su = new Success();
            su.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(NewEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        tfSem = new javax.swing.JTextField();
        tfRoll = new javax.swing.JTextField();
        tfDept = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(856, 495));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADMIN ACTION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel2.setText("Full Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Roll No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Semester");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        tfName.setBackground(new java.awt.Color(58, 58, 58));
        tfName.setForeground(new java.awt.Color(200, 200, 200));
        tfName.setToolTipText("Enter full name...");
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 160, -1));

        tfSem.setBackground(new java.awt.Color(58, 58, 58));
        tfSem.setForeground(new java.awt.Color(200, 200, 200));
        tfSem.setToolTipText("Enter full name...");
        getContentPane().add(tfSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 160, -1));

        tfRoll.setBackground(new java.awt.Color(58, 58, 58));
        tfRoll.setForeground(new java.awt.Color(200, 200, 200));
        tfRoll.setToolTipText("Enter full name...");
        getContentPane().add(tfRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 160, -1));

        tfDept.setBackground(new java.awt.Color(58, 58, 58));
        tfDept.setForeground(new java.awt.Color(200, 200, 200));
        tfDept.setToolTipText("Enter full name...");
        tfDept.setActionCommand("null");
        getContentPane().add(tfDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 160, -1));

        jLabel3.setText("Department");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 590, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/serv.gif"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/err.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/2.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.dispose();
     HomePage hp = new HomePage();
     hp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    addData();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   tfName.setText(""); 
   tfDept.setText("");
tfRoll.setText("");
tfSem.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfDept;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfRoll;
    private javax.swing.JTextField tfSem;
    // End of variables declaration//GEN-END:variables
}

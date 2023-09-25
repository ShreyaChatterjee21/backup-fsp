/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author Shubh
 */
public class SearchEntry extends javax.swing.JFrame {

    /**
     * Creates new form SearchEntry
     */
    public SearchEntry() {
       initComponents() ;
        DatabaseConn();
        
    }
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void SearchData(){
      if(jTextField1.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Insufficient data provided");
      }
      else{
          try {
              int roll = Integer.parseInt(jTextField1.getText());
              String query = "select name,department, semester from infomation where roll_no=?";
              pst = conn.prepareStatement(query);
              pst.setInt(1,roll);
              rs =  pst.executeQuery();
              boolean check = rs.next();
              if(!check){
                  jTextField5.setBackground(Color.red);
                  jTextField5.setText("data not found");
                  jTextField5.setText("");
                  jTextField5.setText("");
                  jTextField5.setText("");
              }
              java.sql.ResultSet rs1 = pst.executeQuery();
              while(rs1.next()){
                  jTextField5.setBackground(Color.green);
                  jTextField5.setText("Data Found :");
                  jTextField2.setText(rs1.getString("name"));
                  jTextField3.setText(rs1.getString("department"));
                  jTextField4.setText(rs1.getString("semester"));
              }} catch (SQLException ex) {
              Logger.getLogger(SearchEntry.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 603));
        setPreferredSize(new java.awt.Dimension(798, 60));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Details");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 410, -1));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Roll No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jTextField1.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, -1));

        jLabel3.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 220, -1));

        jLabel4.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Semester");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 710, 60));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 220, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/serv.gif"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 140, -1));

        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/err.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/sea.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    SearchData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
        HomePage hp = new HomePage();
    hp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEntry().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

   

}

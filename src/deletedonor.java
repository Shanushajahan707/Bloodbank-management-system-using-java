
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shanu shajahan
 */
public class deletedonor extends javax.swing.JFrame {
      Connection con;
    /**
     * Creates new form deletedonor
     */
    public deletedonor() {
        initComponents();
        
        String url ="jdbc:mysql://localhost/bloodbank";
        String user ="root";
        String pass ="";
        try{
           con= DriverManager.getConnection(url,user,pass);  
        }catch(Exception ex){
          System.out.println("Error :" + ex.getMessage());
        }
        table();
    }

    public void table(){
        String sql= "SELECT * FROM newdo";
        try{
          PreparedStatement pst = con.prepareStatement(sql);
          ResultSet rs = pst.executeQuery();
          DefaultTableModel model = (DefaultTableModel)table3.getModel();
          model.setRowCount(0);
          while(rs.next()){
              model.addRow(new String[]{rs.getString(1) ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)} );
          }
        }catch(Exception ex){
            System.out.println("Error :" + ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DELETE DONOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 178, 41));

        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        delete_btn.setText("DELETE");
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_btnMousePressed(evt);
            }
        });
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 110, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        jButton3.setText("BACK");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 100, 30));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DONORID", "FULLNAME", "FATHERNAME", "MOTHERNAME", "DOB", "PHONE", "CITY", "BLOOD", "EMAIL", "ADDRESS"
            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table3MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 490, 510));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("fullname");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 153, 153));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("father name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("mother name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("dob");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jTextField9.setBackground(new java.awt.Color(255, 153, 153));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("phone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        jTextField5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jTextField6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("city");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "THIRUVANANTHAPURAM", "KOLLAM", "PATHANAMTHITTA", "ALAPPUZHA", "KOTTAYAM", "IDUKKI", "ERNAKULAM", "THRISSUR", "PALAKKAD", "MALAPPURAM", "KOZHIKOODE", "KANNUR", "KASARGOD" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("blood");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O-", "O+" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jTextField8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 140, 110));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("donor id");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jTextField7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 801, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_btnActionPerformed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
        setVisible(false);
            new main().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void delete_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMousePressed
        // TODO add your handling code here:
            String donorid=jTextField7.getText();
            String fullname=jTextField2.getText();
            String fathername=jTextField3.getText();
            String mothername=jTextField4.getText();
            String dob=jTextField9.getText();
            String phone=jTextField5.getText();
            String email=jTextField6.getText();
            String city=jComboBox2.getSelectedItem().toString();
            String blood=jComboBox1.getSelectedItem().toString();
            String address=jTextField8.getText();
          if(donorid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill the form Properly", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
           deletedonor(donorid,fullname,fathername,mothername,dob,phone,email,city,blood,address);
         
        } 
       String sql= "SELECT * FROM newdo";
        try{
          PreparedStatement pst = con.prepareStatement(sql);
          ResultSet rs = pst.executeQuery();
          DefaultTableModel model = (DefaultTableModel)table3.getModel();
          model.setRowCount(0);
          while(rs.next()){
            model.addRow(new String[]{rs.getString(1) ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)} );
          }
        }catch(Exception ex){
            System.out.println("Error :" + ex.getMessage());
        } 
    }//GEN-LAST:event_delete_btnMousePressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)table3.getModel();
        int SelectedRowIndex = table3.getSelectedRow();
        jTextField7.setText((String)table3.getValueAt(SelectedRowIndex, 0));
        try{
            int srow=table3.getSelectedRow();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
             jTextField2.setText((String)table3.getValueAt(SelectedRowIndex,1));
            jTextField3.setText((String)table3.getValueAt(SelectedRowIndex,2 ));
             jTextField4.setText((String)table3.getValueAt(SelectedRowIndex,3 ));
             jTextField9.setText((String)table3.getValueAt(SelectedRowIndex, 4));
             jTextField5.setText((String)table3.getValueAt(SelectedRowIndex, 5));
                 jTextField6.setText((String)table3.getValueAt(SelectedRowIndex,6));
                  jComboBox2.addItem((String)table3.getValueAt(SelectedRowIndex, 7));
             jComboBox2.setSelectedItem((String)table3.getValueAt(SelectedRowIndex, 7));
                jComboBox1.addItem((String)table3.getValueAt(SelectedRowIndex, 8));
            jComboBox1.setSelectedItem((String)table3.getValueAt(SelectedRowIndex, 8));
                  jTextField8.setText((String)table3.getValueAt(SelectedRowIndex,9 ));
            
    }//GEN-LAST:event_table3MouseClicked

    private void table3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_table3MousePressed

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
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletedonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable table3;
    // End of variables declaration//GEN-END:variables

private void deletedonor(String donorid, String fullname, String fathername, String mothername, String dob, String phone, String email, String city,String blood,String address ) 
    {
     try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bloodbank","root","");
            PreparedStatement  pst=con.prepareStatement("delete from newdo where donorid = ?");
           
            pst.setString(1, donorid);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Donor Detials Delete Successfully...");
            
            
        } catch (Exception ex) {
            Logger.getLogger(deletedonor.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
    }

    private static class con {

        private static PreparedStatement prepareStatement(String sql) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public con() {
        }
    }
 }

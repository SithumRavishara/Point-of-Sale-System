/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum Ravishara
 */
public class DeleteCustomer extends javax.swing.JFrame {

    /**
     * Creates new form DeleteCustomer
     */
    public DeleteCustomer() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salarytxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adresstxt = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jLabel1.setText("POINT OF SALES SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 330, 35));

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel2.setText("LESLY STORES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("           Name :-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));

        nametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("           Salary :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Customer ID :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 20));

        salarytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytxtActionPerformed(evt);
            }
        });
        jPanel1.add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 210, -1));

        idtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("          Adress :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 20));

        adresstxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(adresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 210, -1));

        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 80, 30));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 290, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void salarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytxtActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        deletebtn.doClick();
    }//GEN-LAST:event_idtxtActionPerformed

    private void adresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresstxtActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "sithum");
            String SQL="delete from customer where id=?";
            PreparedStatement stm = connection.prepareStatement(SQL);
            //Statement stm = connection.createStatement();
            String id = idtxt.getText();
            /*String name = nametxt.getText();
            String adress = adresstxt.getText();
            Double salary =Double.parseDouble(salarytxt.getText());*/
            //String SQL="Insert into Customer Values('"+id+"','"+name+"','"+adress+"',"+salary+")";
            stm.setObject(1, id);
            int res = stm.executeUpdate();
            if(res>0){ 
                
               JOptionPane.showMessageDialog(this, "Delete Customer...");

            }else{
                JOptionPane.showMessageDialog(this, "Customer Not Found..");

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE,null,ex);

        }
    }//GEN-LAST:event_deletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresstxt;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField salarytxt;
    // End of variables declaration//GEN-END:variables
}

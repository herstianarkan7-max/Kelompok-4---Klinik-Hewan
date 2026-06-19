/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.klinikhewan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class datahewan extends javax.swing.JFrame {
    int idPemilikBaru;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(datahewan.class.getName());

    public datahewan() {
        initComponents();
    }
    public void tangkapPemilik(int idMasuk){
        this.idPemilikBaru = idMasuk;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama_hewan = new javax.swing.JTextField();
        jenis_hewan = new javax.swing.JTextField();
        umur_hewan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("DATA HEWAN");

        jLabel2.setText("Nama Hewan");

        jLabel3.setText("Jenis Hewan");

        jLabel4.setText("Umur Hewan");

        nama_hewan.addActionListener(this::nama_hewanActionPerformed);

        jenis_hewan.addActionListener(this::jenis_hewanActionPerformed);

        umur_hewan.addActionListener(this::umur_hewanActionPerformed);

        jButton1.setText("Next");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Back");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(nama_hewan)
                    .addComponent(jenis_hewan)
                    .addComponent(umur_hewan))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_hewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jenis_hewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(umur_hewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
   
    Connection conn = testkoneksi.getKoneksi();
    
    String sql = "INSERT INTO tb_hewan (id_pemilik, nama_hewan, jenis_hewan, umur_hewan) VALUES (?, ?, ?, ?)";
    
    PreparedStatement pst = conn.prepareStatement(sql);
    pst.setInt(1, idPemilikBaru);
    pst.setString(2, nama_hewan.getText()); // Mengisi Nama Hewan
    pst.setString(3, jenis_hewan.getText()); // Mengisi Jenis Hewan
    pst.setString(4, umur_hewan.getText()); // Mengisi Umur Hewan
    
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Data Hewan Berhasil Disimpan!");
    
} catch (Exception e) {
  
    JOptionPane.showMessageDialog(null, "Penyimpanan Gagal: " + e.getMessage());
}
        PilihJenisLayanan PilihJenisLayanan = new
            PilihJenisLayanan();
         
         PilihJenisLayanan.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jenis_hewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_hewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_hewanActionPerformed

    private void umur_hewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umur_hewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umur_hewanActionPerformed

    private void nama_hewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_hewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_hewanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FormLogin FL = new FormLogin();
         FL.setVisible(true);
         this.dispose();
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new datahewan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jenis_hewan;
    private javax.swing.JTextField nama_hewan;
    private javax.swing.JTextField umur_hewan;
    // End of variables declaration//GEN-END:variables
}

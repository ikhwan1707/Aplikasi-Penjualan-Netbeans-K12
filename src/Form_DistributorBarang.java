
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SMKI Utama7
 */
public class Form_DistributorBarang extends javax.swing.JFrame {

    private DefaultTableModel model;
    /**
     * Creates new form Form_Petugas
     */
    public Form_DistributorBarang() {
        initComponents();
        loadData();
        kosong();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtiddistributor = new javax.swing.JTextField();
        txtnamadistributor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamatdistributor = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtemaildistributor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelpondistributor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldistributor = new javax.swing.JTable();
        btnaddnewdistributor = new javax.swing.JButton();
        btnupdatedistributor = new javax.swing.JButton();
        btndeletedistributor = new javax.swing.JButton();
        btncanceldistributor = new javax.swing.JButton();
        btnclosedistributor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtkotaasaldistributor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entri Data Distributor Barang ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID Distributor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, -1));

        jLabel3.setText("Nama Distributor");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        txtiddistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddistributorActionPerformed(evt);
            }
        });
        jPanel2.add(txtiddistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 6, 330, -1));

        txtnamadistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamadistributorActionPerformed(evt);
            }
        });
        jPanel2.add(txtnamadistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 34, 330, -1));

        jLabel4.setText("Alamat Distributor");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, -1, -1));

        txtalamatdistributor.setColumns(20);
        txtalamatdistributor.setRows(5);
        jScrollPane1.setViewportView(txtalamatdistributor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 62, 330, 60));

        jLabel5.setText("E-Mail");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 156, -1, -1));

        txtemaildistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemaildistributorActionPerformed(evt);
            }
        });
        jPanel2.add(txtemaildistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 153, 330, -1));

        jLabel6.setText("Telpon");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 184, -1, -1));
        jPanel2.add(txttelpondistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 181, 167, -1));

        jLabel7.setText("Maksimal 15 Digit");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 184, -1, -1));

        tabeldistributor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldistributor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldistributorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeldistributor);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 214, -1, 201));

        btnaddnewdistributor.setText("Add New");
        btnaddnewdistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewdistributorActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddnewdistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 421, 160, -1));

        btnupdatedistributor.setText("Update");
        btnupdatedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatedistributorActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdatedistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 421, 69, -1));

        btndeletedistributor.setText("Delete");
        btndeletedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletedistributorActionPerformed(evt);
            }
        });
        jPanel2.add(btndeletedistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 421, 67, -1));

        btncanceldistributor.setText("Cancel");
        btncanceldistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceldistributorActionPerformed(evt);
            }
        });
        jPanel2.add(btncanceldistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 421, 67, -1));

        btnclosedistributor.setText("Close");
        btnclosedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclosedistributorActionPerformed(evt);
            }
        });
        jPanel2.add(btnclosedistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 421, 66, -1));

        jLabel8.setText("Kota Asal");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 131, -1, -1));

        txtkotaasaldistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkotaasaldistributorActionPerformed(evt);
            }
        });
        jPanel2.add(txtkotaasaldistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 128, 330, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadData(){
        //Membuat Model
        model = new DefaultTableModel();
        
        //Menghapus Seluruh Data
        model.getDataVector().removeAllElements();
        
        //Memberi Tahu Bahwa Data Telah Kosong
        model.fireTableDataChanged();
        
        tabeldistributor.setModel(model);
        model.addColumn("ID Distributor");
        model.addColumn("Nama Distributor");
        model.addColumn("Alamat");
        model.addColumn("Kota Asal");
        model.addColumn("Email");
        model.addColumn("Telpon");
        
        try{
            
        String sql = "SELECT * FROM tbldistributor";
        
        Connection c = Koneksi.getKoneksi();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
        //Lakukan Penelusuran Baris
        model.addRow(new Object[]{
            r.getString(1),
            r.getString(2),
            r.getString(3),
            r.getString(4),
            r.getString(5),
            r.getString(6)
        });
    }
    tabeldistributor.setModel(model);
    }catch(SQLException e){
        System.out.println("Terjadi Error");
    }
}
    private void kosong(){
        txtiddistributor.setText(null);
        txtnamadistributor.setText(null);
        txtalamatdistributor.setText(null);
        txtkotaasaldistributor.setText(null);
        txtemaildistributor.setText(null);
        txttelpondistributor.setText(null);
    }
    
    private void txtiddistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiddistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiddistributorActionPerformed

    private void txtemaildistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemaildistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemaildistributorActionPerformed

    private void btnaddnewdistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewdistributorActionPerformed
        // TODO add your handling code here:
        String id = txtiddistributor.getText();
        String nama = txtnamadistributor.getText();
        String alamat = txtalamatdistributor.getText();
        String kotaasal = txtkotaasaldistributor.getText();
        String email = txtemaildistributor.getText();
        String telpon = txttelpondistributor.getText();
        
        
        if ("".equals(id) ||
            "".equals(nama) ||
            "".equals(alamat) ||
            "".equals(kotaasal) ||
            "".equals(email) ||
            "".equals(telpon))
        {
            JOptionPane.showMessageDialog(this,
                    "Harap Lengkapi Data",
                    "Error", JOptionPane.WARNING_MESSAGE);  
        } else {
            
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "INSERT INTO tbldistributor VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                
                p.setString(1, id);
                p.setString(2, nama);
                p.setString(3, alamat);
                p.setString(4, kotaasal);
                p.setString(5, email);
                p.setString(6, telpon);
                
                p.executeUpdate();
                p.close();
                
                JOptionPane.showMessageDialog(null,
                        "Data Berhasil diSimpan");
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,
                        e.getMessage());
            }finally{
                loadData();
                kosong();
            }
        }
    }//GEN-LAST:event_btnaddnewdistributorActionPerformed

    private void txtkotaasaldistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkotaasaldistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkotaasaldistributorActionPerformed

    private void txtnamadistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamadistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamadistributorActionPerformed

    private void tabeldistributorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldistributorMouseClicked
        // TODO add your handling code here:
        int baris = tabeldistributor.getSelectedRow();
        
        if(baris == -1){
            
            return;
        }
        
        String id = tabeldistributor.getValueAt(baris, 0).toString();
        txtiddistributor.setText(id);
        String nama = tabeldistributor.getValueAt(baris, 1).toString();
        txtnamadistributor.setText(nama);
        String alamat = tabeldistributor.getValueAt(baris, 2).toString();
        txtalamatdistributor.setText(alamat);
        String kotaasal = tabeldistributor.getValueAt(baris, 3).toString();
        txtkotaasaldistributor.setText(kotaasal);
        String email = tabeldistributor.getValueAt(baris, 4).toString();
        txtemaildistributor.setText(email);
        String telpon = tabeldistributor.getValueAt(baris, 5).toString();
        txttelpondistributor.setText(telpon);
    }//GEN-LAST:event_tabeldistributorMouseClicked

    private void btnclosedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclosedistributorActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnclosedistributorActionPerformed

    private void btncanceldistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceldistributorActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btncanceldistributorActionPerformed

    private void btndeletedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletedistributorActionPerformed
        // TODO add your handling code here:
        int i = tabeldistributor.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String IDDistributor = (String) model.getValueAt(i, 0);
        
        try{
            Connection c = Koneksi.getKoneksi();
            
            String sql = "DELETE FROM tbldistributor WHERE IDDistributor = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, IDDistributor);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
        } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally {
            loadData();
            kosong();
        }
    }//GEN-LAST:event_btndeletedistributorActionPerformed

    private void btnupdatedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatedistributorActionPerformed
        // TODO add your handling code here:
        int i = tabeldistributor.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String id = (String) model.getValueAt(i, 0);
        String nama = txtnamadistributor.getText();
        String alamat = txtalamatdistributor.getText();
        String kotaasal = txtkotaasaldistributor.getText();
        String email = txtemaildistributor.getText();
        String telpon = txttelpondistributor.getText();
        
        try{
            Connection c = Koneksi.getKoneksi();
            
            String sql = "UPDATE tbldistributor SET NamaDistributor = ?, Alamat = ?, KotaAsal = ?, Email = ?, Telpon = ? WHERE IDDistributor = ?";
                    
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, nama);
            p.setString(2, alamat);
            p.setString(3, kotaasal);
            p.setString(4, email);
            p.setString(5, telpon);
            p.setString(6, id);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil diUbah");
        } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally {
            loadData();
            kosong();
        }
    }//GEN-LAST:event_btnupdatedistributorActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_DistributorBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnewdistributor;
    private javax.swing.JButton btncanceldistributor;
    private javax.swing.JButton btnclosedistributor;
    private javax.swing.JButton btndeletedistributor;
    private javax.swing.JButton btnupdatedistributor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabeldistributor;
    private javax.swing.JTextArea txtalamatdistributor;
    private javax.swing.JTextField txtemaildistributor;
    private javax.swing.JTextField txtiddistributor;
    private javax.swing.JTextField txtkotaasaldistributor;
    private javax.swing.JTextField txtnamadistributor;
    private javax.swing.JTextField txttelpondistributor;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elhannnn
 */
public class BarangForm extends javax.swing.JFrame {
    private Connection conn;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BarangForm.class.getName());

    public BarangForm() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTersedia = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Form Barang");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah Total");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 51));
        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 51));
        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnInput.setBackground(new java.awt.Color(0, 102, 255));
        btnInput.setForeground(new java.awt.Color(255, 255, 255));
        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Jumlah Total ", "Jumlah Tersedia", "Status"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Barang Tersedia");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTersedia)))
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(42, 42, 42))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInput)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tblBarang.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Baris Yang Akan Diperbarui!");
            return;
        }

        int id = Integer.parseInt(tblBarang.getValueAt(selectedRow, 0).toString());
        String kode = txtKode.getText();
        String nama = txtNamaBarang.getText();
        String total = txtQuantity.getText();
        String tersedia = txtTersedia.getText();

        if (kode.isEmpty() || nama.isEmpty() || total.isEmpty() || tersedia.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Semua kolom harus diisi!",
                    "Validasi",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE sarana SET kode_barang=?, nama_sarana=?, jumlah_total=?, jumlah_tersedia=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);

            // ⚠️ URUTAN HARUS PAS
            st.setString(1, kode);
            st.setString(2, nama);
            st.setInt(3, Integer.parseInt(total));
            st.setInt(4, Integer.parseInt(tersedia));
            st.setInt(5, id); // ✅ INI YANG KAMU LUPA

            int rowUpdated = st.executeUpdate();

            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data sarana berhasil diupdate!");
                resetForm();
                getData();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Gagal mengupdate data!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblBarang.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                    "Pilih data yang akan dihapus!",
                    "Validasi",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Ambil ID dari kolom 0
        int id = Integer.parseInt(tblBarang.getValueAt(selectedRow, 0).toString());

        // Konfirmasi hapus
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String sql = "DELETE FROM sarana WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id); // ✅ WAJIB

            int rowDeleted = st.executeUpdate();

            if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(this,
                        "Data sarana berhasil dihapus!");
                resetForm();
                getData();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Data gagal dihapus!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        String kode = txtKode.getText();
        String nama = txtNamaBarang.getText();
        String total = txtQuantity.getText();
        String tersedia = txtTersedia.getText();

        // Validasi input
        if (kode.isEmpty() || nama.isEmpty() || total.isEmpty() || tersedia.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Semua kolom harus diisi!",
                    "Validasi", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "INSERT INTO sarana(kode_barang, nama_sarana, jumlah_total, jumlah_tersedia) "
                       + "VALUES (?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1,kode);
            st.setString(2, nama);
            st.setInt(3, Integer.parseInt(total));
            st.setInt(4, Integer.parseInt(tersedia));

            int rowInserted = st.executeUpdate();

            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, 
                        "Data sarana berhasil ditambahkan!");

                resetForm();
                getData();
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Gagal menambahkan data!",
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }

            st.close();

        } catch (NumberFormatException nfe) {
            // Jika input angka tidak valid
            JOptionPane.showMessageDialog(this, 
                    "Kode, Total, dan Tersedia harus berupa angka!",
                    "Format Angka Salah",
                    JOptionPane.ERROR_MESSAGE);

        } catch (SQLIntegrityConstraintViolationException dup) {
            JOptionPane.showMessageDialog(this, 
                    "Kode barang sudah terdaftar! Gunakan kode yang berbeda.",
                    "Duplikat Data",
                    JOptionPane.WARNING_MESSAGE);

        } catch (SQLException sqlEx) {
            // Menangkap error SQL lain
            JOptionPane.showMessageDialog(this,
                    "Terjadi kesalahan database:\n" + sqlEx.getMessage(),
                    "SQL Error",
                    JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE, null, sqlEx);
        } 
        catch (Exception e) {
            // Error umum lainnya
            JOptionPane.showMessageDialog(this,
                    "Terjadi kesalahan:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
         int selectedRow = tblBarang.getSelectedRow();

        if (selectedRow != -1) {

            int id = Integer.parseInt(tblBarang.getValueAt(selectedRow, 0).toString()); // 🔥 ID
            String kode_barang = tblBarang.getValueAt(selectedRow, 1).toString();
            String nama_sarana = tblBarang.getValueAt(selectedRow, 2).toString();
            String jumlah_total = tblBarang.getValueAt(selectedRow, 3).toString();
            String jumlah_tersedia = tblBarang.getValueAt(selectedRow, 4).toString();
            String status = tblBarang.getValueAt(selectedRow, 5).toString();

            txtKode.setText(kode_barang);
            txtNamaBarang.setText(nama_sarana);
            txtQuantity.setText(jumlah_total);
            txtTersedia.setText(jumlah_tersedia);

            // DEBUG (opsional)
            System.out.println("ID BARANG DIPILIH = " + id);

            btnInput.setEnabled(false);
            btnEdit.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_tblBarangMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new BarangForm().setVisible(true));
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM sarana ORDER BY id DESC";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id"); // 🔥 ID ASLI
                String kode_barang = rs.getString("kode_barang");
                String nama_sarana = rs.getString("nama_sarana");
                String jumlah_total = rs.getString("jumlah_total");
                String jumlah_tersedia = rs.getString("jumlah_tersedia");
                String status = rs.getString("status");

                Object[] rowData = {
                    id,              // ✅ KOLOM 0 = ID
                    kode_barang,
                    nama_sarana,
                    jumlah_total,
                    jumlah_tersedia,
                    status
                };

                model.addRow(rowData);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void resetForm() {
        txtKode.setText("");
        txtNamaBarang.setText("");
        txtQuantity.setText("");
        txtTersedia.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTersedia;
    // End of variables declaration//GEN-END:variables
}

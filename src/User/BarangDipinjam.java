/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import Session.UserSession;
import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BarangDipinjam extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BarangDipinjam.class.getName());

    private Connection conn;
    
    public BarangDipinjam() {
        initComponents();
        conn = Koneksi.getConnection(); 
        tampilPengembalian();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengembalian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtKeperluan = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        btnKembalikan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Kembalikan Barang");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Barang", "Quantity", "Keperluan", "Dari Tanggal", "Sampai Tangal", "Status"
            }
        ));
        tblPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPengembalian);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIdPeminjaman.setEditable(false);
        txtIdPeminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtQty.setEditable(false);
        txtQty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtKeperluan.setEditable(false);
        txtKeperluan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtTanggalKembali.setEditable(false);
        txtTanggalKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtTanggal.setEditable(false);
        txtTanggal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "disetujui", "ditolak", "dikembalikan" }));
        cmbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnKembalikan.setBackground(new java.awt.Color(255, 255, 51));
        btnKembalikan.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnKembalikan.setText("Kembalikan");
        btnKembalikan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Kembalikan Baarng");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBarang.setEditable(false);
        txtBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdPeminjaman)
                        .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(txtKeperluan, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(txtTanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembalikan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBarang))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnKembalikan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPengembalianMouseClicked
        int selectedRow = tblPengembalian.getSelectedRow();
        if (selectedRow == -1) return;

        // 🔥 AMBIL DATA SESUAI INDEX KOLOM
        int idPeminjaman = Integer.parseInt(
            tblPengembalian.getValueAt(selectedRow, 0).toString()
        );

        String barang = tblPengembalian.getValueAt(selectedRow, 1).toString();
        String keperluan = tblPengembalian.getValueAt(selectedRow, 2).toString();
        String qty = tblPengembalian.getValueAt(selectedRow, 3).toString();
        String tanggalPinjam = tblPengembalian.getValueAt(selectedRow, 4).toString();
        String tanggalKembali = tblPengembalian.getValueAt(selectedRow, 5).toString();

        // 🔹 ISI KE FORM (INI YANG BENAR)
        txtIdPeminjaman.setText(String.valueOf(idPeminjaman));
        txtBarang.setText(barang);              // ✅ INI YANG KAMU LUPA
        txtKeperluan.setText(keperluan);
        txtQty.setText(qty);
        txtTanggal.setText(tanggalPinjam);
        txtTanggalKembali.setText(tanggalKembali);

        // 🔹 SET STATUS OTOMATIS
        cmbStatus.setSelectedItem("dikembalikan");

        btnKembalikan.setEnabled(true);

        System.out.println("ID DIPILIH = " + idPeminjaman);
    }//GEN-LAST:event_tblPengembalianMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HomeFormUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        if (txtIdPeminjaman.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Pilih barang yang akan dikembalikan!");
            return;
        }

        int idPeminjaman = Integer.parseInt(txtIdPeminjaman.getText());
        Connection conn = null;

        try {
            conn = Koneksi.getConnection();
            conn.setAutoCommit(false);

            // 🔍 CEK STATUS SAAT INI
            String cekStatus = "SELECT status FROM peminjaman WHERE id=?";
            PreparedStatement psCheck = conn.prepareStatement(cekStatus);
            psCheck.setInt(1, idPeminjaman);

            ResultSet rs = psCheck.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
                return;
            }

            if (!rs.getString("status").equals("disetujui")) {
                JOptionPane.showMessageDialog(this,
                    "Barang sudah dikembalikan!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            // 1️⃣ UPDATE STATUS
            String sqlUpdate =
            "UPDATE peminjaman SET status='dikembalikan', tanggal_kembali=NOW() WHERE id=?";
            PreparedStatement ps1 = conn.prepareStatement(sqlUpdate);
            ps1.setInt(1, idPeminjaman);
            ps1.executeUpdate();

            // 2️⃣ TAMBAH STOK SARANA
            String sqlStok =
            "UPDATE sarana s " +
            "JOIN peminjaman p ON p.id_sarana = s.id " +
            "SET s.jumlah_tersedia = s.jumlah_tersedia + p.jumlah_dipinjam " +
            "WHERE p.id=?";

            PreparedStatement ps2 = conn.prepareStatement(sqlStok);
            ps2.setInt(1, idPeminjaman);
            ps2.executeUpdate();

            conn.commit();

            JOptionPane.showMessageDialog(this,
                "Barang berhasil dikembalikan!",
                "Sukses",
                JOptionPane.INFORMATION_MESSAGE);

            tampilPengembalian();
            resetFormPengembalian();
            btnKembalikan.setEnabled(false);

        } catch (Exception e) {

            try { if (conn != null) conn.rollback(); } catch (Exception ex) {}

            JOptionPane.showMessageDialog(this,
                "Gagal mengembalikan barang:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);

        } finally {
            try { if (conn != null) conn.setAutoCommit(true); } catch (Exception e) {}
        }
    }//GEN-LAST:event_btnKembalikanActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new BarangDipinjam().setVisible(true));
    }
    
    private void tampilPengembalian() {
        DefaultTableModel model =
            (DefaultTableModel) tblPengembalian.getModel();
        model.setRowCount(0);

        int idWarga = UserSession.getInstance().getIdWarga();

        try {
            String sql =
                "SELECT p.id, s.nama_sarana, p.urgensi, p.jumlah_dipinjam, " +
                "p.tanggal_pinjam, p.tanggal_kembali, p.status " +
                "FROM peminjaman p " +
                "JOIN sarana s ON p.id_sarana = s.id " +
                "WHERE p.id_warga = ? AND p.status = 'disetujui'";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idWarga);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),                // 0 ID (hidden)
                    rs.getString("nama_sarana"),    // 1 Barang
                    rs.getString("urgensi"),        // 2 Keperluan
                    rs.getInt("jumlah_dipinjam"),   // 3 Qty
                    rs.getDate("tanggal_pinjam"),  // 4 Tgl Pinjam
                    rs.getDate("tanggal_kembali"), // 5 Tgl Kembali
                    rs.getString("status")          // 6 Status
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Gagal menampilkan data:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPengembalian;
    private javax.swing.JTextField txtBarang;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtKeperluan;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTanggalKembali;
    // End of variables declaration//GEN-END:variables

    private void resetFormPengembalian() {
        txtIdPeminjaman.setText("");
        txtBarang.setText("");
        txtQty.setText("");
        txtKeperluan.setText("");
        txtTanggal.setText("");
        txtTanggalKembali.setText("");
    }
}

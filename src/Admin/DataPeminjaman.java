/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;


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
public class DataPeminjaman extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DataPeminjaman.class.getName());

    private Connection conn;

    public DataPeminjaman() {
        initComponents();
        conn = Koneksi.getConnection(); // SAMA PERSIS
        tampilData();

            for (int i = 0; i < tblPeminjaman.getColumnCount(); i++) {
                System.out.println(
                    "Index " + i + " = " + tblPeminjaman.getColumnName(i)

            );
        }
        tblPeminjaman.getColumnModel().getColumn(0).setMinWidth(0);
        tblPeminjaman.getColumnModel().getColumn(0).setMaxWidth(0);
        tblPeminjaman.getColumnModel().getColumn(0).setWidth(0);


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSampaiTgl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        cmbStatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtBarang = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtKeperluan = new javax.swing.JTextField();
        txtDariTgl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(20, 20, 20))
        );

        txtSampaiTgl.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Data Peminjaman");

        btnUpdate.setBackground(new java.awt.Color(255, 255, 0));
        btnUpdate.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Warga ", "Barang Yang Ingin Dipinjam", "Quantity", "Keperluan", "Dari Tanggal", "Sampai Taggal", "Status"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "disetujui", "ditolak", "dikembalikan" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(51, 51, 255));
        btnHitung.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(255, 255, 255));
        btnHitung.setText("Hitung Kelayakan");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Update Status");

        txtNama.setEditable(false);

        txtBarang.setEditable(false);

        txtQuantity.setEditable(false);

        txtKeperluan.setEditable(false);

        txtDariTgl.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnHitung))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama)
                    .addComponent(txtBarang)
                    .addComponent(txtQuantity)
                    .addComponent(txtKeperluan)
                    .addComponent(txtDariTgl)
                    .addComponent(txtSampaiTgl)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnHitung)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDariTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSampaiTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        int selectedRow = tblPeminjaman.getSelectedRow();

        if (selectedRow != -1) {

            int id = Integer.parseInt(tblPeminjaman.getValueAt(selectedRow, 0).toString()); // 🔥 ID ASLI
            String nama_lengkap = tblPeminjaman.getValueAt(selectedRow, 1).toString();
            String barang = tblPeminjaman.getValueAt(selectedRow, 2).toString();
            String qty = tblPeminjaman.getValueAt(selectedRow, 3).toString();
            String keperluan = tblPeminjaman.getValueAt(selectedRow, 4).toString();
            String dari_tanggal = tblPeminjaman.getValueAt(selectedRow, 5).toString();
            String sampai_tanggal = tblPeminjaman.getValueAt(selectedRow, 6).toString();

            txtNama.setText(nama_lengkap);
            txtBarang.setText(barang);
            txtQuantity.setText(qty);
            txtKeperluan.setText(keperluan);
            txtDariTgl.setText(dari_tanggal);
            txtSampaiTgl.setText(sampai_tanggal);

            System.out.println("ID DIPILIH = " + id);
        }

        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       new HasilWP().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHitungActionPerformed


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblPeminjaman.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                "Pilih data peminjaman terlebih dahulu!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idPeminjaman = Integer.parseInt(
            tblPeminjaman.getValueAt(selectedRow, 0).toString()
        );

        String statusLama = tblPeminjaman.getValueAt(selectedRow, 7).toString();
        String statusBaru = cmbStatus.getSelectedItem().toString();

        Connection conn = null;

        try {
            conn = Koneksi.getConnection();
            conn.setAutoCommit(false);

            // 🔒 VALIDASI ALUR STATUS
            if (statusLama.equals("pending") &&
               !(statusBaru.equals("disetujui") || statusBaru.equals("ditolak"))) {
                throw new Exception("Status tidak valid!");
            }

            if (statusLama.equals("disetujui") && !statusBaru.equals("dipinjam")) {
                throw new Exception("Harus menjadi DIPINJAM!");
            }

            if (statusLama.equals("dipinjam") && !statusBaru.equals("dikembalikan")) {
                throw new Exception("Harus menjadi DIKEMBALIKAN!");
            }

            // 1️⃣ UPDATE STATUS
            String sqlUpdateStatus =
                "UPDATE peminjaman SET status=?, tanggal_kembali=NOW() WHERE id=?";
            PreparedStatement psStatus =
                conn.prepareStatement(sqlUpdateStatus);

            psStatus.setString(1, statusBaru);
            psStatus.setInt(2, idPeminjaman);
            psStatus.executeUpdate();

            // 2️⃣ JIKA DISETUJUI → KURANGI STOK
            if (statusBaru.equals("disetujui")) {

                String sqlKurangStok =
                    "UPDATE sarana s " +
                    "JOIN peminjaman p ON p.id_sarana = s.id " +
                    "SET s.jumlah_tersedia = s.jumlah_tersedia - p.jumlah_dipinjam " +
                    "WHERE p.id = ? AND s.jumlah_tersedia >= p.jumlah_dipinjam";

                PreparedStatement psKurang =
                    conn.prepareStatement(sqlKurangStok);
                psKurang.setInt(1, idPeminjaman);

                if (psKurang.executeUpdate() == 0) {
                    throw new Exception("Stok sarana tidak mencukupi!");
                }
            }

            // 3️⃣ JIKA DIKEMBALIKAN → TAMBAH STOK
            if (statusBaru.equals("dikembalikan")) {

                String sqlTambahStok =
                    "UPDATE sarana s " +
                    "JOIN peminjaman p ON p.id_sarana = s.id " +
                    "SET s.jumlah_tersedia = s.jumlah_tersedia + p.jumlah_dipinjam " +
                    "WHERE p.id = ?";

                PreparedStatement psTambah =
                    conn.prepareStatement(sqlTambahStok);
                psTambah.setInt(1, idPeminjaman);
                psTambah.executeUpdate();
            }

            conn.commit();

            JOptionPane.showMessageDialog(this,
                "Status peminjaman berhasil diperbarui!");

            tampilData();
            resetForm();

        } catch (Exception e) {

            try {
                if (conn != null) conn.rollback();
            } catch (Exception ex) {}

            JOptionPane.showMessageDialog(this,
                e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);

        } finally {
            try {
                if (conn != null) conn.setAutoCommit(true);
            } catch (Exception e) {}
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DataPeminjaman().setVisible(true));
    }
    
    private void tampilData() {

       DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        model.setRowCount(0);

        try {
            String sql =
                "SELECT p.id, w.nama_lengkap, s.nama_sarana, p.jumlah_dipinjam, " +
                "p.urgensi, p.tanggal_pinjam, p.tanggal_kembali, p.status " +
                "FROM peminjaman p " +
                "JOIN warga w ON p.id_warga = w.id " +
                "JOIN sarana s ON p.id_sarana = s.id " +
                "WHERE p.status = 'pending'";


            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int no = 1;

           while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),          // ⬅️ ID (TERSEMBUNYI)
                    rs.getString("nama_lengkap"),
                    rs.getString("nama_sarana"),
                    rs.getInt("jumlah_dipinjam"),
                    rs.getString("urgensi"),
                    rs.getDate("tanggal_pinjam"),
                    rs.getDate("tanggal_kembali"),
                    rs.getString("status")
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Gagal menampilkan data:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    
    private void resetForm() {
        txtNama.setText("");
        txtBarang.setText("");
        txtQuantity.setText("");
        txtKeperluan.setText("");
        txtDariTgl.setText("");
        txtSampaiTgl.setText("");
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtBarang;
    private javax.swing.JTextField txtDariTgl;
    private javax.swing.JTextField txtKeperluan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSampaiTgl;
    // End of variables declaration//GEN-END:variables
}

package User;

import Admin.*;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import Config.Koneksi;
import java.sql.*;
import javax.swing.*;
import Session.UserSession;
import Auth.LoginForm;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;

public class PeminjamanForm extends javax.swing.JFrame {
    private int idWargaLogin;
    private String namaWargaLogin;
    private Connection conn;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PeminjamanForm.class.getName());


    public PeminjamanForm() {
        initComponents(); // ⬅️ WAJIB PALING AWAL

        // === WINDOW LISTENER DITARUH DI SINI ===
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                try {
                    if (conn != null && !conn.isClosed()) {
                        conn.close();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        setLocationRelativeTo(null);
        setTitle("Form Pengajuan Peminjaman Sarana RT");

        // ===== CEK SESSION LOGIN =====
        UserSession session = UserSession.getInstance();
        if (session.getIdWarga() <= 0) {
            JOptionPane.showMessageDialog(this,
                "Silakan login terlebih dahulu!",
                "Akses Ditolak", JOptionPane.ERROR_MESSAGE);
            new LoginForm().setVisible(true);
            dispose();
            return;
        }

        idWargaLogin = session.getIdWarga();
        namaWargaLogin = session.getNamaWarga();

        conn = Koneksi.getConnection(); // buka koneksi

        txtNamaWarga.setEditable(false);
        txtNamaWarga.setText(namaWargaLogin);

        loadBarangComboBox();
    }

   private void loadNamaWarga() {
    String sql = "SELECT nama_lengkap FROM warga WHERE id = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, idWargaLogin);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                txtNamaWarga.setText(rs.getString("nama_lengkap"));
            } else {
                txtNamaWarga.setText("Warga tidak ditemukan");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
                "Gagal load nama: " + e.getMessage());
        e.printStackTrace();
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaWarga = new javax.swing.JTextField();
        cmbBarang = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        tglBalikin = new com.toedter.calendar.JDateChooser();
        tglPinjam = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cmbKeperluan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel1.setText("Form Peminjaman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Peminjam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Pinjam Tanggal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Sampai Tanggal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));
        getContentPane().add(txtNamaWarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, -1));

        cmbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBarangActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 200, -1));
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 200, -1));
        getContentPane().add(tglBalikin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 200, -1));
        getContentPane().add(tglPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, -1));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajukan Peminjaman");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Keperluan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 99, -1));

        cmbKeperluan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pernikahan", "Arisan", "Pengajian", "Kematian", "Sunatan", "Acara Pribadi" }));
        getContentPane().add(cmbKeperluan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 440, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBarangActionPerformed
    }//GEN-LAST:event_cmbBarangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ajukanPeminjaman();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeFormUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    
    private boolean ajukanPeminjaman() {
        if (cmbBarang.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tidak ada barang tersedia!");
            return false;
        }

        Barang barang = (Barang) cmbBarang.getSelectedItem();

        if (barang == null) {
            JOptionPane.showMessageDialog(this, "Silakan pilih barang!");
            return false;
        }

        int idBarang = barang.id;
        int stokTersedia = barang.stok;


        String qtyText = txtQuantity.getText().trim();
        if (qtyText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah yang ingin dipinjam!");
            return false;
        }
        int jumlah;
        try {
            jumlah = Integer.parseInt(qtyText);
            if (jumlah <= 0) throw new Exception();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Jumlah harus angka positif!");
            return false;
        }

        Date datePinjam = tglPinjam.getDate();
        Date dateKembali = tglBalikin.getDate();
        if (datePinjam == null || dateKembali == null) {
            JOptionPane.showMessageDialog(this, "Pilih tanggal pinjam dan kembali!");
            return false;
        }
        if (dateKembali.before(datePinjam)) {
            JOptionPane.showMessageDialog(this, "Tanggal kembali tidak boleh sebelum tanggal pinjam!");
            return false;
        }

        String keperluan = cmbKeperluan.getSelectedItem().toString();

        if (keperluan.isEmpty()) keperluan = "Acara RT / Hajatan";

        Connection conn = Koneksi.getConnection();
        try {
            // Cek stok
            String cek = "SELECT jumlah_tersedia FROM sarana WHERE id = ?";
            PreparedStatement psCek = conn.prepareStatement(cek);
            psCek.setInt(1, idBarang);
            ResultSet rs = psCek.executeQuery();
            if (rs.next() && rs.getInt("jumlah_tersedia") < jumlah) {
                JOptionPane.showMessageDialog(this, "Stok tidak cukup! Tersedia hanya " + rs.getInt("jumlah_tersedia"));
                return false;
            }

            // Simpan pengajuan
            String sql = "INSERT INTO peminjaman (id_warga, id_sarana, jumlah_dipinjam, tanggal_pinjam, tanggal_kembali, urgensi, status) VALUES (?, ?, ?, ?, ?, ?, 'pending')";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idWargaLogin);
            ps.setInt(2, idBarang);
            ps.setInt(3, jumlah);
            ps.setDate(4, new java.sql.Date(datePinjam.getTime()));
            ps.setDate(5, new java.sql.Date(dateKembali.getTime()));
            ps.setString(6, keperluan);

            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, 
                    "Pengajuan berhasil dikirim!\nMenunggu persetujuan Pak RT.", 
                    "Sukses", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengajukan: " + e.getMessage());
        }
        return false;
    }
    
    private void loadBarangComboBox() {
        String sql = "SELECT id, nama_sarana, jumlah_tersedia " +
                     "FROM sarana WHERE jumlah_tersedia > 0 " +
                     "ORDER BY nama_sarana";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            cmbBarang.removeAllItems();

           while (rs.next()) {
                cmbBarang.addItem(
                    new Barang(
                        rs.getInt("id"),
                        rs.getString("nama_sarana"),
                        rs.getInt("jumlah_tersedia")
                    )
                );
            }


            if (cmbBarang.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "Tidak ada barang tersedia!");
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Gagal memuat data barang:\n" + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PeminjamanForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Barang> cmbBarang;
    private javax.swing.JComboBox<String> cmbKeperluan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser tglBalikin;
    private com.toedter.calendar.JDateChooser tglPinjam;
    private javax.swing.JTextField txtNamaWarga;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

class Barang {
    int id;
    String nama;
    int stok;

    Barang(int id, String nama, int stok) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama;
    }
}


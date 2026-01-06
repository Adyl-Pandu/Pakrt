package Admin;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import Config.Koneksi;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;

public class PeminjamanForm extends javax.swing.JFrame {

    private Connection conn;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PeminjamanForm.class.getName());


    public PeminjamanForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Form Pengajuan Peminjaman Sarana RT");

        conn = Koneksi.getConnection(); // ✅ HARUS PALING AWAL


        loadWargaComboBox();        // ✅ sekarang aman
        loadBarangComboBox();
        getData();
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
        cmbBarang = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        tglBalikin = new com.toedter.calendar.JDateChooser();
        tglPinjam = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cmbKeperluan = new javax.swing.JComboBox<>();
        cmbWarga = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKeranjang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Form Peminjaman");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Peminjam");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Barang");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Pinjam Tanggal");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Sampai Tanggal");

        cmbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBarangActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajukan Peminjaman");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Keperluan");

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Jumlah Tersedia", "Status"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Data Barang");

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmbKeperluan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pernikahan", "Arisan", "Pengajian", "Kematian", "Sunatan", "Acara Pribadi" }));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tambah Kranjang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblKeranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblKeranjang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel2))
                                            .addGap(183, 183, 183))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cmbKeperluan, 0, 178, Short.MAX_VALUE)
                                                .addComponent(cmbBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbWarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtQuantity)
                                                .addComponent(tglBalikin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tglPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(jButton1)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addGap(25, 25, 25)))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbWarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbKeperluan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tglBalikin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBarangActionPerformed
    }//GEN-LAST:event_cmbBarangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ajukanPeminjaman();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        int selectedRow = tblBarang.getSelectedRow();

        if (selectedRow != -1) {

            String nama_sarana = tblBarang.getValueAt(selectedRow, 1).toString();
            String jumlah_tersedia = tblBarang.getValueAt(selectedRow, 2).toString();
            String status = tblBarang.getValueAt(selectedRow, 3).toString();
        }
    }//GEN-LAST:event_tblBarangMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BarangItem barang = (BarangItem) cmbBarang.getSelectedItem();

        if (barang == null || txtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Barang & jumlah wajib diisi!");
            return;
        }

        int jumlah = Integer.parseInt(txtQuantity.getText());

        DefaultTableModel model =
            (DefaultTableModel) tblKeranjang.getModel();

        model.addRow(new Object[]{
            barang.getId(),
            barang.getNama(),
            jumlah
        });

        txtQuantity.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "select * from sarana ORDER BY id DESC";
            PreparedStatement st =conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            int no =1;
            while(rs.next()){
                String nama_sarana = rs.getString("nama_sarana");
                String jumlah_tersedia = rs.getString("jumlah_tersedia");
                String status = rs.getString("status");
                
                
                
                Object[] rowData ={no,nama_sarana,jumlah_tersedia,status};
                model.addRow(rowData);
                no++;
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(BarangForm.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private boolean ajukanPeminjaman() {

        // 🔍 VALIDASI BARANG
        if (cmbBarang.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Pilih barang terlebih dahulu!");
            return false;
        }

        // 🔍 VALIDASI WARGA
        if (cmbWarga.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Pilih warga terlebih dahulu!");
            return false;
        }

        // 🔥 AMBIL DATA DARI COMBOBOX (OBJECT)
        BarangItem barang = (BarangItem) cmbBarang.getSelectedItem();
        WargaItem warga = (WargaItem) cmbWarga.getSelectedItem();

        int idBarang = barang.getId();
        int idWarga = warga.getId();

        // 🔢 VALIDASI JUMLAH
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

        // 📅 VALIDASI TANGGAL
        Date datePinjam = tglPinjam.getDate();
        Date dateKembali = tglBalikin.getDate();

        if (datePinjam == null || dateKembali == null) {
            JOptionPane.showMessageDialog(this, "Pilih tanggal pinjam dan kembali!");
            return false;
        }

        if (dateKembali.before(datePinjam)) {
            JOptionPane.showMessageDialog(this,
                "Tanggal kembali tidak boleh sebelum tanggal pinjam!");
            return false;
        }

        // 📝 URGENSI / KEPERLUAN
        String urgensi = cmbKeperluan.getSelectedItem().toString();
        if (urgensi == null || urgensi.isEmpty()) {
            urgensi = "Acara RT / Hajatan";
        }

        try (Connection conn = Koneksi.getConnection()) {

            // 🔍 CEK STOK BARANG
            String cek = "SELECT jumlah_tersedia FROM sarana WHERE id=?";
            PreparedStatement psCek = conn.prepareStatement(cek);
            psCek.setInt(1, idBarang);
            ResultSet rs = psCek.executeQuery();

            if (rs.next()) {
                int tersedia = rs.getInt("jumlah_tersedia");
                if (tersedia < jumlah) {
                    JOptionPane.showMessageDialog(this,
                        "Stok tidak cukup!\nTersedia: " + tersedia);
                    return false;
                }
            }

            // 💾 SIMPAN PEMINJAMAN
            String sql =
                "INSERT INTO peminjaman " +
                "(id_warga, id_sarana, jumlah_dipinjam, tanggal_pinjam, tanggal_kembali, urgensi, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, 'pending')";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idWarga);   // 🔥 DARI COMBOBOX WARGA
            ps.setInt(2, idBarang);
            ps.setInt(3, jumlah);
            ps.setDate(4, new java.sql.Date(datePinjam.getTime()));
            ps.setDate(5, new java.sql.Date(dateKembali.getTime()));
            ps.setString(6, urgensi);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                "Pengajuan peminjaman berhasil!",
                "Sukses",
                JOptionPane.INFORMATION_MESSAGE
            );

            this.dispose();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Gagal mengajukan peminjaman:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    
    private void loadBarangComboBox() {
        String sql = "SELECT id, kode_barang, nama_sarana, jumlah_tersedia "
                   + "FROM sarana WHERE jumlah_tersedia > 0 ORDER BY nama_sarana";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            cmbBarang.removeAllItems();

            while (rs.next()) {
                cmbBarang.addItem(
                    new BarangItem(
                        rs.getInt("id"),
                        rs.getString("nama_sarana")
                    )
                );
            }


            if (cmbBarang.getItemCount() == 0) {
                cmbBarang.setEnabled(false);
                JOptionPane.showMessageDialog(this,
                    "Tidak ada data Barang!");
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                    "Gagal load barang: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private void loadWargaComboBox() {

        String sql =
            "SELECT id, nama_lengkap " +
            "FROM warga " +
            "ORDER BY nama_lengkap";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            cmbWarga.removeAllItems();

            while (rs.next()) {
                cmbWarga.addItem(
                    new WargaItem(
                        rs.getInt("id"),
                        rs.getString("nama_lengkap")
                    )
                );
            }

           if (cmbWarga.getItemCount() == 0) {
                cmbWarga.setEnabled(false);
                JOptionPane.showMessageDialog(this,
                    "Tidak ada data warga!");
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Gagal load warga: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PeminjamanForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<BarangItem> cmbBarang;
    private javax.swing.JComboBox<String> cmbKeperluan;
    private javax.swing.JComboBox<WargaItem> cmbWarga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTable tblKeranjang;
    private com.toedter.calendar.JDateChooser tglBalikin;
    private com.toedter.calendar.JDateChooser tglPinjam;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

class BarangItem {
    private int id;
    private String nama;

    public BarangItem(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nama;
    }
}

class WargaItem {
    private int id;
    private String nama;

    public WargaItem(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nama;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;
import Config.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elhannnn
 */
public class HasilWP extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HasilWP.class.getName());

    private Connection conn;

    public HasilWP() {
        initComponents();
        conn = Koneksi.getConnection();
        tampilData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        tblWP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Warga", "Barang", "Quantity", "Keperluan", "Dari Tanggal", "Sampai Tanggal", "Status", "Kepemilikan Rumah", "Pekerjaan", "Penghasilan", "Nilai WP", "Ranking"
            }
        ));
        jScrollPane1.setViewportView(tblWP);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Perhitungan WP");

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnKembali.setBackground(new java.awt.Color(255, 255, 51));
        btnKembali.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(51, 51, 255));
        btnHitung.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(255, 255, 255));
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali)
                        .addGap(29, 29, 29)
                        .addComponent(btnHitung))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHitung)
                        .addComponent(btnKembali)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        if (tblWP.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,
                "Tidak ada data konflik!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "Hitung WP & setujui peminjaman PRIORITAS?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) return;

        hitungWP();          // 1️⃣ hitung + sorting
        autoApproveTop1();   // 2️⃣ setujui ranking 1
        tampilData();        // 3️⃣ refresh table
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new HasilWP().setVisible(true));
    }
    
    private void autoApproveTop1() {

        if (tblWP.getRowCount() == 0) return;

        // Ambil ID peminjaman dari baris TERATAS
        int idPeminjaman = Integer.parseInt(
            tblWP.getValueAt(0, 0).toString() // kolom ID
        );

        Connection conn = null;

        try {
            conn = Koneksi.getConnection();
            conn.setAutoCommit(false);

            // 1️⃣ Update status jadi disetujui
            String sqlUpdate =
                "UPDATE peminjaman SET status='disetujui' WHERE id=?";
            PreparedStatement ps1 = conn.prepareStatement(sqlUpdate);
            ps1.setInt(1, idPeminjaman);
            ps1.executeUpdate();

            // 2️⃣ Kurangi stok sarana
            String sqlStok =
                "UPDATE sarana s " +
                "JOIN peminjaman p ON p.id_sarana = s.id " +
                "SET s.jumlah_tersedia = s.jumlah_tersedia - p.jumlah_dipinjam " +
                "WHERE p.id = ? AND s.jumlah_tersedia >= p.jumlah_dipinjam";

            PreparedStatement ps2 = conn.prepareStatement(sqlStok);
            ps2.setInt(1, idPeminjaman);

            if (ps2.executeUpdate() == 0) {
                throw new Exception("Stok sarana tidak mencukupi!");
            }

            conn.commit();

            JOptionPane.showMessageDialog(this,
                "Peminjaman PRIORITAS berhasil disetujui otomatis!",
                "Sukses",
                JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {

            try { if (conn != null) conn.rollback(); } catch (Exception ex) {}

            JOptionPane.showMessageDialog(this,
                "Auto approve gagal:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );

        } finally {
            try { if (conn != null) conn.setAutoCommit(true); } catch (Exception e) {}
        }
    }

    
    private void tampilData() {

       DefaultTableModel model = (DefaultTableModel) tblWP.getModel();
        model.setRowCount(0);

        try {
            String sql =
                "SELECT p.id, w.nama_lengkap, s.nama_sarana, p.jumlah_dipinjam, " +
                "p.urgensi, p.tanggal_pinjam, p.tanggal_kembali, " +
                "w.status_pernikahan, w.kepemilikan_rumah, " +
                "w.pekerjaan, w.penghasilan " +
                "FROM peminjaman p " +
                "JOIN warga w ON p.id_warga = w.id " +
                "JOIN sarana s ON p.id_sarana = s.id " +
                "JOIN ( " +
                "   SELECT id_sarana, DATE(tanggal_pinjam) tgl " +
                "   FROM peminjaman " +
                "   WHERE status = 'pending' " +
                "   GROUP BY id_sarana, DATE(tanggal_pinjam) " +
                "   HAVING COUNT(*) > 1 " +
                ") konflik " +
                "ON p.id_sarana = konflik.id_sarana " +
                "AND DATE(p.tanggal_pinjam) = konflik.tgl " +
                "WHERE p.status = 'pending'";





            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int no = 1;

           while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),                 // 0
                    rs.getString("nama_lengkap"),    // 1
                    rs.getString("nama_sarana"),     // 2
                    rs.getInt("jumlah_dipinjam"),    // 3
                    rs.getString("urgensi"),         // 4
                    rs.getString("tanggal_pinjam"),  // 5
                    rs.getString("tanggal_kembali"), // 6
                    rs.getString("status_pernikahan"),   // 7
                    rs.getString("kepemilikan_rumah"),   // 8
                    rs.getString("pekerjaan"),           // 9
                    rs.getInt("penghasilan"),            // 10
                    "", // 11 nilai WP
                    ""  // 12 ranking
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
    
    
    private int nilaiUrgensi(String u) {
        switch (u) {
            case "Kematian": return 5;
            case "Pernikahan": return 4;
            case "Sunatan": return 3;
            case "Pengajian": return 2;
            case "Arisan": return 1;
            case "Acara Pribadi": return 1;
            default: return 1;
        }
    }

    
    private int nilaiStatus(String s) {
        switch (s) {
            case "Fakir Miskin": return 4;
            case "Yatim / Piatu": return 3;
            case "Janda": return 3;
            case "Menikah": return 2;
            case "Belum Menikah": return 1;
            default: return 1;
        }
    }

    
    private int nilaiRumah(String r) {
        switch (r) {
            case "Tinggal Bareng Orang Tua": return 3;
            case "Kontrak": return 2;
            case "Rumah Sendiri": return 1;
            default: return 1;
        }
    }

    
    
    private int nilaiPekerjaan(String p) {
        switch (p) {
            case "Tidak Bekerja": return 5;
            case "Karyawan Swasta": return 4;
            case "Karyawan BUMN": return 3;
            case "PNS":
            case "TNI":
            case "POLRI": return 2;
            default: return 1;
        }
    }

    
    private int nilaiPenghasilan(int gaji) {
        if (gaji == 0) return 5;
        if (gaji <= 1000000) return 4;
        if (gaji <= 3000000) return 3;
        return 1;
    }

    
    private void hitungWP() {

        int rowCount = tblWP.getRowCount();

        double[] nilaiWP = new double[rowCount];
        double totalWP = 0;

        double w1 = 0.40; // urgensi
        double w2 = 0.10; // status
        double w3 = 0.15; // rumah
        double w4 = 0.20; // pekerjaan
        double w5 = 0.15; // penghasilan

        for (int i = 0; i < rowCount; i++) {

            String urgensi   = tblWP.getValueAt(i, 4).toString();
            String status    = tblWP.getValueAt(i, 7).toString();
            String rumah     = tblWP.getValueAt(i, 8).toString();
            String pekerjaan = tblWP.getValueAt(i, 9).toString();
            int penghasilan  = Integer.parseInt(
                tblWP.getValueAt(i, 10).toString()
            );

            int c1 = nilaiUrgensi(urgensi);
            int c2 = nilaiStatus(status);
            int c3 = nilaiRumah(rumah);
            int c4 = nilaiPekerjaan(pekerjaan);
            int c5 = nilaiPenghasilan(penghasilan);

            // RUMUS WP
            double S =
                Math.pow(c1, w1) *
                Math.pow(c2, w2) *
                Math.pow(c3, w3) *
                Math.pow(c4, w4) *
                Math.pow(c5, w5);

            nilaiWP[i] = S;
            totalWP += S;

            // tampilkan nilai S di table
            tblWP.setValueAt(String.format("%.5f", S), i, 11);
        }

        // normalisasi + ranking + sorting
        beriRanking(nilaiWP, totalWP);
    }


    private void beriRanking(double[] wp, double total) {
        int n = wp.length;
        Double[][] data = new Double[n][2];

        for (int i = 0; i < n; i++) {
            double v = wp[i] / total;
            data[i][0] = (double) i; // index baris
            data[i][1] = v;

            tblWP.setValueAt(String.format("%.5f", v), i, 11); // nilai V
        }

        // SORT DESC (nilai terbesar di atas)
        Arrays.sort(data, (a, b) -> Double.compare(b[1], a[1]));

        DefaultTableModel model = (DefaultTableModel) tblWP.getModel();
        Object[][] temp = new Object[n][model.getColumnCount()];

        for (int i = 0; i < n; i++) {
            int row = data[i][0].intValue();
            for (int j = 0; j < model.getColumnCount(); j++) {
                temp[i][j] = model.getValueAt(row, j);
            }
            temp[i][12] = i + 1; // ranking
        }

        model.setRowCount(0);
        for (Object[] row : temp) {
            model.addRow(row);
        }
    }

    
    private void rankingWP(int baris) {

        Double[] nilai = new Double[baris];
        Integer[] index = new Integer[baris];

        // Ambil nilai WP dari tabel
        for (int i = 0; i < baris; i++) {
            nilai[i] = Double.parseDouble(
                tblWP.getValueAt(i, 9).toString() // kolom nilai WP
            );
            index[i] = i;
        }

        // Urutkan dari terbesar ke terkecil
        Arrays.sort(index, (a, b) -> Double.compare(nilai[b], nilai[a]));

        // Simpan ranking ke tabel
        for (int i = 0; i < baris; i++) {
            tblWP.setValueAt(i + 1, index[i], 10); // kolom ranking
        }
    }



    

    


    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWP;
    // End of variables declaration//GEN-END:variables
}

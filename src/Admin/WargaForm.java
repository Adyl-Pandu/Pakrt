/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

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
public class WargaForm extends javax.swing.JFrame {
    
    private Connection conn;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(WargaForm.class.getName());

    public WargaForm() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNoHP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbKepemilikan = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbPenghasilan = new javax.swing.JComboBox<>();
        cmbPekerjaan = new javax.swing.JComboBox<>();
        txtAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWarga = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Admin");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txtUsername.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 270, -1));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Form Warga");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("Role");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cmbRole.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin-Pengurus", "User-Warga" }));
        jPanel1.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 270, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        btnDaftar.setBackground(new java.awt.Color(51, 51, 255));
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 99, -1));

        txtNama.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 270, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Nama Kepala Keluarga");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtNoHP.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jPanel1.add(txtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 270, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Nomor HP");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnEdit.setBackground(new java.awt.Color(255, 255, 51));
        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 99, -1));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 99, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 51));
        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 99, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel5.setText("Data Warga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        txtPassword.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 270, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("Pekerjaan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        cmbStatus.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janda", "Menikah", "Belum Menikah", "Yatim / Piatu", "Fakir Miskin", " " }));
        jPanel1.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 270, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setText("Kepemilikan Rumah");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 20));

        cmbKepemilikan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cmbKepemilikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rumah Sendiri", "Kontrak", "Tinggal Bareng Orang Tua" }));
        cmbKepemilikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKepemilikanActionPerformed(evt);
            }
        });
        jPanel1.add(cmbKepemilikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 270, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel12.setText("Penghasilan");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        cmbPenghasilan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cmbPenghasilan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rp. 0 - Rp.1.000.000", "Rp.1.000.000 - Rp.3.000.000", "Rp.3.000.000 - Rp.5.000.000", "> Rp.5.000.000", " " }));
        jPanel1.add(cmbPenghasilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 270, -1));

        cmbPekerjaan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cmbPekerjaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PNS", "TNI", "POLRI", "Karyawan Swasta", "Karyawan BUMN", "Tidak Bekerja" }));
        jPanel1.add(cmbPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 270, -1));

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtAlamat.setRows(5);
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 270, -1));

        tblWarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Username", "Nama", "Nomor HP", "Pekerjaan", "Status Pribadi", "Kepemilikan Rumah", "Penghasilan", "Alamat", "Role"
            }
        ));
        tblWarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWargaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblWarga);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 910, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngaaa.com-7310383.png"))); // NOI18N
        jPanel3.add(jLabel16);

        jLabel15.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Admin");
        jPanel3.add(jLabel15);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       int selectedRow = tblWarga.getSelectedRow();
       if(selectedRow == -1){
           JOptionPane.showMessageDialog(this,"Pilih Baris Yang Akan Diperbarui!");
           return;
       }
       
        int id = Integer.parseInt(tblWarga.getValueAt(selectedRow, 0).toString());
        String username = txtUsername.getText();
        String nama_lengkap = txtNama.getText();
        String noHp = txtNoHP.getText();
        String pekerjaan = cmbPekerjaan.getSelectedItem().toString();
        String status = cmbStatus.getSelectedItem().toString();
        String kepemilikan = cmbKepemilikan.getSelectedItem().toString();
        String penghasilanText = cmbPenghasilan.getSelectedItem().toString();
        int penghasilan = getPenghasilanValue(penghasilanText);        
        String alamat = txtAlamat.getText();
        String password = new String(txtPassword.getPassword());
        String selected = cmbRole.getSelectedItem().toString();
        String role = "";

        if (selected.equals("Admin-Pengurus")) {
            role = "admin";
        } else if (selected.equals("User-Warga")) {
            role = "user";
        }
        
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password wajib diisi saat edit!");
            return;
        }


         if (nama_lengkap.isEmpty() || username.isEmpty() || password.isEmpty() || 
            noHp.isEmpty() ||pekerjaan.isEmpty()||status.isEmpty()||kepemilikan.isEmpty()
           || alamat.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, 
                    "Semua kolom harus terisi!", 
                    "Validasi", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        try {
            String sql;
            PreparedStatement st;

            if (password.isEmpty()) {
                sql = "UPDATE warga SET username=?,nama_lengkap=?,noHp=?,pekerjaan=?,status_pernikahan=?,kepemilikan_rumah=?,penghasilan=?,alamat=?,role=? WHERE id=?";
                st = conn.prepareStatement(sql);

                st.setString(1, username);
                st.setString(2, nama_lengkap);
                st.setString(3, noHp);
                st.setString(4, pekerjaan);
                st.setString(5, status);
                st.setString(6, kepemilikan);
                st.setInt(7, penghasilan);
                st.setString(8, alamat);
                st.setString(9, role);
                st.setInt(10, id);

            } else {
                sql = "UPDATE warga SET username=?,nama_lengkap=?,noHp=?,pekerjaan=?,status_pernikahan=?,kepemilikan_rumah=?,penghasilan=?,alamat=?,role=?,password=? WHERE id=?";
                st = conn.prepareStatement(sql);

                st.setString(1, username);
                st.setString(2, nama_lengkap);
                st.setString(3, noHp);
                st.setString(4, pekerjaan);
                st.setString(5, status);
                st.setString(6, kepemilikan);
                st.setInt(7, penghasilan);
                st.setString(8, alamat);
                st.setString(9, role);
                st.setString(10, password);
                st.setInt(11, id);
            }
            
            System.out.println("ID UPDATE = " + id);
            System.out.println("PASSWORD = '" + password + "'");
            System.out.println("ROLE = [" + role + "]");

            System.out.println("EDIT penghasilan text : " + penghasilanText);
            System.out.println("EDIT penghasilan int  : " + penghasilan);

            int rowUpdated = st.executeUpdate();

            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui!");
                resetForm();
                getData();
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Data gagal diupdate!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            st.close();
        }catch(Exception e){
            Logger.getLogger(WargaForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        String username = txtUsername.getText();
        String nama_lengkap = txtNama.getText();
        String noHp = txtNoHP.getText();
        String pekerjaan = cmbPekerjaan.getSelectedItem().toString();
        String status = cmbStatus.getSelectedItem().toString();
        String kepemilikan = cmbKepemilikan.getSelectedItem().toString();
        String penghasilanText = cmbPenghasilan.getSelectedItem().toString();
        int penghasilan = getPenghasilanValue(penghasilanText);

        String alamat = txtAlamat.getText();
        String password = new String(txtPassword.getPassword());
        String selected = cmbRole.getSelectedItem().toString();
        String role = "";

        // Validasi input kosong
        if (nama_lengkap.isEmpty() || username.isEmpty() || password.isEmpty() || 
            noHp.isEmpty() ||pekerjaan.isEmpty()||status.isEmpty()||kepemilikan.isEmpty()
            || alamat.isEmpty()) {

            JOptionPane.showMessageDialog(this, 
                    "Semua kolom harus terisi!", 
                    "Validasi", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }


        if (selected.equals("Admin-Pengurus")) {
            role = "admin";
        } else if (selected.equals("User-Warga")) {
            role = "user";
        }


        try {
            String sql = "INSERT INTO warga(username,nama_lengkap,noHp,pekerjaan,status_pernikahan,kepemilikan_rumah,penghasilan,alamat,role,password) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, username);
            st.setString(2, nama_lengkap);
            st.setString(3, noHp);
            st.setString(4, pekerjaan);
            st.setString(5, status);
            st.setString(6, kepemilikan);
            st.setInt(7, penghasilan);
            st.setString(8, alamat);
            st.setString(9, role);
            st.setString(10, password);
            
   
            int rowInserted = st.executeUpdate();

            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan!");
                resetForm();
                getData();
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Data gagal ditambahkan!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }

            st.close();

        } catch (Exception e) {
            // tampilkan error di console NetBeans
            e.printStackTrace();

            // tampilkan error ke user
            JOptionPane.showMessageDialog(this, 
                    "Terjadi kesalahan: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);

            // kirim error log ke Log System
            Logger.getLogger(WargaForm.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btnDaftarActionPerformed
 
    private int getPenghasilanValue(String penghasilanText) {
    switch (penghasilanText) {
        case "Rp. 0 - Rp.1.000.000":
            return 0;
        case "Rp.1.000.000 - Rp.3.000.000":
            return 1000000;
        case "Rp.3.000.000 - Rp.5.000.000":
            return 3000000;
        case "> Rp.5.000.000":
            return 5000000;
        default:
            return 0;
    }
}






    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblWargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWargaMouseClicked

        int selectedRow = tblWarga.getSelectedRow();

        if (selectedRow != -1) {

            int id = Integer.parseInt(tblWarga.getValueAt(selectedRow, 0).toString()); // 🔥 ID ASLI
            String username = tblWarga.getValueAt(selectedRow, 1).toString();
            String nama = tblWarga.getValueAt(selectedRow, 2).toString();
            String noHp = tblWarga.getValueAt(selectedRow, 3).toString();
            String pekerjaan = tblWarga.getValueAt(selectedRow, 4).toString();
            String status = tblWarga.getValueAt(selectedRow, 5).toString();
            String kepemilikan = tblWarga.getValueAt(selectedRow, 6).toString();
            String penghasilan = tblWarga.getValueAt(selectedRow, 7).toString();
            String alamat = tblWarga.getValueAt(selectedRow, 8).toString();
            String role = tblWarga.getValueAt(selectedRow, 9).toString();

            txtUsername.setText(username);
            txtNama.setText(nama);
            txtNoHP.setText(noHp);
            cmbPekerjaan.setSelectedItem(pekerjaan);
            cmbStatus.setSelectedItem(status);
            cmbKepemilikan.setSelectedItem(kepemilikan);
            cmbPenghasilan.setSelectedItem(penghasilan);
            txtAlamat.setText(alamat);
            cmbRole.setSelectedItem(role);

            System.out.println("ID DIPILIH = " + id);
        }

        btnEdit.setEnabled(true);
        btnDaftar.setEnabled(false);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblWargaMouseClicked

    private void cmbKepemilikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKepemilikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKepemilikanActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new WargaForm().setVisible(true));
    }
    
    private void getData() {
    DefaultTableModel model = (DefaultTableModel) tblWarga.getModel();
    model.setRowCount(0);

    try {
        String sql = "SELECT * FROM warga";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id"); // 🔥 AMBIL ID ASLI
            String username = rs.getString("username");
            String nama_lengkap = rs.getString("nama_lengkap");
            String noHp = rs.getString("noHp");
            String pekerjaan = rs.getString("pekerjaan");
            String status_pernikahan = rs.getString("status_pernikahan");
            String kepemilikan_rumah = rs.getString("kepemilikan_rumah");
            String penghasilan = rs.getString("penghasilan");
            String alamat = rs.getString("alamat");
            String role = rs.getString("role");

            Object[] rowData = {
                id, // ✅ KOLOM 0 = ID
                username,
                nama_lengkap,
                noHp,
                pekerjaan,
                status_pernikahan,
                kepemilikan_rumah,
                penghasilan,
                alamat,
                role
            };

            model.addRow(rowData);
        }

        rs.close();
        st.close();

    } catch (Exception e) {
        Logger.getLogger(WargaForm.class.getName()).log(Level.SEVERE, null, e);
    }
}


    private void resetForm() {
        txtNama.setText("");
        txtUsername.setText("");
        txtNoHP.setText("");
        txtAlamat.setText("");
        txtPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cmbKepemilikan;
    private javax.swing.JComboBox<String> cmbPekerjaan;
    private javax.swing.JComboBox<String> cmbPenghasilan;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblWarga;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHP;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}


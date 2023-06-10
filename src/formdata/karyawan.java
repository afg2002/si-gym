/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formdata;

import helper.database;
import helper.reset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author afgha
 */
public class karyawan extends javax.swing.JFrame {
    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset reset = new reset();
    String table = "karyawan";
    String[] columns = {"id_karyawan","nama_karyawan","no_telp","jenis_kelamin","jabatan","email","tgl_bekerja"};
    String[] columnsUpdate = {"nama_karyawan","no_telp","jenis_kelamin","jabatan","email","tgl_bekerja"};
    
    protected void datatable(){
        Object[] Baris = {"id_karyawan","nama_karyawan","no_telp","jenis_kelamin","jabatan","email","tgl_bekerja"};
        tabmode  = new DefaultTableModel(null, Baris);
        tabKaryawan.setModel(tabmode);
        String sql = "select * from karyawan";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("id_karyawan");
                String b= res.getString("nama_karyawan");
                String d= res.getString("no_telp");
                String e = res.getString("jenis_kelamin");
                String f = res.getString("jabatan");
                String g = res.getString("tgl_bekerja");
                String h = res.getString("email");
                
                String[] data = {a,b,d,e,f,h,g};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     void reset(){
        reset.resetTextFields(this.getContentPane());
    }
     
     
    public karyawan() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tIdKaryawan = new javax.swing.JTextField();
        tNamaKaryawan = new javax.swing.JTextField();
        cJK = new javax.swing.JComboBox<>();
        tNoTelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cJabatan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dcTglBekerja = new com.toedter.calendar.JDateChooser();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabKaryawan = new javax.swing.JTable();
        bCetak = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        tEmail = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DATA KARYAWAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(437, 437, 437))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        jLabel2.setText("ID Karyawan");

        jLabel3.setText("Nama Karyawan");

        jLabel4.setText("No Telp");

        jLabel5.setText("Jenis Kelamin");

        cJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "== Pilih Jenis Kelamin == ", "Laki-laki", "Perempuan", " " }));

        jLabel6.setText("Jabatan");

        cJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "== Pilih Jabatan ==", "Kasir", "Office Boy" }));

        jLabel7.setText("Email");

        jLabel8.setText("Tanggal Bekerja");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bExit.setText("Exit");

        tabKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabKaryawan);

        bCetak.setText("Cetak");

        bClear.setText("Clear");

        bCari.setText("Cari");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNoTelp)
                            .addComponent(tIdKaryawan)
                            .addComponent(cJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNamaKaryawan)
                            .addComponent(cJabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcTglBekerja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCari))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExit)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bClear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bCari)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(tNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(tNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(cJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dcTglBekerja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCetak)
                            .addComponent(bClear))
                        .addGap(18, 58, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
//        String id_karyawan = tIdKaryawan.getText();
        String nama_karyawan = tNamaKaryawan.getText();
        String notelp = tNoTelp.getText();
        String email = tEmail.getText();
        String jk = cJK.getSelectedItem().toString();
        String jm = cJabatan.getSelectedItem().toString();
        java.sql.Date tglBekerja = new java.sql.Date(dcTglBekerja.getDate().getTime());
        Object[] values = {"0", nama_karyawan,notelp,jk,jm,email,tglBekerja};
        
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String condition = "id_karyawan = " + tIdKaryawan.getText();
        try {
            db.deleteData(conn, table, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
            String id_karyawan = tIdKaryawan.getText();
            String sql = "SELECT * FROM karyawan WHERE id_karyawan = " + id_karyawan;
            try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("nama_karyawan");
                String b = res.getString("no_telp");
                String c = res.getString("jenis_kelamin");
                String d = res.getString("jabatan");
                String e = res.getString("email");
                java.sql.Date f = res.getDate("tgl_bekerja");
                tNamaKaryawan.setText(a);
                tNoTelp.setText(b);
                cJK.setSelectedItem(c);
                cJabatan.setSelectedItem(d);
                tEmail.setText(e);
                dcTglBekerja.setDate(f);
            }
            } catch (SQLException ex) {
                Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bCariActionPerformed

    private void tabKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabKaryawanMouseClicked
        int selectedRowIndex =  tabKaryawan.getSelectedRow();
        String a = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String b = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String c = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String d = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String e = tabmode.getValueAt(selectedRowIndex, 4).toString();
        String f = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String g = tabmode.getValueAt(selectedRowIndex, 6).toString();
        
        tIdKaryawan.setText(a);
        tNamaKaryawan.setText(b);
        tNoTelp.setText(c);
        cJK.setSelectedItem(d);
        cJabatan.setSelectedItem(e);
        tEmail.setText(f);
        dcTglBekerja.setDate(java.sql.Date.valueOf(g));
    }//GEN-LAST:event_tabKaryawanMouseClicked

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        String id_karyawan = tIdKaryawan.getText();
        String nama_karyawan = tNamaKaryawan.getText();
        String notelp = tNoTelp.getText();
        String jk = cJK.getSelectedItem().toString();
        String jb = cJabatan.getSelectedItem().toString();
        String email = tEmail.getText();
        java.sql.Date tgl_bekerja = new java.sql.Date(dcTglBekerja.getDate().getTime());
        Object[] values = {nama_karyawan,notelp,jk,jb,email,tgl_bekerja};
        String condition = "id_karyawan = " + id_karyawan; //
        System.out.println(condition);
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columnsUpdate, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JComboBox<String> cJK;
    private javax.swing.JComboBox<String> cJabatan;
    private com.toedter.calendar.JDateChooser dcTglBekerja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tIdKaryawan;
    private javax.swing.JTextField tNamaKaryawan;
    private javax.swing.JTextField tNoTelp;
    private javax.swing.JTable tabKaryawan;
    // End of variables declaration//GEN-END:variables
}

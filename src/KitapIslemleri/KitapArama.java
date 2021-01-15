package KitapIslemleri;

import Database.Kitaplar;
import Database.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import keeptoo.Drag;
import net.proteanit.sql.DbUtils;

public class KitapArama extends javax.swing.JFrame {

    DefaultTableModel model;
    ResultSet resultset;
    DBHelper helper = new DBHelper();
    Connection connection = null;
    PreparedStatement preparedStatement;

    public KitapArama() throws SQLException {
        initComponents();
        model = (DefaultTableModel) tableKitaplar.getModel();
        connection = helper.getConnection();
        try {
            ArrayList<Kitaplar> kitaplar = getKitap();
            for (Kitaplar kitap : kitaplar) {
                Object[] row = {kitap.getKitapAdı(), kitap.getKitapNo(), kitap.getSayfaSayısı(), kitap.getYazar(), kitap.getYayınevi()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<Kitaplar> getKitap() throws SQLException {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        Statement statement = null;
        ResultSet resultset;
        ArrayList<Kitaplar> kitaplar = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery("select *from kitaplar");
            kitaplar = new ArrayList<Kitaplar>();
            while (resultset.next()) {
                kitaplar.add(new Kitaplar(
                        resultset.getString("KitapAdı"),
                        resultset.getInt("KitapNo"),
                        resultset.getInt("SayfaSayısı"),
                        resultset.getString("Yazar"),
                        resultset.getString("Yayınevi")
                ));

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }
        return kitaplar;
    }
    private void güncelleme(){
        String sql ="select * from kitaplar";
        try {
            preparedStatement=connection.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            tableKitaplar.setModel(DbUtils.resultSetToTableModel(resultset));
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,exception);
        }
                
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKitaplar = new javax.swing.JTable();
        txtAra = new javax.swing.JTextField();
        txtKitapAdi = new javax.swing.JTextField();
        txtSayfaSayisi = new javax.swing.JTextField();
        txtYayinevi = new javax.swing.JTextField();
        txtYazari = new javax.swing.JTextField();
        txtKitapNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_search_in_list_100px.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_undo_50px.png")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(74, 74, 74))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(229, 229, 229))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        tableKitaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Adı", "Kitap Numarası", "Sayfa Sayısı", "Kitap Yazarı", "Kitap Yayınevi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKitaplar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKitaplarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKitaplar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 640, 200));

        txtAra.setForeground(new java.awt.Color(0, 153, 153));
        txtAra.setText("Aramak için 'enter'e basınız...");
        txtAra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAraMouseClicked(evt);
            }
        });
        txtAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAraActionPerformed(evt);
            }
        });
        jPanel1.add(txtAra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 290, 30));

        txtKitapAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKitapAdi.setForeground(new java.awt.Color(0, 102, 102));
        txtKitapAdi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 210, 30));

        txtSayfaSayisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSayfaSayisi.setForeground(new java.awt.Color(0, 102, 102));
        txtSayfaSayisi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSayfaSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSayfaSayisiActionPerformed(evt);
            }
        });
        jPanel1.add(txtSayfaSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 210, 30));

        txtYayinevi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtYayinevi.setForeground(new java.awt.Color(0, 102, 102));
        txtYayinevi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtYayinevi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 210, 30));

        txtYazari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtYazari.setForeground(new java.awt.Color(0, 102, 102));
        txtYazari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtYazari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYazariActionPerformed(evt);
            }
        });
        jPanel1.add(txtYazari, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 210, 30));

        txtKitapNo.setEditable(false);
        txtKitapNo.setBackground(new java.awt.Color(255, 255, 255));
        txtKitapNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKitapNo.setForeground(new java.awt.Color(0, 102, 102));
        txtKitapNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("KitapAdı:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kitap Numarası:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sayfa Sayısı:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kitap Yazarı:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Kitap Yayınevi:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        kButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_update_left_rotation_24px.png")); // NOI18N
        kButton3.setText("       Güncelle");
        kButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton3.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton3.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton3.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton3.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton3.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 90, 40));

        jLabel8.setText("Önce tablodan seçip güncellemek istediğiniz ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, 20));

        jLabel9.setText("bilginin ilgili kutucuğundan düzeltme yapıp");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, 20));

        jLabel10.setText("'Güncelleme' butonuna basınız.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(990, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setVisible(false);
        OduncAlma ob = null;
        try {
            ob = new OduncAlma();
        } catch (SQLException ex) {
            Logger.getLogger(KitapArama.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_formMousePressed
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_formMouseDragged
    private void txtAraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAraMouseClicked
        txtAra.setText(null);
    }//GEN-LAST:event_txtAraMouseClicked
    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        String searchKey = txtAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tableKitaplar.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtAraActionPerformed

    private void txtSayfaSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSayfaSayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSayfaSayisiActionPerformed

    private void txtYazariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYazariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYazariActionPerformed

    private void tableKitaplarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKitaplarMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) tableKitaplar.getModel();
        String tblKitapAdi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 0).toString();
        String tblKitapNo = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 1).toString();
        String tblSayfaSayisi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 2).toString();
        String tblYazar = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 3).toString();
        String tblYayinevi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 4).toString();
        txtKitapNo.setText(tblKitapNo);
        txtKitapAdi.setText(tblKitapAdi);
        txtSayfaSayisi.setText(tblSayfaSayisi);
        txtYazari.setText(tblYazar);
        txtYayinevi.setText(tblYayinevi);
    }//GEN-LAST:event_tableKitaplarMouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        String sql = "UPDATE `kutuphaneotomasyonu`.`kitaplar` SET"
                +"`KitapAdı` = '"+txtKitapAdi.getText()+"',"               
                +"`SayfaSayısı` = '"+txtSayfaSayisi.getText()+"',"
                +"`Yazar` = '"+txtYazari.getText()+"',"
                +"`Yayınevi` = '"+txtYayinevi.getText()+"'"
                +"where KitapNo = '"+txtKitapNo.getText()+"'";
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null,"Güncelleme işlemi başarıyla gerçekleşti.");
            güncelleme();
            
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }                        
    }//GEN-LAST:event_kButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(KitapArama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapArama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapArama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapArama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KitapArama().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KitapArama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
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
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tableKitaplar;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtKitapAdi;
    private javax.swing.JTextField txtKitapNo;
    private javax.swing.JTextField txtSayfaSayisi;
    private javax.swing.JTextField txtYayinevi;
    private javax.swing.JTextField txtYazari;
    // End of variables declaration//GEN-END:variables
}

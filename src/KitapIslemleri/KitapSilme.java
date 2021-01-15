package KitapIslemleri;

import Database.Kitaplar;
import Database.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import keeptoo.Drag;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import UygulamaEkrani.AnaEkran;
import net.proteanit.sql.DbUtils;

public class KitapSilme extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection connection = null;
    ResultSet resultset;
    PreparedStatement preparedStatement;
    DBHelper helper = new DBHelper();

    public KitapSilme() throws SQLException {
        initComponents();
        connection = helper.getConnection();
        KitapArama();
    }

    public void KitapArama() throws SQLException {

        model = (DefaultTableModel) tableKitaplar.getModel();
        connection = helper.getConnection();
        try {
            ArrayList<Kitaplar> kitaplar = getKitap();
            for (Kitaplar kitap : kitaplar) {
                Object[] row = {kitap.getKitapAdı(), kitap.getKitapNo(), kitap.getSayfaSayısı(), kitap.getYazar(), kitap.getYayınevi()};
                model.addRow(row);
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception);
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
            resultset = statement.executeQuery("select * from kitaplar");
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

        jPanel1 = new javax.swing.JPanel();
        txtKitapNo = new javax.swing.JTextField();
        txtYazar = new javax.swing.JTextField();
        txtYayınevi = new javax.swing.JTextField();
        txtSayfaSayısı = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        txtKitapAdı = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKitaplar = new javax.swing.JTable();
        kButton3 = new keeptoo.KButton();
        txtAra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKitapNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKitapNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 210, 30));

        txtYazar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtYazar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtYazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 240, 30));

        txtYayınevi.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtYayınevi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtYayınevi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 240, 30));

        txtSayfaSayısı.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtSayfaSayısı.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSayfaSayısı, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kitap No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Yazarı");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kitap Adı");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Yayınevi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        kButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_waste_24px.png")); // NOI18N
        kButton2.setText("      Sil");
        kButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton2.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton2.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton2.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton2.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 60, 40));

        txtKitapAdı.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtKitapAdı.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapAdı, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sayfa Sayısı");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(717, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        tableKitaplar.setBackground(new java.awt.Color(51, 51, 51));
        tableKitaplar.setForeground(new java.awt.Color(255, 255, 255));
        tableKitaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Adı", "Kitap No", "SayfaSayısı", "Yazar", "Yayınevi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKitaplar.setInheritsPopupMenu(true);
        tableKitaplar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKitaplarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKitaplar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 330, 220));

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
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 90, 40));

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
        jPanel1.add(txtAra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 290, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_search_24px.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\Arayüzler\\img\\icons8_remove_book_100px.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_home_page_50px.png")); // NOI18N
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
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(86, 86, 86))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(988, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setVisible(false);
        AnaEkran ob = new AnaEkran();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_formMousePressed
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_formMouseDragged
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        String sql = "delete from kitaplar where KitapNo=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txtKitapNo.getText());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Kitap başarıyla silindi.");
            txtKitapAdı.setText(null);
            txtKitapNo.setText(null);
            txtSayfaSayısı.setText(null);
            txtYayınevi.setText(null);
            txtYazar.setText(null);
            model.setRowCount(0);
            KitapArama();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,exception);
        }
    }//GEN-LAST:event_kButton2ActionPerformed
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
    String sql = "UPDATE `kutuphaneotomasyonu`.`kitaplar` SET"
                +"`KitapAdı` = '"+txtKitapAdı.getText()+"',"               
                +"`SayfaSayısı` = '"+txtSayfaSayısı.getText()+"',"
                +"`Yazar` = '"+txtYazar.getText()+"',"
                +"`Yayınevi` = '"+txtYayınevi.getText()+"'"
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
    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        String searchKey = txtAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tableKitaplar.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtAraActionPerformed
    private void tableKitaplarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKitaplarMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) tableKitaplar.getModel();
        String tblKitapAdi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 0).toString();
        String tblKitapNo = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 1).toString();
        String tblSayfaSayisi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 2).toString();
        String tblYazar = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 3).toString();
        String tblYayinevi = tblModel.getValueAt(tableKitaplar.getSelectedRow(), 4).toString();
        txtKitapNo.setText(tblKitapNo);
        txtKitapAdı.setText(tblKitapAdi);
        txtSayfaSayısı.setText(tblSayfaSayisi);
        txtYazar.setText(tblYazar);
        txtYayınevi.setText(tblYayinevi);
    }//GEN-LAST:event_tableKitaplarMouseClicked
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String sql = "select * from kitaplar where kitapNo=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txtKitapNo.getText());
            resultset = preparedStatement.executeQuery();

            if (resultset.next()) {
                String add1 = resultset.getString("KitapAdı");
                txtKitapAdı.setText(add1);
                String add2 = resultset.getString("SayfaSayısı");
                txtSayfaSayısı.setText(add2);
                String add3 = resultset.getString("Yazar");
                txtYazar.setText(add3);
                String add4 = resultset.getString("Yayınevi");
                txtYayınevi.setText(add4);
                resultset.close();
                preparedStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Kitap bulunamadı.");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        } finally {
            try {
                resultset.close();
                preparedStatement.close();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception);
            }

        }
    }//GEN-LAST:event_jLabel9MouseClicked
    private void txtAraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAraMouseClicked
        txtAra.setText(null);
    }//GEN-LAST:event_txtAraMouseClicked
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
            java.util.logging.Logger.getLogger(KitapSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapSilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KitapSilme().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KitapSilme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tableKitaplar;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtKitapAdı;
    private javax.swing.JTextField txtKitapNo;
    private javax.swing.JTextField txtSayfaSayısı;
    private javax.swing.JTextField txtYayınevi;
    private javax.swing.JTextField txtYazar;
    // End of variables declaration//GEN-END:variables

//    private void executeSQlQuery(String sorgu, String updated) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}

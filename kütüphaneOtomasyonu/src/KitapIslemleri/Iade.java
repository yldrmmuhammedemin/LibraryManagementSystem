package KitapIslemleri;

import Database.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.Drag;
import UygulamaEkrani.AnaEkran;


public class Iade extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet resultset;
    PreparedStatement preparedStatement;
    DBHelper helper = new DBHelper();

    public Iade() throws SQLException {

        initComponents();
        connection = helper.getConnection();
    }

    public void sil() {
        String sql = "delete from ödüncalmatablosu where KitapNumarası=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txtKitapNo.getText());
            preparedStatement.execute();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception);

        }
    }
    public void odunciadegüncelleme() {

        String sql = "insert into iadetablosu(ÜyeTcKimlikNo,ÜyeAdSoyad,ÜyeCinsiyet,ÜyeKütüphaneID,ÜyeTelefonNo,KitapAdı,KitapNumarası,KitapYazarı,KitapSayfaSayısı,KitapYayınevi,ÖdünçTarihi,İadeTarihi)values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txtTcKimlikNo.getText());
            preparedStatement.setString(2, txtAdSoyad.getText());
            preparedStatement.setString(3, txtCinsiyet.getText());
            preparedStatement.setString(4, txtKütüphaneID.getText());
            preparedStatement.setString(5, txtTelefonNo.getText());
            preparedStatement.setString(6, txtKitapAdı.getText());
            preparedStatement.setString(7, txtKitapNo.getText());
            preparedStatement.setString(8, txtYazarı.getText());
            preparedStatement.setString(9, txtSayfaNo.getText());
            preparedStatement.setString(10, txtYayınevi.getText());
            preparedStatement.setString(11, txtÖdünçAlma.getText());
            preparedStatement.setString(12, txtİadeTarihi.getText());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Kitabın iade işlemi tamamlandı.");

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel16 = new javax.swing.JLabel();
        txtKitapNo = new javax.swing.JTextField();
        txtYayınevi = new javax.swing.JTextField();
        txtSayfaNo = new javax.swing.JTextField();
        txtYazarı = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKitapAdı = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTcKimlikNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKütüphaneID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCinsiyet = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonNo = new javax.swing.JTextField();
        kButton3 = new keeptoo.KButton();
        txtÖdünçAlma = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtİadeTarihi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("X");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 738, -1));

        txtKitapNo.setEditable(false);
        txtKitapNo.setBackground(new java.awt.Color(255, 255, 255));
        txtKitapNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtKitapNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 30));

        txtYayınevi.setEditable(false);
        txtYayınevi.setBackground(new java.awt.Color(255, 255, 255));
        txtYayınevi.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtYayınevi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtYayınevi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 30));

        txtSayfaNo.setEditable(false);
        txtSayfaNo.setBackground(new java.awt.Color(255, 255, 255));
        txtSayfaNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtSayfaNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSayfaNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 220, 30));

        txtYazarı.setEditable(false);
        txtYazarı.setBackground(new java.awt.Color(255, 255, 255));
        txtYazarı.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtYazarı.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtYazarı, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kitap Numarası");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Yayınevi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kitap Adı");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sayfa No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtKitapAdı.setEditable(false);
        txtKitapAdı.setBackground(new java.awt.Color(255, 255, 255));
        txtKitapAdı.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtKitapAdı.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKitapAdı, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Yazarı");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tc Kimlik No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        txtTcKimlikNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTcKimlikNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ad-Soyad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        txtAdSoyad.setEditable(false);
        txtAdSoyad.setBackground(new java.awt.Color(255, 255, 255));
        txtAdSoyad.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtAdSoyad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtAdSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kütüphane ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        txtKütüphaneID.setEditable(false);
        txtKütüphaneID.setBackground(new java.awt.Color(255, 255, 255));
        txtKütüphaneID.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtKütüphaneID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtKütüphaneID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cinsiyet");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        txtCinsiyet.setEditable(false);
        txtCinsiyet.setBackground(new java.awt.Color(255, 255, 255));
        txtCinsiyet.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtCinsiyet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Telefon No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        txtTelefonNo.setEditable(false);
        txtTelefonNo.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtTelefonNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTelefonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 230, 30));

        kButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_save_24px_1.png")); // NOI18N
        kButton3.setText("      Kaydet");
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
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 90, -1));

        txtÖdünçAlma.setEditable(false);
        txtÖdünçAlma.setBackground(new java.awt.Color(255, 255, 255));
        txtÖdünçAlma.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtÖdünçAlma.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtÖdünçAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 220, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Ödünç Alma Tarihi(GG.AA.YYYY)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("İade Tarihi(GG.AA.YYYY)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        txtİadeTarihi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtİadeTarihi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtİadeTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 230, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_search_24px.png")); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\Arayüzler\\img\\icons8_return_book_100px.png")); // NOI18N

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
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(75, 75, 75))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(244, 244, 244))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(988, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setVisible(false);
        AnaEkran ob = new AnaEkran();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        sil();
        odunciadegüncelleme();
        txtAdSoyad.setText(null);
        txtCinsiyet.setText(null);
        txtKitapAdı.setText(null);
        txtKitapNo.setText(null);
        txtKütüphaneID.setText(null);
        txtSayfaNo.setText(null);
        txtTcKimlikNo.setText(null);
        txtTelefonNo.setText(null);
        txtYayınevi.setText(null);
        txtYazarı.setText(null);
        txtÖdünçAlma.setText(null);
        txtİadeTarihi.setText(null);
    }//GEN-LAST:event_kButton3ActionPerformed
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_formMousePressed
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_formMouseDragged
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        String sql = "select *from ödüncalmatablosu where ÜyeTcKimlikNo=? ";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txtTcKimlikNo.getText());
            resultset = preparedStatement.executeQuery();
            if (resultset.next()) {
                String add1 = resultset.getString("ÜyeAdSoyad");
                txtAdSoyad.setText(add1);
                String add2 = resultset.getString("ÜyeCinsiyet");
                txtCinsiyet.setText(add2);
                String add3 = resultset.getString("ÜyeKütüphaneID");
                txtKütüphaneID.setText(add3);
                String add4 = resultset.getString("ÜyeTelefonNo");
                txtTelefonNo.setText(add4);
                String add5 = resultset.getString("KitapAdı");
                txtKitapAdı.setText(add5);
                String add6 = resultset.getString("KitapNumarası");
                txtKitapNo.setText(add6);
                String add7 = resultset.getString("KitapYazarı");
                txtYazarı.setText(add7);
                String add8 = resultset.getString("KitapSayfaSayısı");
                txtSayfaNo.setText(add8);
                String add9 = resultset.getString("KitapYayınevi");
                txtYayınevi.setText(add9);
                String add10 = resultset.getString("ÖdüncTarihi");
                txtÖdünçAlma.setText(add10);
                resultset.close();
                preparedStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Girdiğiniz TC ye ait ödünç alınmış kitap bulunamadı");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);

        } finally {
            try {
                preparedStatement.close();
                resultset.close();
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        }
    }//GEN-LAST:event_jLabel17MouseClicked
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
            java.util.logging.Logger.getLogger(Iade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Iade().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Iade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtCinsiyet;
    private javax.swing.JTextField txtKitapAdı;
    private javax.swing.JTextField txtKitapNo;
    private javax.swing.JTextField txtKütüphaneID;
    private javax.swing.JTextField txtSayfaNo;
    private javax.swing.JTextField txtTcKimlikNo;
    private javax.swing.JTextField txtTelefonNo;
    private javax.swing.JTextField txtYayınevi;
    private javax.swing.JTextField txtYazarı;
    private javax.swing.JTextField txtÖdünçAlma;
    private javax.swing.JTextField txtİadeTarihi;
    // End of variables declaration//GEN-END:variables
}

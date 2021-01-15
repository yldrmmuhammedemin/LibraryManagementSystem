package GirisEkrani;

import Database.DBHelper;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.Drag;

public class Forgotpassword extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet resultset;
    PreparedStatement preparedStatement;
    DBHelper helper = new DBHelper();

    public Forgotpassword() throws SQLException {
        super("Şifremi Unuttum");
        initComponents();
        connection = helper.getConnection();
    }

    public void arama() {
        String Girdi1 = txtTc.getText();
        String sql = "select * from kullanıcılar where TCKİMLİKNO='" + Girdi1 + "'";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultset = (ResultSet) preparedStatement.executeQuery();
            if (resultset.next()) {
                txtisimSoyisim.setText(resultset.getString(1));
                txtguvenlikSorusu.setText(resultset.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "Yanlış bir TC Kimlik No girildi! Lütfen geçerli bir TC Kimlik No giriniz.");
                txtTc.setText(null);
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
    }

    public void kurtar() {
        String Girdi2 = txtCevap.getText();
        String sql = "select * from kullanıcılar where cevap='" + Girdi2 + "'";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultset = (ResultSet) preparedStatement.executeQuery();
            if (resultset.next()) {
                txtsifre.setText(resultset.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Yanlış bir cevap girildi! Lütfen doğru cevabı giriniz.");
                txtCevap.setText(null);

            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, exception);

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        txtsifre = new javax.swing.JTextField();
        txtTc = new javax.swing.JTextField();
        txtguvenlikSorusu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton7 = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kButton9 = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kButton10 = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        txtCevap = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtisimSoyisim = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsifre.setEditable(false);
        txtsifre.setBackground(new Color(0,0,0,0)
        );
        txtsifre.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtsifre.setForeground(new java.awt.Color(255, 255, 255));
        txtsifre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtsifre.setCaretColor(new java.awt.Color(51, 153, 255));
        txtsifre.setOpaque(false);
        kGradientPanel1.add(txtsifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 230, 20));

        txtTc.setBackground(new Color(0,0,0,0));
        txtTc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTc.setForeground(new java.awt.Color(255, 255, 255));
        txtTc.setToolTipText("");
        txtTc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTc.setCaretColor(new java.awt.Color(51, 153, 255));
        txtTc.setOpaque(false);
        kGradientPanel1.add(txtTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 230, 20));

        txtguvenlikSorusu.setEditable(false);
        txtguvenlikSorusu.setBackground(new Color(0,0,0,0)
        );
        txtguvenlikSorusu.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtguvenlikSorusu.setForeground(new java.awt.Color(255, 255, 255));
        txtguvenlikSorusu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtguvenlikSorusu.setCaretColor(new java.awt.Color(51, 153, 255));
        txtguvenlikSorusu.setOpaque(false);
        kGradientPanel1.add(txtguvenlikSorusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 230, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ŞİFRENİZ");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İsim-Soyisim");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tc Kimlik No");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cevap");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Güvenlik Sorusu");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 20));

        kButton7.setText("Geri");
        kButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton7.setkBorderRadius(20);
        kButton7.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton7.setkHoverColor(new java.awt.Color(0, 153, 255));
        kButton7.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton7.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton7.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton7.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 108, 26));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\2131231-4.png")); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_forgot_password_100px_1.png")); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        kButton9.setText("ARA");
        kButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton9.setkBorderRadius(20);
        kButton9.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton9.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton9.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton9.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton9.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton9.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 108, 26));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_identification_documents_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 20, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_fingerprint_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_ask_question_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_true_false_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_key_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        kButton10.setText("ŞİFREM");
        kButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton10.setkBorderRadius(20);
        kButton10.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton10.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton10.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton10.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton10.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton10.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 108, 26));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_search_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        txtCevap.setBackground(new Color(0,0,0,0));
        txtCevap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCevap.setForeground(new java.awt.Color(255, 255, 255));
        txtCevap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCevap.setCaretColor(new java.awt.Color(51, 153, 255));
        txtCevap.setOpaque(false);
        kGradientPanel1.add(txtCevap, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 230, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_user_rights_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("TC KİMLİĞİNİZİ GİRİP ARATTIKTAN SONRA");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("GÜVENLİK SORUSU GELECEKTİR SORUYU");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("CEVAPLAYIN VE 'ŞİFREM' BUTONUNA BASIN.");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_high_priority_32px.png")); // NOI18N
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtisimSoyisim.setEditable(false);
        txtisimSoyisim.setBackground(new Color(0,0,0,0));
        txtisimSoyisim.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtisimSoyisim.setForeground(new java.awt.Color(255, 255, 255));
        txtisimSoyisim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtisimSoyisim.setCaretColor(new java.awt.Color(51, 153, 255));
        txtisimSoyisim.setOpaque(false);
        kGradientPanel1.add(txtisimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 230, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(668, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        setVisible(false);
        Login ob = null;
        try {
            ob = new Login();
        } catch (SQLException ex) {
            Logger.getLogger(Forgotpassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_kButton7ActionPerformed
    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        arama();
    }//GEN-LAST:event_kButton9ActionPerformed
    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        kurtar();
    }//GEN-LAST:event_kButton10ActionPerformed
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked
    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged
    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed
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
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Forgotpassword().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Forgotpassword.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KButton kButton10;
    private keeptoo.KButton kButton7;
    private keeptoo.KButton kButton9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtCevap;
    private javax.swing.JTextField txtTc;
    private javax.swing.JTextField txtguvenlikSorusu;
    private javax.swing.JTextField txtisimSoyisim;
    private javax.swing.JTextField txtsifre;
    // End of variables declaration//GEN-END:variables
}

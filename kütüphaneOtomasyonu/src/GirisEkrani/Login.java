package GirisEkrani;


import Database.DBHelper;
import Database.VeritabaniBaglantisi;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.Drag;

public class Login extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet resultset;
    PreparedStatement preparedStatement;
    DBHelper helper = new DBHelper();
    public static String projeyapanlar ="Muhammed Emin Yıldırım-191816057 \n\t\t  Mehmet Emin Heybet-191816033";//Static Kullanımı
    public Login() throws SQLException {
        initComponents();
        connection = helper.getConnection();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        txtTC = new javax.swing.JTextField();
        txtPassSifre = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton5 = new keeptoo.KButton();
        kButton6 = new keeptoo.KButton();
        kButton7 = new keeptoo.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtTC.setBackground(new Color(0,0,0,0));
        txtTC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTC.setForeground(new java.awt.Color(255, 255, 255));
        txtTC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTC.setCaretColor(new java.awt.Color(51, 153, 255));
        txtTC.setOpaque(false);
        kGradientPanel1.add(txtTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 230, 20));

        txtPassSifre.setBackground(new Color(0,0,0,0));
        txtPassSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPassSifre.setForeground(new java.awt.Color(255, 255, 255));
        txtPassSifre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassSifre.setCaretColor(new java.awt.Color(51, 153, 255));
        txtPassSifre.setOpaque(false);
        kGradientPanel1.add(txtPassSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 230, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tc Kimlik No");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        kButton5.setText("Şifremi Unuttum");
        kButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton5.setkBorderRadius(20);
        kButton5.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton5.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton5.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton5.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton5.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton5.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, 26));

        kButton6.setText("Kayıt Ol");
        kButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton6.setkBorderRadius(20);
        kButton6.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton6.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton6.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton6.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton6.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton6.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 108, 26));

        kButton7.setText("Giriş Yap");
        kButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton7.setkBorderRadius(20);
        kButton7.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton7.setkHoverColor(new java.awt.Color(153, 255, 255));
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
        kGradientPanel1.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 108, 26));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_male_user_50px_1.png")); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_library_100px_1.png")); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\2131231-4.png")); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_customer_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_key_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 645, 363));

        setSize(new java.awt.Dimension(645, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged
    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed
    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        setVisible(false);
        Forgotpassword ob = null;
        try {
            ob = new Forgotpassword();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_kButton5ActionPerformed
    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        setVisible(false);
        SignUp ob = null;
        try {
            ob = new SignUp();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_kButton6ActionPerformed
    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        String mysql = "select *from kullanıcılar where TCKİMLİKNO=? and şifre=?";
        try {
            preparedStatement = connection.prepareStatement(mysql); //elimizdeki bağlantı ile statement oluşturur.
            preparedStatement.setString(1, txtTC.getText());
            preparedStatement.setString(2, txtPassSifre.getText());
            resultset = preparedStatement.executeQuery(); //executeQuery sql cümleciğimizi çalıştırmayı sağlar.
            VeritabaniBaglantisi ornek = new VeritabaniBaglantisi() {};
            ornek.yapanlar(projeyapanlar);
            VeritabaniBaglantisi onay= new VeritabaniBaglantisi() {};
            onay.basarili();
            if (resultset.next()) {
                resultset.close();
                preparedStatement.close();
                setVisible(false);
                LoadingPage ob = new LoadingPage();
                ob.setUpLoading();
                ob.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tc Kimlik No veya Şifre Hatalı! Lütfen doğru girdiğinze emin olunuz.");
                txtTC.setText(null);
                txtPassSifre.setText(null);

            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);

        } finally {
            try {
                resultset.close();
                preparedStatement.close();
            } catch (SQLException exception) {
            }
        }
    }//GEN-LAST:event_kButton7ActionPerformed
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KButton kButton7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtPassSifre;
    private javax.swing.JTextField txtTC;
    // End of variables declaration//GEN-END:variables
}

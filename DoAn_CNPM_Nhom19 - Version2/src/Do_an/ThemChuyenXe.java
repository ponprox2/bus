package Do_an;

import static Do_an.KetNoi.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThemChuyenXe extends javax.swing.JFrame {

    public static String maNhanVien = "";
    public static String username = "";

    public ThemChuyenXe() {
        initComponents();
        this.setTitle("Thêm chuyến xe");
    }

    public ThemChuyenXe(String user) {
        initComponents();
        laySoXe();
        LaythoiGian();
        int n = Integer.parseInt(layMaChuyen()) + 1;
        lb_machuyen.setText(String.valueOf(n));
        maNhanVien = layMaNV(user);
        username = user;
        this.setLocationRelativeTo(null);
        this.setTitle("Thêm chuyến xe");
    }

    public String layMaNV(String tk) {
        String manv = "";
        String sql = "select MaNV from NHANVIEN where TAIKHOAN = ?";
        Connection kn = layKetNoi();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, tk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                manv = rs.getString("MaNV");
            }
        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
        return manv;
    }

    public void laySoXe() {
        Connection kn = layKetNoi();
        String Sql = "Select BienSoXe from XE";
        try {
            PreparedStatement ps = kn.prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cb_bienso.addItem(rs.getString("BienSoXe"));
            }
        } catch (SQLException e) {
            Logger.getLogger(TongKetVeNgay.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    public void LaythoiGian() {
        String a, b;
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat ngay = new SimpleDateFormat("dd-MM-yyyy");
        lb_ngaychay.setText(ngay.format(date));
        SimpleDateFormat gio = new SimpleDateFormat("HH:mm");
        a = gio.format(date);
        txt_gioxuat.setText(a);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        cal.add(Calendar.MINUTE, 20);
        date = cal.getTime();
        b = gio.format(date);
        txt_gionhap.setText(b);

        SimpleDateFormat alo = new SimpleDateFormat("yyyy-MM-dd");
        String c = alo.format(date);
    }

    public String layMaChuyen() {
        String maChuyen = null;
        Connection conn = KetNoi.layKetNoi();
        String sql = "select MaChuyenXe from CHUYENXE";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                maChuyen = rs.getString(1);
            }
        } catch (Exception e) {
            Logger.getLogger(ThemChuyenXe.class.getName()).log(Level.SEVERE, null, e);
        }
        return maChuyen;
    }

    public void addChuyenXe(int machuyen, String maNV, Date ngaychay, Time gioxuat, Time gionhap, String bs) {
        Connection conn = KetNoi.layKetNoi();
        String sql = "insert into CHUYENXE values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, machuyen);
            ps.setString(2, maNV);
            ps.setDate(3, (java.sql.Date) ngaychay);
            ps.setTime(4, (java.sql.Time) gioxuat);
            ps.setTime(5, (java.sql.Time) gionhap);
            ps.setString(6, bs);

            ps.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(ThemChuyenXe.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean checkChuyenXe(String maNV, Date ngayHT, Time gioHT) {

        java.sql.Time tg1 = null;
        java.sql.Time tg2 = null;
        Connection conn = KetNoi.layKetNoi();
        String sql2 = "select TGXuatBen, TGNhapBen from CHUYENXE where MaNV = '" + maNV + "' and NgayChay = '" + ngayHT + "'";
        boolean ktra = false;
        try {
            PreparedStatement ps = conn.prepareStatement(sql2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tg1 = rs.getTime("TGXuatBen");
                tg2 = rs.getTime("TGNhapBen");
            }
        } catch (Exception e) {
            Logger.getLogger(ThemChuyenXe.class.getName()).log(Level.SEVERE, null, e);
        }

        if (tg1 == null && tg2 == null) {
        } else if (gioHT.after(tg1) && gioHT.before(tg2) || gioHT.equals(tg1) || gioHT.equals(tg2)) {
            ktra = true;
        }

        return ktra;
    }

    public String checkBienSoXe(Date ngayHT, Time gioHT, String bienSoXe) {

        java.sql.Time tg1 = null;
        java.sql.Time tg2 = null;
        String ktra = "";
        Connection conn = KetNoi.layKetNoi();
        String sql = "select TGXuatBen, TGNhapBen from CHUYENXE where BienSoXe = '" + bienSoXe + "' and NgayChay = '" + ngayHT + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tg1 = rs.getTime("TGXuatBen");
                tg2 = rs.getTime("TGNhapBen");
            }
        } catch (Exception e) {
            Logger.getLogger(ThemChuyenXe.class.getName()).log(Level.SEVERE, null, e);
        }

        if (tg1 == null && tg2 == null) {
        } else if (gioHT.after(tg1) && gioHT.before(tg2) || gioHT.equals(tg1) || gioHT.equals(tg2)) {
            ktra = bienSoXe;
        }

        return ktra;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_taochuyen = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_machuyen = new javax.swing.JLabel();
        cb_bienso = new javax.swing.JComboBox<>();
        lb_ngaychay = new javax.swing.JLabel();
        txt_gioxuat = new javax.swing.JTextField();
        txt_gionhap = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TẠO CHUYẾN XE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 280, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 570, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GIỜ NHẬP BẾN DỰ KIẾN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 200, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MÃ CHUYẾN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NGÀY CHẠY");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 110, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GIỜ XUẤT BẾN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 50));

        btn_back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(58, 71, 80));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        btn_back.setText("TRỞ VỀ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 120, 40));

        btn_taochuyen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_taochuyen.setForeground(new java.awt.Color(58, 71, 80));
        btn_taochuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/oke_22.png"))); // NOI18N
        btn_taochuyen.setText("TẠO CHUYẾN");
        btn_taochuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taochuyenActionPerformed(evt);
            }
        });
        jPanel1.add(btn_taochuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 150, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BIỂN SỐ XE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 50));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bus_50.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lb_machuyen.setBackground(new java.awt.Color(153, 153, 153));
        lb_machuyen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lb_machuyen.setOpaque(true);
        jPanel1.add(lb_machuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 260, 40));

        cb_bienso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cb_bienso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_biensoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_bienso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 260, 40));

        lb_ngaychay.setBackground(new java.awt.Color(153, 153, 153));
        lb_ngaychay.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lb_ngaychay.setOpaque(true);
        jPanel1.add(lb_ngaychay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 260, 40));

        txt_gioxuat.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(txt_gioxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 260, 40));

        txt_gionhap.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(txt_gionhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 260, 40));

        jLabel14.setBackground(new java.awt.Color(183, 183, 183));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bg_form.jpg"))); // NOI18N
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_biensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_biensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_biensoActionPerformed

    private void btn_taochuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taochuyenActionPerformed
        int mc = Integer.parseInt(lb_machuyen.getText());
        String maNV = maNhanVien;
        int bienso = cb_bienso.getSelectedIndex();
        String bs = cb_bienso.getItemAt(bienso);
        Date date = new Date();
        java.sql.Date ngaychay = new java.sql.Date(date.getTime());

        Date xuat = null, nhap = null;

        String gx = txt_gioxuat.getText();
        String gn = txt_gionhap.getText();

        String giochuanxuat = "(0?[5-9]:[0-5][0-9])|(1[0-8]:[0-5][0-9])|(19:00)";
        String giochuannhap = "(0?[6-9]:[0-5][0-9])|(1[0-9]:[0-5][0-9])|(20:[0-2][0-9])|(20:30)";
        
        
        if (!gx.matches(giochuanxuat)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giờ xuất bến đúng định dạng trong khoảng từ 5:00 tới 19:00","Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (!gn.matches(giochuannhap)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giờ nhập bến đúng định dạng trong khoảng từ 6:00 tới 20:30","Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                xuat = new SimpleDateFormat("HH:mm").parse(gx);
                nhap = new SimpleDateFormat("HH:mm").parse(gn);
            } catch (Exception e) {
                Logger.getLogger(ThemChuyenXe.class.getName()).log(Level.SEVERE, null, e);
            }
                
            
            if (nhap.getTime() - xuat.getTime() <= 0) 
            {
                JOptionPane.showMessageDialog(this, "Giờ nhập bến không thể lớn hơn hoặc bằng giờ xuất bến");
            } 
            else if (nhap.getTime() - xuat.getTime() < 3600000 || nhap.getTime() - xuat.getTime() > 4800000) 
            {
                JOptionPane.showMessageDialog(this, "Giờ xuất bến phải lớn hơn giờ nhập bến 60-80 phút");
            } else 
            {
                java.sql.Time gioxuat = new java.sql.Time(xuat.getTime());
                java.sql.Time gionhap = new java.sql.Time(nhap.getTime());

                if (checkChuyenXe(maNV, ngaychay, gioxuat)) 
                {
                    JOptionPane.showMessageDialog(this, "Bạn đã thêm chuyến xe trước đó rồi!");
                    User us = new User();
                    us.setVisible(true);
                    this.dispose();
                } 
                else if (checkBienSoXe(ngaychay, gioxuat, bs) == bs) 
                {
                    JOptionPane.showMessageDialog(this, "Xe này đã chạy rồi!");
                } else 
                {
                    addChuyenXe(mc, maNV, ngaychay, gioxuat, gionhap, bs);
                    JOptionPane.showMessageDialog(rootPane, "Tạo chuyến thành công");
                    User us = new User();
                    us.setVisible(true);
                    this.dispose();
                }
            }
        }
       
    }//GEN-LAST:event_btn_taochuyenActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User us = new User(username);
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(ThemChuyenXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemChuyenXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemChuyenXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemChuyenXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemChuyenXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_taochuyen;
    private javax.swing.JComboBox<String> cb_bienso;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel lb_machuyen;
    private javax.swing.JLabel lb_ngaychay;
    private javax.swing.JTextField txt_gionhap;
    private javax.swing.JTextField txt_gioxuat;
    // End of variables declaration//GEN-END:variables
}

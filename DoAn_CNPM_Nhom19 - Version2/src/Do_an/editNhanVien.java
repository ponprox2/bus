/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Do_an;

import static Do_an.KetNoi.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class editNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ThemNhanVien
     */
    public editNhanVien() {
        initComponents();
        layTaiKhoan();
        LTen.setText("");
        LDT.setText("");
        LCMND.setText("");
        this.setLocationRelativeTo(null);
        this.setTitle("Hiệu chỉnh nhân viên");

    }
    
    public editNhanVien(String ma, String ten, String cmnd, String gioitinh, String sdt, String tk) {
        initComponents();
        layTaiKhoan();
        LTen.setText("");
        LDT.setText("");
        LCMND.setText("");
        T_Ma.setText(ma);
        T_Ten.setText(ten);
        T_CMND.setText(cmnd);
        T_DT.setText(sdt);
        if(gioitinh.equals("NU")) 
        {
            rb_nu.setSelected(true);
        }
        Com_TK.setSelectedItem(tk);
        this.setLocationRelativeTo(null);
        this.setTitle("Hiệu chỉnh nhân viên");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        T_Ma = new javax.swing.JTextField();
        T_Ten = new javax.swing.JTextField();
        T_CMND = new javax.swing.JTextField();
        T_DT = new javax.swing.JTextField();
        Com_TK = new javax.swing.JComboBox<>();
        LCMND = new javax.swing.JLabel();
        LDT = new javax.swing.JLabel();
        rb_nam = new javax.swing.JRadioButton();
        rb_nu = new javax.swing.JRadioButton();
        LTen = new javax.swing.JLabel();
        LMa = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("aaa"); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HIỆU CHỈNH NHÂN VIÊN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 410, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 570, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GIỚI TÍNH");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 90, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TÀI KHOẢN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 110, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TÊN NHÂN VIÊN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CMND");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 130, 50));

        btn_Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Back.setForeground(new java.awt.Color(58, 71, 80));
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        btn_Back.setText("TRỞ VỀ");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 790, 120, 40));

        btn_Them.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(58, 71, 80));
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/add_22.png"))); // NOI18N
        btn_Them.setText("THÊM");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 790, 110, 40));

        btn_Sua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(58, 71, 80));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/new_18.png"))); // NOI18N
        btn_Sua.setText("SỬA");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 790, 110, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/edit_50.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 60));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MÃ NHÂN VIÊN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 50));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ĐIỆN THOẠI");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 110, 50));

        T_Ma.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(T_Ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 310, 40));

        T_Ten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(T_Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 310, 40));

        T_CMND.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(T_CMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 310, 40));

        T_DT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(T_DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 310, 40));

        Com_TK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Com_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com_TKActionPerformed(evt);
            }
        });
        jPanel1.add(Com_TK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 310, 40));

        LCMND.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LCMND.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 150, 40));

        LDT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LDT.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 150, 40));

        buttonGroup1.add(rb_nam);
        rb_nam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_nam.setForeground(new java.awt.Color(255, 255, 255));
        rb_nam.setSelected(true);
        rb_nam.setText("NAM");
        rb_nam.setOpaque(false);
        jPanel1.add(rb_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 100, 40));

        buttonGroup1.add(rb_nu);
        rb_nu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_nu.setForeground(new java.awt.Color(255, 255, 255));
        rb_nu.setText("NỮ");
        rb_nu.setOpaque(false);
        jPanel1.add(rb_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 100, 40));

        LTen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LTen.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, 40));

        LMa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LMa.setForeground(new java.awt.Color(255, 255, 255));
        LMa.setText("(Không cần nhập MÃ NHÂN VIÊN nếu sửa)");
        jPanel1.add(LMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 480, 40));

        jLabel16.setBackground(new java.awt.Color(183, 183, 183));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/background_form_new.jpg"))); // NOI18N
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 870));

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

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        String ma = T_Ma.getText().toUpperCase();
        String ten = T_Ten.getText();
        String CMND = T_CMND.getText();
        String Gioi = rb_nam.isSelected()? "NAM" : "NU";
        String SDT = T_DT.getText();
        String tk = Com_TK.getSelectedItem().toString();

        if(checkTK(tk) == 1)
        {
            if (!"".equals(ten) && !"".equals(CMND) && !"".equals(Gioi) && !"".equals(SDT)) 
            {
                if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) 
                {
                    LDT.setText("");
                    LCMND.setText("");
                    LTen.setText("");
                    if (checkCMND(CMND,tk) == 1) 
                    {
                        JOptionPane.showMessageDialog(this, "Số CMND này đã có người sử dụng.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    }
                    else 
                    {
                        ten = ten.trim().replaceAll("\\s+", " ").toUpperCase();
                        Sua(ten, CMND, Gioi, SDT, tk);
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        QLNhanVien ad = new QLNhanVien();
                        ad.setVisible(true);
                        this.dispose();
                    }
                } 
                else 
                {
                     JOptionPane.showMessageDialog(this, "Vui lòng Nhập đúng định dạng","Thông Báo", JOptionPane.WARNING_MESSAGE);
                    if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) != 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) == 1) {
                        LCMND.setText("");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) != 1) {
                        LCMND.setText("");
                        LDT.setText("");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) == 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) != 1) {
                        LCMND.setText("");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) != 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) {
                        LCMND.setText("");
                        LDT.setText("");
                        LTen.setText("");
                    }   
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Vui lòng diền đầy đủ thông tin","Thông Báo", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản này chưa có người sử dụng, không thể sửa!","Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        String ma = T_Ma.getText().toUpperCase();
        String ten = T_Ten.getText().trim().toUpperCase();
        String CMND = T_CMND.getText();
        String Gioi = rb_nam.isSelected()? "NAM" : "NU";
        String SDT = T_DT.getText();
        String tk = Com_TK.getSelectedItem().toString();

        if (!"".equals(ma) && !"".equals(ten) && !"".equals(CMND) && !"".equals(Gioi) && !"".equals(SDT)) 
        {
            if(checkCQ_maNV(ma) == 1)
            {
                if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) 
                {
                    LDT.setText("");
                    LCMND.setText("");
                    LTen.setText("");

                    if (checkMa(ma) == 1) 
                    {
                        JOptionPane.showMessageDialog(this, "Mã nhân viên đã được sử dụng", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    } 
                    else if (checkTK(tk) == 1) 
                    {
                        JOptionPane.showMessageDialog(this, "Tài khoản dã có người dùng", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    } 
                    else if (checkCMND(CMND,tk) == 1) 
                    {
                        JOptionPane.showMessageDialog(this, "Số CMND này đã có người sử dụng.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    }
                    else 
                    {
                        ten = ten.trim().replaceAll("\\s+", " ").toUpperCase();
                        Them(ma, ten, CMND, Gioi, SDT, tk);
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        QLNhanVien ad = new QLNhanVien();
                        ad.setVisible(true);
                        this.dispose();
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Vui lòng Nhập đúng định dạng", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) != 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) == 1) {
                        LCMND.setText("");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) != 1) {
                        LCMND.setText("");
                        LDT.setText("");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) == 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) != 1 && checkkytu(ten) != 1) {
                        LCMND.setText("");
                        LDT.setText("Nhập 10 số (0xxx)");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) != 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) != 1) {
                        LCMND.setText("Nhập 9 số");
                        LDT.setText("");
                        LTen.setText("A-Z a-z");
                    } else if (checkNumCMND(CMND) == 1 && checkNumSDT(SDT) == 1 && checkkytu(ten) == 1) {
                        LCMND.setText("");
                        LDT.setText("");
                        LTen.setText("");
                    }   
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không đúng định dạng (NV00 - NV99)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Vui lòng diền đầy đủ thông tin", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        QLNhanVien ad = new QLNhanVien();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void Com_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com_TKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_TKActionPerformed

    public void Them(String ma, String ten, String CMND, String Gioi, String DT, String TK) {
        Connection kn = layKetNoi();
        String sql = "insert into NHANVIEN values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.setString(2, ten);
            ps.setString(3, CMND);
            ps.setString(4, Gioi);
            ps.setString(5, DT);
            ps.setString(6, TK);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int checkMa(String ma) {
        int a = 0;
        Connection kn = layKetNoi();
        String sql = "select * from NHANVIEN";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("MaNV").equals(ma)) {
                    a = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }

        return a;
    }
    
    public int checkCMND(String cmnd, String TK) {
        int a = 0;
        Connection kn = layKetNoi();
        String sql = "select * from NHANVIEN where TaiKhoan <>'" + TK + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("CMND").equals(cmnd)) {
                    a = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }

        return a;
    }

    public int checkTen(String ten) {
        int a = 0;
        Connection kn = layKetNoi();
        String sql = "select * from NHANVIEN";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("TenNV").equalsIgnoreCase(ten)) {
                    a = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }

        return a;
    }

    public void layTaiKhoan() {
        Connection kn = layKetNoi();
        String Sql = "Select TaiKhoan from TAIKHOAN WHERE MaVaiTro =1";
        try {
            PreparedStatement ps = kn.prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Com_TK.addItem(rs.getString("TaiKhoan"));
            }
        } catch (SQLException e) {
            Logger.getLogger(TongKetVeNgay.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public int checkTK(String tk) {
        int a = 0;
        Connection kn = layKetNoi();
        String sql = "select * from NHANVIEN";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("TaiKhoan").equalsIgnoreCase(tk)) {
                    a = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }

        return a;
    }

    public void Sua(String ten, String CMND, String Gioi, String DT, String TK) {
        Connection kn = layKetNoi();
        String sql = "update NHANVIEN set TenNV =?, CMND =?, GioiTinh=?, DienThoai=? Where TaiKhoan=?";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, ten);
            ps.setString(2, CMND);
            ps.setString(3, Gioi);
            ps.setString(4, DT);
            ps.setString(5, TK);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(editNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int checkNumSDT(String a) {
        int b = 0;
        String check = "0\\d{9}";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }
    
    public int checkNumCMND(String a) {
        int b = 0;
        String check = "\\d{9}";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

    public int checkkytu(String a) {
        int b = 0;
        String check = "[a-zA-Z ]+";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }
    
    public int checkCQ_maNV(String a) {
        int b = 0;
        String check = "NV[0-9]{2}";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

 

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
            java.util.logging.Logger.getLogger(editNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editNhanVien().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Com_TK;
    private javax.swing.JLabel LCMND;
    private javax.swing.JLabel LDT;
    private javax.swing.JLabel LMa;
    private javax.swing.JLabel LTen;
    private javax.swing.JTextField T_CMND;
    private javax.swing.JTextField T_DT;
    private javax.swing.JTextField T_Ma;
    private javax.swing.JTextField T_Ten;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb_nam;
    private javax.swing.JRadioButton rb_nu;
    // End of variables declaration//GEN-END:variables
}

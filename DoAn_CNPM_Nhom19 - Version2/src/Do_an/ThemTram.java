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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ThemTram extends javax.swing.JFrame {

    static DefaultTableModel dtm;

    public ThemTram() {
        initComponents();
        layduLieuTram();
        this.setLocationRelativeTo(null);
        this.setTitle("Thêm trạm");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        B_Back = new javax.swing.JButton();
        B_Xoa = new javax.swing.JButton();
        B_Them = new javax.swing.JButton();
        B_Ktra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        T_TenTram = new javax.swing.JTextField();
        T_MaTram = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Tram = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("THÊM TRẠM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 920, 10));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TÊN TRẠM MỚI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MÃ TRẠM MỚI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 40));

        B_Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Back.setForeground(new java.awt.Color(58, 71, 80));
        B_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        B_Back.setText("TRỞ VỀ");
        B_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BackActionPerformed(evt);
            }
        });
        jPanel1.add(B_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 130, 50));

        B_Xoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Xoa.setForeground(new java.awt.Color(58, 71, 80));
        B_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/delete_18.png"))); // NOI18N
        B_Xoa.setText("XÓA");
        B_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_XoaActionPerformed(evt);
            }
        });
        jPanel1.add(B_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 130, 50));

        B_Them.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Them.setForeground(new java.awt.Color(58, 71, 80));
        B_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/add_22.png"))); // NOI18N
        B_Them.setText("THÊM");
        B_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ThemActionPerformed(evt);
            }
        });
        jPanel1.add(B_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 130, 50));

        B_Ktra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Ktra.setForeground(new java.awt.Color(58, 71, 80));
        B_Ktra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/check_18.png"))); // NOI18N
        B_Ktra.setText("KIỂM TRA");
        B_Ktra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_KtraActionPerformed(evt);
            }
        });
        jPanel1.add(B_Ktra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 130, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bus_add_60.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 50));
        jPanel1.add(T_TenTram, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 250, 40));
        jPanel1.add(T_MaTram, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 40));

        T_Tram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Trạm", "Tên Trạm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(T_Tram);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 500, 500));

        jLabel8.setBackground(new java.awt.Color(183, 183, 183));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/background_form_new.jpg"))); // NOI18N
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

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

    private void B_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ThemActionPerformed
        String ma = T_MaTram.getText();
        String ten = T_TenTram.getText();

        if (ma.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống mã trạm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (checkNum(ma) != 1) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng mã trạm (1-99)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if(CheckMa(ma) == 1){
            JOptionPane.showMessageDialog(this, "Mã trạm đã tồn tại, vui lòng nhập mã trạm khác", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else if(ten.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống tên trạm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if(checkkytu(ten) != 1){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng tên trạm (A-Z a-z)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (CheckTen(ten) == 1) {
            JOptionPane.showMessageDialog(this, "Tên trạm đã tồn tại, vui lòng nhập tên trạm khác", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else {
            them(ma, ten);
            JOptionPane.showMessageDialog(this, "Thêm trạm thành công");
            this.layduLieuTram();
            T_MaTram.setText("");
            T_TenTram.setText("");

        }
    }//GEN-LAST:event_B_ThemActionPerformed

    private void B_KtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_KtraActionPerformed
        String ma = T_MaTram.getText();
        String ten = T_TenTram.getText();
        if (checkNum(ma) != 1) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng mã trạm (1-99)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (CheckMa(ma) != 0) {
            JOptionPane.showMessageDialog(this, "Mã trạm đã tồn tại vui lòng nhập lại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else if(ten.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống tên trạm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if(checkkytu(ten) != 1){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng tên trạm (A-Z a-z)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (CheckTen(ten) == 1) {
            JOptionPane.showMessageDialog(this, "Tên trạm đã tồn tại vui lòng nhập lại", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn có thể thêm trạm này");
        }
    }//GEN-LAST:event_B_KtraActionPerformed

    private void B_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_XoaActionPerformed
        String maTram = T_MaTram.getText();
        int check;
        int kiemTraMaTram = 0;  //0: Đã nhập Mã trạm; 1: Chưa nhập Mã trạm.
        
        int removeIndex = T_Tram.getSelectedRow();
       
       if(removeIndex == -1)
       {
           if (maTram.equals("")) 
           {
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 trạm hoặc nhập mã trạm để xóa","Thông báo", JOptionPane.WARNING_MESSAGE);
           } 
            else if(checkNum(maTram) == 1)
                {
                    check = CheckMa(maTram);   
                    if (check == 1) 
                    {
                        if(CheckMaTram_VeXe(maTram) != 1)
                        {
                            int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa?", "Xác nhận", 0);
                            if (ret == JOptionPane.CANCEL_OPTION) 
                            {
                                return;
                            } 
                            else if (ret == JOptionPane.OK_OPTION) 
                            {
                                xoaTram(maTram);
                                JOptionPane.showMessageDialog(this, "Xóa trạm thành công");
                                this.layduLieuTram();
                                T_MaTram.setText("");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Trạm này hiện đang lưu trong hệ thống, không thể xóa!!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                        }                       
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(this, "Trạm này chưa có, bạn hãy thêm thông tin trạm vào hệ thống");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng mã trạm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                }
       }
       else 
        {
           String ma = T_Tram.getModel().getValueAt(removeIndex, 0).toString();
           if(CheckMaTram_VeXe(ma) != 1)
           {
                int rett = JOptionPane.showConfirmDialog(rootPane, "Bạn có thật sự muốn xóa?");
                if( rett == JOptionPane.OK_OPTION)
                {
                     xoaTram(ma);
                     this.layduLieuTram();
                     JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                     T_MaTram.setText("");
                }
                else
                {
                    return;
                }
           }
           else
           {
               JOptionPane.showMessageDialog(this, "Trạm này hiện đang lưu trong hệ thống, không thể xóa!!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
           }
        }
    }//GEN-LAST:event_B_XoaActionPerformed

    private void B_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BackActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_BackActionPerformed

    public void them(String ma, String ten) {
        Connection kn = layKetNoi();
        int matram = Integer.parseInt(ma);
        ten = ten.trim().replaceAll("\\s+", " ");
        String sql = "insert into TRAM values (?,?)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setInt(1, matram);
            ps.setString(2, ten.toUpperCase());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ThemTram.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int CheckMa(String ma) {
        Connection kn = layKetNoi();
        int b = 0;
        String sql = "select * from TRAM where MaTram ='" + ma + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(ThemTram.class.getName()).log(Level.SEVERE, null, e);
        }

        return b;
    }
    
    public int CheckMaTram_VeXe(String ma){
        Connection kn = layKetNoi();
        int b = 0;
        String sql = "select * from VEXE where MaTram ='" + ma + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                b = 1;
            }
        } catch (Exception e) {
        }
        
        return b;
    }

    public int CheckTen(String ten) {
        Connection kn = layKetNoi();
        int b = 0;
        String sql = "select * from TRAM where TenTram =N'" + ten + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(ThemTram.class.getName()).log(Level.SEVERE, null, e);
        }

        return b;
    }

    public void layduLieuTram() {
        Connection kn = layKetNoi();
        DefaultTableModel dtm = (DefaultTableModel) T_Tram.getModel();
        dtm.setNumRows(0);

        String sql = "select * from TRAM ORDER BY MaTram";
        Vector vt;
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("MaTram"));
                vt.add(rs.getString("TenTram"));
                dtm.addRow(vt);
            }
            T_Tram.setModel(dtm);
            rs.close();
            ps.close();
            kn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThemTram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void xoaTram(String maTram) {
        Connection kn = layKetNoi();
        String sql = "delete from TRAM where MATRAM = ?";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maTram);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ThemTram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int checkkytu(String a) {
        int b = 0;
        String check = "[\\w ]{1,50}$";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

    public int checkNum(String a) {
        int b = 0;
//        String check = "[0-9]{1,2}$";
        String check = "[1-9]|[1-9][0-9]";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }
    
    public String chuanHoa(String a){
//        a = a.trim();
        return a.trim().replaceAll("\\s+", " ");
        
    }

    //  public void them(){}
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
            java.util.logging.Logger.getLogger(ThemTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemTram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Ktra;
    private javax.swing.JButton B_Them;
    private javax.swing.JButton B_Xoa;
    private javax.swing.JTextField T_MaTram;
    private javax.swing.JTextField T_TenTram;
    private javax.swing.JTable T_Tram;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

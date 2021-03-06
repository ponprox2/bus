/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Do_an;

import static Do_an.KetNoi.layKetNoi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TraMaVe extends javax.swing.JFrame {

    /**
     * Creates new form TraMaVe
     */
    public TraMaVe() {
        
        initComponents();
        Thongtinve();
        this.setLocationRelativeTo(null);
        this.setTitle("Kiểm tra mã vé");
    }
    static DefaultTableModel dtm;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L_MaVe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Bang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KIỂM TRA MÃ VÉ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 350, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 540, 10));

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(58, 71, 80));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        jButton4.setText("TRỞ VỀ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 830, 120, 40));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(58, 71, 80));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/check_18.png"))); // NOI18N
        jButton2.setText("TÌM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 110, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/ticket_check_50.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MÃ VÉ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, 40));

        L_MaVe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L_MaVe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                L_MaVeKeyReleased(evt);
            }
        });
        jPanel1.add(L_MaVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 310, 40));

        T_Bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Vé", "Mã Chuyến Xe", "Thời Gian", "Mã Loại Vé", "Tên Trạm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T_Bang.setEnabled(false);
        T_Bang.setFocusable(false);
        jScrollPane1.setViewportView(T_Bang);
        if (T_Bang.getColumnModel().getColumnCount() > 0) {
            T_Bang.getColumnModel().getColumn(0).setMaxWidth(200);
            T_Bang.getColumnModel().getColumn(1).setMinWidth(100);
            T_Bang.getColumnModel().getColumn(1).setMaxWidth(100);
            T_Bang.getColumnModel().getColumn(2).setMinWidth(150);
            T_Bang.getColumnModel().getColumn(2).setMaxWidth(150);
            T_Bang.getColumnModel().getColumn(3).setMinWidth(150);
            T_Bang.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 740, 520));

        jLabel6.setBackground(new java.awt.Color(183, 183, 183));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/background_form_new.jpg"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 910));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ma = L_MaVe.getText();

        if (TimMa(ma) == 1) {
            Thongtin1ve(ma);
        } else {
            JOptionPane.showMessageDialog(this, "Vé không tồn tại","Thông Báo", JOptionPane.WARNING_MESSAGE);
            this.Thongtinve();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void L_MaVeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_L_MaVeKeyReleased
        if(!L_MaVe.getText().isEmpty())
        {
            locTatCa(T_Bang, L_MaVe.getText(), 0);
        }
        else
        {
            locTatCa(T_Bang, "", 0);
        }
    }//GEN-LAST:event_L_MaVeKeyReleased

    public int TimMa(String ma) {
        int a = 0;

        Connection kn = layKetNoi();
        String sql = "Select * from VEXE";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("Mave").equalsIgnoreCase(ma)) {
                    a = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(TraMaVe.class.getName()).log(Level.SEVERE, null, e);
        }

        return a;
    }

    public void Thongtin1ve(String mave) {
        Connection kn = layKetNoi();
        DefaultTableModel dtm = (DefaultTableModel) T_Bang.getModel();
        dtm.setNumRows(0);
        String sql = "select MaVe, MaChuyenXe, ThoiGian, Loaive, TenTram  from VEXE, TRAM, LOAIVE\n"
                + "where LOAIVE.MaLoaiVe=VEXE.MaLoaiVe\n"
                + "and TRAM.MaTram=VEXE.MaTram\n"
                + "and MaVe =" + mave;
        Vector vt;
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("MaVe"));
                vt.add(rs.getString("MaChuyenXe"));
                vt.add(rs.getString("ThoiGian"));
                vt.add(rs.getString("LoaiVe"));
                vt.add(rs.getString("TenTram"));
                dtm.addRow(vt);
            }
            T_Bang.setModel(dtm);
            rs.close();
            ps.close();
            kn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TraMaVe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Thongtinve() {
        Connection kn = layKetNoi();
        DefaultTableModel dtm = (DefaultTableModel) T_Bang.getModel();
        dtm.setNumRows(0);
        
        
        String sql = "select MaVe, MaChuyenXe, ThoiGian, Loaive, TenTram  from VEXE, TRAM, LOAIVE\n"
                + "where LOAIVE.MaLoaiVe=VEXE.MaLoaiVe\n"
                + "and TRAM.MaTram=VEXE.MaTram";
        Vector vt;
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("MaVe"));
                vt.add(rs.getString("MaChuyenXe"));
                vt.add(rs.getString("ThoiGian").substring(0, 8));
                vt.add(rs.getString("LoaiVe"));
                vt.add(rs.getString("TenTram"));
                dtm.addRow(vt);
            }
            T_Bang.setModel(dtm);
            rs.close();
            ps.close();
            kn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TraMaVe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void locTatCa(JTable tb, String str, int cotLoc){
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tb.getModel())); 
        tb.setRowSorter(sorter);
        try {
            if(cotLoc > -1) //nếu cotLoc >-1 thì lọc tất cả các cột có cột = cotLoc xem dòng nào = str
            {
                sorter.setRowFilter(RowFilter.regexFilter(str, cotLoc));
            }
            else //nếu cột lọc = -1 thì lọc tất cả các cột xem dòng nào = str
            {
                sorter.setRowFilter(RowFilter.regexFilter(str));
            }
        } 
        catch(PatternSyntaxException pse) {
            System.out.println("Bad regex pattern");
        }
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
            java.util.logging.Logger.getLogger(TraMaVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraMaVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraMaVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraMaVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraMaVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_MaVe;
    private javax.swing.JTable T_Bang;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

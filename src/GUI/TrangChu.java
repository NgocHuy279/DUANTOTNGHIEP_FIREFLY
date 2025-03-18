/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Win 10
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private DrawerController drawer;

    public TrangChu() {
        initComponents();
        JLabel headerLabel = new JLabel();
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setVerticalAlignment(SwingConstants.CENTER);
        headerLabel.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_suit_127px.png")));
        headerLabel.setText("F I R E F LY");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Chỉnh font chữ
        headerLabel.setForeground(new Color(152, 239, 237)); // Màu chữ xanh dương
        headerLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        headerLabel.setVerticalTextPosition(SwingConstants.BOTTOM); // Đặt chữ dưới ảnh
        drawer = Drawer.newDrawer(this)
                //                .header(new JLabel(new ImageIcon(getClass().getResource("/icon/icons8_suit_127px.png"))))
                //                .header(new Header()) 
                //                .header(new Header())
                .header(headerLabel)
                .space(5)
                                .separator(2, new Color(152, 239, 237))
                .background(Color.WHITE)
                .backgroundTransparent(0.3f)
                .enableScroll(true)
                .enableScrollUI(true)
                //                                .drawerBackground(Color.yellow)
                .addChild(new DrawerItem("Nhân viên").icon(new ImageIcon(getClass().getResource("/icon/icons8_management_20px.png"))).build())
                .addChild(new DrawerItem("Khách hàng").icon(new ImageIcon(getClass().getResource("/icon/icons8_customer_insight_20px.png"))).build())
                .addChild(new DrawerItem("Danh mục").icon(new ImageIcon(getClass().getResource("/icon/icons8_sorting_20px.png"))).build())
                .addChild(new DrawerItem("Sản phẩm").icon(new ImageIcon(getClass().getResource("/icon/icons8_product_20px.png"))).build())
                .addChild(new DrawerItem("Hóa đơn").icon(new ImageIcon(getClass().getResource("/icon/icons8_bill_20px.png"))).build())
                .addChild(new DrawerItem("Hóa đơn chi tiết").icon(new ImageIcon(getClass().getResource("/icon/icons8_bill_20px_1.png"))).build())
                .addChild(new DrawerItem("Thống kê").icon(new ImageIcon(getClass().getResource("/icon/icons8_statistics_20px.png"))).build())
                .addChild(new DrawerItem("Doanh thu").icon(new ImageIcon(getClass().getResource("/icon/icons8_sales_performance_20px.png"))).build())
                .addChild(new DrawerItem("Đăng nhập") //  Thêm item Đăng nhập vào menu
                        .icon(new ImageIcon(getClass().getResource("/icon/icons8_login_rounded_up_20px.png")))
                        .build())
                .addFooter(new DrawerItem("Thoát").icon(new ImageIcon(getClass().getResource("/icon/icons8_exit_20px.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
//                        if (di.getText().equals("Đăng nhập")) {
//                            moDangNhap(); // Gọi hàm mở hộp thoại đăng nhập
//                        }
//                        if (di.getText().equals("Nhân viên")) {
//                            moNV();
//                        }
//                        if (di.getText().equals("Khách hàng")) {
//                            moKH();
//                        }
//                        if (di.getText().equals("Danh mục")) {
//                            moDanhMuc();
//                        }
//                        if (di.getText().equals("Sản phẩm")) {
//                            moSanPham();
//                        }
//                        if (di.getText().equals("Hóa đơn")) {
//                            moHD();
//                        }
//                        if (di.getText().equals("Hóa đơn chi tiết")) {
//                            moHDCT();
//                        }
//                        if(di.getText().equals("Thoát")){
//                            System.exit(0);
//                        }
//                        System.out.println(i);
                    }

                })
                .build();
//   drawer.setAutoHide(false);
        drawer.show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMuc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMuc.setText("]]]");
        btnMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(678, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMuc)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMucActionPerformed
//        if (drawer.isShow()) {
//            drawer.hide();
//        } else {
//            drawer.show();
//        }
    }//GEN-LAST:event_btnMucActionPerformed
    private void moDangNhap() {
        DangNhapJDialog dangNhap = new DangNhapJDialog(this, true);
        dangNhap.setVisible(true);
    }

//    private void moNV() {
//        JFNhanVien nhanVien = new JFNhanVien();
//        nhanVien.setVisible(true);
//    }
//
//    private void moKH() {
//        JFKhachHang khachHang = new JFKhachHang();
//        khachHang.setVisible(true);
//    }
//
//    private void moDanhMuc() {
//        JFDanhMuc danhMuc = new JFDanhMuc();
//        danhMuc.setVisible(true);
//    }
//
//    private void moSanPham() {
//        JFSanPham sanPham = new JFSanPham();
//        sanPham.setVisible(true);
//    }
//
//    private void moHD() {
//        JFHoaDon hoaDon = new JFHoaDon();
//        hoaDon.setVisible(true);
//    }
//
//    private void moHDCT() {
//        JFHoaDonCT hoaDonCT = new JFHoaDonCT();
//        hoaDonCT.setVisible(true);
//    }

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMuc;
    // End of variables declaration//GEN-END:variables
}

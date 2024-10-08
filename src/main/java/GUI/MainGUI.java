/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import BUS.receptBUS;
import GUI.product.product;
import GUI.Import.Import;
import GUI.recept.recept;
import GUI.SELL.sell;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ThinkBook
 */
public class MainGUI extends javax.swing.JFrame {
    
    //
    product product_gui;
    Import import_gui;
    recept recept_gui;
    sell sell_gui;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }
    private void open_gui(int  i) throws SQLException{
        switch (i){
            case 1: 
            {
                product_gui = new product();
                jmain.removeAll();
                product_gui.setSize(950, 650);
                jmain.add(product_gui);
                jmain.updateUI();
                change_color(1);
            } break;
            case 2:
            {
                import_gui = new Import();
                jmain.removeAll();
                import_gui.setSize(950,650);
                jmain.add(import_gui);
                jmain.updateUI();
                change_color(2);
            } break;
            case 3:
            {   
                recept_gui = new recept();
                jmain.removeAll();
                recept_gui.setSize(950,650);
                jmain.add(recept_gui);
                jmain.updateUI();
                change_color(3);
                
            } break;
            case 4:
            {   
                receptBUS test = new receptBUS();
                if (!test.check_date())
                sell_gui = new sell();
                else sell_gui= new sell(test.get_last_recept(),test.get_last_recept().getReceptId());
                jmain.removeAll();
                sell_gui.setSize(950,650);
                jmain.add(sell_gui);
                jmain.updateUI();
                change_color(4);
                
            }
            
    }
    }
    private void change_color(int i){
         product_panel.setBackground(new java.awt.Color(255, 255, 255));
         lb_product.setForeground(new java.awt.Color(0, 0, 0));         
         
         lb_import.setForeground(new java.awt.Color(0, 0, 0));
         panel_import.setBackground(new java.awt.Color(255,255,255));
         
         lbl_recept.setBackground(new java.awt.Color(255, 255, 255));
         panel_recept.setForeground(new java.awt.Color(0, 0, 0)); 
         
         lbl_sell.setBackground(new java.awt.Color(255, 255, 255));
         panel_sell.setForeground(new java.awt.Color(0, 0, 0)); 
         
         switch(i){
             case 1:
                    product_panel.setBackground(new java.awt.Color(0, 51, 204));
                    lb_product.setForeground(new java.awt.Color(255, 255, 255));
                break;
             case 2:
                 panel_import.setBackground(new java.awt.Color(0, 51, 204));
                 lb_import.setForeground(new java.awt.Color(255, 255, 255));
                 break;
             case 3:
                 panel_recept.setBackground(new java.awt.Color(0, 51, 204));
                 lbl_recept.setForeground(new java.awt.Color(255, 255, 255));
             case 4:
                 lbl_sell.setBackground(new java.awt.Color(0, 51, 204));
                 panel_sell.setForeground(new java.awt.Color(255, 255, 255));
                 
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jmain = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        product_panel = new javax.swing.JPanel();
        lb_product = new javax.swing.JLabel();
        panel_import = new javax.swing.JPanel();
        lb_import = new javax.swing.JLabel();
        lbl_sell = new javax.swing.JPanel();
        panel_sell = new javax.swing.JLabel();
        panel_recept = new javax.swing.JPanel();
        lbl_recept = new javax.swing.JLabel();
        kho_panel = new javax.swing.JPanel();
        lblSanpham4 = new javax.swing.JLabel();
        static_panel = new javax.swing.JPanel();
        lblSanpham5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MINI BAO MANAGEMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(549, 549, 549))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jmain.setBackground(new java.awt.Color(153, 255, 153));
        jmain.setPreferredSize(new java.awt.Dimension(950, 650));

        javax.swing.GroupLayout jmainLayout = new javax.swing.GroupLayout(jmain);
        jmain.setLayout(jmainLayout);
        jmainLayout.setHorizontalGroup(
            jmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jmainLayout.setVerticalGroup(
            jmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        product_panel.setBackground(new java.awt.Color(255, 255, 255));
        product_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_panelMouseClicked(evt);
            }
        });

        lb_product.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_product.setText("Sản phẩm");
        lb_product.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout product_panelLayout = new javax.swing.GroupLayout(product_panel);
        product_panel.setLayout(product_panelLayout);
        product_panelLayout.setHorizontalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_product, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        product_panelLayout.setVerticalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_product, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        panel_import.setBackground(new java.awt.Color(255, 255, 255));
        panel_import.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_importMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_importMouseEntered(evt);
            }
        });

        lb_import.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lb_import.setText("Nhập hàng");
        lb_import.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout panel_importLayout = new javax.swing.GroupLayout(panel_import);
        panel_import.setLayout(panel_importLayout);
        panel_importLayout.setHorizontalGroup(
            panel_importLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_importLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(lb_import, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_importLayout.setVerticalGroup(
            panel_importLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_import, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        lbl_sell.setBackground(new java.awt.Color(255, 255, 255));
        lbl_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sellMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_sellMouseEntered(evt);
            }
        });

        panel_sell.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        panel_sell.setText("Bán hàng");
        panel_sell.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout lbl_sellLayout = new javax.swing.GroupLayout(lbl_sell);
        lbl_sell.setLayout(lbl_sellLayout);
        lbl_sellLayout.setHorizontalGroup(
            lbl_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_sellLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(panel_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lbl_sellLayout.setVerticalGroup(
            lbl_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_sell, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        panel_recept.setBackground(new java.awt.Color(255, 255, 255));
        panel_recept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_receptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_receptMouseEntered(evt);
            }
        });

        lbl_recept.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_recept.setText("Hóa đơn");
        lbl_recept.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout panel_receptLayout = new javax.swing.GroupLayout(panel_recept);
        panel_recept.setLayout(panel_receptLayout);
        panel_receptLayout.setHorizontalGroup(
            panel_receptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_receptLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(lbl_recept, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_receptLayout.setVerticalGroup(
            panel_receptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_recept, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        kho_panel.setBackground(new java.awt.Color(255, 255, 255));
        kho_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kho_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kho_panelMouseEntered(evt);
            }
        });

        lblSanpham4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblSanpham4.setText("Kho hàng");
        lblSanpham4.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout kho_panelLayout = new javax.swing.GroupLayout(kho_panel);
        kho_panel.setLayout(kho_panelLayout);
        kho_panelLayout.setHorizontalGroup(
            kho_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kho_panelLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(lblSanpham4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kho_panelLayout.setVerticalGroup(
            kho_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        static_panel.setBackground(new java.awt.Color(255, 255, 255));
        static_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                static_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                static_panelMouseEntered(evt);
            }
        });

        lblSanpham5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblSanpham5.setText("Thống kê");
        lblSanpham5.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout static_panelLayout = new javax.swing.GroupLayout(static_panel);
        static_panel.setLayout(static_panelLayout);
        static_panelLayout.setHorizontalGroup(
            static_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, static_panelLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(lblSanpham5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        static_panelLayout.setVerticalGroup(
            static_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_import, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_sell, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_recept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kho_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(static_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(product_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbl_sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_recept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kho_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(static_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_panelMouseClicked
        try {
            open_gui(1);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_product_panelMouseClicked

    private void panel_importMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_importMouseClicked
        try {
            // TODO add your handling code here:
            open_gui(2);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_panel_importMouseClicked

    private void panel_importMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_importMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_importMouseEntered

    private void lbl_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sellMouseClicked
        try {
            // TODO add your handling code here:
            open_gui(4);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbl_sellMouseClicked

    private void lbl_sellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sellMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_sellMouseEntered

    private void panel_receptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_receptMouseClicked
        try {
            // TODO add your handling code here:
            open_gui(3);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_panel_receptMouseClicked

    private void panel_receptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_receptMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_receptMouseEntered

    private void kho_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kho_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kho_panelMouseClicked

    private void kho_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kho_panelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kho_panelMouseEntered

    private void static_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_static_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_static_panelMouseClicked

    private void static_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_static_panelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_static_panelMouseEntered

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jmain;
    private javax.swing.JPanel kho_panel;
    private javax.swing.JLabel lb_import;
    private javax.swing.JLabel lb_product;
    private javax.swing.JLabel lblSanpham4;
    private javax.swing.JLabel lblSanpham5;
    private javax.swing.JLabel lbl_recept;
    private javax.swing.JPanel lbl_sell;
    private javax.swing.JPanel panel_import;
    private javax.swing.JPanel panel_recept;
    private javax.swing.JLabel panel_sell;
    private javax.swing.JPanel product_panel;
    private javax.swing.JPanel static_panel;
    // End of variables declaration//GEN-END:variables
}

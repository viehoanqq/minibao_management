/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import GUI.product.product;
/**
 *
 * @author ThinkBook
 */
public class MainGUI extends javax.swing.JFrame {
    
    //
    product product_gui;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }
    private void open_gui(int  i){
        switch (i){
            case 1: 
            {
                product_gui = new product();
                jmain.removeAll();
                product_gui.setSize(950, 650);
                jmain.add(product_gui);
                jmain.updateUI();
            }
    }
    }

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
        prd_panel = new javax.swing.JPanel();
        lblSanpham = new javax.swing.JLabel();
        import_panel = new javax.swing.JPanel();
        lblSanpham1 = new javax.swing.JLabel();
        pannelSP2 = new javax.swing.JPanel();
        sell_panel = new javax.swing.JLabel();
        pannelSP3 = new javax.swing.JPanel();
        recept_panel = new javax.swing.JLabel();
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
                .addContainerGap(12, Short.MAX_VALUE))
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
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        prd_panel.setBackground(new java.awt.Color(51, 102, 255));
        prd_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prd_panelMouseClicked(evt);
            }
        });

        lblSanpham.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblSanpham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanpham.setText("Sản phẩm");
        lblSanpham.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout prd_panelLayout = new javax.swing.GroupLayout(prd_panel);
        prd_panel.setLayout(prd_panelLayout);
        prd_panelLayout.setHorizontalGroup(
            prd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prd_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        prd_panelLayout.setVerticalGroup(
            prd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        import_panel.setBackground(new java.awt.Color(255, 255, 255));
        import_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                import_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                import_panelMouseEntered(evt);
            }
        });

        lblSanpham1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblSanpham1.setText("Nhập hàng");
        lblSanpham1.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout import_panelLayout = new javax.swing.GroupLayout(import_panel);
        import_panel.setLayout(import_panelLayout);
        import_panelLayout.setHorizontalGroup(
            import_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, import_panelLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(lblSanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        import_panelLayout.setVerticalGroup(
            import_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanpham1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        pannelSP2.setBackground(new java.awt.Color(255, 255, 255));
        pannelSP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pannelSP2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pannelSP2MouseEntered(evt);
            }
        });

        sell_panel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        sell_panel.setText("Bán hàng");
        sell_panel.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout pannelSP2Layout = new javax.swing.GroupLayout(pannelSP2);
        pannelSP2.setLayout(pannelSP2Layout);
        pannelSP2Layout.setHorizontalGroup(
            pannelSP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelSP2Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(sell_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pannelSP2Layout.setVerticalGroup(
            pannelSP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sell_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        pannelSP3.setBackground(new java.awt.Color(255, 255, 255));
        pannelSP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pannelSP3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pannelSP3MouseEntered(evt);
            }
        });

        recept_panel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        recept_panel.setText("Hóa đơn");
        recept_panel.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout pannelSP3Layout = new javax.swing.GroupLayout(pannelSP3);
        pannelSP3.setLayout(pannelSP3Layout);
        pannelSP3Layout.setHorizontalGroup(
            pannelSP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelSP3Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(recept_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pannelSP3Layout.setVerticalGroup(
            pannelSP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recept_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
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
            .addComponent(lblSanpham4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
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
            .addComponent(lblSanpham5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(import_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelSP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelSP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kho_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(static_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(import_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pannelSP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannelSP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kho_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(static_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(232, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jmain, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void prd_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prd_panelMouseClicked
        //           set_color_pannel(2);
                open_gui(1);
    }//GEN-LAST:event_prd_panelMouseClicked

    private void import_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_import_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_import_panelMouseClicked

    private void import_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_import_panelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_import_panelMouseEntered

    private void pannelSP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pannelSP2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pannelSP2MouseClicked

    private void pannelSP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pannelSP2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pannelSP2MouseEntered

    private void pannelSP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pannelSP3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pannelSP3MouseClicked

    private void pannelSP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pannelSP3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pannelSP3MouseEntered

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
    private javax.swing.JPanel import_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jmain;
    private javax.swing.JPanel kho_panel;
    private javax.swing.JLabel lblSanpham;
    private javax.swing.JLabel lblSanpham1;
    private javax.swing.JLabel lblSanpham4;
    private javax.swing.JLabel lblSanpham5;
    private javax.swing.JPanel pannelSP2;
    private javax.swing.JPanel pannelSP3;
    private javax.swing.JPanel prd_panel;
    private javax.swing.JLabel recept_panel;
    private javax.swing.JLabel sell_panel;
    private javax.swing.JPanel static_panel;
    // End of variables declaration//GEN-END:variables
}

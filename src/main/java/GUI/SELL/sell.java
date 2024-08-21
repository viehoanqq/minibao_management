/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SELL;

import BUS.receptBUS;
import BUS.productBUS;
import BUS.recept_detailBUS;
import DTO.productDTO;
import DTO.receptDTO;
import DTO.recept_detailDTO;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThinkBook
 */
public class sell extends javax.swing.JPanel {

   receptDTO recept_ = new receptDTO();
    ArrayList<productDTO> product_list = new ArrayList<>();
    productBUS productBUS = new productBUS();
    DefaultTableModel product_model,recept_model;
    
    /**
     * Creates new form create_import
     */
    public sell() {
        initComponents();
        product_model = (DefaultTableModel) tbl_product.getModel();
        recept_model =  (DefaultTableModel) tbl_recept.getModel();
        product_list = productBUS.getList();
        view_table(product_list,product_model);
        view_date();
    }
    public sell(receptDTO recept , String id_detail) throws SQLException {
        this.recept_ = recept;
        
        initComponents();
        product_model = (DefaultTableModel) tbl_product.getModel();
        recept_model =  (DefaultTableModel) tbl_recept.getModel();
        product_list = productBUS.getList();
        view_table(product_list,product_model);
        view_table_recept_detail(id_detail);
        view_date();
    }
    private void view_date(){
        Date date = new Date(System.currentTimeMillis());
        
        tf_date.setText(String.valueOf(date.toString()));
    }
    private void remove_table(DefaultTableModel tbl){
        int rowCount = tbl.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tbl.removeRow(i);
        }
    
    }
    public void view_table(ArrayList<productDTO> list,DefaultTableModel tbl){
        int i=0;
        remove_table(tbl);
        for (productDTO sp:list){
            tbl.addRow( new Object[]{
                ++i,sp.getId(),sp.getName()
                 
    });}}

    public void view_table_recept_detail(String id) throws SQLException{
        if (id == null) return;
        recept_detailBUS rd = new recept_detailBUS();
        ArrayList<recept_detailDTO> temp_list = new ArrayList<>();
        temp_list = rd.get_all_recept_detail();
        for (recept_detailDTO i:temp_list){
            if (i.getReceptId().equals(id)){
                add_line(recept_model,productBUS.search_id(i.getProductId()));
            }
        }
    }
    public void add_line(DefaultTableModel tbl,productDTO sp){
        {   int i=0;
            tbl.addRow(new Object []{
                ++i,sp.getId(),sp.getName(),sp.getQuantity(),sp.getCostPrice(),sp.getUniPrice()
            });
        }}
    
    private void add_recept_detail() throws SQLException{
        int n =  tbl_recept.getRowCount();
        for (int i=0;i<n;i++ ){
            recept_detailDTO temp = new recept_detailDTO();
            temp.setReceptId(tf_id.getText());
            temp.setProductId(String.valueOf(tbl_recept.getValueAt(i, 1)));
            temp.setQuantity(Integer.parseInt(String.valueOf(tbl_recept.getValueAt(i, 3))));
            recept_detailBUS test = new recept_detailBUS();
            test.add_recept_detail(temp);
        }}
    private void add_recept() throws SQLException{
        recept_.setReceptId(tf_id.getText());
        recept_.setStaff(tf_staff.getText());
        recept_.setDate(Date.valueOf(tf_date.getText()));
        recept_.setTotal(Integer.parseInt(tf_total_cost.getText()));
        receptBUS test = new receptBUS();
        test.add_recept(recept_);
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        tf_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        tf_total_cost = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_staff = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_confirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_recept = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tf_quantity = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setText("Danh sách sản phẩm SP nhập");

        jLabel10.setText("Tổng tiền");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP"
            }
        ));
        tbl_product.setToolTipText("");
        tbl_product.setFocusable(false);
        tbl_product.setRequestFocusEnabled(false);
        tbl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_product);

        tf_search.setForeground(new java.awt.Color(153, 153, 153));
        tf_search.setText("Search...");
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        btn_search.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jLabel6.setText("Danh sách sản phẩm");

        lbl_quantity.setText("Số lượng");

        tf_total_cost.setForeground(new java.awt.Color(153, 153, 153));
        tf_total_cost.setFocusTraversalPolicyProvider(true);
        tf_total_cost.setFocusable(false);
        tf_total_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_total_costActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setBackground(new java.awt.Color(255, 51, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐƠN HÀNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tf_id.setForeground(new java.awt.Color(153, 153, 153));
        tf_id.setFocusTraversalPolicyProvider(true);
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        tf_staff.setForeground(new java.awt.Color(153, 153, 153));
        tf_staff.setFocusTraversalPolicyProvider(true);
        tf_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_staffActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Đơn hàng");

        btn_confirm.setBackground(new java.awt.Color(0, 204, 0));
        btn_confirm.setText("Xác nhận");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên người nhập");

        tf_date.setForeground(new java.awt.Color(153, 153, 153));
        tf_date.setFocusTraversalPolicyProvider(true);
        tf_date.setFocusable(false);
        tf_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dateActionPerformed(evt);
            }
        });

        tbl_recept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Giá nhập", "Giá bán"
            }
        ));
        jScrollPane2.setViewportView(tbl_recept);

        jLabel9.setText("Ngày nhập");

        tf_quantity.setForeground(new java.awt.Color(153, 153, 153));
        tf_quantity.setFocusTraversalPolicyProvider(true);
        tf_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityActionPerformed(evt);
            }
        });
        tf_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_quantityKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_total_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_quantity)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_total_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_quantity))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()== 1){

            lbl_quantity.setVisible(true);
            tf_quantity.setVisible(true);
            tf_quantity.setSize(100, 30);
        }
    }//GEN-LAST:event_tbl_productMouseClicked

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchActionPerformed

    private void tf_total_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_total_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_total_costActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void tf_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_staffActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        try {
            // TODO add your handling code here:
            add_recept_detail();
        } catch (SQLException ex) {
            Logger.getLogger(sell.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        try {
            add_recept();
        } catch (SQLException ex) {
            Logger.getLogger(sell.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        remove_table(recept_model);

    }//GEN-LAST:event_btn_confirmActionPerformed

    private void tf_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dateActionPerformed

    private void tf_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantityActionPerformed

    private void tf_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER ){
            int i = tbl_product.getSelectedRow();
            productDTO temp = new productDTO();
            temp = product_list.get(i);
            temp.setQuantity(Integer.valueOf(tf_quantity.getText()));
            add_line(recept_model,temp);
            recept_.setTotal(recept_.getTotal() + temp.getUniPrice()* Integer.valueOf(tf_quantity.getText()));

            tf_total_cost.setText(String.valueOf(recept_.getTotal()));
            tf_quantity.setVisible(false);
            lbl_quantity.setVisible(false);

        }

    }//GEN-LAST:event_tf_quantityKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_search;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTable tbl_recept;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_quantity;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_staff;
    private javax.swing.JTextField tf_total_cost;
    // End of variables declaration//GEN-END:variables
}

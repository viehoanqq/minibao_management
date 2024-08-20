package DAO;

import static DAO.DBConnect.getConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.productDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bon Nguyen
 */
public class productDAO {

    Connection conn = getConnect();

    public ArrayList<productDTO> list() {
        ArrayList<productDTO> productlist = new ArrayList<>();
        try {
            String sql = "select * from product";
            PreparedStatement stmt_getlist = conn.prepareStatement(sql);
            ResultSet rs = stmt_getlist.executeQuery();

            while (rs.next()) {
                String product_id = rs.getString("product_id");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                int uni_price = rs.getInt("uni_price");
                int cost_price = rs.getInt("cost_price");
                String infor = rs.getString("information");
                
                productDTO product = new productDTO(product_id, name, quantity,cost_price,  uni_price,infor);
                productlist.add(product); 

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return productlist;
    }
 
     public void add(productDTO sp) throws SQLException {
              Connection connection = DBConnect.getConnect();
              String sql = "INSERT INTO product (product_id, name, quantity,cost_price, uni_price, information) VALUES (?, ?, ?, ?, ?, ?)";
              PreparedStatement pst = connection.prepareStatement(sql);

              pst.setString(1, sp.getId());
              pst.setString(2, sp.getName());
              pst.setInt(3, sp.getQuantity());
              pst.setInt(4, sp.getCostPrice());
              pst.setInt(5, sp.getUniPrice());
              pst.setString(6, sp.getInformation());

              pst.executeUpdate();

              pst.close();
          }
     public void update(productDTO sp) {
    try {
        Connection connection = DBConnect.getConnect();
        PreparedStatement pst = connection.prepareStatement("UPDATE product SET name=?, quantity=?, cost_price=? , uni_price=?, information=? WHERE product_id=?");
        pst.setString(1, sp.getName());
        pst.setInt(2, sp.getQuantity());
        pst.setInt(3,sp.getCostPrice());
        pst.setInt(4, sp.getUniPrice());
        pst.setString(5, sp.getInformation());
        pst.setString(6, sp.getId());
        pst.executeUpdate();
        System.out.println("Update thành công");
        pst.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
     public void delete(productDTO sp) {
                        try {
                              Connection connection = DBConnect.getConnect();

                            PreparedStatement pst = connection.prepareStatement("DELETE FROM product WHERE product_id = ?");
                            pst.setString(1, sp.getId());
                            pst.executeUpdate();

                            System.out.println("Xóa thành công");
                            pst.close();
                            connection.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
//                        }
//                    }
//     public void int getQuantity(String id){
//         
//         return 
//     }
                        }
     }
}
    
    
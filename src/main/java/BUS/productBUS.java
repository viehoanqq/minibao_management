package BUS;

import DAO.productDAO;
import DTO.productDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Bon Nguyen
 */
public class productBUS {

    private ArrayList<productDTO> product_list;
    private productDAO productDAO;

    productDAO spDAO=new productDAO(); 
    
    public productBUS(){

        list();
    }

    public void list() {
        productDAO productDAO = new productDAO();
        product_list = new ArrayList<>();
        product_list = productDAO.list();
    }

    public ArrayList<productDTO> getList() {
        return product_list;
    }
 
     public void add(productDTO SP) throws SQLException {
          spDAO.add(SP);
    
      }
    public void update(productDTO SP) throws SQLException {
              spDAO.update(SP);
              
          }
    public void delete(productDTO sp) throws SQLException {
              spDAO.delete(sp);
              
          }
    public productDTO search_id(String id){
        for (productDTO sp:product_list){
            if (sp.getId().equals(id))
                return sp;
        }
        return null;
    }
    public void update_product(productDTO i){
        for (productDTO sp:product_list){
            if (sp.getId().equals(i.getId())){
                sp.setName(i.getName());
                sp.setQuantity(i.getQuantity());
                sp.setUniPrice(i.getUniPrice());
                sp.setInformation(i.getInformation());
            }
        }
    }
    public ArrayList<productDTO> descending_sort(){
        ArrayList<productDTO> temp_list = new ArrayList<>();
        temp_list= product_list;
        Collections.sort(temp_list,new Comparator<productDTO>(){
            public int compare(productDTO p1, productDTO p2){
                return Integer.compare(p1.getQuantity(),p2.getQuantity());
            }
            
        });
        return temp_list;
    }
//    public void remove_product(productDTO i){
//        for ()
//    }
//
//    public int ConvertDoubleToInt(double price){
//        return (int) price;
//    }
//     public int getQuantity(String productID) throws SQLException
//     {
//           productDAO dao = new productDAO();
//           return dao.getQuantity(productID);
//     }
//     public int compareQuantity(String productID,int sl) throws SQLException
//     {
//         productDAO dao = new productDAO();
//         return dao.compareQuantity(productID, sl);
//     }
//       public void update_quantity(String productID,int sl) throws SQLException
//       {
//             productDAO dao = new productDAO();
//             dao.update_quantity(productID, sl);
//       }
//      public String createId()
//    {
//        productDAO dao = new productDAO();
//        String maSP;
//        dsProduct = new ArrayList<>();
//        dsProduct = dao.list();
//        int l = dsProduct.size();
//        l = l + 1;
//        if (l < 10) {
//            maSP = "SP0" + String.valueOf(l);
//        } else {
//            maSP = "SP" + String.valueOf(l);
//        }
//
//        return maSP;
//    }
//    
//
//
//
//
//    public void sub_quantity(String productID, int sl) throws SQLException {
//        productDAO dao = new productDAO();
//        dao.sub_quantity(productID, sl);
//    }
//
//    public ArrayList<productDTO> searchByIđAnName(String s) {
//        ArrayList<productDTO> list = new ArrayList<>();
//        for (productDTO product : list) {
//            if (product.getProducctID().toLowerCase().contains(s.toLowerCase())
//                    && product.getProductName().toLowerCase().contains(s.toLowerCase())) {
//                list.add(product);
//            }
//        }
//        return list;
//    }
//    public ArrayList<productDTO> SeardByname(String s) {
//            ArrayList<productDTO > list = getList();
//        ArrayList<productDTO > ketQua = new ArrayList<>();
//        for (productDTO brand : list) {
//            
//            if (s.equalsIgnoreCase(brand.getBrandID())) {
//                ketQua.add(brand);
//            }
//        }
//        return ketQua;
//    }
//    


}

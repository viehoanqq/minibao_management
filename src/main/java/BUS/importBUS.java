/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.importDTO;
import DAO.importDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ThinkBook
 */
public class importBUS {
    private ArrayList<importDTO> list = new ArrayList<>();
    private importDAO imDAO = new importDAO();
    
    public importBUS() {
        get_list();
        
    };
    public ArrayList<importDTO>  get_list() {
        importDAO importDAO = new importDAO();
        list = importDAO.get_list();
        return list;
    }
    public void add_import(importDTO i) throws SQLException{
        imDAO.add_import(i);
        
    }
    public void update_import(importDTO i) throws SQLException{
        imDAO.update_import(i);
    }
    public void delete_import(importDTO i) throws SQLException{
        imDAO.delete_import(i);
    }
      
    
    
}

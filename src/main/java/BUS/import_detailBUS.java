package BUS;

import DAO.import_detailDAO;
import DTO.import_detailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class import_detailBUS {
    private ArrayList<import_detailDTO>  import_detail_list;
    private import_detailDAO imDAO = new import_detailDAO();
    

    // Constructor to initialize DAO with a database connection
    public import_detailBUS(){}
    public import_detailBUS(Connection conn) throws SQLException {
        this.imDAO = new import_detailDAO();
        list();
    }

    // Method to add a new import_detailDTO
    private void list() throws SQLException{
        import_detailDAO A = new import_detailDAO();
        import_detail_list = A.getAllImportDetails();
    }
    public void addImportDetail(import_detailDTO detail) throws SQLException {
        imDAO.addImportDetail(detail);
    }

    // Method to update an existing import_detailDTO
    public void updateImportDetail(import_detailDTO detail) throws SQLException {
        imDAO.updateImportDetail(detail);
    }

    // Method to delete an import_detailDTO
    public void deleteImportDetail(String importId, String productId) throws SQLException {
        imDAO.deleteImportDetail(importId, productId);
    }

    // Method to get all import_details
    public ArrayList<import_detailDTO> getAllImportDetails() throws SQLException {
        return imDAO.getAllImportDetails();
    }

    // Method to get a specific import_detailDTO
    public import_detailDTO getImportDetail(String importId, String productId) throws SQLException {
        return imDAO.getImportDetail(importId, productId);
    }
}
package BUS;

import DAO.recept_detailDAO;
import DTO.recept_detailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class recept_detailBUS {
    private recept_detailDAO recept_detailDAO;

    // Constructor
    public recept_detailBUS() {
        this.recept_detailDAO = new recept_detailDAO();
    }

    // Add a new receipt detail
    public void add_recept_detail(recept_detailDTO detail) throws SQLException {
        recept_detailDAO.addReceptDetail(detail);
    }

    // Update an existing receipt detail
    public void update_recept_detail(recept_detailDTO detail) throws SQLException {
        recept_detailDAO.updateReceptDetail(detail);
    }

    // Delete a receipt detail
    public void delete_recept_detail(String receptId, String productId) throws SQLException {
        recept_detailDAO.deleteReceptDetail(receptId, productId);
    }

    // Retrieve all receipt details
    public ArrayList<recept_detailDTO> get_all_recept_detail() throws SQLException {
        return recept_detailDAO.getAllReceptDetails();
    }

    // Retrieve a specific receipt detail
    public recept_detailDTO get_recept_detail(String receptId, String productId) throws SQLException {
        return recept_detailDAO.getReceptDetail(receptId, productId);
    }
}
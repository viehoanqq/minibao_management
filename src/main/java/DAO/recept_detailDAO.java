package DAO;

import DTO.recept_detailDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class recept_detailDAO {
    private Connection connection = DBConnect.getConnect();

    // Constructor to initialize the database connection
    public recept_detailDAO() {

    }

    // Method to add a new receipt detail
    public void addReceptDetail(recept_detailDTO detail) throws SQLException {
        String sql = "INSERT INTO recept_detail (recept_id, product_id, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, detail.getReceptId());
            pstmt.setString(2, detail.getProductId());
            pstmt.setInt(3, detail.getQuantity());
            pstmt.executeUpdate();
        }
    }

    // Method to update an existing receipt detail
    public void updateReceptDetail(recept_detailDTO detail) throws SQLException {
        String sql = "UPDATE recept_detail SET quantity = ? WHERE recept_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, detail.getQuantity());
            pstmt.setString(2, detail.getReceptId());
            pstmt.setString(3, detail.getProductId());
            pstmt.executeUpdate();
        }
    }

    // Method to delete a receipt detail
    public void deleteReceptDetail(String receptId, String productId) throws SQLException {
        String sql = "DELETE FROM recept_detail WHERE recept_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, receptId);
            pstmt.setString(2, productId);
            pstmt.executeUpdate();
        }
    }

    // Method to retrieve all receipt details
    public ArrayList<recept_detailDTO> getAllReceptDetails() throws SQLException {
        ArrayList<recept_detailDTO> details = new ArrayList<>();
        String sql = "SELECT * FROM recept_detail";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                recept_detailDTO detail = new recept_detailDTO();
                detail.setReceptId(rs.getString("recept_id"));
                detail.setProductId(rs.getString("product_id"));
                detail.setQuantity(rs.getInt("quantity"));
                details.add(detail);
            }
        }
        return details;
    }

    // Method to retrieve a specific receipt detail
    public recept_detailDTO getReceptDetail(String receptId, String productId) throws SQLException {
        String sql = "SELECT * FROM recept_detail WHERE recept_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, receptId);
            pstmt.setString(2, productId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new recept_detailDTO(
                    rs.getString("recept_id"),
                    rs.getString("product_id"),
                    rs.getInt("quantity")
                );
            }
        }
        return null;
    }
}
package DAO;

import DTO.import_detailDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class import_detailDAO {
    private Connection conn = DBConnect.getConnect(); 
     

    // Constructor to initialize the database connection
    public import_detailDAO() {
    }

    public void addImportDetail(import_detailDTO detail) throws SQLException {
        String sql = "INSERT INTO import_detail (import_id, product_id, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, detail.getImportId());
            pstmt.setString(2, detail.getProductId());
            pstmt.setInt(3, detail.getQuantity());
            pstmt.executeUpdate();
        }
    }

    public void updateImportDetail(import_detailDTO detail) throws SQLException {
        String sql = "UPDATE import_detail SET quantity = ? WHERE import_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, detail.getQuantity());
            pstmt.setString(2, detail.getImportId());
            pstmt.setString(3, detail.getProductId());
            pstmt.executeUpdate();
        }
    }

    public void deleteImportDetail(String importId, String productId) throws SQLException {
        String sql = "DELETE FROM import_detail WHERE import_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, importId);
            pstmt.setString(2, productId);
            pstmt.executeUpdate();
        }
    }

    // Method to get all import_details
    public ArrayList<import_detailDTO> getAllImportDetails() throws SQLException {
        ArrayList<import_detailDTO> details = new ArrayList<>();
        String sql = "SELECT import_id, product_id, quantity FROM import_detail";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String importId = rs.getString("import_id");
                String productId = rs.getString("product_id");
                int quantity = rs.getInt("quantity");
                details.add(new import_detailDTO(importId, productId, quantity));
            }
        }
        return details;
    }

    public import_detailDTO getImportDetail(String importId, String productId) throws SQLException {
        String sql = "SELECT import_id, product_id, quantity FROM import_detail WHERE import_id = ? AND product_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, importId);
            pstmt.setString(2, productId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new import_detailDTO(rs.getString("import_id"), 
                                             rs.getString("product_id"), 
                                             rs.getInt("quantity"));
                }
            }
        }
        return null; 
    }
}
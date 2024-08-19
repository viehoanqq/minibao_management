package DAO;

import static DAO.DBConnect.getConnect;
import DTO.importDTO;
import DTO.productDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ArrayList;

public class importDAO {
    private Connection conn ;
    public importDAO(){};

    // Thêm importDTO
    public void add_import(importDTO importEntry) throws SQLException {
        String sql = "INSERT INTO import (import_id, staff, create_time, total) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, importEntry.getImportId());
            pstmt.setString(2, importEntry.getStaff());
            pstmt.setDate(3, importEntry.getDate());
            pstmt.setInt(4, importEntry.getTotal());
            pstmt.executeUpdate();
        }
    }

    // Cập nhật importDTO
    public void update_import(importDTO importEntry) throws SQLException {
        String sql = "UPDATE import SET staff = ?, create_time = ?, total = ? WHERE import_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, importEntry.getStaff());
            pstmt.setDate(2, importEntry.getDate());
            pstmt.setInt(3, importEntry.getTotal());
            pstmt.setString(4, importEntry.getImportId());
            pstmt.executeUpdate();
        }
    }

    // Xóa importDTO
    public void delete_import(importDTO importId) throws SQLException {
                Connection conn = getConnect();
        String sql = "DELETE FROM import WHERE import_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, importId.getImportId());
            pstmt.executeUpdate();
        }
    }

    // Lấy tất cả các importDTO
    public ArrayList<importDTO> get_list() {
        Connection conn = getConnect();
        ArrayList<importDTO> list = new ArrayList<>();
        try {
            String sql = "select * from import";
            PreparedStatement stmt_getlist = conn.prepareStatement(sql);
            ResultSet rs = stmt_getlist.executeQuery();

            while (rs.next()) {
                String import_id = rs.getString("import_id");
                String staff = rs.getString("staff");
                Date create_time = rs.getDate("create_time");
                int total = rs.getInt("total");
                
                importDTO Import = new importDTO(import_id,staff,create_time,total);
                list.add(Import); 

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }
 
}
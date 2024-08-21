package DAO;

import DTO.receptDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for Recept
 */
public class receptDAO {
    private Connection connection = DBConnect.getConnect(); 

    // Constructor to initialize the connection
    public receptDAO() {

    }

    // Method to create a new recept
    public void createRecept(receptDTO recept) throws SQLException {
        String sql = "INSERT INTO recept (recept_id, staff, date, total) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, recept.getReceptId());
            statement.setString(2, recept.getStaff());
            statement.setDate(3, recept.getDate());
            statement.setInt(4, recept.getTotal());
            statement.executeUpdate();
        }
    }

    // Method to read a recept by ID
    public receptDTO readRecept(String receptId) throws SQLException {
        String sql = "SELECT * FROM recept WHERE recept_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, receptId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new receptDTO(
                    resultSet.getString("recept_id"),
                    resultSet.getString("staff"),
                    resultSet.getDate("date"),
                    resultSet.getInt("total")
                );
            }
        }
        return null; // or throw an exception
    }

    // Method to update an existing recept
    public void updateRecept(receptDTO recept) throws SQLException {
        String sql = "UPDATE recept SET staff = ?, date = ?, total = ? WHERE recept_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, recept.getStaff());
            statement.setDate(2, recept.getDate());
            statement.setInt(3, recept.getTotal());
            statement.setString(4, recept.getReceptId());
            statement.executeUpdate();
        }
    }

    // Method to delete a recept
    public void deleteRecept(String receptId) throws SQLException {
        String sql = "DELETE FROM recept WHERE recept_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, receptId);
            statement.executeUpdate();
        }
    }

    // Method to list all recepts
    public ArrayList<receptDTO> getAllRecepts() throws SQLException {
        ArrayList<receptDTO> recepts = new ArrayList<>();
        String sql = "SELECT * FROM recept";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                receptDTO recept = new receptDTO(
                    resultSet.getString("recept_id"),
                    resultSet.getString("staff"),
                    resultSet.getDate("date"),
                    resultSet.getInt("total")
                );
                recepts.add(recept);
            }
        }
        return recepts;
    }
}
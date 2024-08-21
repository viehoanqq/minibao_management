package BUS;

import DAO.receptDAO; // Note the capitalization
import DTO.receptDTO; // Note the capitalization
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Business Logic Layer for Recept
 */
public class receptBUS {
    private ArrayList<receptDTO> recept_list = new ArrayList<>();
    private receptDAO receptDAO;

    public receptBUS() {
        try {
            receptDAO = new receptDAO();
            list();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }

    private void list() throws SQLException {
        recept_list = receptDAO.getAllRecepts();
    }

    public ArrayList<receptDTO> get_list() {
        return recept_list;
    }

    public void add_recept(receptDTO recept) {
        try {
            receptDAO.createRecept(recept);
            recept_list.add(recept); // Update in-memory list
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }

    public void update_recept(receptDTO recept) {
        try {
            receptDAO.updateRecept(recept);
            // Update the in-memory list as well
            for (int i = 0; i < recept_list.size(); i++) {
                if (recept_list.get(i).getReceptId().equals(recept.getReceptId())) {
                    recept_list.set(i, recept);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }

    public void delete_recept(String receptId) {
        try {
            receptDAO.deleteRecept(receptId);
            // Remove from in-memory list
            recept_list.removeIf(recept -> recept.getReceptId().equals(receptId));
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }
    
    public boolean check_date(){
        Date date = new Date(System.currentTimeMillis());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(recept_list.get(recept_list.size() - 1).getDate()).equals(sdf.format(date));
    }
    public receptDTO get_last_recept(){
        return recept_list.get(recept_list.size()-1);
        }
}
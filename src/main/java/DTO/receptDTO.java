package DTO;

import java.sql.Date;

/**
 * Data Transfer Object for Recept
 */
public class receptDTO {
    private String recept_id;  // ID của nhập khẩu
    private String staff;       // Nhân viên thực hiện
    private Date date;          // Ngày nhập khẩu
    private int total;          // Tổng số lượng

    // Constructor
    public receptDTO(){}
    public receptDTO(String recept_id, String staff, Date date, int total) {
        this.recept_id = recept_id;
        this.staff = staff;
        this.date = date;
        this.total = total;
    }

    // Getters
    public String getReceptId() {
        return recept_id;
    }

    public String getStaff() {
        return staff;
    }

    public Date getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    // Setters
    public void setReceptId(String recept_id) {
        this.recept_id = recept_id;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ReceptDTO{" +
                "recept_id='" + recept_id + '\'' +
                ", staff='" + staff + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
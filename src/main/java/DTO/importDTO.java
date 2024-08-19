package DTO;

import java.sql.Date;

/**
 */
public class importDTO {
    private String import_id;  // ID của nhập khẩu
    private String staff;       // Nhân viên thực hiện
    private Date date;          // Ngày nhập khẩu
    private int total;          // Tổng tiền

    // Hàm khởi tạo
    public importDTO(){};
    public importDTO(String import_id, String staff, Date date, int total) {
        this.import_id = import_id;
        this.staff = staff;
        this.date = date;
        this.total = total;
    }

    // Getter và Setter cho import_id
    public String getImportId() {
        return import_id;
    }

    public void setImportId(String import_id) {
        this.import_id = import_id;
    }

    // Getter và Setter cho staff
    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    // Getter và Setter cho date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getter và Setter cho total
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "importDTO{" +
                "import_id='" + import_id + '\'' +
                ", staff='" + staff + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
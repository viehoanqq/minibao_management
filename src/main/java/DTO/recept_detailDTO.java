package DTO;

/**
 * Data Transfer Object for receipt details.
 * 
 * @author ThinkBook
 */
public class recept_detailDTO {
    private String recept_id;
    private String product_id;
    private int quantity;

    // Default constructor
    public recept_detailDTO() {}

    // Parameterized constructor
    public recept_detailDTO(String recept_id, String product_id, int quantity) {
        this.recept_id = recept_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    // Getters
    public String getReceptId() {
        return recept_id;
    }

    public String getProductId() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setReceptId(String recept_id) {
        this.recept_id = recept_id;
    }

    public void setProductId(String product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    @Override
    public String toString() {
        return "ReceptDetailDTO{" +
                "recept_id='" + recept_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {
        int result = recept_id.hashCode();
        result = 31 * result + product_id.hashCode();
        result = 31 * result + quantity;
        return result;
    }
}
package DTO;

public class import_detailDTO {
    private String import_id;
    private String product_id;
    private int quantity;

    // Constructor
    public import_detailDTO(){
        
    }
    public import_detailDTO(String import_id, String product_id, int quantity) {
        this.import_id = import_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    // Getters
    public String getImportId() {
        return import_id;
    }

    public String getProductId() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setImportId(String import_id) {
        this.import_id = import_id;
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
        return "import_detail{" +
                "import_id='" + import_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
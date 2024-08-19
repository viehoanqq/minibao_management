package DTO;

/**
 * Product Data Transfer Object
 * 
 * This class represents a product with attributes such as id, name, quantity,
 * unit price, and additional information.
 * 
 * Author: ThinkBook
 */
public class productDTO {
    private String id;
    private String name;
    private String information;
    private int quantity;
    private int uni_price;

    // Default constructor
    public productDTO() {}

    // Constructor with parameters
    public productDTO(String id, String name, int quantity, int uni_price, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.quantity = quantity;
        this.uni_price = uni_price;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUniPrice() {
        return uni_price;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUniPrice(int uni_price) {
        this.uni_price = uni_price;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Asus
 */
public class ScheduledOrderDetailEntity {
    private String orderId;
    private String itemName;
    private String quantity;
    private String price;

    public ScheduledOrderDetailEntity() {
    }

    public ScheduledOrderDetailEntity(String orderId, String itemName, String quantity, String price) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ScheduledOrderDetail{" + "orderId=" + orderId + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}

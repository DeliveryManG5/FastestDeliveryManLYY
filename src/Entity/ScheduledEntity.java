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
public class ScheduledEntity {
    private String OrderID;
    private String CustomerID;
    private String date;
    private String area;
    private String address;
    private String status;
    private String restarant;
    private String deliveryMan;

    public ScheduledEntity() {
    }

    public ScheduledEntity(String OrderID, String CustomerID, String date, String area, String address) {
        this.OrderID = OrderID;
        this.CustomerID = CustomerID;
        this.date = date;
        this.area = area;
        this.address = address;
    }

    public ScheduledEntity(String OrderID, String CustomerID, String date, String area, String address, String status, String restarant, String deliveryMan) {
        this.OrderID = OrderID;
        this.CustomerID = CustomerID;
        this.date = date;
        this.area = area;
        this.address = address;
        this.status = status;
        this.restarant = restarant;
        this.deliveryMan = deliveryMan;
    }
    

    
    
    
    
    
    
   

    public String getOrderID() {
        return OrderID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }
    
    public String getArea() {
        return area;
    }

    public String getStatus() {
        return status;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public String getRestarant() {
        return restarant;
    }

    

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setArea(String area) {
        this.area = area;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public void setRestarant(String restarant) {
        this.restarant = restarant;
    }
    
    @Override
    public String toString() {
        return OrderID + "|" + CustomerID + "|" + date + "|" + area + "|" + address + "|" + status + "|" + restarant+ "|" +deliveryMan;
    }

    
    
    
    
}

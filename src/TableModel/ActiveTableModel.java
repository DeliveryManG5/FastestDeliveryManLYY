/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;


import ADT.LScheduledOrder;
import Entity.ScheduledEntity;
import Interface.ScheduledInterface;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Asus
 */
public class ActiveTableModel extends AbstractTableModel{
    private ScheduledInterface<ScheduledEntity> contents = new LScheduledOrder<>();
    String [] columns = {"Order ID","Customer ID","Date","Address","Restarant","Delivery Staff","Status"};    
    public ActiveTableModel(ScheduledInterface<ScheduledEntity> contents){
        this.contents = contents;
    } 
    
    public String getColumnName(int col) {
        return columns[col];
    }
    @Override
    public int getRowCount(){
        return this.contents.getNumberOfEntries();
    }

    @Override
    public int getColumnCount(){
        return 7;
    }

    @Override
    public Object getValueAt(int row, int column){
        String orderID = null;
        String customerID = null;
        String date = null;
        String address = null;
        String restarant = null;
        String status = null;
        String deleveryman = null;
        row++;
        
            ScheduledEntity order = (ScheduledEntity) contents.get(row);
             orderID = order.getOrderID();
             customerID = order.getCustomerID();
             date = order.getDate();
             address = order.getAddress();
             restarant = order.getRestarant();
             deleveryman = order.getDeliveryMan();
             status = order.getStatus();
          
        if(column == 0)
            return orderID;
        else if(column == 1)
            return customerID;
        else if(column == 2)
            return date;
        else if(column == 3)
            return address;
        else if(column == 4)
            return restarant;
        else if(column == 5)
            return deleveryman;
        else
            return status;
        
        
    }
}

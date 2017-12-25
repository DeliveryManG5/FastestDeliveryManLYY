/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import ADT.LScheduledOrder;
import Entity.ScheduledOrderDetailEntity;
import Interface.ScheduledInterface;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Asus
 */
public class DetailTableModel extends AbstractTableModel{
    private ScheduledInterface<ScheduledOrderDetailEntity> contents = new LScheduledOrder<>();
    String [] columns = {"Item Name","Quantity","Price","Total Price"};    
    public DetailTableModel(ScheduledInterface<ScheduledOrderDetailEntity> contents){
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
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column){
        String ItemName = null;
        int quantity = 0;
        int price = 0;
        int totalprice = 0;
        
        row++;
        
            ScheduledOrderDetailEntity order = (ScheduledOrderDetailEntity) contents.get(row);
             ItemName = order.getItemName();
             quantity = Integer.parseInt(order.getQuantity());
             price = Integer.parseInt(order.getPrice());
             totalprice = quantity*price;
             
          
        if(column == 0)
            return ItemName;
        else if(column == 1)
            return quantity;
        else if(column == 2)
            return price;
        else
            return totalprice;
        
        
    }
}

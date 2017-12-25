/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Client.ScheduledOrderHome;
import Entity.ScheduledEntity;
import Entity.ScheduledOrderDetailEntity;
import Interface.ScheduledInterface;
/**
 *
 * @author Asus
 */
public class LScheduledOrder<T> implements ScheduledInterface<T>{
    
    private Node firstNode; // reference to first node
    private int numberOfEntries; // number of entries in list

    @Override
    public boolean addRecord(T newDetails) {
        Node newNode = new Node(newDetails);	// create the new node

        if (isEmpty()) // if empty list
        {
            firstNode = newNode;
        } else {                        // add to end of nonempty list
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            while (currentNode.next != null) {	// while have not reached the last node
                currentNode = currentNode.next;
            }
            currentNode.next = newNode; // make last node reference new node
        }

        numberOfEntries++;
        
        return true;
    }

    @Override
    public boolean updateRecord(int givenPosition, T newOrderID) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
          Node currentNode = firstNode;
          for (int i = 0; i < givenPosition - 1; ++i) {
            currentNode = currentNode.next;		// advance currentNode to next node
          }
          currentNode.data = newOrderID;	// currentNode is pointing to the node at givenPosition
        } else {
          isSuccessful = false;
        }

        return isSuccessful;
    }

   

    @Override
    public ScheduledInterface<ScheduledEntity> getActiveRecord(String dateTime) {
        ScheduledInterface<ScheduledEntity> activeList = new LScheduledOrder<>();
        if(!ScheduledOrderHome.scheduledOrderList.isEmpty()){
            System.out.println(ScheduledOrderHome.scheduledOrderList);
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                ScheduledEntity scheduled = (ScheduledEntity)currentNode.data;
                String date = scheduled.getDate();
                if(date.equals(dateTime)){
                    activeList.addRecord(scheduled);
                }
                
                currentNode = currentNode.next;
        
            }
        }
        return activeList;
    }
    
    @Override
    public ScheduledInterface getActiveRecord(String dateTime, String area) {
        ScheduledInterface<ScheduledEntity> activeList = new LScheduledOrder<>();
        if(!ScheduledOrderHome.scheduledOrderList.isEmpty()){
            System.out.println("LD:" + ScheduledOrderHome.scheduledOrderList);
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                ScheduledEntity scheduled = (ScheduledEntity)currentNode.data;
                String date = scheduled.getDate();
                String ScheduledArea = scheduled.getArea();
                if(date.equals(dateTime)&&ScheduledArea.equals(area)){
                    activeList.addRecord(scheduled);
                }
                
                currentNode = currentNode.next;
        
            }
        }
        return activeList;
    }
    
    @Override
    public ScheduledInterface getDetailRecord(String orderID) {
        ScheduledInterface<ScheduledOrderDetailEntity> activeList = new LScheduledOrder<>();
        if(!ScheduledOrderHome.scheduledOrderDetailList.isEmpty()){
            System.out.println("LD:" + ScheduledOrderHome.scheduledOrderDetailList);
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                ScheduledOrderDetailEntity scheduled = (ScheduledOrderDetailEntity)currentNode.data;
                String tempOrderID = scheduled.getOrderId();
                if(tempOrderID.equals(orderID)){
                    activeList.addRecord(scheduled);
                }
                
                currentNode = currentNode.next;
        
            }
        }
        return activeList;
    }
    
    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
          outputStr += currentNode.data + "\n";
          currentNode = currentNode.next;
        }
        return outputStr;
    }

    @Override
    public T getRecord(String inputID) {
        T result = null;
        
        if(ScheduledOrderHome.scheduledOrderList.isEmpty()){// if empty list
        
            result = null;
        } else {                       
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            for(int i = 0; i < numberOfEntries; i++){
                
                ScheduledEntity scheduled = (ScheduledEntity)currentNode.data;

                String id = scheduled.getOrderID();

                if(id.equals(inputID))
                    result = currentNode.data;
                else
                    currentNode = currentNode.next;
        
            }
            
            
        }
        
        return result;
    }

    

    @Override
    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public T getLastData() {
        T result = null;
        
        if (isEmpty()) // if empty list
        {
            result = null;
        } else {                       
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            while (currentNode.next != null) {	// while have not reached the last node
                currentNode = currentNode.next;
            }
            result = currentNode.data;// currentNode is pointing to the last node
        }
        
        return result;
    }

    @Override
    public boolean searchRecord(String orderId) {
        boolean found = false;
        Node currentNode = firstNode;
        for(int i = 0; i < numberOfEntries; i++) {
          
          ScheduledEntity scheduled = (ScheduledEntity)currentNode.data;
          String tempOrderID = scheduled.getOrderID();
          if(tempOrderID.equals(orderId)){
            found = true;
          }
          else{
              currentNode = currentNode.next;
          }
        }
        
        return found;
    }

    @Override
    public int getNumberOfEntries() {
        
    return numberOfEntries;
    }

    @Override
    public T get(int givenPosition) {
        T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      result = currentNode.data;	// currentNode is pointing to the node at givenPosition
    }

    return result;
    }

    @Override
    public int getPosition(String id) {
        int position = 0;
        Node currentNode = firstNode;
        for(int i = 1; i <= numberOfEntries; i++) {
            ScheduledEntity scheduled = (ScheduledEntity)currentNode.data;
            String orderID = scheduled.getOrderID();
            if(orderID.equals(id)){
            position = i;
            break;
          }
          else
              currentNode = currentNode.next;
        }
        
        return position;
    }

    

    
    private class Node {

        private T data;
        private Node next;
        

        private Node(T data) {
          this.data = data;
          this.next = null;
        }

        private Node(T data, Node next) {
          this.data = data;
          this.next = next;
        }
        


        
    } // end Node
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Asus
 */
public interface ScheduledInterface<T> {
    boolean addRecord(T newDetails);
    boolean updateRecord(int givenPosition, T newOrderID);
    ScheduledInterface getActiveRecord(String dateTime);
    ScheduledInterface getActiveRecord(String dateTime, String area);
    ScheduledInterface getDetailRecord(String orderID);
    T getRecord(String inputID);
    void clear();
    boolean isEmpty();
    T getLastData();
    boolean searchRecord(String orderId);
    int getNumberOfEntries();
    T get(int givenPosition);
    int getPosition(String id);
}

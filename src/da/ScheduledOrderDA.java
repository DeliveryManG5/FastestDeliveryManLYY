/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ScheduledOrderDA {
    private String host = "jdbc:derby://localhost:1527/OrderDb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "FOODORDER";
    private Connection conn;
    private PreparedStatement stmt;

    public ScheduledOrderDA(){
        createConnection();
    }
      
    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(host, user, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }  
    
    private void shutDown() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public ResultSet selectRecord(String date){
        String queryStr = "SELECT * FROM " + tableName + " WHERE  DATE_ORDER = ?";
        ResultSet rs = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1,date);
            
            rs = stmt.executeQuery();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
}
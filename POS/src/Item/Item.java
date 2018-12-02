/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum Ravishara
 */
public class Item {
    public static void main(String[] args) {
        
    
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "sithum");
            Statement stm=connection.createStatement();
           String SQL="Select*From item";
           ResultSet rst= stm.executeQuery(SQL);
           while(rst.next()){
           String code = rst.getString("Code");
           String description = rst.getString("description");
           String unitprice = rst.getString("unitprice");
           Double qtyOnHand = rst.getDouble("qtyOnHand");
            System.out.println(code+"\t"+description+"\t\t"+unitprice+"\t"+qtyOnHand);
           }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
}
}
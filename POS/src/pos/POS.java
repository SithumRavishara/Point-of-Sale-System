
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum Ravishara
 */
public class POS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "sithum");
            Statement stm=connection.createStatement();
           String SQL="Select*From customer";
           ResultSet rst= stm.executeQuery(SQL);
           while(rst.next()){
           String ID = rst.getString("ID");
           String NAME = rst.getString("NAME");
           String ADRESS = rst.getString("ADRESS");
           Double SALARY = rst.getDouble("SALARY");
            System.out.println(ID+"\t"+NAME+"\t"+ADRESS+"\t"+SALARY);
           }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }
    
}

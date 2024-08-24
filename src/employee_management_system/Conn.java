
package employee_management_system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "_Divyansh4");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

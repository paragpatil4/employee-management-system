package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "paragpatil");
          s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*
Creating JDBC Conectivity:
1. Register the driver class
2. Creating the connecting string
3. Creating the statement
4. Executing mysql queries
5. Closing the connections
*/
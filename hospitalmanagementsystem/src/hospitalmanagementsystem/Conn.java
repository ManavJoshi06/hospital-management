package hospitalmanagementsystem;

import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn()
    {
        try{Class.forName("com.mysql.cj.jdbc.Driver");
           c= DriverManager.getConnection("jdbc:mysql://localhost:3306/carehospital", "root", "1234");
           s=c.createStatement();
      }catch(Exception e)
      { e.printStackTrace();
      }
    }
    
}

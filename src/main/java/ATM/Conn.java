package ATM;

import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","passw0rd");
            s =c.createStatement();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


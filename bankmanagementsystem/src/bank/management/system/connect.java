package bank.management.system;

import java.sql.*;

public class connect {
    Connection connection;
    Statement statement;
    public connect()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Pra1607@");
            statement=connection.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }

}

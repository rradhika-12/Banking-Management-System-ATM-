package bank.management.system;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;

    Statement statement;

    public Con() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "sqlmy12");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

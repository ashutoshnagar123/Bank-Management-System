package bank_management_system_ant;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankmanagementsystem",
                    "root",
                    "Ashu@8209691886"
            );

            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
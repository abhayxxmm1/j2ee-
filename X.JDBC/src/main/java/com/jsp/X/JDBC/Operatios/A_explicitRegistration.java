package com.jsp.X.JDBC.Operatios;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
//import org.postgresql.Driver;   // PostgreSQL JDBC driver

public class A_explicitRegistration {
    public static void main(String[] args) throws SQLException {

    	/**
    	 * @check A1_execute.java
    	 */
        // 1. Register the driver explicitly
        Driver pgDriver = new org.postgresql.Driver();
        DriverManager.registerDriver(pgDriver);   // manual registration with DriverManager [web:21][web:26]

        // 2. Get connection
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/scott",
                "postgres",
                "root"
        );

        System.out.println("Connection established: " + con);
        con.close();
    }
}

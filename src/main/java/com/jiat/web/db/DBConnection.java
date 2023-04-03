package com.jiat.web.db;

import com.jiat.web.util.ApplicationProperties;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws Exception {

        ApplicationProperties properties = ApplicationProperties.getInstance();
        Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(properties.get("sql.connection.url"), properties.get("sql.connection.username"), properties.get("sql.connection.password"));


        return connection;
    }

}

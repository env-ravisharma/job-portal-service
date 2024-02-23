package com.env.jobportalbackend.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseService {

    public Connection getJDBConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/practice_database";
        String uname = "postgres";
        String pass = "root";
        return DriverManager.getConnection(url, uname, pass);
    }

}

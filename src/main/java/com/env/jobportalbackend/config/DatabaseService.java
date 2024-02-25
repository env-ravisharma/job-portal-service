package com.env.jobportalbackend.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseService {

    public Connection getH2DBConnection() throws Exception {
        return DriverManager.getConnection("jdbc:h2:mem:test");
    }

}

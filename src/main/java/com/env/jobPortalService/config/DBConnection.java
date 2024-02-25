package com.env.jobPortalService.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public String url;
    public String userName;
    public String password;

    public DBConnection(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public Connection getDBConnection() throws Exception {
        return DriverManager.getConnection(url, userName, password);
    }

}

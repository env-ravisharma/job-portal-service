package com.env.jobportalbackend.config.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public String url;
    public String userName;
    public String password;

    public Connection getDBConnection() throws Exception {
        return DriverManager.getConnection(url, userName, password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

package com.env.jobportalbackend.core.persistence;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionService {

    public Connection getDBConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/practice_database";
        String uname = "postgres";
        String pass = "root";
        String sql = "insert into student values (?,?,?)";

        return DriverManager.getConnection(url, uname, pass);
    }
}

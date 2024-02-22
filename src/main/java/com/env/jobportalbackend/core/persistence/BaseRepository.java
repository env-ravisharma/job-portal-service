package com.env.jobportalbackend.core.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BaseRepository {

    Connection con;

    public BaseRepository() throws Exception {
        con = new JdbcConnectionService().getDBConnection();
    }


    public void insertStudent(int id, String name, int marks) throws Exception
    {
        try {
            String sql = "insert into student values (?,?,?)";
            PreparedStatement st = this.con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, marks);
            st.execute();
        } catch (Exception e){
            throw e;
        } finally {
            con.close();
        }

    }

}

package sample;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_Accessor {
    Connection con;
    PreparedStatement pst;

    public ResultSet access_database(String query){
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/harmonic_environment","root","");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery(query);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}

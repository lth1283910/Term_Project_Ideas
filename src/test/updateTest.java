package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement stmt = null;

        
        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mysql://localhost/mydb";
        conn = DriverManager.getConnection(url, "root", "tizm**423");

        stmt = conn.createStatement();
        String set_name = "¿Â¿Á«Â";
        String name = "±Ë¿Á«Â";
        String sql = "update table1 set name=\""+set_name+"\" where name=\""+name+"\"";

        stmt.executeUpdate(sql);
	}
}

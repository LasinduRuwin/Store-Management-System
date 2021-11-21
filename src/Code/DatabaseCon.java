/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Lasindu Ruwin
 */
public class DatabaseCon {
    
    private static final String UN = "root";
    private static final String pw = "";
    private static final String URL = "jdbc:mysql://localhost:3306/management_app_db";
    
    public Connection Database_connection()
    {
        Connection con ;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(URL, UN, pw);
            return con;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException");
            return null;
        }
        catch(SQLException ee)
        {
            System.out.println("SQLException");
            return null;
        }
        catch(NullPointerException ex){
            System.out.println("Null pointer Error");
            return null;
        }
        
        
    }
    
    
}

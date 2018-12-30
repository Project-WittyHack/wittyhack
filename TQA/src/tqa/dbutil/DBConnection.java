/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q2VBHN4N:1521/xe","project","java");
            JOptionPane.showMessageDialog(null, "Successfully loaded the Driver", "Success!!", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception sq){
            JOptionPane.showMessageDialog(null, "Error Connecting To The Database"+sq, "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    public static Connection getConnection(){
         return conn;
    }
       
    public static void closeConnection(){
        
	if(conn != null)
	{ 
 		try
		{    conn.close();
                     JOptionPane.showMessageDialog(null,"Successfully disconnected from the database", "SUCCESS!!!", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(SQLException sq){
                     JOptionPane.showMessageDialog(null,"Error In Disconnecting from the Database","ERROR!!", JOptionPane.ERROR_MESSAGE);
		}
	}

     }
    
}

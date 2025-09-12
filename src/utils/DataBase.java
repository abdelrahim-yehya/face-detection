
package utils;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    ResultSet resultat =null;
    Statement instruction;
    public PreparedStatement ps;
    Connection mycnx;
    
    public DataBase() throws SQLException
    {
       String url="jdbc:mysql://localhost:3306/faces";
       String user="root";
       String pass="Abed.yehya123";
     
        try {
             mycnx= DriverManager.getConnection(url,user,pass);
             instruction=mycnx.createStatement();
              ps = mycnx.prepareStatement("select * from person");

        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error!");
        }     
    }
     public ResultSet getData(String Query) throws SQLException
        {
            resultat=instruction.executeQuery(Query); 
            return resultat;
        }
     public void modifyData(String Query) throws SQLException{
         instruction.executeUpdate(Query);
     }
     
    
    
}


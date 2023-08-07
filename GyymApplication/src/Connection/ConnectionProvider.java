/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MI
 */
public class ConnectionProvider {
    
   
     
        public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Nivedvk@18");
        System.out.println("Successfull");
         return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

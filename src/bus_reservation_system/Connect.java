/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_reservation_system;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author ANJAN SAMANTA
 */
public class Connect {
    
   public static Connection ConnectDB(){
//        String url= "jdbc:ucanaccess://C:/Users/ASUS/Desktop/project/bus_reservation_system/db.accdb";
//        Connection conn;
        
        try{
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
//            conn = DriverManager.getConnection(url);
//            Statement statement = conn.createStatement();
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ANJAN SAMANTA\\Desktop\\anjan project\\project\\bus_reservation_system\\db.accdb");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}

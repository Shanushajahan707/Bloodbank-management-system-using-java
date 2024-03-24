/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql. *;
/**
 *
 * @author shanu shajahan
 */
public class DBconnector {
    
    static final String DB_URL = "jdbc:mysql://localhost/bloodbank";
    static final String USER ="root";
    static final String PASS ="";
    public static Connection connectDB(){
        Connection conn=null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
          System.out.println("There were erorrs while connecting to db.");
          return null;
        }
    }

    static Connection db() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

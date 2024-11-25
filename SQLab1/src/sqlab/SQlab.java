/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlab;

import java.io.*; 
import java.sql.*; 
import javax.swing.JOptionPane;
import com.ibatis.common.jdbc.ScriptRunner;
import java.awt.HeadlessException;

public class SQlab {
   
    public static String url = "jdbc:sqlite:C:/myDB/database.db";
   
    public static void script(){
        try {
            new File("c:/myDB/").mkdir(); //creates the folder were the DB will be saved.
            DriverManager.registerDriver(new org.sqlite.JDBC());
            Connection conn = DriverManager.getConnection(url);
            ScriptRunner sr = new ScriptRunner(conn,false,false); //No Username & Password
            Reader reader = new BufferedReader(new FileReader("src/sqlab/MyScript.sql"));
            sr.runScript(reader);
            conn.close();
            JOptionPane.showMessageDialog(null,("Database & Table Created & Populated!")); //if there is an error 
            } catch (HeadlessException | IOException | SQLException e) {
              JOptionPane.showMessageDialog(null,(e.getMessage())); //if there is an error a popup is issued
            }//end try catch
    }//end script
    
}//end class SQlab

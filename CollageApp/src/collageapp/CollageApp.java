/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collageapp;

/**
 *
 * @author Mos Afridi
 */
public class CollageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s;
       Lecturer l = new Lecturer();
       Admin a;
       
       String name = "Jo Sharma";
       String email = "jo@sharma.com";
       String progDir = "BSHC1";
       double salary = 45000;
       
       
       l.setName(name);
       l.setEmail(email);
       
        System.out.println("Lecturer name :" +l.getName());
        System.out.println("Email: "+l.getEmail());
        
       String sname= "poala  smith";
       String semail= "Poala@email.com";
       String sid = "x123";
       String scourse = "BSCH!";
       
       s = new Student(sid, scourse, sname, semail);
        System.out.println("Student NAme :" +s.getName());
        System.out.println("Student Email" +s.getEmail());
        
        
        
        String aname = "John";
        String aemail = "John@gmial.com";
        
        a = new Admin(aname, aemail);
        System.out.println("Admin Name " +a.getName());
        System.out.println("Amin Email" +a.getEmail());
    }
    
}// End of Class

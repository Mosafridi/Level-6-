/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String name, email, id;
        
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        
        System.out.println("Enter Name");
        name = sc.nextLine();
        
        System.out.println("Enter Email");
        email = sc.nextLine();
        
        System.out.println("Enter ID");
        id = sc.nextLine();
        
        
        s.setName(name);
        s.setEmail(email);
        s.setId(id);
        
        System.out.println(s.toString());
        System.out.println();
    }
    
}

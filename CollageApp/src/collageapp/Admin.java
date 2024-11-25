/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collageapp;

/**
 *
 * @author Dell
 */
public class Admin extends Person {
    String department;

    public Admin(String name, String email) {
        super(name, email);
    }

    public Admin() {
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
   
    
    
}

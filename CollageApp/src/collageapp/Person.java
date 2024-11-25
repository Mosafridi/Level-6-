/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collageapp;

/**
 *
 * @author Mos Afridi
 */
public class Person {
    protected String name, email;

    public Person(String name, String email) {// Overloaded Constuctor
        this.name = name;
        this.email = email;
    }

    public Person() {// empty  Constuctor
    }

    // Setter 
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Getter 
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    
}

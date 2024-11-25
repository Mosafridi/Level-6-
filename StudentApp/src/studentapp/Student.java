/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author Dell
 */
public class Student {
    
    private String name, email, id;

    public Student(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Student() {
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", id=" + id + '}';
    }
   
    
}

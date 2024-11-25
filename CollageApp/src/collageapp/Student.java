/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collageapp;

/**
 *
 * @author Mos Afridi
 */
public class Student  extends Person{// Student Inhert From Person Class
    
    private String id , course;

    public Student(String id, String course, String name, String email) {
        super(name, email);
        this.id = id;
        this.course = course;
    }

    public Student() {
       
    }

   

    //Setter

    public void setId(String id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }
   
    
    
    
}

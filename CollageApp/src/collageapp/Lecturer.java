/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collageapp;

/**
 *
 * @author Mos Afridi
 */
public class Lecturer extends Person {// Lecturer Inhert From Person Class
    
    private double salary;
    private String progDir;

    public Lecturer(double salary, String progDir, String name, String email) {
        super(name, email);
        this.salary = salary;
        this.progDir = progDir;
    }

    public Lecturer() {// Default Consrtuctor 
       
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setProgDir(String progDir) {
        this.progDir = progDir;
    }

    public double getSalary() {
        return salary;
    }

    public String getProgDir() {
        return progDir;
    }
    
    
    
}// End Class

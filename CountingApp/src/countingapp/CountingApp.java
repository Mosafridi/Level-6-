/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class CountingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        System.out.println("helloWorld");
        
        //declear var
        String sentence;
        
        //declear and create an instance of object
        Count c = new Count();
        
        //ask user for sentence 
        sentence = JOptionPane.showInputDialog(null, "Enter a sentence, Leave out the fullstop");
        
        //call setter
        c.setSentence(sentence);
        
        //call cumpute
        c.compute();
        
        //call get methods and display
      JOptionPane.showMessageDialog(null, "Contains vowels: " + c.getNumV() + ", consonants: " + c.getNumC() + ", words: " + c.getNumS());

        
        JOptionPane.showMessageDialog(null,"Latters" +c.getNumLetters());
    }
    
}

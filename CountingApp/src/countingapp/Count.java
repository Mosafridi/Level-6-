/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countingapp;

/**
 *
 * @author Dell
 */
public class Count {
    
    private String sentence;
   private int numV, numC, numS, numLetters;

    public Count(String sentence, int numV, int numC, int numS, int numLetters) {
        this.sentence = sentence;
        this.numV = numV;
        this.numC = numC;
        this.numS = numS;
        this.numLetters = numLetters;
    }

    public Count() {// defult constractor
    }
 
   
//set methods
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    //get methods
    public int getNumV() {
        return numV;
    }

    public int getNumC() {
        return numC;
    }

    public int getNumS() {
        return numS;
    }

    public int getNumLetters() {
        return numLetters;
    }
   
    public void compute(){
        for(int i = 0; i < sentence.length(); i++){//loop over sentence
            if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i'|| sentence.charAt(i)=='o' || sentence.charAt(i)=='u'){
                numV++;
            }else if(sentence.charAt(i)==' '){
                numS++;
            }else{
                numC++;
            }
        }
       numS++; // i will always have 1 more word then the space in the sentence 
      numLetters = sentence.length();
    }
}

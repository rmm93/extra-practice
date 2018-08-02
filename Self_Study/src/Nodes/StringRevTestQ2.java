/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

import java.util.*;
/**
 *
 * @author Raoum
 */
public class StringRevTestQ2 {
    public static void main (String []args){
        System.out.println("Please enter a String");
        Scanner inp = new Scanner(System.in);
        String word= inp.next();
        StringStackQ2 str= new StringStackQ2(word);
        System.out.println(reverseString(str).stringStck);
        
    }//main method
    public static StringStackQ2 reverseString(StringStackQ2 s){
        StringStackQ2 reverse = new StringStackQ2("");
        String t="";
        for (int i=0 ; i<s.size();i++){
            if (!s.isEmpty()){
                t= ""+ s.pop();
                reverse.push(t);
            }//if
        }//for
        
        return reverse;
    }//method
}

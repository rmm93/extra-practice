/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

/**
 *
 * @author Raoum
 */
public class StringStackQ2 implements StackInterface {
    String stringStck;
    int top;
    
    StringStackQ2(String s){
        stringStck = s;
        top = stringStck.length()-1;
    }//constructor
    @Override
    public void push(String obj) {
       /* if (top+1 == stringStck.length())
            System.out.println("Stack is full");*/
        if(obj.length()==1)
            stringStck += obj;
    }

    @Override
    public char pop() {
    if( isEmpty( ) )
            System.out.println("Stack is Empty" );
        return stringStck.charAt(top--) ;

    }

    @Override
    public char peek() {
        if( isEmpty( ) )
            System.out.println("Stack is Empty" );
        return stringStck.charAt(top);

    }

    @Override
    public boolean isEmpty() {
        return top == -1;

    }

    @Override
    public int size() {
        return stringStck.length();
    }

    @Override
    public void makeEmpty() {
        top = -1;
    }
    
}

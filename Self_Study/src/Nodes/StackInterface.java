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
public interface StackInterface {
    //  Adds an element to the stack
   public void push(String obj);

  //  Removes and returns the top element from this stack
   public char pop( );

   //  Returns without removing the top element of this stack
   public char peek( );   

   //  Returns true if this stack contains no elements
   public boolean isEmpty( );

   //  Returns the number of elements in this stack
   public int size( );

   // Empty the stack
   public void makeEmpty( );

}

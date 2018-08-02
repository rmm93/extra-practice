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
public class List {
    ListNode header;

    // Constructor
    public List(){
        header = new ListNode(); 
    }

    // Test if the list is logically empty.
    public boolean isEmpty( ){
        return header.next == null; 
    }

    // Make the list logically empty
    public void makeEmpty( ){
        header.next = null; 
    }
   
    public void insertAfter(ListNode n, int d){
        ListNode temp=new ListNode(d,n.next);
        n.next=temp;
    }
    // insert a node at the first
    public void insertFirst(int d){
        ListNode temp=new ListNode(d,header.next);
        header.next=temp;
    }
    // delete the node after a node n
    public void deleteAfter(ListNode n){
       if(n.next!=null)  //if n is not last element
          n.next=n.next.next;
    }

}

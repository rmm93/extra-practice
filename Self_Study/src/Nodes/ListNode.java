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
class ListNode {
    int data;
    ListNode next;
    
    //constructors
    ListNode(int d, ListNode n){
        this.data=d;
        this.next=n;
    }   
      
    ListNode(int d){
        this(d, null);
    }

    ListNode(){
        this(0);
    }
    
    ListNode(ListNode n){
        this(0,n);
    }
}

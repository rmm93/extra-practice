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
public class NodeTestQ1 {
    public static void main(String[]args){
        ListNode p = new ListNode(6,null);
        ListNode q = new ListNode(4);        
        p.next= q;
        int tmp= p.data;
        p.data= q.data;
        q.data= tmp;
        ListNode r = new ListNode(5,q);
        p.next=r;
        
        for(ListNode current = p; current != null; current=current.next){
            System.out.println(current.data);
        }//for

        
    }//main 
    
    
}//class

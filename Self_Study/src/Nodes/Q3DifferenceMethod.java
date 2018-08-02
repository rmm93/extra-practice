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
public class Q3DifferenceMethod {
    public static void main(String [] args){
    int [][] A= {{1,2,2},{3,4,5}};
    int [][] B= {{1,2,9},{11,3,4}};
    int [][] L= difference2D(A,B);
    }//main
    
    public static int[][] difference2D(int [][] A, int [][] B){
        int [][] C= new int [A.length][];
    
        for(int i=0 ; i<A.length; i++){
            C[i]= new int[A[i].length];
            for(int j=0 ; j<A[i].length; j++){
                C[i][j]= A[i][j]-B[i][j];
                //System.out.print(C[i][j]+" ");
            }//nested for 
            //System.out.println();
        }//for
    return C;
    }//method
}

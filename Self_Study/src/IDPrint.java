/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IDPrint extends JFrame{
    // attributes 4 text&labels, 1 area, 3 buttons
    private JButton btn1,btn2,btn3;
    private JTextField namet, yeart, idt, colleget;
    private JLabel namel, yearl, idl, collegel;
    private JTextArea picplace = new JTextArea();
    private JPanel pan1,pan2;
    //constructor
    public IDPrint (){
        super();
        setSize(600,600);
        setTitle("Print your info =D");
        // must memorise X_X
        btn1= new JButton("Browse");
        btn2= new JButton("Print");
        btn3= new JButton("Cancel");
        namel = new JLabel("Name: ");
        yearl = new JLabel("Enrollment Year: ");
        idl = new JLabel("Std. ID: ");
        collegel = new JLabel("College: ");
        namet= new JTextField();
        yeart= new JTextField();
        idt= new JTextField();
        colleget= new JTextField();
        pan2= new JPanel ();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont= getContentPane();
        cont.setLayout(null);
        cont.add(picplace);
        picplace.setBounds(10,10,200,200);
        
        // info pan
        pan1 = new JPanel();
        pan1.setLayout(new GridLayout(4,4));
        pan1.add(namel);        pan1.add(namet);
        pan1.add(yearl);        pan1.add(yeart);
        pan1.add(idl);          pan1.add(idt);
        pan1.add(collegel);     pan1.add(colleget);
        
        cont.add(pan1);
        pan1.setBounds(250, 10, 300, 200);
        
        pan2.setLayout(new FlowLayout());
        pan2.add(btn1);
        pan2.add(btn2);
        pan2.add(btn3);
        
        cont.add(pan2);
        pan2.setBounds(10, 250, 300, 400);
    }//contructor
    public static void main(String [] args){
        IDPrint wind = new IDPrint();
        wind.setVisible(true);
    }//main
}//class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Raoum
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tictacktoe extends JFrame{
    
    private JButton btn1 = new JButton ("1");
    private JButton btn2 = new JButton ("2");
    private JButton btn3 = new JButton ("3");
    private JButton btn4 = new JButton ("4");
    private JButton btn5 = new JButton ("5");
    private JButton btn6 = new JButton ("6");
    private JButton btn7 = new JButton ("7");
    private JButton btn8 = new JButton ("8");
    private JButton btn9 = new JButton ("9");
    private JPanel pan1 = new JPanel();
    private JPanel pan = new JPanel();
    private JLabel lbl= new JLabel("\"X\" Player should start: ");
    private int count=0;
    
    public tictacktoe(){
        super();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic-Tack-Toe Game");
        Container cn= getContentPane();
        pan1.add(lbl);
        pan.setLayout(new GridLayout(3,3));
        pan.add(btn1);  pan.add(btn2);  pan.add(btn3);
        pan.add(btn4);  pan.add(btn5);  pan.add(btn6);
        pan.add(btn7);  pan.add(btn8);  pan.add(btn9);
        cn.setLayout(new GridLayout(2,1));
        cn.add(pan1);
        cn.add(pan);
        ButtonListener BL = new ButtonListener();
        btn1.addActionListener(BL);
        btn2.addActionListener(BL);
        btn3.addActionListener(BL);
        btn4.addActionListener(BL);
        btn5.addActionListener(BL);
        btn6.addActionListener(BL);
        btn7.addActionListener(BL);
        btn8.addActionListener(BL);
        btn9.addActionListener(BL);
    }//constructor
    
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            count++;
            Object ob = ae.getSource();
            if (count % 2 == 0){
                if (ob.equals(btn1)){
                btn1.setText("O");}
                else if (ob.equals(btn2)){
                btn2.setText("O");}
                else if (ob.equals(btn3)){
                btn3.setText("O");}
                else if (ob.equals(btn4)){
                btn4.setText("O");}
                else if (ob.equals(btn5)){
                btn5.setText("O");}
                else if (ob.equals(btn6)){
                btn6.setText("O");}
                else if (ob.equals(btn7)){
                btn7.setText("O");}
                else if (ob.equals(btn8)){
                btn8.setText("O");}
                else if (ob.equals(btn9)){
                btn9.setText("O");}
            }//if
            else{
                if (ob.equals(btn1)){
                btn1.setText("X");}
                else if (ob.equals(btn2)){
                btn2.setText("X");}
                else if (ob.equals(btn3)){
                btn3.setText("X");}
                else if (ob.equals(btn4)){
                btn4.setText("X");}
                else if (ob.equals(btn5)){
                btn5.setText("X");}
                else if (ob.equals(btn6)){
                btn6.setText("X");}
                else if (ob.equals(btn7)){
                btn7.setText("X");}
                else if (ob.equals(btn8)){
                btn8.setText("X");}
                else if (ob.equals(btn9)){
                btn9.setText("X");}
            }//else
                if (btn1.getText().equals(btn2.getText())&&btn1.getText().equals(btn3.getText())|| 
                    btn4.getText().equals(btn5.getText())&&btn4.getText().equals(btn6.getText())||
                    btn7.getText().equals(btn8.getText())&&btn7.getText().equals(btn9.getText())||
                    btn1.getText().equals(btn4.getText())&&btn1.getText().equals(btn7.getText())||
                    btn2.getText().equals(btn5.getText())&&btn2.getText().equals(btn8.getText())||
                    btn3.getText().equals(btn6.getText())&&btn3.getText().equals(btn9.getText())||
                    btn1.getText().equals(btn5.getText())&&btn1.getText().equals(btn9.getText())||
                    btn3.getText().equals(btn5.getText())&&btn3.getText().equals(btn7.getText())){
                    if (count % 2 == 0){    
                        JOptionPane.showMessageDialog(null, "\"O\" Player Won");
                        System.exit(0);}//nested if
                    else {
                        JOptionPane.showMessageDialog(null, "\"X\" Player Won");
                        System.exit(0);}
                }// if
                else if (!btn1.getText().equals("1") && !btn2.getText().equals("2") && !btn3.getText().equals("3") 
                && !btn4.getText().equals("4") && !btn5.getText().equals("5") &&!btn6.getText().equals("6") &&
                !btn7.getText().equals("7") && !btn8.getText().equals("8") && !btn9.getText().equals("9")){
                    JOptionPane.showMessageDialog(null, "It's a TIE");
                    System.exit(0);
                }//else
        }//override
    }// private class
        
    public static void main(String[] args){
        tictacktoe wind = new tictacktoe();
        wind.setVisible(true);
    }//main
}

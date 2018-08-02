/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Revision_Of_JFrames extends JFrame{
    private JLabel label= new JLabel("Did you do it Properly Raoum?");
    private JTextArea txt= new JTextArea("Testing... 1... 2... 3"); 
    private JRadioButton yes= new JRadioButton("Yes ^o^", true);
    private JRadioButton no= new JRadioButton("No T_T", false);
    private ButtonGroup answer = new ButtonGroup();
    private JButton btn= new JButton("OK");
    private JPanel p= new JPanel(); 
    public Revision_Of_JFrames(){
        setSize(400,200);
        setTitle("Prior to New Semester Revision");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        answer.add(no);
        answer.add(yes);
        Container cont= getContentPane();
        cont.setLayout(new GridLayout(3,1));
        cont.add(label);
        p.add(yes);
        p.add(no);
        p.add(btn);
        cont.add(p);
        cont.add(txt);
        ActionPressed app= new ActionPressed();
        btn.addActionListener(app);
    }//constructor
    
    private class ActionPressed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object src= ae.getSource();
            if (yes.isSelected() == true){
                txt.setText("Great Job Raoum *^-^* I knew you could do it =D");
            }
            if (no.isSelected() == true){
                txt.setText("It's Ok.. You're almost there .. give it one more try >^<");
            }
              
        }
        
    }
    
    public static void main (String[] args){
        Revision_Of_JFrames fr= new Revision_Of_JFrames();
        fr.show(true);
    }//main
}//class

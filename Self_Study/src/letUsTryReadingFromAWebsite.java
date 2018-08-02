
import java.io.*;
import java.net.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
public class letUsTryReadingFromAWebsite {
    public static void main (String[]args){
        try {
            File saved = new File("info.txt");
            URL infoSource = new URL("https://www.armstrong.edu/academic-departments/cs-it");
            Scanner inp= new Scanner(infoSource.openStream());
            PrintWriter out = new PrintWriter(saved);
            while(inp.hasNext()){
                out.println();
            }
            
            inp.close();
            out.close();
        }
        catch(MalformedURLException ex){
            ex.printStackTrace();
        }
        catch (Exception exc){
            exc.printStackTrace();  
        }
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
import java.util.*;
public class Program4 {
    public static void main(String []args){
        int id,age,fee;
        String menu="", name, fname,lname,clName;
        char clinic;
        while(!menu.equals("Exit")){
            displayMainMenu();
            Scanner sc= new Scanner(System.in);
            menu = sc.next();
            printMsg(menu);
            clinic = readAndVerify();
            while(clinic==' '){
                printMsg(menu);
                clinic = readAndVerify();
            }//while
            if (menu.equals("Book")){
                System.out.print("\tEnter your full name: ");
                fname = sc.next();
                lname= sc.next();
                name= fname+" "+lname;
                System.out.println();
                System.out.print("\tEnter the national ID number: ");
                id= sc.nextInt();
                System.out.println();
                int time= appTime(clinic);
                System.out.printf("\tThe appointment will be at %d PM\n",time);
                System.out.print("\tEnter 1 to confirm ,2 to cancel ");
                int cancel= sc.nextInt();
                if (cancel==2){
                    continue;}
                System.out.println();
                fee=0;
                if (clinic== 'G' || clinic=='g'){
                    fee= 100;
                }//if
                else if (clinic== 'P' || clinic=='p'){
                    fee= 150;
                }//if
                else{
                    fee= 250;
                }//else
                clName = clinicName(clinic);
                bookingInfo(name,id,time,clName,fee);
            }//if
            if (menu.equals("Add")){
                if(clinic!= 'D' && clinic!= 'd'){
                    System.out.print("\tEnter your full name: ");   
                    fname = sc.next();
                    lname= sc.next();
                    name= fname+" "+lname;
                    System.out.println();
                    System.out.print("\tEnter the national ID number: ");
                    id= sc.nextInt();
                    System.out.println();
                    System.out.print("\tEnter your age: ");
                    age= sc.nextInt();
                    System.out.println();
                    System.out.print("\tEnter your mobile number ###-###-####: ");
                    String phone= sc.next();
                    System.out.println();
                    System.out.print("\tEnter weigt in Kilos: ");
                    double w= sc.nextDouble();
                    System.out.println();
                    System.out.print("\tEnter your height in CM: ");
                    double h= sc.nextDouble();
                    System.out.println();
                    String bmi1= BMI(w,h);
                    clName = clinicName(clinic);
                    addPatient(name,id,age,phone,clName,w,h,bmi1);
                }//if
                else{
                    clName = clinicName(clinic);
                    System.out.print("\tEnter your full name: ");   
                    fname = sc.next();
                    lname= sc.next();
                    name= fname+" "+lname;
                    System.out.println();
                    System.out.print("\tEnter the national ID number: ");
                    id= sc.nextInt();
                    System.out.println();
                    System.out.print("\tEnter your age: ");
                    age= sc.nextInt();
                    System.out.println();
                    System.out.print("\tEnter your mobile number ###-###-####: ");
                    String phone= sc.next();
                    System.out.println();
                    addPatient(name,id,age,phone,clName);
                }//else
            }//if
        }//while
    }//main
    
    public static void displayMainMenu(){
        printDash();
        System.out.println("\tWelcome to KAU Medical Administration System");
        printDash();
        System.out.println("\tEnter \"Book\" to book a new appointment");
        System.out.println("\tEnter \"Add\" to add a new patient");
        System.out.println("\tEnter \"Exit\" to exit the program");
        System.out.print("Enter your Choice:");
        
    }//main menu
    
    public static char readAndVerify(){
        Scanner cs= new Scanner(System.in);
        String inp= cs.next();        
        char read= inp.charAt(0);
        if (read== 'G' ||read== 'g'||read== 'P'||read== 'p'||read== 'D'||read== 'd'){
            return read;
        }//if
        else{
            System.out.println("Wrong Choice of clinics ... try again");
            return ' ';
        }//else
    }//input and verify

    public static void printMsg(String menu){
        int x=0;
        while(x!=1){
            if (menu.equals("Book")||menu.equals("Add")|| menu.equals("Exit")){
                if(menu.equals("Exit")){
                    System.exit(0);}
                else{
                    bookAndAdd();
                    x++;}
            }//if
            else {
                System.out.println("Wrong Choice of Service type!");// end of else
                Scanner cs= new Scanner(System.in);
                menu = cs.next();
            }//else
        }
    }//print Msg
    
    public static void bookingInfo(String name, int id, int time, String clinic, int fee){
        System.out.print("\t\t");
        printDash2();
        System.out.println("\t\tInformation Details for Booking Appointment");
        System.out.print("\t\t");
        printDash2();
        System.out.printf("Name\t: %s\tNational ID Number\t: %d\nClinic\t: %s\tAppointment time\t: %d PM\nAppointment fee\t: %d SR\n"
                ,name,id,clinic,time, fee);
        printDash();
        System.out.print("Redirect to main menu");
        printDash2(); 
    }//booking info
    
    public static void addPatient(String name, int id, int age, String phone,String clinic){
        System.out.print("\t");
        printDash2();
        System.out.println("\t\tInformation Details for Adding Patient");
        System.out.print("\t");
        printDash2();
        System.out.printf("Name\t: %s\tNational ID Number\t: %d\nAge\t: %d\tPhone Number\t: %s PM\nClinic\t: %s \n"
                ,name,id,age,phone,clinic);    
        printDash();
        System.out.print("Redirect to main menu");
        printDash2();        
    }//add dentistry 
    
    public static void addPatient(String name, int id, int age, String phone,String clinic,double weight,double height, String bmi){
        System.out.print("\t");
        printDash2();
        System.out.println("\t\tInformation Details for Adding Patient");
        System.out.print("\t");
        printDash2();
        System.out.printf("Name\t: %s\tNational ID Number\t: %d\nAge\t: %d\tPhone Number\t: %s PM\nClinic\t: %s\tWeight\t: %.2f\tBMI\t: %s\tHeight\t: %.2f\n"
                ,name,id,age,phone,clinic,weight,bmi,height);    
        printDash();
        System.out.print("Redirect to main menu");
        printDash2();   
    }// add clinic
    
    //a method to print booking and adding menu
    public static void bookAndAdd(){
        printDash2();
        System.out.println("\tDEPARTMENT: Please select the correct department");
        printDash2();
        System.out.println("\tEnter G or g for General Medicine:");
        System.out.println("\tEnter P or p for Pediatrics:");
        System.out.println("\tEnter D or d for Dentistry:");
        System.out.print("Enter your Choice:\n");        
    }// book and add
    
    // BMI method
    public static String BMI(double weight, double height){
        double bmi= (weight/(height*height))*10000;
        if (bmi<=18.49){
        return "Thin";}
        else if (bmi>18.49 && bmi<=24.99){
        return "Normal";}
        else if (bmi>24.99 && bmi<=29.99){
        return "Overweight";}
        else{return "Obese";}
    }//BMI
    //a method to print a dash line
    public static void printDash(){
        for (int k = 0; k<=100;k++){
            System.out.print("-");
        }//for
        System.out.println();
    }//Dash method
    
    public static void printDash2(){
        System.out.print("\t");
        for (int k = 0; k<=70;k++){
            System.out.print("-");
        }//for
        System.out.println();
    }//Dash method
    
    // time picking method
    public static int appTime(char c){
        int random;
        if(c== 'G' ||c== 'g'){
            random = (int )(Math.random() * 11 + 1);}
        else if(c== 'P'||c== 'p'){random = (int )(Math.random() * 9 + 1);}
        else{random = (int )(Math.random() * 10 -3);}
        return random;
    }//time
    
    public static String clinicName(char c){
        if(c== 'G' ||c== 'g'){
            return "General Medicine";}
        else if(c== 'P'||c== 'p'){return "Pediatrics";}
        else{return "Dentistry";}
    }//name
}

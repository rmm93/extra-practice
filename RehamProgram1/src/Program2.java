//Name ID Email....
import java.util.*;
public class Program2 {
    public static void main(String [] args){
        printDash();
        System.out.println("\tWelcome to Elctricity and Water billing System");
        printDash();
        String billType= electWater();
        if(billType.equals("Elect") || billType.equals("ELECT") || billType.equals("elect")){
            electricBill(category());
        }//if
        else if(billType.equals("Water") || billType.equals("WATER") || billType.equals("water")){
            waterBill(category());
        }//if else
        else if(billType.equals("Exit") || billType.equals("EXIT") || billType.equals("exit")){
            System.out.println(".........Bye...........");
            System.exit(0);
        }//if else exit
        else{
            wrongChoice();
        }//else
        
        
    }//main
    
    //a method to print a dash line
    public static void printDash(){
        for (int k = 0; k<=100;k++){
            System.out.print("-");
        }//for
        System.out.println();
    }//Dash method
    
    // a method to input bill type
    public static String electWater(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter \"Elect\" for Elctricity bill");
        System.out.println("Enter \"Water\" for Water bill");
        System.out.println("Enter \"Exit\" for Exiting the program");
        System.out.println("Enter your choice: ");
        String bill=inp.next();
        return bill;
    }//input
    
    // a method to input category type
    public static String category(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter R or r for Residential");
        System.out.println("Enter C or c for Commercial");
        System.out.println("Enter A or a for Agriculture");
        System.out.println("Enter G or g for Governmental");
        System.out.println("Enter O or o for Others");
        System.out.println("Enter your choice: ");
        String chrctr= inp.next();
        return chrctr;
    }//category
    
    // a method for exiting program
    public static void wrongChoice(){
        System.out.println("Wrong data input");
        System.exit(0);
    }//wrong Choice
    
    // a method to calculate electrical bill
    public static void electricBill(String s){
        double unP=0.0;double cElecet=0.0;
        if (s.equals("R")||s.equals("r")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            // calculation
            cElecet= calculateRElect(con);
            display(con,cElecet,unP);
        }//if
        else if (s.equals("C")||s.equals("c")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            // cost function
            cElecet= calculateCElect(con);
            display(con,cElecet,unP);
        }//if
        else if (s.equals("A")||s.equals("a")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            // cost function
            cElecet= calculateACHElect(con);
            display(con,cElecet,unP);
        }//if
        else if (s.equals("G")||s.equals("g")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            // cost function
            cElecet= con*0.32;
            display(con,cElecet,unP);
        }//if
        else if (s.equals("O")||s.equals("o")){
            //function call
            int con=consumption();
            consumption(con);
            cElecet= calculateOElect(con);
            unP=unpaid();
            userDetails();
            display(con,cElecet,unP);
        }//if
        else{
           wrongChoice(); 
        }//else
    }//electbill
    
    // a method to get consumption
    public static int consumption(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your Consumption: ");
        int cons= inp.nextInt();
            return cons; 
    }//consumption
    
    // a method to check consumption
    public static void consumption(int c){
        if (c<1){
            wrongChoice();
        }//if
    }//check
    
    // a method to input unpaid amount
    public static double unpaid(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your unpaid amount: ");
        double unpaid= inp.nextDouble();
        return unpaid;
    }//unpaid
    
    // a method to input user details
    public static void userDetails(){
        String [] info= new String[3];
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your full Name: ");
        info[0]= inp.nextLine();
        System.out.println("Enter your Contact Number: ");
        info[1]= inp.next();
        System.out.println("Enter your Counter Number: ");
        info[2]= inp.next();
        printDash();
        System.out.printf("Information Details of Applying for Electricity/ Water Bill \n");
        printDash();printDash();
        System.out.println("Name:\t"+ info[0]+"\tContact Number\t"+info[1]+"\tCounter Number\t"+info[2]);
    }//user details
    
    // a method to calculate resedential electric consumption cost
    public static double calculateRElect(int consume){
        int modo=0;
        if (consume >=1 && consume<=2000){
            return 0.05*consume;
        }//if
        else if(consume >=2001 && consume<=4000){
            modo= consume- 2000;
            return 2000*0.05+ modo*0.1;
        }//else if
        else if(consume >=4001 && consume<=6000){
            modo= consume- 4000;
            return 2000*0.05+ 2000*0.1+modo*0.2;
        }//elseif
       else if(consume >=6001 && consume<=8000){
            modo= consume- 6000;
            return 2000*0.05+2000*0.1+2000*0.2+ modo*0.3;
        }//else if
       else{
           modo= consume- 6000;
           return 2000*0.05+2000*0.1+2000*0.2+ modo*0.3;
       }//else
    }//elect calc.
    
    // a method to calculate the Commercial electric consumption cost
    public static double calculateCElect(int consume){
        int modo=0;
        if (consume >=1 && consume<=4000){
            return 0.16*consume;
        }//if
        else if(consume >=4001 && consume<=8000){
            modo= consume- 4000;
            return 4000*0.16+modo*0.24;
        }//elseif
       else{
           modo= consume- 8000;
           return 4000*0.16+4000*0.24+ modo*0.3;
       }//else
    }//elect calc.
    
    // a method to calculate the Agriculture and charity electric consumption cost
    public static double calculateACHElect(int consume){
        int modo=0;
        if (consume >=1 && consume<=4000){
            return 0.1*consume;
        }//if
        else if(consume >=4001 && consume<=8000){
            modo= consume- 4000;
            return 4000*0.1+modo*0.12;
        }//elseif
       else{
           modo= consume- 8000;
           return 4000*0.1+4000*0.12+ modo*0.16;
       }//else
    }//elect calc.
    
    // a method to calculate the Other electric consumption cost
    public static double calculateOElect(int consume){
        Scanner key= new Scanner(System.in);
        System.out.print("Enter Category Name: ");
        String categoryName= key.next();
        System.out.print("Enter Cost for Consumption/unit: ");
        double cst= key.nextDouble();
        return cst*consume;
    }//elect calc.
    
    // a method to display the final bill 
    public static void display(int c, double cost, double up){
        double total=cost+up;
        System.out.println("\tConsumption\t: "+ c);
        System.out.println("\tCost\t\t: "+ cost+" SAR");
        System.out.println("\tUnpaid Bill \t: "+ up+" SAR");
        System.out.println("\t----------------------------");
        System.out.println("\tTotal \t: "+ total+" SAR");
    }//display
    
    // a method to calculate water bill
    public static void waterBill(String s){
        double unP=0.0;double cWater=0.0;
        if (s.equals("R")||s.equals("r")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            cWater= calculateRWater(con);
            display(con,cWater,unP);
        }//if
        else if (s.equals("C")||s.equals("c")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            //calculation
            cWater= calculateCWater(con);
            display(con,cWater,unP);
        }//if
        else if (s.equals("A")||s.equals("a")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            //calculation
            cWater= calculateACHWater(con);
            display(con,cWater,unP);
        }//if
        else if (s.equals("G")||s.equals("g")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            //calculation
            cWater= calculateGWater(con);
            display(con,cWater,unP);
        }//if
        else if (s.equals("O")||s.equals("o")){
            //function call
            int con=consumption();
            consumption(con);
            unP=unpaid();
            userDetails();
            //calculation
            cWater= calculateOWater(con);
            display(con,cWater,unP);
        }
        else{
           wrongChoice(); 
        }//else
    }
        
    // a method to calculate resedential water consumption cost
    public static double calculateRWater(int consume){
        int modo=0;
        if (consume >=1 && consume<=50){
            return 0.001*consume;
        }//if
        else if(consume >=51 && consume<=100){
            modo= consume- 50;
            return 50*0.001+ modo*0.0015;
        }//else if
        else if(consume >=101 && consume<=200){
            modo= consume- 100;
            return 50*0.001+ 50*0.0015+modo*0.02;
        }//elseif
       else if(consume >=201 && consume<=300){
            modo= consume- 200;
            return 50*0.001+50*0.0015+100*0.02+ modo*0.04;
        }//else if
       else{
           modo= consume- 300;
           return 50*0.001+50*0.0015+100*0.02+ 100*0.04+modo*0.06;
       }//else
    }//water calc.
    
    // a method to calculate commercial water consumption cost
    public static double calculateCWater(int consume){
        int modo=0;
        if (consume >=1 && consume<=50){
            return 0.01*consume;
        }//if
        else if(consume >=51 && consume<=100){
            modo= consume- 50;
            return 50*0.01+ modo*0.025;
        }//else if
        else if(consume >=101 && consume<=200){
            modo= consume- 100;
            return 50*0.01+ 50*0.025+modo*0.06;
        }//elseif
       else if(consume >=201 && consume<=300){
            modo= consume- 200;
            return 50*0.01+50*0.025+100*0.06+ modo*0.08;
        }//else if
       else{
           modo= consume- 300;
           return 50*0.01+50*0.025+100*0.06+ 100*0.08+modo*0.12;
       }//else
    }//water calc.
    
    // a method to calculate Agriculture and charity water consumption cost
    public static double calculateACHWater(int consume){
        int modo=0;
        if (consume >=1 && consume<=50){
            return 0.0015*consume;
        }//if
        else if(consume >=51 && consume<=100){
            modo= consume- 50;
            return 50*0.0015+ modo*0.002;
        }//else if
        else if(consume >=101 && consume<=200){
            modo= consume- 100;
            return 50*0.0015+ 50*0.002+modo*0.01;
        }//elseif
       else if(consume >=201 && consume<=300){
            modo= consume- 200;
            return 50*0.0015+50*0.002+100*0.01+ modo*0.02;
        }//else if
       else{
           modo= consume- 300;
           return 50*0.0015+50*0.002+100*0.01+ 100*0.02+modo*0.04;
       }//else
    }//water calc.
    
    // a method to calculate government water consumption cost
    public static double calculateGWater(int consume){
        int modo=0;
        if (consume >=1 && consume<=50){
            return 0.01*consume;
        }//if
        else if(consume >=51 && consume<=200){
            modo= consume- 50;
            return 50*0.01+ modo*0.04;
        }//else if
       else{
           modo= consume- 200;
           return 50*0.01+150*0.04+modo*0.1;
       }//else
    }//water calc.
    
    // a method to calculate the Other water consumption cost
    public static double calculateOWater(int consume){
        Scanner key= new Scanner(System.in);
        System.out.print("Enter Category Name: ");
        String categoryName= key.next();
        System.out.print("Enter Cost for Consumption/unit: ");
        double cst= key.nextDouble();
        return cst*consume;
    }//elect calc.
}//class

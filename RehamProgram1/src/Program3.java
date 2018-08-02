import java.util.*;
public class Program3 {
    public static void main(String [] args){
        int count=0, x=0,egTrnsfr=0,uaeTrnsfr=0,yTrnsfr=0,usTrnsfr=0,eurTrnsfr=0,cTrnsfr=0;
        double trnsfrAmnt, trnsfrPrice, total=0.0;
        String dest, fName, lName, accNum;
        Scanner sc= new Scanner(System.in);
        
        while(x!=3){
        
        printDash();
        printDashln("  Welcome to Jeddah Bank Transfers  ");
        printDash();
        System.out.println("|\t 1. Arab currencies. \t\t\t    |");
        System.out.println("|\t 2. World currencies. \t\t\t    |");
        System.out.println("|\t 3. Exit \t\t\t\t    |");
        printDash();
        System.out.println("\t > Please enter your choice: ");
        x = sc.nextInt();
        if (x== 1){
            printDash2();
            printDashln(" The Arab Countries Menu  ");
            printDash2();
            System.out.println("|\t E. Egypt. \t\t\t  |");
            System.out.println("|\t U. United Arab Emirates. \t  |");
            System.out.println("|\t Y. Yemen. \t\t\t  |");
            System.out.println("|\t B. Back to Main Menu \t\t  |");
            printDash2();
            System.out.println("\t > Please enter your Destination: ");
            dest= sc.next();
            if (dest.equals("E")){
                egTrnsfr++;}//if
            else if(dest.equals("U")){
                uaeTrnsfr++;}//else if
            else if(dest.equals("Y")){
                yTrnsfr++;}
            System.out.println("Receiver's Name: ");
            fName= sc.next();
            System.out.println("Receiver's Last Name: ");
            lName= sc.next();
            System.out.println("Receiver's Account Number: ");
            accNum= sc.next();
            System.out.println("Enter amount of money you want to transfer: ");
            trnsfrAmnt= sc.nextDouble();
            if (dest.equals("B")){
                continue;
            }//nested if
            else{
                if(!dest.equals("U") && !dest.equals("E") && !dest.equals("Y")){
                    System.out.println("Wrong Selection! Please enter the correct Choice.");
                continue;
                }// if
                count++;
                trnsfrPrice= arabTrnsfr(trnsfrAmnt,dest);
                total+=trnsfrAmnt;
                succesfulFund(fName,lName,"Arab", dest,trnsfrAmnt,trnsfrPrice);
            }//nested else
        }//if
        else if(x== 2){
            printDash2();
            printDashln(" The World Countries Menu ");
            printDash2();
            System.out.println("|\t U. United States. \t\t  |");
            System.out.println("|\t E. Europe \t\t\t  |");
            System.out.println("|\t C. Canada \t\t\t  |");
            System.out.println("|\t B. Back to Main Menu \t\t  |");
            printDash2();
            System.out.println("\t > Please enter your Destination: ");
            dest= sc.next();
            if (dest.equals("U")){
                usTrnsfr++;}//if
            else if(dest.equals("E")){
                eurTrnsfr++;}//else if
            else if(dest.equals("C")){
                cTrnsfr++;}
            System.out.println("Receiver's Name: ");
            fName= sc.next();
            System.out.println("Receiver's Last Name: ");
            lName= sc.next();
            System.out.println("Receiver's Account Number: ");
            accNum= sc.next();
            System.out.println("Enter amount of money you want to transfer: ");
            trnsfrAmnt= sc.nextDouble();
            if (dest.equals("B")){
                continue;
            }//nested if
            else{
                if(!dest.equals("U") && !dest.equals("E") && !dest.equals("C")){
                    System.out.println("Wrong Selection! Please enter the correct Choice.");
                continue;
                }// if
                count++;
                trnsfrPrice= worldTrnsfr(trnsfrAmnt,dest);
                total+=trnsfrAmnt;
                succesfulFund(fName,lName,"World", dest,trnsfrAmnt,trnsfrPrice);
            }//nested else
        }//else if
        else if(x== 3){
            summery(total,egTrnsfr,yTrnsfr,uaeTrnsfr,usTrnsfr,eurTrnsfr,cTrnsfr);
            break;
        }// else if
        else{
            System.out.println("Wrong Selection! Please enter the correct Choice.");
            continue;
        }// else
        }//while
    }//main
    
    //method to print dashed line
    public static void printDash(){
        System.out.print("|");
        for (int k = 0; k<=50;k++){
            System.out.print("-");
        }//for
        System.out.print("|");
        System.out.println();
    }//Dash method
    
    // method to print a dash line with words in between
    public static void printDashln(String s){
        System.out.print("|");
        for (int k = 0; k<=7;k++){
            System.out.print("-");
        }//for
        System.out.print(s);
        for (int k = 0; k<=6;k++){
            System.out.print("-");
        }//for
        System.out.print("|");
        System.out.println();
    }//Dash method
    
    public static void printDash2(){
        System.out.print("|");
        for (int k = 0; k<=40;k++){
            System.out.print("-");
        }//for
        System.out.print("|");
        System.out.println();
    }//Dash method
    
    // arab transfer calculation
    public static double arabTrnsfr(double d, String s){
        if (s.equals("E")){
            return 0.2056*d;
        }//if
        else if(s.equals("U")){
            return 1.0201*d;
        }//else if
        else {
            return 0.0150*d;
        }//else if
    }//arab transfer
    
    //a method to display succesful fund details
    public static void succesfulFund(String s,String t,String r, String destination,double d , double b){
        int days=0;
        String dst="", curr=""; 
        printDash();
        printDashln("------ Succesful Fund Transfer -----");
        printDash();
        if (r.equals("Arab")){
            if (destination.equals( "E")){
                curr= "EGP";
                days= 1;
                dst="Egypt";
            }//if
            else if(destination.equals("U")){
                curr= "AED";
                days= 0;
                dst="UAE";
            }//else if
            else if(destination.equals("Y")){
                curr= "YER";
                days= 2;
                dst="Yemen";
            }//else if
        }//if
        if (r.equals("World")){
            if (destination.equals("U")){
                curr= "USD";
                days= 4;
                dst="USA";
            }//if
            else if(destination.equals("E")){
                curr= "EUR";
                days= 3;
                dst="Europe";
            }//else if
            else if(destination.equals("C")){
                curr= "CAD";
                days= 4;
                dst="Canada";
            }//else if
        }//if
        System.out.printf(" Receiver's Name: %s %s\tRegion: %s \n Destination: %s\tTransfer Amount: %.2f \n Currency: %s\tTransformation Price: %.2f \n Timing for disposition: %d \n", s,t,r,dst,d,curr,b,days);
    }//succesfulFund print
    
        // world transfer calculation
    public static double worldTrnsfr(double d, String s){
        if (s.equals("U")){
            return 3.7457*d;
        }//if
        else if(s.equals("E")){
            return 4.0044*d;
        }//else if
        else {
            return 2.8091*d;
        }//else if
    }//arab transfer
    
    // a method to display Summery
    public static void summery(double total, int egt,int y, int uae, int usa, int eur, int c){
        int max=0;
        System.out.println(" Total Amount of Fund Transition: "+total);
        System.out.println("# of Fund Transformation to Egypt: "+ egt);
        System.out.println("# of Fund Transformation to Yemen: "+y);
        System.out.println("# of Fund Transformation to United Arab Emirates: "+uae);
        System.out.println("# of Fund Transformation to USA: "+usa);
        System.out.println("# of Fund Transformation to Europe: "+eur);
        System.out.println("# of Fund Transformation to Canada: "+c);
        max=Math.max(egt, Math.max(y, Math.max(uae, Math.max(usa, Math.max(eur, c)))));
        if (max== egt){
            System.out.println("Egypt has the Max number of Transformation");
        }//if
        else if (max== y){
            System.out.println("Yemen has the Max number of Transformation");
        }//if
        else if (max== uae){
            System.out.println("UAE has the Max number of Transformation");
        }//if
        else if (max== usa){
            System.out.println("USA has the Max number of Transformation");
        }//if
        else if (max== eur){
            System.out.println("Europe has the Max number of Transformation");
        }//if
        else{
            System.out.println("Canada has the Max number of Transformation");
        }//if
    }//summery
}

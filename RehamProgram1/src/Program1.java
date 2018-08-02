//Name ID Email....
import java.util.*;
public class Program1 {
    public static void main (String []args){
        Date d= new Date();
        System.out.println("Initializing Statical Report Creator...");
            int [] exam1= new int[3];
            int [] exam2= new int[3];
            int [] exam3= new int[3];
            int [] exam4= new int[3];
        System.out.println("Please enter the number of attending students for the 1st exam");
            gradeInput(exam1);
        System.out.println("Please enter the number of attending students for the 2nd exam");
            gradeInput(exam2);
        System.out.println("Please enter the number of attending students for the 3rd exam");
            gradeInput(exam3);
        System.out.println("Please enter the number of attending students for the 4th exam");
            gradeInput(exam4);
        printDash();
        printStar();
        System.out.printf("\t Students Attendance Report for Exams\t");
        printStar();
        System.out.println();
        printDash();
        System.out.println();
        displayReport(exam1,1);
        displayReport(exam2,2);
        displayReport(exam3,3);
        displayReport(exam4,4);
        printDash();
        int sumAtnd= sumAttend(exam1)+sumAttend(exam2)+sumAttend(exam3)+sumAttend(exam4);
        System.out.println("Total sum of attendance "+sumAtnd);
        printDash();printDash();
        System.out.println("*** REPORT CREATED "+d.toGMTString()+" ***");
        }//main
    
    //a method to input the grades 
    public static void gradeInput(int [] array){ 
        Scanner inp= new Scanner(System.in);
        String message= "Number of student's attendance for CPCS-20";
        for (int i=0;i<3;i++){
            System.out.printf("\t %s%d :", message,i+2);
            array[i]= inp.nextInt();
        }//for
    }//gradeinp
    
    //a method to print a dash line
    public static void printDash(){
        for (int k = 0; k<=100;k++){
            System.out.print("-");
        }//for
        System.out.println();
    }//Dash method
    
    //a method to print a star line
    public static void printStar(){
        for (int k = 0; k<=7;k++){
            System.out.print("*");
        }//for
    }//Star method
    
    //a method to print attendance or absence in all the exams
    public static String ToString(int [] array){
        String attendAbsent= "";
        for (int s=0; s<array.length;s++){
            attendAbsent += array[s] + "\t\t";
        }//for
        return attendAbsent;
    }//attendance printing
    
    //a method to print percentage in all the exams
    public static String ToString(double [] array){
        String attendAbsent= "";
        for (int s=0; s<array.length;s++){
            attendAbsent += array[s] + "\t\t";
        }//for
        return attendAbsent;
    }//percentage printing 
    
    //a method to get absence for all exams
    public static int[] getAbsence(int [] exam){
        int [] absence = new int[3];
        for (int k=0;k<absence.length;k++){
            if (k==0){
                absence[k]= 150-exam[k];
            }//if
            else if(k==1){
                absence[k]= 100-exam[k];
            }//else if
            else{
                absence[k]= 75-exam[k];
            }//else
        }//for
        return absence;
    }//get absence
    
    //a method to get percentage of attendance or absence in all the exams
    public static double [] getPercentage(int [] arr){
        double [] percent= new double[3];
        for (int i =0; i<3;i++){
            if(i==0){
                percent[i] =(Math.round(((double)arr[i]*100.0))/150.0);
                percent[i]=(double)(Math.round(percent[i]*100.0))/100.0;
            }//if
            else if(i==1){
                percent[i] =(Math.round(((double)arr[i]*100.0))/100.0);
                percent[i]=(double)(Math.round(percent[i]*100.0))/100.0;
            }//if
            else{
                percent[i] =(Math.round(((double)arr[i]*100.0))/75.0);
                percent[i]=(double)(Math.round(percent[i]*100.0))/100.0;
            }//if
        }//for
        return percent;
    }//percentage method
    
    // a method for summing attendance
    public static int sumAttend(int [] attend){
        int attendTotal= 0;
        for (int s=0; s<attend.length;s++){
            attendTotal += attend[s];
        }//for
        return attendTotal;
    }//summation 
    
// a display for the tables method
    public static void displayReport(int []exam, int num){
        System.out.printf("\t\t\t Exam %d Report\n",num);
        System.out.println("\t\t\t----------------");
        System.out.println("\t\t\tCPCS-202"+"\tCPCS-203"+"\tCPCS-204");
        System.out.println("\t # Attendance\t"+ ToString(exam));
        System.out.println("\t # Absence\t"+ ToString(getAbsence(exam)));
        System.out.println("\t % Attendance\t"+ ToString(getPercentage(exam)));
        System.out.println("\t % Absence\t"+ ToString(getPercentage(getAbsence(exam))));
        printDash();
        System.out.println("\tSum of student's attendance "+ sumAttend(exam));
    }//display
}//class

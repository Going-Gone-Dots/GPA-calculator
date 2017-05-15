
package gpa.calculator;

import java.util.Scanner;
        
public class GpaCalculator {

  
    public static void main(String[] args) {
     System.out.println("GPA Calculator");
     System.out.println(); //new line
        
        Scanner sc = new Scanner (System.in);
        double gradeTotal = 0;
        double gradePoints = 0;
        double totalPoints = 0;
        
        String grade = "";
        
       
        
         for (int c = 0; c < 4  ; c++ ){
           
             
              System.out.print("Enter grade:  ");
              grade = sc.next();
              
              
             switch (grade){
                 case "A": case "a":
                     gradePoints = 4.0;
                     break;
                 case "B": case "b":
                     gradePoints = 3.0;
                     break;
                 case "C": case "c":
                     gradePoints = 2.0;
                     break;
                 case "D": case "d":
                     gradePoints = 1.0;
                     break;}
             
                   
                     totalPoints += (gradePoints);
                     
                 
                 
                 
                 
                        
                     
                     
                     
             }
         gradeTotal = (totalPoints / 4) ;
            System.out.println("GPA: "+gradeTotal);
            
        }
    }
    


package MODULE_5.ExpenseTracker;
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

 /*  Assignment 5.1 - ExpenseTracker - Implementation by Polensky(2023)  
 */
/*
 * (The ValidatorIO class #2). Design a class named ValidatorIO to validate invalid user entries. The class contains:
*/


 
import java.util.Scanner; // using a scanner in getInt

public class ValidatorIO {
   
   // 1. A static method named getInt with a Scanner argument named sc and a string argument named prompt and an Integer return type. 
   public static Integer getInt(Scanner sc, String prompt){
        //Add local variables for an Integer named input and a boolean named isValid. Set the input variable to 0 and isValid to false.
        Integer input = 0;
        boolean isValid = false;
  //  Using a while loop check if isValid is false, display the contents of the prompt variable to the console, 
  //  and use an if…else statement to check for Scanner hasNextInt(). 
    while(isValid=false) {
        System.out.print(prompt);
        if(sc.hasNextInt()) {
            input = sc.nextInt();
            isValid = true;//  For true comparisons, set the input variable to sc.nextLine and isValid to true. 
        }
            else {  
                    //  For false comparisons, display the message “Error! Invalid integer value.”
                System.out.println("\n Error! Invalid integer value.");
            }
            sc.nextLine();// get next line from scanner
            } // end of while loop
    return input;
    } //end of getInt
  
// Figure 2.1. Example code
// 2. A static method named getDouble with a Scanner argument named sc and a string argument named prompt and a double return type. 
//    Using the code I provided in Figure 2.1, repeat the process, but this time check for double values (hint: use sc.hasNextDouble() and sc.nextDouble()).
    public static Double getDouble(Scanner sc, String prompt) {
        Double input = 0.0;
        boolean isValid = false;
        while(!isValid) {
            System.out.print(prompt);
            if(sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } // end if
                else {
                    System.out.println("\n Error! Invalid double value.");
                } // end else
                sc.nextLine(); // get next line from scanner
        }  // end while
        return input;
    }   // end of getDouble function

        // 3. A static method named getString with a Scanner argument named sc and a string argument named prompt and a string return type. 
    public static String getString(Scanner sc, String prompt){          
        System.out.println(prompt);     //  Display the prompt message and 
                                        //  use sc.next() to capture the user’s inputted value. 
        return sc.next(sc.nextLine());  // Return the inputted value.                
    } // end of getString method
} // end of ValidatorIO class

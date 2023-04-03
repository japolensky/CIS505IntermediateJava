/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

/*
 *  Wilkowski, D. (2020) ANSI escape codes https://gist.github.com/dominikwilkowski/60eed2ea722183769d586c76f22098dd
 */
/*
 *  Assignment 3.1 Implementation by Polensky(2023)
 */

package MODULE_3;
/* 
(The TestCustomerAccountApp class #4). Design a class named TestCustomerAccountApp to test the Account, Customer, and CustomerDB classes:



4. Allow the user to continue to select as many options as they choose by prompting them to decide between continuing or exiting the menu. 
    Use a do…while loop in your programming logic.
5. After exiting the menu, display the customers details using the customer classes toString() method. 
    Next, on a separate line, show the customers account balance.
*/
import java.util.Scanner; // using a scanner

public class TestCustomerAccountApp {
public static void main(String[] args) {// begin main 
    boolean exit=true; // using this to jump out of loop SR 3.1.4 do...while loop requirement
        //1. Prompt the user to enter a customer number between 1007 and 1009. 
        // Use the inputted number to invoke the getCustomer static method and assign the returned value to a variable named customer.
    System.out.println("  Welcome to the Customer Account App");
        do{
        System.out.println("\n  Enter a customer ID:");
        System.out.println("    ex: 1007, 1008, 1009>:");

        Scanner input = new Scanner(System.in); // create a scanner for user input
        Integer id=input.nextInt(); //get the account number from the user
        //3. Handle the user’s selection and invoke the corresponding method. 
        System.out.println("The selected user was:"+id);
        if ((id==1007)||(id==1008)||(id==1009)){
        
            
        }else{//For invalid selections, display a message “Error: Invalid Option.”
            exit=false;// stay in loop until a valid customer ID is entered 
            System.out.println("Error: Invalid Option.");
             }
        
        }while (exit!=true); //end do
 
            do  {       //begin do
                        //2. Display the account menu using the accounts displayMenu method.
                Account.displayMenu(); // show the figure 3.5 account menu from the account class
                
            }while (exit!=true); //end do
       
        }//end main

    } // end class

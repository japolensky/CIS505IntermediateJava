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
import java.util.Scanner; // using scanners

public class TestCustomerAccountApp {
public static void main(String[] args) {// begin main 
    double value = 0.0; // value for transaction
    Integer id=null; // account identifier
    Character action=null; // account action character    
    boolean exit=true; // using this to jump out of loop SR 3.1.4 do...while loop requirement
        //1. Prompt the user to enter a customer number between 1007 and 1009. 
        // Use the inputted number to invoke the getCustomer static method and assign the returned value to a variable named customer.
    System.out.println("  Welcome to the Customer Account App");
        do{
        exit=true;
        id=null;

        System.out.println("\n  Enter a customer ID:");
        System.out.print("    ex: 1007, 1008, 1009>:");

        Scanner input = new Scanner(System.in); // create a scanner for user input
        try {
            id=input.nextInt(); //get the account number from the user     
        } catch (Exception e) {
            id=0;// set id to zero if incorrect input
        }
       
        
        //3. Handle the user’s selection and invoke the corresponding method. 
        System.out.println("\n   The selected user was:"+id);
        if ((id==1007)||(id==1008)||(id==1009)){
        
        }else{//For invalid selections, display a message “Error: Invalid Option.”
            exit=false;// stay in loop until a valid customer ID is entered 
            System.out.println("Error: Invalid Option.");
             }
       
        }while (exit!=true); //end do
        
        Customer cust = CustomerDB.getCustomer(id);  // create customer object from the testDB
        Account acct = new Account();
        System.out.println(cust.toString()); //test what is made *** remove for operation      
        
            do  {       //begin do
                        //2. Display the account menu using the accounts displayMenu method.
                action=null; // character for operator input
                exit=false;
                Scanner input = new Scanner(System.in); // create a scanner for user input
                
                Account.displayMenu(); // show the figure 3.5 account menu from the account class
                try {
                    action=input.next().charAt(0); //get the account action from the user     
                } catch (Exception e) {
                    action=' ';// set an invalid action
                }
                if ((action=='D')||(action=='d')){
                System.out.print("\n    Enter deposit amount:");
                                        
                    try {
                        value=input.nextDouble();
                                        if (value>0){
                                     acct.deposit(value);       
                                        }
                    } catch (Exception e) {
                        value=0.00;// set value to value within reason for bad input 
                    }
                }

                else if ((action=='W')||(action=='w')){
                        System.out.print("\n    Enter withdrawal amount:");
                                                
                            try {
                                value=input.nextDouble();
                                                if (value>0){
                                             acct.withdraw(value);       
                                                }
                            } catch (Exception e) {
                                value=0.00;// set value to value within reason for bad input 
                            }
                    
                }
                else if ((action=='B')||(action=='b')){
                    System.out.print("\n    Account Balance : "+acct.getBalance());
                                            
                        try {
                            value=input.nextDouble();
                                            if (value>0){
                                         acct.deposit(value);       
                                            }
                        } catch (Exception e) {
                            value=0.00;// set value to value within reason for bad input 
                        }
                }
                else{//For invalid selections, display a message “Error: Invalid Option.”
                    exit=false;// stay in loop until a valid customer ID is entered 
                    System.out.println("  Error: Invalid Option.");
                    System.out.print("\n  Continue? (y/n): ");
                    try {
                        action=input.next().charAt(0); //get the account action from the user     
                    } catch (Exception e) {
                        action=' ';// set an invalid action
                    }
                    if ((action=='Y')||(action=='y')){
                        continue;
                    }
                        else break;
                    }
               
                }while (exit!=true); //end do    
   


        }//end main

    } // end class

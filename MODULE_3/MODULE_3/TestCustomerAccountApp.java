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

2. Display the account menu using the accounts displayMenu method.
3. Handle the user’s selection and invoke the corresponding method. 
    For invalid selections, display a message “Error: Invalid Option.”
4. Allow the user to continue to select as many options as they choose by prompting them to decide between continuing or exiting the menu. 
    Use a do…while loop in your programming logic.
5. After exiting the menu, display the customers details using the customer classes toString() method. 
    Next, on a separate line, show the customers account balance.
*/

public class TestCustomerAccountApp {
public static void main(String[] args) {
    //1. Prompt the user to enter a customer number between 1007 and 1009. 
    // Use the inputted number to invoke the getCustomer static method and assign the returned value to a variable named customer.
    System.out.println("  Welcome to the Customer Account App");
    System.out.println("\n  Enter a customer ID:");
    System.out.println("    ex: 1007, 1008, 1009>:");
    Account.displayMenu(); // show the figure 3.5 account menu from the account class
    Customer customer = new Customer();
     
}
}
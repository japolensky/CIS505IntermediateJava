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
 * (The TestExpenseTracker class #4). Design a class named TestExpenseTracker to test the classes Transaction, TransactionIO, and ValidatorIO. The class contains:
// 6. Compress all Java files into a Jar file named <YourLastName>ExpenseTracker.jar.
// Save the solution under a folder named ExpenseTracker in your repositories Module_5 folder.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    //1. Display a menu to the user matching the format in Figure 4.1.
    //Figure 4.1.
    //________________________________________________
    //|  Welcome to the Expense Tracker
    //| 
    //|    1. View Transactions
    //|    2. Add Transactions
    //|    3. View Expense
    //|  Please choose an option: 3
    //|
    //|  Your total monthly expense is $661.79
    //|
    // figure 4.5
    //|  Continue? (y/n): n
    //|  
    //|  Program terminated by the user...
    //|________________________________________________

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String c="y"; //  string to continue or exit from figure 4.3
    String menu="    1. View Transactions\n"+
                "    2. Add Transactions\n"+
                "    3. View Expense\n"+
                "  Please choose an option: ";
    System.out.print( "  Welcome to the Expense Tracker\n\n");
    
        while (c.equalsIgnoreCase("y")){ //Special note. Use the ValidatorIO static methods to validate the users input.
            switch(ValidatorIO.getInt(scanner, menu)){ //the integer returned is each case for the menu 1/2/3    
                case 1: // 2. If the user selects menu item one, display all the transactions in the expenses.txt file.                                
                    try {
                        System.out.println("\nMONTHLY EXPENSES");
                        // Special note. Invoke the findAll method from the TransactionIO class and format the amount data field using $%,6.2.f
                        ArrayList<Transaction> transactions = TransactionIO.findAll();

                        for(Transaction tran : transactions) {
                            System.out.printf("\n Date: %s\n Description: %s\n Amount: $%6.2f\n", tran.getDate(), tran.getDescription(), tran.getAmount());
                        }
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;
                case 2:// 3. If the user selects menu item two, allow the user to add a new transaction to the expenses.txt file.
                // Special note. Use the ValidatorIO static methods for the user prompts. 
                // Allow the user to enter as many transactions as they wish by asking them to “Add another transaction.” 
                // This means you will need at least two while loops. 
                // One to check if they want to stay in the main program and one to check if they want to stay in the “Add Transactions” section
                    c = "y";
                    ArrayList<Transaction> inputTransactions = new ArrayList<Transaction>();

                    while(c.equalsIgnoreCase("y")) {
                        String description = ValidatorIO.getString(scanner, "\n Enter the description: ");
                        double amount = ValidatorIO.getDouble(scanner, " Enter the amount: ");
                        Transaction tran = new Transaction();
                        tran.setDescription(description);
                        tran.setAmount(amount);
                        inputTransactions.add(tran);
                        c = ValidatorIO.getString(scanner, "\nAdd another transaction? (y/n): ");
                    }
                    try {
                        TransactionIO.bulkInsert(inputTransactions);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;
                case 3:// 4. If the user selects menu item three, display the total expenses of all transactions in the expenses.txt file.
                // Special note. Invoke the findAll method from the TransactionIO class and iterate over the list to get a running total of the transaction amounts.
                    try {
                        ArrayList<Transaction> transactions = TransactionIO.findAll();
                        double totalExpenses = 0.0;

                        for(Transaction tran : transactions) {
                            totalExpenses += tran.getAmount();
                        }
                        System.out.printf("\n Your total monthly expense is $%6.2f\n", totalExpenses);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;
            }//end of while
            c = ValidatorIO.getString(scanner, "\nContinue? (y/n): ");// 5. Allow the user to stay in the menu by prompting them to continue. 
            //If the user does not wish to continue, exit the program.
        }//end while
    }// end main()    
} // end Test Expense Tracker

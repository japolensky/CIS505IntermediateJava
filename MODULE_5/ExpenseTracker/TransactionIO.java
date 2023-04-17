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
 * (The TransactionIO class #3). Design a class named TransactionIO for reading and writing transactions to a text file. The class contains:
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class TransactionIO {
private static String FILE_NAME="expenses.txt"; // 1. A private string constant data field named FILE_NAME. The default value is “expenses.txt”
private static File file = new File(FILE_NAME); // 2. A private File data field name file. The default value is a new File instance. Use the FILE_NAME constant as the argument for the new file instance.

                                                // 3. A public static method named bulkInsert with an ArrayList<Transaction> argument named transactions and a return type of void. 
    // Give the signature of this method a “throws IOException.” 
    /**<-used javadoc
     * 
     * @param transactions
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;  // In the body of the function, create a new PrintWriter variable named output and set the default value to null. 
                                    // Using an if…else statement, check if the file exists. 
            if(file.exists()) {// For true comparisons, assign a new PrintOutStream to the output variable.
                output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true)); // from example in figure 3.3
            }
            else {// For false comparison, set output to a new PrintWriter instance. Use the FILE_NAME constant as the PrintWriter instances argument. 
                output = new PrintWriter(FILE_NAME);
            }
            // Finally, iterate over the transactions argument and write the objects to the file using the output.print and output.println() methods.
            for(Transaction tran : transactions) {  // more from example in figure 3.3 (Krasso / Gold)
                output.print(tran.getDate()+" ");
                output.print(tran.getDescription()+" ");
                output.println(tran.getAmount());
            }
            output.close(); // close the writer
    }// end bulkInsert


// 4. A public static method named findAll with a return type of ArrayList<Transaction>. Give the signature of this method a “throws IOException.” 

    public static ArrayList<Transaction> findAll() throws IOException {
                                            //  In the body of the method, open the expenses.txt file
        Scanner input = new Scanner(file);  // Special note. Invoke Scanner input = new Scanner(file) to open the expenses.txt file. 
        
        ArrayList<Transaction> tran = new ArrayList<Transaction>();
        //iterate over the lines, and return an ArrayList of transactions.
        while(input.hasNext()) {    // Use while (input.hasNext()) to iterate over the file and assign the data fields to a new instance of a transaction object.   
        
            tran.add(new Transaction(input.next(), input.next(), input.nextDouble()));//gets the next set of date String, description String, price Double from file
        }
        input.close();
        return tran;

    } // end findAll



// Add this object to an ArrayList of transactions and return it.
}// end TransactionIO class

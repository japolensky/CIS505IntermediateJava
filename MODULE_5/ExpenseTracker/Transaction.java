package MODULE_5.ExpenseTracker;
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

//import java.util.Date; // using Dates
import java.time.*; // using time
// import java.util.Currency;  // using currency
import java.text.NumberFormat; // using the numberformmatting with currency
import java.util.Locale; // using localizations

/*  Assignment 5.1 - ExpenseTracker - Implementation by Polensky(2023)  
 */
/*
 * (The Transaction class #1). Design a class named transaction to represent an expense transaction. The class contains:

.

 */
public class Transaction {
    // 1. A private string data field named date that specifies the date of a transaction. The default value is today’s date formatted as “MM-dd-yyyy”
    private String date=LocalDate.now().toString();
    // 2. A private string data field named description that specifies the description of a transaction. The default is an empty string
    private String description = "" ;
    // 3. A private double data field named amount that specifies the amount of a transaction. The default value is 0.
    private double amount = 0.0;
    // 4. Accessor and mutator methods for the all three data fields.
    public void setDate(String date) {  //mutator
        this.date = date;
    }  // end setDate
    public String getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
        // 5. A no-argument constructor that creates a default transaction.
    public void Transaction(){
        this.Transaction(LocalDate.now().toString(),"",0.0);

    }
    // 6. An argument constructor that creates a transaction using the three data fields.
    public void Transaction(String date, String description, double amount){
        this.date=date;
        this.description=description;
        this.amount=amount;
    }
    // 7. Override the toString method. Return a string description of a transaction with all three data fields, on separate lines.
    @Override
    public String toString() {
    
        return  "  Date:        "+date+
              "\n  Description: "+description+
              "\n  Amount:      "+NumberFormat.getCurrencyInstance(Locale.US).format(amount)+"\n";
    }
}

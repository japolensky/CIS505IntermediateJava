/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

  //  Java Formatter. https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

/*
 *  Wilkowski, D. (2020) ANSI escape codes https://gist.github.com/dominikwilkowski/60eed2ea722183769d586c76f22098dd
 */
/*
 *  Assignment 3.1 Implementation by Polensky(2023)
 */

 package MODULE_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
 (The Account class #3). Design a class named Account to represent an account. This class contains:
 */
public class Account {

    private double balance=200.00;// 1. A private double data field named balance. The default is 200.

    // 2. An accessor method for the balance data field.
    //accessors
    public double getBalance() { 
        return balance;
    }
    public void setBalance(double bal){
        this.balance=bal;
    }
        // 3. A public method named deposit with a double argument named amt and a return type of void. 
        

    public void deposit(double amt){
        this.balance+=amt;      // Increase the running total of the balance data field using the methods argument.
    }
        // 4. A public method named withdraw with a double argument named amt and a return type of void. 

 
    public void withdraw(double amt){
        if (this.balance>=amt)  // If the balance data field is greater than or equal to the argument
        this.balance-=amt;      // decrease the running total of the balance field using the methods argument.
    }
//  5. A public method named displayMenu with a return type of void. Print a menu matching the format in figure 3.5:
//Figure 3.5
//
//  Account Menu
//  Enter <W/w> for withdraw
//  Enter <B/b> for balance
//    Enter option>: 
    public static void displayMenu(){
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.print("    Enter option>: ");
    }

//6. A public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy.
    public String getTransactionDate(){
      //  LocalDateTime now = LocalDateTime.now();
      //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy"); // format strategy MM-dd-yyyy
      //  return(now.format(formatter));//return a string in the correct format the now time
      //  return(LocalDateTime.now().format(formatter));//return a string in the correct format the now time
      return(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"))); // consolidated to avoid creating temp objects
    }

} // end of account class

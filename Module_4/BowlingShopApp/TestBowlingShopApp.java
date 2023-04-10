package MODULE_4.BowlingShopApp;
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

 /*  Assignment 4.1 - Bowling Shop App - Implementation by Polensky(2023)
 */
/*
 * (The TestBowlingShopApp class #7). Design a class named TestBowlingShopApp to test the Product, Ball, Bag, Shoe, ProductDB, and GenericQueue classes.
1. A public static method named displayMenu that displays the menu in figure 7.1.
Figure 7.1. Menu
__________________________
   MENU OPTIONS
     1. <b> Bowling Balls
     2. <a> Bowling Bags
     3. <s> Bowling Shoes
     4. <x> To Exit

  Please choose an option:
__________________________


3. Allow the user to keep selecting options until “x” is chosen.
    3.1 Special note. Pay close attention to the format of the price data field. 
    3.2 Use the printf method and pattern “$%,6.2f” in the product classes toString method.
4. Compress all Java files into a Jar file named <YourLastName>BowlingShopApp.jar.
 */
import java.util.Scanner;
public class TestBowlingShopApp {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String action = "";

       GenericQueue<Product> products = new GenericQueue<Product>();
        //       2. Display the menu to the user and invoke the getProducts method from the ProductDB class with the user’s entry as the argument. 
            
            //       2.2 Using a while loop iterate over the queue and invoke the dequeue method to display the contents.
            //       2.3 Special note. Use the queues size method in the while loops signature to keep track of your placement in the queue. 
            //       2.4 Use the products toString method to display the results.
            

do {
    displayMenu();
    action = String.valueOf(input.nextLine().charAt(0));
    products = ProductDB.getProducts(action);   //2.1 Assign the results to a product generic queue named products. 
    System.out.println("\n  --Product Listing--");
    while(products.size() > 0) {
        System.out.println(products.dequeue().toString()+"\n");
        } // end dequeue while loop nested
    }while ((action!="x")||action!="X"||action!=("4")); // end interface loop
        input.close();// close the scanner
   } // end main1


    public static void displayMenu(){  // prints the menu for the user
        System.out.println("   MENU OPTIONS");
        System.out.println("     1. <b> Bowling Balls");
        System.out.println("     2. <a> Bowling Bags");
        System.out.println("     3. <s> Bowling Shoes");
        System.out.println("     4. <x> To Exit \n");
        System.out.print("  Please choose an option:");
        } // end displaymenu
} // end TestBowlingShopApp class

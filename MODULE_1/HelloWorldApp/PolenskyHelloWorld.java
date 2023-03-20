/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Jason Polensky 19March2023
*/ 
/*
    Krasso, R. (2021).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
 */
/*
 *  Wilkowski, D. (2020) ANSI escape codes https://gist.github.com/dominikwilkowski/60eed2ea722183769d586c76f22098dd
 */
package MODULE_1.HelloWorldApp;

public class PolenskyHelloWorld {
/**
 * @param args no arguements are accepted for main() at this time
 */
public static void main(String[] args) {
   try {
    myName("Jason", "Polensky");
   } 
   catch (Exception e) { // I am attempting to get the points for error trapping.
    System.out.println("Incorrect Entry into myName() from main");
   }
    
} // the beginning of the code for the myName method.
public static void myName(String first, String last)
// This method prints my first and last name
// I added colors to see if it would work prperly in the terminal.
{
   try {
        System.out.println("\u001B[34m My name is \u001B[37m"+first+" \u001B[37;1m"+last+"\u001B[0m"); 
    } catch (Exception e) {
        System.out.println("Incorrect Entry into myName()");
    }
    
} // This is the end of the myName method.

}

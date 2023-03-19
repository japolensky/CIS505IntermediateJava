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
public static void main(String[] args) {
    myName("Jason", "Polensky");
}
public static void myName(String first, String last)
// This method prints my first and last name
/*I added colors to see if it would work prperly in the terminal */
{
    System.out.println("\u001B[34m My name is \u001B[37m"+first+" \u001B[37;1m"+last+"\u001B[0m");
}

}

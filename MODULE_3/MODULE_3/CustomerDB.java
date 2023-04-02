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
 (The CustomerDB class #2). Design a class named CustomerDB. This class contains:
    1. A public static method named getCustomer with an Integer argument named id and a return type of Customer.
        1.1. Using an if…else if…else if…else statement, compare the argument id data field against the values 1007, 1008, and 1009.
        1.2. For each match, return a new customer object with unique fields. (JAP - assuming since only an integer comes in, for each true comparison)
        1.3. If there are no matches, return a default customer object.
 */
public class CustomerDB {

    public static Customer getCustomer(int id){
        if (id==1007)      {  // handle success comparison list from 1.1
            return(new Customer("Jennifer Patterson", "8422 Grover Ave", "Bellevue", "68123"));//return unique object
            } 
        else if (id==1008) {
            return(new Customer("Bender Bending Rodriguez", "Unit 00100100 - Robot Arms Apartments", "New New York", "10001"))
        }      
        else if (id==1009) {
            return(new Customer("Philip J Fry", "Unit 00100100 - Robot Arms Apartments", "New New York", "10001"))
        }          
            else 
            return(new Customer()); // return default object - also null.
                
    }//end of getCustomer
        
    } // end of customer DB class


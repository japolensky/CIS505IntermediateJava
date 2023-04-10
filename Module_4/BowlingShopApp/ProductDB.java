package MODULE_4.BowlingShopApp;
import java.util.List;
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
(The ProductDB class #5). Design a class named ProductDB to represent the bowling shops database.

1. A public static method named getProducts with string argument named code and a return type of a product generic queue 
    (hint: we are leveraging the GenericQueue to store the product objects). 
2. Using an if…else if…else if…else check the argument against the values “b, s, and a.” 
    2.1. For arguments that equal “b” create five (5) new ball instances
        {set all four data fields with values, and add them to a product generic queue named balls.}
    2.2 For arguments that equal “s” create five (5) new shoe instances
        {set all four data fields with values, and add them to a product generic queue named shoes.}
    2.3 For arguments that equal “a’ create three (3) new shoe instances
        {set all four data fields with values, and add them to a product generic queue named shoes.}
    2.4 For all other arguments 
        {return an empty product generic queue.}
 */

public class ProductDB {
    public static GenericQueue<Product> getProducts(String code){
        GenericQueue<Product> balls = new GenericQueue<Product>();
        balls.enqueue(ball1);
    }

}

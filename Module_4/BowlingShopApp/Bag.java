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
(The Bag class #3). Design a product subclass named bag to represent a bowling bag.
 */
public class Bag extends Product {
   private String type="";      // 1. A private string data field named type that specifies the number of bowling balls the bag can hold. The default is an empty string. 
Bag(){                          // 2. A no-argument constructor that creates a default bag.
}
                                // 3. Accessor and mutator methods for the type data field.
public String getType() {           //Accessor
    return type;
}
public void setType(String type) {  //Mutator
    this.type = type;
}
        // 4. Override the toString() method. Return an appended string of the superclass with an additional field for the bags type.
    @Override
    public String toString() {
        return super.toString()+"\n    Color:    "+this.type;
    }
}



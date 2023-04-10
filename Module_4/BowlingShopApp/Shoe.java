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
 * (The Shoe class #4). Design a product subclass named shoe to represent bowling shoes. The class contains:
 */
public class Shoe extends Product{
  private double size=0;    // 1. A private double data field named size that specifies the shoe size. The default is 0.
  Shoe(){                   // 2. A no-argument constructor that creates a default shoe.
  }
                            // 3. Accessor and mutator methods for the size data field.
public double getSize() {       //Accessor
    return size;
}
public void setSize(double size) {//Mutator
    this.size = size;
}
    @Override               // 4. Override the toString() method. Return an appended string of the superclass with an additional field for the shoe size.
    public String toString() {  
        return super.toString()+"\n            Size: "+this.size;
                              //"\n           Price: "+this.price);//for reference placement
    }   
}

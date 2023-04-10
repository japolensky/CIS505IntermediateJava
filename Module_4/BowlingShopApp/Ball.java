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
 * 
 * (The Product class #1). Design a superclass named product to represent a product in a bowling shop.
 */
/*
 * (The Ball class #2). Design a product subclass named ball to represent a bowling ball.
 */
public class Ball extends Product {
    private String color="";        // 1. A private string data field named color that specifies the color of a bowling ball. The default is an empty string.
    Ball(){                         // 2. A no-argument constructor that creates a default ball.
           super(); // call the super class constructor
           this.color=""; 
        }

    //   JP - I set the parameters using the setters.
        Ball(String color){  // arguement with constructor
            super();
            setColor(color);
        }
    
                                    // 3. Accessor and mutator methods for the color data field.
    public String getColor() {          //Accessor
        return color;
    }
    public void setColor(String color) { //Mutator
        this.color = color;
    } //end setColor

   // 4. Override the toString() method. Return an appended string of the superclass with an additional field for the bowling balls color.
@Override
    public String toString() {
    return super.toString()+"\n    Color:    "+this.color;
}  // end toString
}  //end of the Ball class

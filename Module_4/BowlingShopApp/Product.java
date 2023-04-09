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
public class Product {              // Begin Product class
    private String code="";         // 1. A private string data field named code that specifies the product code. The default value is an empty string.
    private String description="";  // 2. A private string data field named description that specifies the products description. The default value is an empty string. 
    private double price=0;         // 3. A private double data field named price that specifies the price of a product. The default value is 0.

    Product(){                      // 4. A no-argument constructor that creates a default product.

    }
                                    // 5. Accessor and mutator methods for all three data fields.
    public String getCode() {           // Accessor
        return code;
    }
    public void setCode(String code) {  //Mutator
        this.code = code;
    }
    public String getDescription() {    // Accessor
        return description;
    }
    public void setDescription(String description) {// Mutator
        this.description = description;
    }
    public double getPrice() {          // Accessor
        return price;
    }
    public void setPrice(double price) {// Mutator
        this.price = price;
    }
    @Override
    public String toString() {      //6. Override the toString() method. Return a description of the product with all three fields on separate lines.
        return ("\n    Name:    "+this.code+
                "\n    Address: "+this.description+
                "\n    City:    "+this.price);
    }
}                                   // End product class   

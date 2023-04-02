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

public class Customer {
  /* 

(The Customer class #1). Design a class named Customer to represent a customer. This class contains:
1. A private string data field named name that specifies the name of a customer.
2. A private string data field named address that specifies the address of a customer.
3. A private string data field named city that specifies the city of a customer.
4. A private string data field named zip that specifies the zip code of a customer.

*/
    private String name;
    private String address;
    private String city;
    private String zip;    
/*
5. A no-argument constructor that creates a default customer.

 */    
    Customer(){
        this.name=null;
        this.address=null;
        this.city=null;
        this.zip=null;     
    }
//  6. An argument constructor that creates a customer using the four data fields.
//   JP - I set the parameters using the setters.
    Customer(String name, String address, String city, String zip){
        setName(name);
        setAddress(address);
        setCity(city);
        setZip(zip);     
    }

// 7. Accessor methods for all four data fields.
// beginning of accessors
      public String getName() { 
        return this.name;
      }
    
      public void setName(String name) {
        this.name = name;
      }

      public String getAddress()  {
        return this.address;
      }
        
      public void setAddress(String address)  {
        this.address = address;
      }
                
      public String getCity() {
        return this.city;
      }
    
      public void setCity(String city) {
        this.city = city;
      }
    
    
      public String getZip() {
        return this.zip;
      }
        
      public void setZip(String zip) {
        this.zip = zip;
      }  
// end of accessors

  //  8. Override the toString() method.
@Override
public String toString(){
    return ("\n    Name:   "+this.name+
            "\n    Address:"+this.address+
            "\n    City:   "+this.city+
            "\n    Zip:    "+this.zip);

}
   
} // end Customer class  

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
(The ProductDB class #5). Design a class named ProductDB to represent the bowling shops database.
 */
public class ProductDB {

            // 1. A public static method named getProducts with string argument named code and a return type of a product generic queue 
            //    (hint: we are leveraging the GenericQueue to store the product objects). 

    public static GenericQueue<Product> getProducts(String code){

            // 2. Using an if…else if…else if…else check the argument against the values “b, s, and a.” 
            if((code.equalsIgnoreCase("b")|| (code.charAt(0)=='1'))) {

                // 2.1. For arguments that equal “b” create five (5) new ball instances
                //      {set all four data fields with values, and add them to a product generic queue named balls.}
        GenericQueue<Product> balls = new GenericQueue<Product>();
        Ball b1 = new Ball();
        b1.setCode("b1000");
        b1.setColor("red");
        b1.setDescription("more bouncy than normal bowling balls");
        b1.setPrice(8.99);
        balls.enqueue(b1);

        Ball b2 = new Ball();
        b2.setCode("b1001");
        b2.setColor("white");
        b2.setDescription("heavy like lead - it's actually pure lead");
        b2.setPrice(69.99);
        balls.enqueue(b2);

        Ball b3 = new Ball();
        b3.setCode("b1003");
        b3.setColor("clear");
        b3.setDescription("You will win with this lucky crystal clear ball");
        b3.setPrice(169.99);
        balls.enqueue(b3);

        Ball b4 = new Ball();
        b4.setCode("b1004");
        b4.setColor("clear");
        b4.setDescription("You will win with this lucky crystal clear ball");
        b4.setPrice(169.99);
        balls.enqueue(b4);

        Ball b5 = new Ball();
        b5.setCode("b1005");
        b5.setColor("metallic");
        b5.setDescription("This bowling ball is made from depleted uranium, it stays warm and shatters pins.   Occasional blue flashes occur in vicinity (1/4 mile)");
        b5.setPrice(184000.93);// EAR99 required, as well as non-proliferation treaty agreement.
        balls.enqueue(b5);

        return balls;
    }
            // 2.2 For arguments that equal “s” create five (5) new shoe instances
            //     {set all four data fields with values, and add them to a product generic queue named shoes.}
        else if((code.equalsIgnoreCase("s")|| (code.charAt(0)=='2'))) {
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            Shoe s1 = new Shoe();
            s1.setCode("s1001");
            s1.setDescription("Infant Shoes");
            s1.setPrice(12.00);
            s1.setSize(0.5);
            shoes.enqueue(s1);

            Shoe s2 = new Shoe();
            s2.setCode("s1002");
            s2.setDescription("Child Shoes");
            s2.setPrice(13.00);
            s2.setSize(7.5);
            shoes.enqueue(s2);

            Shoe s3 = new Shoe();
            s3.setCode("s1003");
            s3.setDescription("Medium Shoes");
            s3.setPrice(18.00);
            s3.setSize(9.5);
            shoes.enqueue(s3);

            Shoe s4 = new Shoe();
            s4.setCode("s1004");
            s4.setDescription("Large Shoes");
            s4.setPrice(12.00);
            s4.setSize(12.0);
            shoes.enqueue(s4);

            Shoe s5 = new Shoe();
            s5.setCode("s1005");
            s5.setDescription("Extra Large Shoes");
            s5.setPrice(12.00);
            s5.setSize(15.5);
            shoes.enqueue(s5);

        return shoes;
    }  //end shoes
            // 2.3 For arguments that equal “a’ create three (3) new BAG instances
            //     {set all four data fields with values, and add them to a product generic queue named shoes.}
        else if((code.equalsIgnoreCase("a")|| (code.charAt(0)=='3'))) {
            GenericQueue<Product> bags = new GenericQueue<Product>();
            Bag a1 = new Bag();
            a1.setCode("bag2017");
            a1.setDescription("The trendy standard ball bag from 2017.");
            a1.setPrice(24.99);
            a1.setType("Leatherette");
            bags.enqueue(a1);

            Bag a2 = new Bag();
            a2.setCode("bag2018");
            a2.setDescription("The alley branded ball bag in shiny and trendy waterproof green.");
            a2.setPrice(34.99);
            a2.setType("Vinyl");
            bags.enqueue(a2);

            Bag a3 = new Bag();
            a3.setCode("bag2023");
            a3.setDescription("The premium cowhide bag - to last a lifetime.");
            a3.setPrice(105.00);
            a3.setType("Leather");
            bags.enqueue(a3);
        return bags;
        }   // end if 'a'-BAG
            // 2.4 For all other arguments 
            //     {return an empty product generic queue.}
        else {return new GenericQueue<Product>();}
    } // end if..else arrangement
} // end ProductDB class


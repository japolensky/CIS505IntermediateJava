/*
 * working with Long Nguyen's discussion board example, added collections.
 */
package MODULE_4.otra_w4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class longexamples {
    public static void main(String[] args) {
        {// Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();
            {// Add some elements to the list
            list.add("Apple");
            list.add("Banana");
            list.add("Orange");
            list.add("Apple");}
        
  // Print the list
            System.out.println("Store list: " + list);  }
            {//Long's linked list example
        LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Austin Martin");
            cars.add("Mazda");
            cars.add("Fiat");
            cars.add("Le Car");
            cars.add("Mercedes");
            cars.add("Saab");
            cars.add("Jaguar");
            System.out.println(cars);
            Collections.sort(cars);
            System.out.println(cars);
            Collections.shuffle(cars);
            System.out.println(cars);
            Collections.shuffle(cars);
            System.out.println(cars);
            }
    }
}

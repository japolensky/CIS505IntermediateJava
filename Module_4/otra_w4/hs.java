/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
        https://liveexample.pearsoncmg.com/liang/intro12e/html/TestMyHashSet.html
*/ 
/*
 * additional modifications by JAPOLENSKY@my365.bellevue.edu
 */
package Module_4.otra_w4;
import java.util.HashSet;
public class hs {
        public static void main(String[] args) {
          // Create a MyHashSet
          java.util.Collection<String> set = new HashSet<>();
          set.add("Smith");
          set.add("Anderson");
          set.add("Lewis");
          set.add("Cook");
          set.add("Smith"); // Add Smith to set  **This doesn't change the size of the set.
          set.add("Jason");
      
          System.out.println("Elements in set: " + set);
          System.out.println("Number of elements in set: " + set.size());
          System.out.println("Is Smith in set? " + set.contains("Smith"));
      
          set.remove("Smith");
          System.out.print("Names in set in uppercase are ");
          for (String s: set)
            System.out.print(s.toUpperCase() + " ");
      
          set.clear();
          System.out.println("\nElements in set: " + set);
        }
      }

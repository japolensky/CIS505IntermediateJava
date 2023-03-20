/*
 * Create a new file named TestFanApp with a main() method to test the Fan class. 
 * Create two instances of the Fan class, 
 * one using the default constructor and the other using the argument constructor. 
 * For the second argument constructor, use the classes constants to set the speed. 
 * Display the objects by invoking the classes toString() method.
 */
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.

        Additional modifications by Jason Polensky 19March2023 - From page 368-369
    general idea of The Fan Class exercise
    generic uml diagram can be found from author here:
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/content/EvenNumberedExerciseUMLDiagram.pdf
    author solution can be found here:
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/#solutions
    my solution is below:
*/ 
package MODULE_1.FanApp;

//package MODULE_1.FanApp;

//import MODULE_1.FanApp.*;
public class TestFanApp {
    public static void main(String[] args) {  //main method
        String bladeColor2="Red White and Blue";
// Create two Fan objects
        Fan fan1= new Fan();
        Fan fan2= new Fan(1, true, 10.0, bladeColor2);
     
       //Meet system requirement 1.3.10 by displayng results of the two fan objects contents
       //using the overridden toString method 
       System.out.println(fan1.toString());
       System.out.println(fan2.toString());
       //end of main method 
    }
}
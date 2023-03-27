/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    author solution can be found here:
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/#solutions
    my solution is below:

*/ 
/*
    Krasso, R. (2021).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment2.3.pdf
 */

package MODULE_2.SportsTeamApp;
import java.util.Scanner;

public class TestSportsTeamApp {
                        //SR 2.3.9a - Create a new file named TestSportsTeamApp with a main() method to test the Team class.
   public static void main(String[] args) {  
    // SR 2.3.9b - Prompt the user to enter the team and player names.
    System.out.println("  Welcome to the Sports Team App /n");
    System.out.print("  Enter a team name: ");
    

    try (Scanner input = new Scanner(System.in))    {
        Team team1 = new Team(input.next());
    
    System.out.println("\n  Enter the player names:");
    System.out.print("    hint: use commas for muliple players; no spaces>: ");
                
            while (input.hasNext()) {
                String line=input.nextLine();
                   String[] teamArray = line.split(",");
        
        for (int i=0;i<teamArray.length; i++){
            if (i<20) {team1.addPlayer(teamArray[i])};
            System.out.println("teamArray["+i+"]="+teamArray[i]);
        }
            }
        

    System.out.println("\n  --Team Summary--");


                                                            } 
}
}

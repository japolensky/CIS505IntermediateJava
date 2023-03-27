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
import java.util.Scanner; // using a scanner

public class TestSportsTeamApp {  //begin class
                        //SR 2.3.9a - Create a new file named TestSportsTeamApp with a main() method to test the Team class.
   public static void main(String[] args) {  //begin main
                        // SR 2.3.9b - Prompt the user to enter the team and player names.
    System.out.println("  Welcome to the Sports Team App \n");

    Scanner input = new Scanner(System.in); 
    boolean exit=true; 
    do {  //begin do
        System.out.print("  Enter a team name: ");
     

    try    {  // begin try
        Team team1 = new Team(input.next());
    
    System.out.println("\n  Enter the player names:");
    System.out.print("    hint: use commas for muliple players; no spaces>: ");
            
    
    String line=input.next(); //get the list of comma sepearated player names into a string
        String[] teamArray = line.split(","); 
                for (int i=0;i<teamArray.length; i++)   { // * begin addPlayer iterator
                    if (i<team1.getTeamMax())   {  //deal with arbitrary 20 team member limit in specification
                        team1.addPlayer(teamArray[i]);
                        // System.out.println("teamArray["+i+"]="+teamArray[i]);  //testing
                                 } 
                                                        } // * end addPlayer iterator
     
    System.out.println("\n  --Team Summary--");
    System.out.print("\n  Number of Players on team: "+team1.getPlayerCount());
    System.out.print("\n  Players on team: ");
    String[] teamSummary = team1.getPlayers(); 
    for (int i=0;i<(team1.getPlayerCount()); i++)   { //begin summary iterator
            System.out.print(teamArray[i]+", ");
                                                    } //end summary iterator
            
            System.out.print("\n  Continue Y/N?");
            String e = input.next(); // get a yes or no
                if (e.startsWith("y")){exit=false;}
                if (e.startsWith("Y")){exit=false;}
                if (e.startsWith("n")){exit=true;}
                if (e.startsWith("N")){exit=true;}
        }  //end try
        finally{//begin finally

        }// end finally
        }while (exit!=true); //end do
    } //end main 
} // end class
                                                        
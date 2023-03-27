/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    author solution can be found here:
    Similar reference project is: 10.6 Course.java pg 379 - listing 10.6
    https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/#solutions
    my solution is below:

*/ 
/*
    Krasso, R. (2021).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment2.3.pdf
 */

package MODULE_2.SportsTeamApp;

public class Team {
    private String teamName="";     //SR 2.3.1 - A private string data field named teamName that specifies the teams name. The default is an empty string.
    private String[] players= new String[20];   //SR 2.3.2 - A private string array data field named players that specifies the players assigned to a team. The default size is 20.
    private int playerCount=0;      //SR 2.3.3 - A private int data field named playerCount that specifies the number of players on a team. The default is 0.
    Team(String nameofteam){        //SR 2.3.4 - An argument constructor that creates a team using the teamName data field as an argument.

    }
    public void addPlayer(String player){       //SR 2.3.5a - A public method named addPlayer with a string argument that adds a player to the players data field.
        players[playerCount] = player;
        this.playerCount++;         //SR 2.3.5b - A public method named addPlayer with a string argument that adds a player to the players data field.
    }
    public String[] getPlayers(){   //SR 2.3.6 - A public string array method named getPlayers that returns the players data field.
        return players;
    }
    public int getPlayerCount(){    //SR 2.3.7 - A public int method named getPlayerCount that returns the playerCount data field.
        return playerCount;
    }
    public String getTeamName(){    //SR 2.3.8 - A public string method named getTeamName that returns the teamName data field.
        return teamName;
    }
    




}

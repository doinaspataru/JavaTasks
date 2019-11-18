package com.intership.task.generics;

public class GenericsMain {
    public static void main(String[] args) {
        RealMadrid realMadrid = new RealMadrid("Real Madrid");
        Barcelona barca = new Barcelona("Barcelona");

        League<Football> FootBall = new League("Football");
        FootBall.addTeamToLeague(barca);
        FootBall.addTeamToLeague(realMadrid);
        FootBall.displayLeague();
        System.out.println();

        League <Hockey> Hockey = new League<>("Hockey");
        NHL nhl = new NHL("NHL");
        Hockey.addTeamToLeague(nhl);
        Hockey.displayLeague();
    }

}

// Create a generic class to implement a league table for any type of sport.
// The class should allow teams to be added to the list, and store a list of teams that belong to this particular league.

// Your class should have a method to print out the teams by name alphabetical.
// Only teams of the same type should be added to any particular instance of the league class - the program should fail to compile if an attempt is made to add an incompatible team.

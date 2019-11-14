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

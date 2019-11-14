package com.intership.task.generics;

import java.util.ArrayList;

public class League <TypeOfSport extends Sports> {
    private String name;
    private ArrayList<TypeOfSport> team = new ArrayList();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeamToLeague(TypeOfSport sport) {
        if(team.contains(sport)) {
            System.out.println("Team already added");
            return false;
        }
        else {
            team.add(sport);
            return true;
        }
    }

    public void displayLeague() {
        System.out.println( name + " league: ");
        for(int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getName());
        }
    }

}

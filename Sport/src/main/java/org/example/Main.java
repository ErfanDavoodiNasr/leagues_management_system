package org.example;


import UI.Runner;
import Util.ApplicationContext;
import data.Data;
import model.Football.FootballClub;
import model.Football.FootballLeague;
import model.Football.FootballMatch;
import model.Volleyball.Set;
import model.Volleyball.VolleyballClub;
import model.Volleyball.VolleyballLeague;
import model.Volleyball.VolleyballMatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Data.footballLeague = new FootballLeague("league bartar");
        Data.volleyballLeague = new VolleyballLeague("league iran");
        Data.volleyballClubs.add(new VolleyballClub("iran"));
        Data.volleyballClubs.add(new VolleyballClub("usa"));
        Data.volleyballClubs.add(new VolleyballClub("uk"));
        Data.volleyballClubs.add(new VolleyballClub("argentina"));
        Data.footballClubs.add(new FootballClub("perspolis"));
        Data.footballClubs.add(new FootballClub("sepahan"));
        Data.footballClubs.add(new FootballClub("esteghlal"));
        Data.footballClubs.add(new FootballClub("teraktor"));
        Data.footballClubs.add(new FootballClub("alm arak"));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(4),
                3, 0));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(4),
                3, 0));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(4),
                3, 0));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(1),
                3, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(1) , Data.footballClubs.get(0),
                5, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(2) , Data.footballClubs.get(1),
                3, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(2),
                3, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(1),
                3, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(1) , Data.footballClubs.get(0),
                3, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(1),
                3, 3));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(3),
                7, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(4),
                5, 4));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(3) , Data.footballClubs.get(4),
                5, 2));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(1) , Data.footballClubs.get(4),
                4, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(0) , Data.footballClubs.get(4),
                5, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(2) , Data.footballClubs.get(4),
                12, 5));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(3) , Data.footballClubs.get(2),
                5, 4));
        Data.footballMatches.add(new FootballMatch(Data.footballClubs.get(1) , Data.footballClubs.get(2),
                1, 1));
        Set set1 = new Set(1, 30 , 29);
        Set set2 = new Set(1, 30 , 29);
        Set set3 = new Set(1, 30 , 29);
        ArrayList<Set> sets = new ArrayList<>(List.of(set1,set2,set3));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(0), Data.volleyballClubs.get(3) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(1), Data.volleyballClubs.get(2) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(2), Data.volleyballClubs.get(1) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(3), Data.volleyballClubs.get(0) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(3), Data.volleyballClubs.get(1) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(3), Data.volleyballClubs.get(2) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(3), Data.volleyballClubs.get(0) , sets));
        Data.volleyballMatches.add(new VolleyballMatch(Data.volleyballClubs.get(2), Data.volleyballClubs.get(1) , sets));


        Runner.run();
    }
}
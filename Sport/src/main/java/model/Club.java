package model;


import model.human.Coach;
import model.human.Player;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Club implements Comparable<Club>{
    private String name;
    private int point;
    private int countWin;
    private int countLose;
    private Coach coach;
    private ArrayList<Player> players;

    public Club() {
        players = new ArrayList<>();
    }


    public Club(String name) {
        this.name = name;
    }

    public Club(String name, int point, int countWin, int countLose, Coach coach, ArrayList<Player> players) {
        this.name = name;
        this.point = point;
        this.countWin = countWin;
        this.countLose = countLose;
        this.coach = coach;
        this.players = players;
    }
    @Override
    public int compareTo(Club other) {
        return this.getPoint() - other.getPoint();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point+= point;
    }

    public int getCountWin() {
        return countWin;
    }

    public void setCountWin() {
        this.countWin++;
    }

    public int getCountLose() {
        return countLose;
    }

    public void setCountLose() {
        this.countLose++;
    }



    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Club club)) return false;
        return getPoint() == club.getPoint() && getCountWin() == club.getCountWin() && getCountLose() == club.getCountLose() && Objects.equals(getName(), club.getName()) &&  Objects.equals(getCoach(), club.getCoach()) && Objects.equals(getPlayers(), club.getPlayers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPoint(), getCountWin(), getCountLose(), getCoach(), getPlayers());
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", countWin=" + countWin +
                ", countLose=" + countLose +
                ", coach=" + coach.getFirstName() + coach.getSecondName() +
                ", players=" + players +
                '}';
    }
}

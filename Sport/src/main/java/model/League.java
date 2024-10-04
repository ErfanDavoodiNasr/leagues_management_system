package model;


import java.util.ArrayList;
import java.util.Objects;

public abstract class League {
    private String name;
    private ArrayList<Club> clubs;
    private ArrayList<Match> matches;

    public League() {
        this.clubs = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public League(String name) {
        this.name = name;
        this.clubs = new ArrayList<>();
        this.matches = new ArrayList<>();
    }
    public League(ArrayList<Match> matches) {
        this.clubs = new ArrayList<>();
        this.matches = matches;
    }

    public League(String name, ArrayList<Club> clubs, ArrayList<Match> matches) {
        this.name = name;
        if (clubs == null)
            this.clubs = new ArrayList<>();
        else
            this.clubs = clubs;
        if (matches == null)
            this.matches = new ArrayList<>();
        else
            this.matches = matches;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof League league)) return false;
        return Objects.equals(getName(), league.getName()) && Objects.equals(getClubs(), league.getClubs()) && Objects.equals(getMatches(), league.getMatches());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getClubs(), getMatches());
    }

    @Override
    public String toString() {
        return "League{" +
                "name='" + name + '\'' +
                ", clubs=" + clubs +
                ", matches=" + matches +
                '}';
    }
}

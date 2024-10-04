package model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Match {
    private LocalDate date;
    private Club home;
    private Club away;
    private String location;

    public Match() {
    }
    public Match(Club home, Club away) {
        this.home = home;
        this.away = away;
    }

    public Match(LocalDate date, Club home, Club away, String location) {
        this.date = date;
        this.home = home;
        this.away = away;
        this.location = location;
    }

    protected abstract void matchResult();
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Club getHome() {
        return home;
    }

    public void setHome(Club home) {
        this.home = home;
    }

    public Club getAway() {
        return away;
    }

    public void setAway(Club away) {
        this.away = away;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match match)) return false;
        return Objects.equals(getDate(), match.getDate()) && Objects.equals(getHome(), match.getHome()) && Objects.equals(getAway(), match.getAway()) && Objects.equals(getLocation(), match.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getHome(), getAway(), getLocation());
    }

    @Override
    public String toString() {
        return "Match{" +
                "date=" + date +
                ", home=" + home +
                ", away=" + away +
                ", location='" + location + '\'' +
                '}';
    }
}

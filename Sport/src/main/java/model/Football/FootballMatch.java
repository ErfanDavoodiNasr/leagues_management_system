package model.Football;

import model.Club;
import model.Match;

import java.time.LocalDate;

public class FootballMatch extends Match {
    private int homeGoals;
    private int awayGoals;

    public FootballMatch(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }
    public FootballMatch( Club home, Club away, int homeGoals, int awayGoals) {
        super(home, away);
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        matchResult();
    }

    public FootballMatch(LocalDate date, Club home, Club away, String location, int homeGoals, int awayGoals) {
        super(date, home, away, location);
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }


    private Club winner() {
        if (this.homeGoals > this.awayGoals){
            return getHome();
        }
        if (this.homeGoals < this.awayGoals){
            return getAway();
        }
        return null;
    }

    @Override
    protected void matchResult() {
        Club winner = winner();
        if (getHome().equals(winner)){
            getHome().setCountWin();
            getAway().setCountLose();
        } else if (getAway().equals(winner)) {
            getAway().setCountWin();
            getHome().setCountLose();
        }else {
            ((FootballClub) getHome()).setCountTie();
            ((FootballClub) getAway()).setCountTie();
        }
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }
}

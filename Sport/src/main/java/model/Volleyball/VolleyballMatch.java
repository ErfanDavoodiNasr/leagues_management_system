package model.Volleyball;

import model.Club;
import model.Match;

import java.time.LocalDate;
import java.util.ArrayList;

public class VolleyballMatch extends Match {
    ArrayList<Set> sets;

    public VolleyballMatch(ArrayList<Set> sets) {
        this.sets = sets;
    }

    public VolleyballMatch(Club home, Club away, ArrayList<Set> sets) {
        super(home, away);
        this.sets = sets;
        matchResult();
    }

    public VolleyballMatch(LocalDate date, Club home, Club away, String location, ArrayList<Set> sets) {
        super(date, home, away, location);
        this.sets = sets;
    }

    @Override
    protected void matchResult() {
        int homePoint = getHomePoint();
        int awayPoint = getAwayPoint();

        if ((homePoint == 3 && awayPoint == 0) || (homePoint == 3 && awayPoint == 1)){
            getHome().setCountWin();
            getHome().setPoint(3);
            getAway().setCountLose();
        } else if ((awayPoint == 3 && homePoint == 0) || (awayPoint == 3 && homePoint == 1)) {
            getAway().setCountWin();
            getAway().setPoint(3);
            getHome().setCountLose();
        } else if (homePoint == 3 && awayPoint == 2) {
            getHome().setCountWin();
            getAway().setCountLose();
            getHome().setPoint(2);
            getAway().setPoint(1);
        } else if (awayPoint == 3 && homePoint == 2) {
            getAway().setCountWin();
            getHome().setCountLose();
            getAway().setPoint(2);
            getHome().setPoint(1);
        }
    }

    private int getHomePoint() {
        int homePoint = 0;
        for (Set set: sets){
            if (set.getHomePoint() > set.getAwayPoint()) {
                homePoint++;
            }
        }
        return homePoint;
    }
    private int getAwayPoint() {
        int awayPoint = 0;
        for (Set set: sets){
            if (set.getHomePoint() < set.getAwayPoint()) {
                awayPoint++;
            }
        }
        return awayPoint;
    }
}

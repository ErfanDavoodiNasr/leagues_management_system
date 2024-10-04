package model.Football;

import model.Club;


public class FootballClub extends Club  {
    private int countTie;

    public FootballClub() {
    }

    @Override
    public int getPoint() {
        return (getCountWin() *3 ) + (getCountTie());
    }

    public FootballClub(String name) {
        super(name);
    }

    public int getCountTie() {
        return countTie;
    }

    public void setCountTie() {
        this.countTie++;
    }


}

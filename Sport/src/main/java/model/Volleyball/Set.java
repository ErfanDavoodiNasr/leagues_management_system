package model.Volleyball;

import java.util.Objects;

public class Set {
    private int setNumber;
    private int homePoint;
    private int awayPoint;

    public Set() {
    }

    public Set(int setNumber, int homePoint, int awayPoint) {
        this.setNumber = setNumber;
        this.homePoint = homePoint;
        this.awayPoint = awayPoint;
    }


    public int getHomePoint() {
        return homePoint;
    }

    public void setHomePoint(int homePoint) {
        this.homePoint = homePoint;
    }

    public int getAwayPoint() {
        return awayPoint;
    }

    public void setAwayPoint(int awayPoint) {
        this.awayPoint = awayPoint;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set set = (Set) o;
        return setNumber == set.setNumber && homePoint == set.homePoint && awayPoint == set.awayPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(setNumber, homePoint, awayPoint);
    }

    @Override
    public String toString() {
        return "Set{" +
                "setNumber=" + setNumber +
                ", homePoint=" + homePoint +
                ", awayPoint=" + awayPoint +
                '}';
    }
}

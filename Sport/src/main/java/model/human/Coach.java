package model.human;

import model.Club;

import java.util.Objects;

public class Coach extends Person{
    private Club currentClub;

    public Coach(String firstName, String secondName, String nationalId, Club currentClub) {
        super(firstName, secondName, nationalId);
        this.currentClub = currentClub;
    }

    public Club getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(Club currentClub) {
        this.currentClub = currentClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coach coach)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(currentClub, coach.currentClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currentClub);
    }

    @Override
    public String toString() {

        return "Coach{" +
                "currentClub=" + currentClub.getName() +
                '}';
    }
}

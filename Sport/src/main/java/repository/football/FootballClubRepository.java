package repository.football;

import model.Football.FootballClub;

import java.util.ArrayList;

public interface FootballClubRepository {
    Boolean create(FootballClub club);
    FootballClub read(FootballClub club);
    ArrayList<FootballClub> readAll();
    void update(int index, FootballClub newClub);
    Boolean delete(FootballClub club);
    FootballClub getClub(String name);
    int getClubIndex(String name);

}

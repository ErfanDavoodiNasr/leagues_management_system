package repository.football;

import model.Football.FootballMatch;

import java.util.ArrayList;

public interface FootballMatchRepository {
    Boolean create(FootballMatch match);
    FootballMatch read(FootballMatch match);
    ArrayList<FootballMatch> readAll();
    void update(int index, FootballMatch newClub);
    Boolean delete(FootballMatch match);
    FootballMatch getMatch(String homeName, String awayName);
    int getMatchIndex(String homeName, String awayName);
}

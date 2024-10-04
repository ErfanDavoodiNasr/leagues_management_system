package service.football;

import model.Football.FootballClub;
import model.Football.FootballMatch;

public interface FootballMatchService {
    void create();
    void read();
    void update();
    void delete();
    void showInfoMatch(FootballMatch footballMatch);
    FootballMatch createMatch();
}

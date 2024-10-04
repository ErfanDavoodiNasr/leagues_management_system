package service.football;

import model.Football.FootballClub;
import model.Football.FootballLeague;

public interface FootballLeagueService {
    void create();
    void read();
    void update();
    void delete();
    void showChartLeague();
    void showClubInfo();
    void sort();
    FootballLeague createLeague();
}

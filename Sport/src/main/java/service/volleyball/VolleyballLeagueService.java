package service.volleyball;

import model.Volleyball.VolleyballLeague;

public interface VolleyballLeagueService {
    void create();
    void read();
    void update();
    void delete();
    void showChartLeague();
    void showClubInfo();
    void sort();

    VolleyballLeague createLeague();
}

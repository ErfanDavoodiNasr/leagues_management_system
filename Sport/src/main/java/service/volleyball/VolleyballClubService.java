package service.volleyball;

import model.Football.FootballClub;
import model.Volleyball.VolleyballClub;

public interface VolleyballClubService {
    void create();
    void read();
    void update();
    void delete();
    VolleyballClub createClub();
}

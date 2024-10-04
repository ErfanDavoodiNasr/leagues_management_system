package service.football;

import model.Football.FootballClub;

import java.util.ArrayList;

public interface FootballClubService {
    void create();
    void read();
    void update();
    void delete();
    FootballClub createClub();
}

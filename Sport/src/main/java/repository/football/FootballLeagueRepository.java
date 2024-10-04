package repository.football;

import model.Football.FootballLeague;

public interface FootballLeagueRepository {
    void create(FootballLeague footballLeague);
    FootballLeague read();
    void update(FootballLeague newLeague);
    void delete();
}

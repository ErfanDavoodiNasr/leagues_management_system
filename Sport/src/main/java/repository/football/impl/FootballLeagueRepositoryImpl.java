package repository.football.impl;

import model.Football.FootballLeague;
import data.Data;
import repository.football.FootballLeagueRepository;

public class FootballLeagueRepositoryImpl implements FootballLeagueRepository {
    @Override
    public void create(FootballLeague footballLeague) {
        Data.footballLeague = footballLeague;
    }

    @Override
    public FootballLeague read() {
        return Data.footballLeague;
    }

    @Override
    public void update(FootballLeague newLeague) {
        Data.footballLeague = newLeague;
    }

    @Override
    public void delete() {
        Data.footballLeague = null;
    }
}

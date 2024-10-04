package repository.volleyball.impl;

import model.Volleyball.VolleyballLeague;
import data.Data;
import repository.volleyball.VolleyballLeagueRepository;

public class VolleyballLeagueRepositoryImpl implements VolleyballLeagueRepository {

    @Override
    public void create(VolleyballLeague volleyballLeague) {
        Data.volleyballLeague = volleyballLeague;
    }

    @Override
    public VolleyballLeague read() {
        return Data.volleyballLeague;
    }

    @Override
    public void update(VolleyballLeague newLeague) {
        Data.volleyballLeague = newLeague;
    }

    @Override
    public void delete() {
        Data.volleyballLeague = null;
    }
}

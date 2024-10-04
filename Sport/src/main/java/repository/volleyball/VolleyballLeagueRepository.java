package repository.volleyball;

import model.Volleyball.VolleyballLeague;

public interface VolleyballLeagueRepository {
    void create(VolleyballLeague volleyballLeague);
    VolleyballLeague read();
    void update(VolleyballLeague newLeague);
    void delete();
}

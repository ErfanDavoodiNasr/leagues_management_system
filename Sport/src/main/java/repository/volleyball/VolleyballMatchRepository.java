package repository.volleyball;

import model.Volleyball.VolleyballMatch;

import java.util.ArrayList;

public interface VolleyballMatchRepository {
    Boolean create(VolleyballMatch volleyballMatch);
    VolleyballMatch read(VolleyballMatch volleyballMatch);
    ArrayList<VolleyballMatch> readAll();
    void update(int index, VolleyballMatch volleyballMatch);
    Boolean delete(VolleyballMatch match);
    VolleyballMatch getMatch(String homeName, String awayName);
    int getMatchIndex(String homeName, String awayName);
}

package service.volleyball;


import model.Volleyball.Set;
import model.Volleyball.VolleyballMatch;

import java.util.ArrayList;

public interface VolleyballMatchService {
    void create();
    void read();
    void update();
    void delete();
    void showInfoMatch(VolleyballMatch volleyballMatch);
    VolleyballMatch createMatch();
    ArrayList<Set> getInputSets();
}

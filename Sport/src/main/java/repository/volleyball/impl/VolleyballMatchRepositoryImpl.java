package repository.volleyball.impl;

import model.Volleyball.VolleyballMatch;
import data.Data;
import repository.volleyball.VolleyballMatchRepository;

import java.util.ArrayList;

public class VolleyballMatchRepositoryImpl implements VolleyballMatchRepository {
    @Override
    public Boolean create(VolleyballMatch volleyballMatch) {
        return Data.volleyballMatches.add(volleyballMatch);
    }

    @Override
    public VolleyballMatch read(VolleyballMatch volleyballMatch) {
        return volleyballMatch;
    }

    @Override
    public ArrayList<VolleyballMatch> readAll() {
        return Data.volleyballMatches;
    }

    @Override
    public void update(int index, VolleyballMatch newVolleyballMatch) {
        Data.volleyballMatches.set(index, newVolleyballMatch);
    }

    @Override
    public Boolean delete(VolleyballMatch match) {
        return Data.volleyballMatches.remove(match);
    }

    @Override
    public VolleyballMatch getMatch(String homeName, String awayName) {
        return Data.volleyballMatches.get(getMatchIndex(homeName, awayName));
    }

    @Override
    public int getMatchIndex(String homeName, String awayName) {
        for (int i=0; i<Data.volleyballMatches.size(); i++){
            if (Data.volleyballMatches.get(i).getHome().getName().equals(homeName)
                    && Data.volleyballMatches.get(i).getAway().getName().equals(awayName)){
                return i;
            }
        }
        return -1;
    }
}

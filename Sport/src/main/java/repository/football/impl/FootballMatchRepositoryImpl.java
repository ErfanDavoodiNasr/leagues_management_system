package repository.football.impl;

import model.Football.FootballMatch;
import data.Data;
import repository.football.FootballMatchRepository;

import java.util.ArrayList;

public class FootballMatchRepositoryImpl implements FootballMatchRepository {
    @Override
    public Boolean create(FootballMatch match) {
        return Data.footballMatches.add(match);
    }

    @Override
    public FootballMatch read(FootballMatch match) {
        return match;
    }

    @Override
    public ArrayList<FootballMatch> readAll() {
        return Data.footballMatches;
    }

    @Override
    public void update(int index, FootballMatch newMatch) {
        Data.footballMatches.set(index, newMatch);
    }

    @Override
    public Boolean delete(FootballMatch match) {
        return Data.footballMatches.remove(match);
    }

    @Override
    public FootballMatch getMatch(String homeName, String awayName) {
        return Data.footballMatches.get(getMatchIndex(homeName, awayName));
    }

    @Override
    public int getMatchIndex(String homeName, String awayName) {
        for (int i=0; i<Data.footballMatches.size(); i++){
            if (Data.footballMatches.get(i).getHome().getName().equals(homeName)
            && Data.footballMatches.get(i).getAway().getName().equals(awayName)){
                return i;
            }
        }
        return -1;
    }
}

package repository.football.impl;

import model.Football.FootballClub;
import data.Data;
import repository.football.FootballClubRepository;

import java.util.ArrayList;

public class FootballClubRepositoryImpl implements FootballClubRepository {

    @Override
    public Boolean create(FootballClub club) {
        return Data.footballClubs.add(club);
    }

    @Override
    public FootballClub read(FootballClub club) {
        return club;
    }

    @Override
    public ArrayList<FootballClub> readAll() {
        return Data.footballClubs;
    }

    @Override
    public void update(int index, FootballClub newClub) {
        Data.footballClubs.set(index, newClub);
    }

    @Override
    public Boolean delete(FootballClub club) {
        return Data.footballClubs.remove(club);
    }

    @Override
    public FootballClub getClub(String name) {
        return Data.footballClubs.get(getClubIndex(name));
    }

    @Override
    public int getClubIndex(String name) {
        for (int i = 0; i< Data.footballClubs.size(); i++){
            if (Data.footballClubs.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}



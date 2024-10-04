package repository.volleyball.impl;

import model.Volleyball.VolleyballClub;
import data.Data;
import repository.volleyball.VolleyballClubRepository;

import java.util.ArrayList;

public class VolleyballClubRepositoryImpl implements VolleyballClubRepository {
    @Override
    public Boolean create(VolleyballClub club) {
        return Data.volleyballClubs.add(club);
    }

    @Override
    public VolleyballClub read(VolleyballClub club) {
        return club;
    }

    @Override
    public ArrayList<VolleyballClub> readAll() {
        return Data.volleyballClubs;
    }

    @Override
    public void update(int index, VolleyballClub newClub) {
        Data.volleyballClubs.set(index, newClub);
    }

    @Override
    public Boolean delete(VolleyballClub club) {
        return Data.volleyballClubs.remove(club);
    }

    @Override
    public VolleyballClub getClub(String name) {
        return Data.volleyballClubs.get(getClubIndex(name));
    }

    @Override
    public int getClubIndex(String name) {
        for (int i=0; i<Data.volleyballClubs.size(); i++){
            if (Data.volleyballClubs.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}

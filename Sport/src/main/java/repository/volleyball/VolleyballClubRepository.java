package repository.volleyball;


import model.Volleyball.VolleyballClub;

import java.util.ArrayList;

public interface VolleyballClubRepository {
    Boolean create(VolleyballClub club);
    VolleyballClub read(VolleyballClub club);
    ArrayList<VolleyballClub> readAll();

    void update(int index, VolleyballClub newClub);
    Boolean delete(VolleyballClub club);
    VolleyballClub getClub(String name);

    int getClubIndex(String name);
}

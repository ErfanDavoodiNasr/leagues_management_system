package service.volleyball.impl;

import Util.Help;
import model.Football.FootballClub;
import model.Volleyball.VolleyballClub;
import repository.volleyball.VolleyballClubRepository;
import service.volleyball.VolleyballClubService;


public class VolleyballClubServiceImpl implements VolleyballClubService {
    private final VolleyballClubRepository volleyballClubRepository;

    public VolleyballClubServiceImpl(VolleyballClubRepository volleyballClubRepository) {
        this.volleyballClubRepository = volleyballClubRepository;
    }

    @Override
    public void create() {
        Boolean result = volleyballClubRepository.create(createClub());
        if (result){
            System.out.println("successfully added");
        }else {
            System.out.println("this football club already exist");
        }
    }

    @Override
    public void read() {
        VolleyballClub club = volleyballClubRepository.getClub(Help.getInputString("enter a name: "));
    }

    @Override
    public void update() {
        int indexOldClub = volleyballClubRepository.getClubIndex(Help.getInputString("enter a old club name: "));
        volleyballClubRepository.update(indexOldClub, createClub());
    }

    @Override
    public void delete() {
        String clubName = Help.getInputString("enter a name: ");
        VolleyballClub club = volleyballClubRepository.getClub(clubName);
        if (club != null){
            volleyballClubRepository.delete(club);
            System.out.println(clubName + " successfully deleted");
        }else {
            System.out.println(clubName + " doesn't exist");
        }
    }

    @Override
    public VolleyballClub createClub() {
        return new VolleyballClub(Help.getInputString("enter a name: "));
    }
}

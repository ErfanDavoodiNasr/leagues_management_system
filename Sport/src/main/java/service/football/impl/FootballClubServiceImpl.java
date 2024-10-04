package service.football.impl;

import Util.Help;
import model.Football.FootballClub;
import repository.football.FootballClubRepository;
import service.football.FootballClubService;

import java.util.Scanner;

public class FootballClubServiceImpl implements FootballClubService {
    private final FootballClubRepository footballClubRepository;
    private static final Scanner scanner = new Scanner(System.in);

    public FootballClubServiceImpl(FootballClubRepository footballClubRepository) {
        this.footballClubRepository = footballClubRepository;
    }

    @Override
    public void create() {
        Boolean result = footballClubRepository.create(createClub());
        if (result){
            System.out.println("successfully added");
        }else {
            System.out.println("this football club already exist");
        }
    }

    @Override
    public void read() {
        FootballClub club = footballClubRepository.getClub(Help.getInputString("enter a name: "));
    }

    @Override
    public void update() {
        int indexOldClub = footballClubRepository.getClubIndex(Help.getInputString("enter a old club name: "));
        footballClubRepository.update(indexOldClub, createClub());
    }

    @Override
    public void delete() {
        String clubName = Help.getInputString("enter a name: ");
        FootballClub club = footballClubRepository.getClub(clubName);
        if (club != null){
            footballClubRepository.delete(club);
            System.out.println(clubName + " successfully deleted");
        }else {
            System.out.println(clubName + " doesn't exist");
        }
    }

    @Override
    public FootballClub createClub() {
        return new FootballClub(Help.getInputString("enter a name: "));
    }
}

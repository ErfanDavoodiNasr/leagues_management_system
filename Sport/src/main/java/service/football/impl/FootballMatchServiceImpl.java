package service.football.impl;

import Util.Help;
import model.Football.FootballClub;
import model.Football.FootballMatch;
import repository.football.FootballClubRepository;
import repository.football.FootballMatchRepository;
import service.football.FootballMatchService;

public class FootballMatchServiceImpl implements FootballMatchService {

    private final FootballMatchRepository footballMatchRepository;
    private final FootballClubRepository footballClubRepository;

    public FootballMatchServiceImpl(FootballMatchRepository footballMatchRepository, FootballClubRepository footballClubRepository) {
        this.footballMatchRepository = footballMatchRepository;
        this.footballClubRepository = footballClubRepository;
    }

    @Override
    public void create() {
        if (footballMatchRepository.create(createMatch())){
            System.out.println("successfully addeed");
        }else {
            System.out.println("there is some problem");
        }
    }

    @Override
    public void read() {
        FootballMatch footballMatch = footballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        showInfoMatch(footballMatchRepository.read(footballMatch));
    }

    @Override
    public void update() {
        FootballMatch footballMatch = footballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        int index = footballMatchRepository.getMatchIndex(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        footballMatchRepository.update(index, footballMatch);
    }

    @Override
    public void delete() {
        FootballMatch footballMatch = footballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        if (footballMatchRepository.delete(footballMatch)){
            System.out.println("successfully removeds");
        }else {
            System.out.println("there is some problem");
        }
    }

    @Override
    public void showInfoMatch(FootballMatch footballMatch) {
        System.out.println(footballMatch.getHome().getName() + " VS " + footballMatch.getAway().getName());
        System.out.println(footballMatch.getHomeGoals() + " -- " + footballMatch.getAwayGoals());
        System.out.println("location: " + footballMatch.getLocation());
    }

    @Override
    public FootballMatch createMatch() {
        return new FootballMatch(
                footballClubRepository.getClub(Help.getInputString("enter a home name club: ")),
                footballClubRepository.getClub(Help.getInputString("enter a away name club: ")),
                Help.getInputInteger("enter count goal home club: "),
                Help.getInputInteger("enter count goal away Club: ")
        );
    }
}

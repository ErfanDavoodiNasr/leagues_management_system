package service.football.impl;

import Util.Help;
import data.Data;
import model.Club;
import model.Football.FootballClub;
import model.Football.FootballLeague;
import model.Football.FootballMatch;
import repository.football.FootballClubRepository;
import repository.football.FootballLeagueRepository;
import repository.football.FootballMatchRepository;
import service.football.FootballLeagueService;

public class FootballLeagueServiceImpl implements FootballLeagueService {

    FootballLeagueRepository footballLeagueRepository;
    FootballClubRepository footballClubRepository;
    FootballMatchRepository footballMatchRepository;

    public FootballLeagueServiceImpl(FootballLeagueRepository footballLeagueRepository, FootballClubRepository footballClubRepository, FootballMatchRepository footballMatchRepository) {
        this.footballLeagueRepository = footballLeagueRepository;
        this.footballClubRepository = footballClubRepository;
        this.footballMatchRepository = footballMatchRepository;
    }

    @Override
    public void create() {
        this.footballLeagueRepository.create(createLeague());
    }

    @Override
    public void read() {
        footballLeagueRepository.read();
    }

    @Override
    public void update() {
footballLeagueRepository.update(createLeague());
    }

    @Override
    public void delete() {
        footballLeagueRepository.delete();
    }

    @Override
    public void showChartLeague() {
        sort();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Team", "Played", "Won", "Lost", "Drawn", "Points");
        for (FootballClub club : Data.footballClubs) {
            int countMatch = (club.getCountLose()) + (club.getCountWin()) + (club.getCountTie());
            System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10d\n", club.getName(), countMatch, club.getCountWin(), club.getCountLose(), club.getCountTie() , club.getPoint());
        }
    }

    @Override
    public void showClubInfo() {
        FootballClub club = footballClubRepository.getClub(Help.getInputString("enter a name: "));
        int countMatch = club.getCountLose() + club.getCountWin() + club.getCountTie();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Team", "Played", "Won", "Lost", "Drawn", "Points");
        System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10d\n", club.getName(), countMatch, club.getCountWin(), club.getCountLose(),club.getCountTie(), club.getPoint());
    }

    @Override
    public void sort() {
        FootballClub temp;
        for (int i=0; i<Data.footballClubs.size(); i++){
            for (int j=i; j<Data.footballClubs.size()-1; j++){
                if (Data.footballClubs.get(j).getPoint() < Data.footballClubs.get(j+1).getPoint()){
                    temp = Data.footballClubs.get(j);
                    Data.footballClubs.set(j, Data.footballClubs.get(j+1));
                    Data.footballClubs.set(j+1, temp);
                }
            }
        }
    }

    @Override
    public FootballLeague createLeague() {
        return new FootballLeague(Help.getInputString("enter a name: "));
    }
}

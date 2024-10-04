package service.volleyball.impl;

import Util.Help;
import data.Data;
import model.Volleyball.VolleyballClub;
import model.Volleyball.VolleyballLeague;
import repository.volleyball.VolleyballClubRepository;
import repository.volleyball.VolleyballLeagueRepository;
import service.volleyball.VolleyballLeagueService;

public class VolleyballLeagueServiceImpl implements VolleyballLeagueService {

    VolleyballLeagueRepository volleyballLeagueRepository;
    VolleyballClubRepository volleyballClubRepository;

    public VolleyballLeagueServiceImpl(VolleyballLeagueRepository volleyballLeagueRepository, VolleyballClubRepository volleyballClubRepository) {
        this.volleyballLeagueRepository = volleyballLeagueRepository;
        this.volleyballClubRepository = volleyballClubRepository;
    }

    @Override
    public void create() {
        this.volleyballLeagueRepository.create(createLeague());
    }

    @Override
    public void read() {
        volleyballLeagueRepository.read();
    }

    @Override
    public void update() {
        volleyballLeagueRepository.update(createLeague());
    }

    @Override
    public void delete() {
        volleyballLeagueRepository.delete();
    }

    @Override
    public void showChartLeague() {
        sort();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Team", "Played", "Won", "Lost", "Points");
        for (VolleyballClub club : Data.volleyballClubs) {
            int countMatch = (club.getCountLose()) + (club.getCountWin());
            System.out.printf("%-10s %-10d %-10d %-10d %-10d\n", club.getName(), countMatch, club.getCountWin(), club.getCountLose(), club.getPoint());
        }
    }

    @Override
    public void showClubInfo() {
        VolleyballClub club = volleyballClubRepository.getClub(Help.getInputString("enter a name: "));
        int countMatch = club.getCountLose() + club.getCountWin();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Team", "Played", "Won", "Lost",  "Points");
        System.out.printf("%-10s %-10d %-10d %-10d %-10d\n", club.getName(), countMatch, club.getCountWin(), club.getCountLose(), club.getPoint());

    }

    @Override
    public void sort() {
        VolleyballClub temp;
        for (int i=0; i<Data.volleyballClubs.size(); i++){
            for (int j=i; j<Data.volleyballClubs.size()-1; j++){
                if (Data.volleyballClubs.get(j).getPoint() < Data.volleyballClubs.get(j+1).getPoint()){
                    temp = Data.volleyballClubs.get(j);
                    Data.volleyballClubs.set(j, Data.volleyballClubs.get(j+1));
                    Data.volleyballClubs.set(j+1, temp);
                }
            }
        }
    }

    @Override
    public VolleyballLeague createLeague() {
        return new VolleyballLeague(Help.getInputString("enter a name: "));
    }
}

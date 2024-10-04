package service.volleyball.impl;

import Util.Help;

import model.Volleyball.Set;
import model.Volleyball.VolleyballMatch;
import repository.volleyball.VolleyballClubRepository;
import repository.volleyball.VolleyballMatchRepository;
import service.volleyball.VolleyballMatchService;

import java.util.ArrayList;

public class VolleyballMatchServiceImpl implements VolleyballMatchService {

    VolleyballMatchRepository volleyballMatchRepository;
    VolleyballClubRepository volleyballClubRepository;

    public VolleyballMatchServiceImpl(VolleyballMatchRepository volleyballMatchRepository, VolleyballClubRepository volleyballClubRepository) {
        this.volleyballMatchRepository = volleyballMatchRepository;
        this.volleyballClubRepository = volleyballClubRepository;
    }

    @Override
    public void create() {
        if (volleyballMatchRepository.create(createMatch())){
            System.out.println("successfully addeed");
        }else {
            System.out.println("there is some problem");
        }
    }

    @Override
    public void read() {
        VolleyballMatch volleyballMatch = volleyballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        showInfoMatch(volleyballMatchRepository.read(volleyballMatch));
    }

    @Override
    public void update() {
        VolleyballMatch volleyballMatch = volleyballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        int index = volleyballMatchRepository.getMatchIndex(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        volleyballMatchRepository.update(index, volleyballMatch);
    }

    @Override
    public void delete() {
        VolleyballMatch volleyballMatch = volleyballMatchRepository.getMatch(
                Help.getInputString("enter a home name club: "),
                Help.getInputString("enter a away name club: ")
        );
        if (volleyballMatchRepository.delete(volleyballMatch)){
            System.out.println("successfully removeds");
        }else {
            System.out.println("there is some problem");
        }
    }

    @Override
    public void showInfoMatch(VolleyballMatch volleyballMatch) {
        System.out.println(volleyballMatch.getHome().getName() + " VS " + volleyballMatch.getAway().getName());
        System.out.println(volleyballMatch.getHome().getPoint() + " -- " + volleyballMatch.getAway().getPoint());
        System.out.println("location: " + volleyballMatch.getLocation());
    }

    @Override
    public VolleyballMatch createMatch() {
        return new VolleyballMatch(
                volleyballClubRepository.getClub(Help.getInputString("enter a home name club: ")),
                volleyballClubRepository.getClub(Help.getInputString("enter a away name club: ")), getInputSets());
    }
    @Override
    public ArrayList<Set> getInputSets(){
        ArrayList<Set> sets = new ArrayList<>();
        for (int i=1; i<=5; i++){
            if (Help.getInputString("finish (y/n): ").equals("y")){
                return sets;
            }
            Set set = new Set(i , Help.getInputInteger(i + " - enter home point: ") , Help.getInputInteger(i + " - enter away point: "));
            sets.add(set);
        }
        return sets;
    }
}

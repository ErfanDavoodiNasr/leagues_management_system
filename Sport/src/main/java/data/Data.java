package data;

import model.Football.FootballClub;
import model.Football.FootballLeague;
import model.Football.FootballMatch;
import model.Volleyball.VolleyballClub;
import model.Volleyball.VolleyballLeague;
import model.Volleyball.VolleyballMatch;

import java.util.ArrayList;

public class Data {
    public static ArrayList<FootballClub> footballClubs = new ArrayList<>();
    public static ArrayList<VolleyballClub> volleyballClubs = new ArrayList<>();
    public static ArrayList<FootballMatch> footballMatches = new ArrayList<>();
    public static ArrayList<VolleyballMatch> volleyballMatches = new ArrayList<>();
    public static FootballLeague footballLeague = new FootballLeague();
    public static VolleyballLeague volleyballLeague = new VolleyballLeague();
}

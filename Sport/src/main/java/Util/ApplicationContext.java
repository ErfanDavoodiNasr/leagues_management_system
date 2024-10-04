package Util;

import repository.football.FootballClubRepository;
import repository.football.FootballLeagueRepository;
import repository.football.FootballMatchRepository;
import repository.football.impl.FootballClubRepositoryImpl;
import repository.football.impl.FootballLeagueRepositoryImpl;
import repository.football.impl.FootballMatchRepositoryImpl;
import repository.volleyball.VolleyballClubRepository;
import repository.volleyball.VolleyballLeagueRepository;
import repository.volleyball.VolleyballMatchRepository;
import repository.volleyball.impl.VolleyballClubRepositoryImpl;
import repository.volleyball.impl.VolleyballLeagueRepositoryImpl;
import repository.volleyball.impl.VolleyballMatchRepositoryImpl;
import service.football.FootballClubService;
import service.football.FootballLeagueService;
import service.football.FootballMatchService;
import service.football.impl.FootballClubServiceImpl;
import service.football.impl.FootballLeagueServiceImpl;
import service.football.impl.FootballMatchServiceImpl;
import service.volleyball.VolleyballClubService;
import service.volleyball.VolleyballLeagueService;
import service.volleyball.VolleyballMatchService;
import service.volleyball.impl.VolleyballClubServiceImpl;
import service.volleyball.impl.VolleyballLeagueServiceImpl;
import service.volleyball.impl.VolleyballMatchServiceImpl;

public class ApplicationContext {
    private static FootballClubRepository footballClubRepository;
    private static FootballClubService footballClubService;
    private static FootballLeagueRepository footballLeagueRepository;
    private static FootballLeagueService footballLeagueService;
    private static FootballMatchRepository footballMatchRepository;
    private static FootballMatchService footballMatchService;

    // ***************************************************************************************

    private static VolleyballClubRepository volleyballClubRepository;
    private static VolleyballMatchRepository volleyballMatchRepository;
    private static VolleyballLeagueRepository volleyballLeagueRepository;
    private static VolleyballMatchService volleyballMatchService;
    private static VolleyballLeagueService volleyballLeagueService;
    private static VolleyballClubService volleyballClubService;

    static {
        footballClubRepository = new FootballClubRepositoryImpl();
        footballLeagueRepository = new FootballLeagueRepositoryImpl();
        footballMatchRepository = new FootballMatchRepositoryImpl();
        footballClubService = new FootballClubServiceImpl(footballClubRepository);
        footballLeagueService = new FootballLeagueServiceImpl(footballLeagueRepository,footballClubRepository,footballMatchRepository);
        footballMatchService = new FootballMatchServiceImpl(footballMatchRepository,footballClubRepository);
        volleyballClubRepository = new VolleyballClubRepositoryImpl();
        volleyballLeagueRepository = new VolleyballLeagueRepositoryImpl();
        volleyballMatchRepository = new VolleyballMatchRepositoryImpl();
        volleyballLeagueService = new VolleyballLeagueServiceImpl(volleyballLeagueRepository, volleyballClubRepository);
        volleyballClubService = new VolleyballClubServiceImpl(volleyballClubRepository);
        volleyballMatchService = new VolleyballMatchServiceImpl(volleyballMatchRepository, volleyballClubRepository);
    }

    public static FootballClubService getFootballClubService() {
        return footballClubService;
    }

    public static FootballLeagueService getFootballLeagueService() {
        return footballLeagueService;
    }

    public static FootballMatchService getFootballMatchService() {
        return footballMatchService;
    }

    public static FootballClubRepository getFootballClubRepository() {
        return footballClubRepository;
    }

    public static VolleyballMatchService getVolleyballMatchService() {
        return volleyballMatchService;
    }

    public static VolleyballLeagueService getVolleyballLeagueService() {
        return volleyballLeagueService;
    }

    public static VolleyballClubService getVolleyballClubService() {
        return volleyballClubService;
    }
}

package UI;

import Util.ApplicationContext;
import Util.Help;

import java.util.Scanner;

public class Runner {
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void run(){
        while (true) {
            System.out.println("1 - Football");
            System.out.println("2 - Volleyball");
            System.out.println("3 - exit");
            int number = Help.getInputInteger("choose a number: ");
            switch (number){
                case 1:
                    runFootball();
                    break;
                case 2:
                    runVolleyball();
                    break;
                case 3:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-3");
            }
        }
    }

    private static void runFootballClub(){
        while (true) {
            System.out.println("1 - create club");
            System.out.println("2 - delete club");
            System.out.println("3 - edit club");
            System.out.println("4 - show club info");
            System.out.println("5 - return to last page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number) {
                case 1:
                    ApplicationContext.getFootballClubService().create();
                    break;
                case 2:
                    ApplicationContext.getFootballClubService().delete();
                    break;
                case 3:
                    ApplicationContext.getFootballClubService().update();
                    break;
                case 4:
                    ApplicationContext.getFootballLeagueService().showClubInfo();
                    break;
                case 5:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-5");
            }
        }
    }

    private static void runFootballMatch(){
        while (true) {
            System.out.println("1 - create match");
            System.out.println("2 - delete match");
            System.out.println("3 - edit match");
            System.out.println("4 - show info match");
            System.out.println("5 - return to last  page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number){
                case 1:
                    ApplicationContext.getFootballMatchService().createMatch();
                    break;
                case 2:
                    ApplicationContext.getFootballMatchService().delete();
                    break;
                case 3:
                    ApplicationContext.getFootballMatchService().update();
                    break;
                case 4:
                    ApplicationContext.getFootballMatchService().read();
                    break;
                case 5:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-5");
            }
        }
    }

    private static void runFootballLeague(){
        while (true) {
            System.out.println("1 - create league");
            System.out.println("2 - delete league");
            System.out.println("3 - edit league");
            System.out.println("4 - show chart league");
            System.out.println("5 - show club info");
            System.out.println("6 - return to last page");
            int number = Help.getInputInteger("enter a number; ");
            switch (number){
                case 1:
                    ApplicationContext.getFootballLeagueService().createLeague();
                    break;
                case 2:
                    ApplicationContext.getFootballLeagueService().delete();
                    break;
                case 3:
                    ApplicationContext.getFootballLeagueService().update();
                    break;
                case 4:
                    ApplicationContext.getFootballLeagueService().showChartLeague();
                    break;
                case 5:
                    ApplicationContext.getFootballLeagueService().showClubInfo();
                    break;
                case 6:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-6");
            }
        }
    }

    private static void runFootball(){
        while (true){
            System.out.println("1 - league setting");
            System.out.println("2 - club setting");
            System.out.println("3 - match setting");
            System.out.println("4 - return to last page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number) {
                case 1:
                    runFootballLeague();
                    break;
                case 2:
                    runFootballClub();
                    break;
                case 3:
                    runFootballMatch();
                    break;
                case 4:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-4");
            }
        }
    }

    private static void runVolleyballClub(){
        while (true) {
            System.out.println("1 - create club");
            System.out.println("2 - delete club");
            System.out.println("3 - edit club");
            System.out.println("4 - show club info");
            System.out.println("5 - return to last page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number) {
                case 1:
                    ApplicationContext.getVolleyballClubService().create();
                    break;
                case 2:
                    ApplicationContext.getVolleyballClubService().delete();
                    break;
                case 3:
                    ApplicationContext.getVolleyballClubService().update();
                    break;
                case 4:
                    ApplicationContext.getVolleyballLeagueService().showClubInfo();
                    break;
                case 5:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-5");
            }
        }
    }

    private static void runVolleyballMatch(){
        while (true) {
            System.out.println("1 - create match");
            System.out.println("2 - delete match");
            System.out.println("3 - edit match");
            System.out.println("4 - show info match");
            System.out.println("5 - return to last  page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number){
                case 1:
                    ApplicationContext.getVolleyballMatchService().createMatch();
                    break;
                case 2:
                    ApplicationContext.getVolleyballMatchService().delete();
                    break;
                case 3:
                    ApplicationContext.getVolleyballMatchService().update();
                    break;
                case 4:
                    ApplicationContext.getVolleyballMatchService().read();
                    break;
                case 5:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-5");
            }
        }
    }
    private static void runVolleyballLeague(){
        while (true) {
            System.out.println("1 - create league");
            System.out.println("2 - delete league");
            System.out.println("3 - edit league");
            System.out.println("4 - show chart league");
            System.out.println("5 - show club info");
            System.out.println("6 - return to last page");
            int number = Help.getInputInteger("enter a number; ");
            switch (number){
                case 1:
                    ApplicationContext.getVolleyballLeagueService().createLeague();
                    break;
                case 2:
                    ApplicationContext.getVolleyballLeagueService().delete();
                    break;
                case 3:
                    ApplicationContext.getVolleyballLeagueService().update();
                    break;
                case 4:
                    ApplicationContext.getVolleyballLeagueService().showChartLeague();
                    break;
                case 5:
                    ApplicationContext.getVolleyballLeagueService().showClubInfo();
                    break;
                case 6:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-6");
            }
        }
    }
    private static void runVolleyball(){
        while (true){
            System.out.println("1 - league setting");
            System.out.println("2 - club setting");
            System.out.println("3 - match setting");
            System.out.println("4 - return to last page");
            int number = Help.getInputInteger("choose a number: ");
            switch (number) {
                case 1:
                    runVolleyballLeague();
                    break;
                case 2:
                    runVolleyballClub();
                    break;
                case 3:
                    runVolleyballMatch();
                    break;
                case 4:
                    System.out.println("exiting...");
                    return;
                default:
                    System.out.println("choose a number between 1-4");
            }
        }
    }
}

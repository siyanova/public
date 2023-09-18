import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Championship championship = new Championship();
        Competitions competition1 = new TeamCompetitions("Хоккей","Япония",2005,"Международное", "командно-личное");
        championship.addCompetition(competition1);
        Competitions competition2 = new IndividualCompetitions("Гимнастика","Португалия",2003,"региональное");
        championship.addCompetition(competition2);
        Competitions competition3 = new IndividualCompetitions("Баскетбол","Финляндия",2001,"международное");
        championship.addCompetition(competition3);

        championship.printChampionships();


    }
}
import java.util.ArrayList;
public class Championship {
    private ArrayList<Competitions> competition = new ArrayList<Competitions>();
    public void addCompetition(Competitions x){
        competition.add(x);
    }

    public int countTeamCompetitions() {
        int count = 0;
        for (Competitions a : competition) {
            if (a instanceof TeamCompetitions) {
                count++;
            }
        }
        return count;
    }

    public int countIndividualCompetitions(){
        int count = 0;
        for(Competitions competitions:competition){
            if(competitions instanceof IndividualCompetitions){
                count++;
            }
        }
        return count;
    }
    public void printChampionships(){
        System.out.print("В чемпионате: ");
        for(Competitions b:competition){
            System.out.println(b);
        }
    }
}

public class IndividualCompetitions extends Competitions{
    private String scale;
    public IndividualCompetitions(String name, String country, int year, String scale){
        super(name,country,year);
        this.scale = scale;
    }
    public String getScale(){
        return scale;

    }

}

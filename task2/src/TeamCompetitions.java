public class TeamCompetitions extends Competitions{
    private String scale;
    private String formOfCredit;
    public TeamCompetitions(String name, String country, int year, String scale, String formOfCredit){
        super(name,country,year);
        this.scale = scale;
        this.formOfCredit = formOfCredit;
    }
    public String getScale(){
        return scale;

    }
    public String formOfCredit(){
        return formOfCredit;
    }
    public void compete(){
        System.out.println(scale+" соревнование "+formOfCredit+ " по форме зачета");
    }
}

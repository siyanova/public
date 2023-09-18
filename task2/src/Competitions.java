public class Competitions {
    private String name;
    private String country;
    private int year;
    public Competitions(String name,String country, int year){
        this.name = name;
        this.country = country;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getYear(){
        return year;
    }
}

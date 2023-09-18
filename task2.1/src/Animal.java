import java.util.ArrayList;

public class Animal {
    static String name;
    static Boolean full;
    protected int run;
    int swim;


    public void run(int length){
        if(length<=run){
        System.out.println(name+" пробежал "+length+"м.");
        }else System.out.println("Животное устанет");
    }
    public void swim(int length){
        if(length<=swim){
        System.out.println(name+" проплыл "+length+"м.");
        }else System.out.println("Животное устанет");
    }

}

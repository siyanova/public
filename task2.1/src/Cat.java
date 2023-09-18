
import java.util.ArrayList;

public class Cat extends Animal{
    static String name;
    static Boolean full = false;
    int run = 200;
    int swim = 0;

    static ArrayList<Animal> cat=new ArrayList<Animal>();
    public Cat(String name){
        this.name =name;
    }

    public void run(int length){
        if(length<=200){
        System.out.println(name+" пробежал "+length+"м.");
        }else System.out.println("Котик устанет(((");
    }
    public void swim(int length){
        if(length!=0){
        System.out.println("Котики не умеют плавать(((");
        }else System.out.println("Котик может отдохнуть:з");
    }
    public static int countCat(){
        int count = 0;
        for(Animal a:cat){
            if(a instanceof Cat){
                count++;
            }
        }
        System.out.println("у нас "+count+" коть");
        return count;


    }

}

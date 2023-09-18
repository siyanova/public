import java.util.ArrayList;

public class Dog extends Animal{
    static String name;
    static Boolean full;
    static ArrayList<Animal> dog=new ArrayList<Animal>();
    public static void addDog(Animal n){
        dog.add(n);
    }
    public Dog(String name) {
        this.name = name;
    }
    public void run(int length) {
        if (length <= 500) {
            System.out.println(name + " пробежал " + length + "м.");
        }else System.out.println("Пёсель устанет(((");
    }
    public void swim(int length){
        if(length<=10){
        System.out.println(name+" проплыл "+length+"м.");
        }else System.out.println("Пёсел утонет(((");
    }
    public static int countDog(){
        int count = 0;
        for(Animal a:dog){
            if(a instanceof Dog){
                count++;
            }
        }
        System.out.println("у нас "+count+" пёселей");
        return count;


    }


}

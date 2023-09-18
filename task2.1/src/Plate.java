
import java.util.ArrayList;

public class Plate {
    int food;
    ArrayList<Animal> animal = new ArrayList<>();

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int mean) {
        System.out.println(food);
        food += mean;
        System.out.println(food);
    }

    public boolean eatFood(,int eat) {
        for (Animal a : animal) {
            if (a instanceof Cat) {
                if (food < eat) {
                    System.out.println("Котику еды недостаточно");
                    return false;
                } else {

                    if (eat <= food) {
                        food -= eat;
                        System.out.println(food);
                        return true;
                    } else System.out.println("Котик не может покушать");
                    return false;
                }
            } else {
                if (food < eat) {
                    System.out.println("Пёсик не наелся");
                    return false;
                } else {

                    if (eat <= food) {
                        food -= eat;
                        System.out.println(food);
                        return true;
                    } else System.out.println("Пёсек не может покушать");
                    return false;
                }

            }
        }
    }
}





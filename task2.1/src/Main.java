import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> cat = new ArrayList<>();

        Animal murzik =new Cat("Мурзик");
        cat.add(murzik);
        Animal jagoda = new Cat("Ягода");
        cat.add(jagoda);
        Animal musya = new Cat("Муся");
        cat.add(musya);
        musya.run(100);
        jagoda.swim(0);
        Cat.countCat();

        Animal bobik = new Dog("Бобик");
        Dog.addDog(bobik);
        Animal rick = new Dog("Рик");
        Dog.addDog(rick);
        bobik.run(400);
        rick.swim(2);
        Dog.countDog();

        Plate plate = new Plate(50);
        plate.addFood(10);
        Animal animal = new Animal();
        Plate.eatFood(20);

    }
}
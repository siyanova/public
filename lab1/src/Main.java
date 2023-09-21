import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
//        zadanie8();
//        zadanie9();
//        zadanie11();
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
//        task18();
//        task19();
//        task20();
//        task21();
    }

    public static void zadanie1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число x");
        double x = scan.nextDouble();
        double y = (-x + Math.sqrt(Math.pow(x, 2) - 4) / 2);
        System.out.printf("Вычисленное значние равно %.3f", y);
    }
    public static void zadanie2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите 4хзначное число x");
        int x = scan.nextInt();
        int a = (x / 1000) % 10;
        int b = (x / 100) % 10;
        int c = (x / 10) % 10;
        int e = x % 10;
        int newx = a * 1000 + c * 100 + b * 10 + e;
        System.out.println(newx);
    }
    public static void zadanie3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите сторону куба а");
        int a = scan.nextInt();
        double V = Math.pow(a,3);
        System.out.println(V);
    }
    public static void zadanie4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x,y,z");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double answer = ((Math.pow(x,2)-5*Math.pow(x,3)-3)/4+Math.pow(y,2))/(Math.pow(z,2)+5);
        System.out.println(answer);
    }
    public static void zadanie5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int n = scan.nextInt();
        int a = (n/100)%10;
        int b = (n/10)%10;
        int c = n%10;
        int[] array = {a,b,c};
        Arrays.sort(array);
        System.out.println(c);
    }
    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оценку");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a==3||b==3||c==3||d==3){
            System.out.print("Стипендия не назначается");
        }else System.out.print("Стипендия назначается");
    }

    public static void zadanie8() {
        int[] x = {1, 3, 2, 0};
        int[] y = {0, 2, 4, 2};


        double[] sides = new double[4];
        for (int i = 0; i < 4; i++) {
            int dx = x[(i + 1) % 4] - x[i];
            int dy = y[(i + 1) % 4] - y[i];
            sides[i] = Math.sqrt(dx * dx + dy * dy);
        }


        boolean isRhombus = sides[0] == sides[2] && sides[1] == sides[3];
        if (isRhombus) {
            System.out.println("Данный четырехугольник является ромбом.");
        } else {
            System.out.println("Данный четырехугольник не является ромбом.");
        }
    }
    public static void zadanie9(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 9999");
        int a = scan.nextInt();
        if(a%2 ==0) {
            System.out.print("четное ");
        }else System.out.println("нечетное ");
        int length = String.valueOf(a).length();
        String[] array = {"","однозначное","двухзначное","трехзначное","четырехзначное"};
        System.out.println(array[length]);
    }
    public static void zadanie11(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х");
        double x = scan.nextDouble();
        double y = 0;
        if(x>3.61) {
            y = Math.expm1(x+8);
        }else if(0<=x && x<=3.61){
            y = 1;
        }else if(x<0){
            y = x/5;
        }
        System.out.println("Значение функции у при х = " + x + " равно " + y);
    }
    public static void zadanie12(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х ");
        double x = scan.nextDouble();
        System.out.println("Введите y ");
        double y = scan.nextDouble();
        System.out.println("Введите z ");
        double z = scan.nextDouble();
        double sum = x+y+z;
        if(sum<1){
            double min = Math.min(Math.min(x, y), z);
            if (min == x) {
                x = (y + z) / 2;
            } else if (min == y) {
                y = (x + z) / 2;
            } else {
                z = (x + y) / 2;
            }

        }else {
            if (x < y) {
                x = (y + z) / 2;
            } else {
                y = (x + z) / 2;
            }

        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
    public static void task13(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер элемента (1 - радиус, 2 - диаметр, 3 - длина окружности, 4 - площадь круга): ");
        int choice = scanner.nextInt();

        System.out.print("Введите значение выбранного элемента: ");
        double value = scanner.nextDouble();

        double radius, diameter, circumference, area;

        switch (choice) {
            case 1:
                radius = value;
                diameter = 2 * radius;
                circumference = 2 * Math.PI * radius;
                area = Math.PI * Math.pow(radius, 2);
                break;
            case 2:
                diameter = value;
                radius = diameter / 2;
                circumference = Math.PI * diameter;
                area = Math.PI * Math.pow(radius, 2);
                break;
            case 3:
                circumference = value;
                radius = circumference / (2 * Math.PI);
                diameter = 2 * radius;
                area = Math.PI * Math.pow(radius, 2);
                break;
            case 4:
                area = value;
                radius = Math.sqrt(area / Math.PI);
                diameter = 2 * radius;
                circumference = 2 * Math.PI * radius;
                break;
            default:
                System.out.println("Некорректный номер элемента");
                return;
        }

        System.out.println("Радиус: " + radius);
    }
    public static void task14(){
        int N = 10;
        int sum = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов четных чисел от 1 до " + N + " равна: " + sum);
    }
    public static void task15(){
        for(int i = 100; i<=999;i++){
            int firstDigit = i/100;
            int lastDigit = i%10;

            if(firstDigit==lastDigit){
                System.out.println(i);
            }
        }
    }
    public static void task16(){
        int n = 10;
        int product = 1;
        for (int i=1;i<=n;i++){
            if(i%8==0){
                product*=i;
            }
        }
        System.out.println("Произведение чисел от 1 до "+n+" кратных 8: "+product);
    }
    public static void task18(){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double z = 1/(Math.sqrt(2*Math.pow(n,3)-n+5));
        System.out.println(z);
    }
    public static void task19(){
        for(double i = 0;i<1; i+=0.1){
            double a = Math.exp(i)+2*Math.pow(Math.sin(i-2), 2);
            System.out.println(i+" "+a);
        }
    }
    public static void task20(){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        double z = 1/(Math.sqrt(2*Math.pow(n,3)-n+5));

    }
    public static void task21(){
        double z = (-Math.pow(1,2)+Math.pow(2,2)-Math.pow(3,2)+Math.pow(4,2)-Math.pow(5,2)+Math.pow(6,2)-Math.pow(7,2)+Math.pow(8,2)-Math.pow(9,2)+Math.pow(10,2));
        System.out.println(z);
    }
}


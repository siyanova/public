import java.util.Scanner;
public class Bankomat {
    public String numbercard;
    public Card card;
    public Client client;
    public Bankomat(Card card){
        this.card =card;
        this.numbercard = card.numberCard;
        this.client = card.client;
        Pin_kode();
    }
    public void Pin_kode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите код: ");
        String pincode = scan.nextLine();
        if(card.pin.equals(pincode)){
            System.out.print(client.name+" ");
            System.out.println(client.Id);

            System.out.print("Узнать баланс? ");
            String balance = scan.nextLine();
            if(balance.equals("yes")){
                System.out.println("Баланс: "+ client.info);
            }

            System.out.print("Пополнить баланс? ");

            Scanner scan2 = new Scanner(System.in);
            String popol = scan2.nextLine();
            if(popol.equals("yes")){
                System.out.print("Сумма для пополнения: ");
                int sum = scan.nextInt();
                client.info = client.info+sum;
                System.out.println("Баланс: "+ client.info);
            }

            System.out.print("Снять наличные? ");
            Scanner scan1 = new Scanner(System.in);

            String takeoff = scan1.nextLine();
            if(takeoff.equals("yes")){
                System.out.print("Сумма для снятия: ");
                int sum1 = scan1.nextInt();
                if(sum1<client.info) {
                    client.info = client.info - sum1;
                    System.out.println("Баланс: " + client.info);
                }else System.out.println("Не хватает денег на балансе");
            }
        }else{
            System.out.println("Пин-код неверен");

        }

    }
}

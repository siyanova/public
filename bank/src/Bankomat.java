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

            System.out.println("Узнать баланс?");
            String balance = scan.nextLine();
            if(balance.equals("да")){
                System.out.println("Баланс: "+ client.info);
            }

            System.out.println("Пополнить баланс?");
            String popol = scan.nextLine();
            if(popol.equals("да")){
                System.out.println("Сумма для пополнения: ");
                int sum = scan.nextInt();
                client.info = client.info+sum;
                System.out.println("Баланс: "+ client.info);
            }

//            System.out.println("Снять наличные?");
//            String takeoff = scan.nextLine();
//            if(takeoff.equals("дa")){
//                System.out.println("Сумма для снятия: ");
//                int sum1 = scan.nextInt();
//                client.info = client.info-sum1;
//                System.out.println("Баланс: "+client.info);
//
//            }
        }else{
            System.out.println("Пин-код неверен");

        }

    }
}

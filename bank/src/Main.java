import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        Client a = new Client("Смирнов",123,34654);
        clients.add(a);
        Client b = new Client("Курбатова",231,15431);
        clients.add(b);
        Client c = new Client("Белаев",321,76532);
        clients.add(c);

        ArrayList<Card> cards = new ArrayList<>();
        Card card = new Card(a, 788, "0000");
        cards.add(card);

        card = new Card(b, 342, "2111");
        cards.add(card);

        card = new Card(c, 999, "1010");
        cards.add(card);

        Bankomat bankomat = new Bankomat(cards.get(0));
    }
}
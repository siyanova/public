public class Card {
    Client client;
    int CVV;
    String pin;
    String numberCard;
    public Card(Client client, int CVV, String pin){
        this.client=client;
        this.CVV=CVV;
        this.pin=pin;
    }
}

import java.util.ArrayList;

public class Client {
    public String name ;
    public int Id;
    public int info;
    ArrayList<Client> clients = new ArrayList<>();
    public Client(String name, int Id, int info){
        this.name = name;
        this.Id = Id;
        this.info = info;
    }
    public  void add(Client a){
        clients.add(a);
    }
}

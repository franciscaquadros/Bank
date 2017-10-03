import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String name;
    Map <Integer, String> clients = new HashMap<Integer, String>();


    Bank(String name){
        this.name = name;
    }

    public void registerCustomer(Customer c){
        clients.put(c.getId(), c.getName());
    }



}

package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws Exception{

        ArrInterface stub = new ArrRemote();
        LocateRegistry.createRegistry(3434);
        Naming.rebind("rmi://localhost:3434/rishav",stub);
        System.out.println("Server has been Started");

    }
}

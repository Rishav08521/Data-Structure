package RMI;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class sever1 {
    public static void main(String[] args) throws Exception{
        factinterface stub=new factRemote();
        LocateRegistry.createRegistry(2003);
        Naming.rebind("rmi://localhost:2003/raj",stub);
        System.out.println("system has been statred");

    }
}

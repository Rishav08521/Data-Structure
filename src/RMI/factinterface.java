package RMI;
import java.rmi.*;

public interface factinterface extends Remote{
    public int fact(int n) throws Exception;
}

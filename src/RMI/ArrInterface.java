package RMI;
import java.rmi.*;

public interface ArrInterface extends Remote {

    public int[] reverse(int arr[]) throws Exception;
}

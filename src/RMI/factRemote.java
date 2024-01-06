package RMI;
import java.rmi.*;
import java.rmi.server.*;

public class factRemote extends UnicastRemoteObject implements factinterface {
    factRemote() throws Exception {
    }
        public int fact(int n){
            int fact=1;
            for (int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }


}

package RMI;

import java.rmi.Naming;
import java.util.Scanner;

public class client1 {
    public static void main(String[] args)throws Exception {
        factinterface stub=(factinterface) Naming.lookup("rmi://localhost:2003/raj");
       // Scanner sc =new Scanner(System.in);
       // int n=sc.nextInt();
        int ans=stub.fact(6);
        System.out.println(ans);


    }
}

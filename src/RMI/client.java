package RMI;

import java.rmi.Naming;

public class client {
    public static void main(String[] args) throws Exception{
        ArrInterface stub = (ArrInterface)Naming.lookup("rmi://localhost:3434/rishav");

        int arr[] ={2,3,5,3,6};

        int ans[] = stub.reverse(arr);


        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}

package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class ArrRemote extends UnicastRemoteObject implements ArrInterface {
    ArrRemote() throws Exception{
    }

    public int[] reverse(int arr[]){
        int n = arr.length;

        int k=0;
        int ans[] = new int[n];

        for(int i=n-1; i>=0; i--){
            ans[k]=arr[i];
            k++;
        }

        return ans;
    }
}

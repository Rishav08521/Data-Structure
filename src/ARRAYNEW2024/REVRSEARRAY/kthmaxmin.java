package ARRAYNEW2024.REVRSEARRAY;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class kthmaxmin {
    public static void kthsmallest(Integer arr[], int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    public static void kthlargest(Integer arr[], int l){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[l-1]);
    }
    public static void main(String[] args) {
        Integer arr[]={2,9,6,7,4,5,1};
        int k=2;
        int l=3;
        kthlargest(arr,l);
        kthsmallest(arr,k);

    }
}

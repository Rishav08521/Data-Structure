package arrayproblem.java;

import java.util.Scanner;

public class prefixsunminarray {
    static int[] makeaprefixsum(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+ arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("entr " +n+ " elemnets");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("enter the range");
        int[] prefixs=makeaprefixsum(arr);

        System.out.println("enter query");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = prefixs[r]-prefixs[l-1];
            System.out.println("sum "+ ans);
        }


    }
}

package arrayproblem.java.uninum04;

import java.util.Scanner;

public class iava {
    static int uniquenum(int[] arr){
        int ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }

    static int unique2(int arr[]){
        int n = arr.length;

        int ans=0;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(unique2(arr));

    }
}

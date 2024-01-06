package arrayproblem.java;

import java.util.Scanner;

public class counthowmanynorepeating {
    static int countofoccurence(int [] arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the x");
        int x=sc.nextInt();
        System.out.println(" count of occurence "+ countofoccurence(arr,x));
    }
}

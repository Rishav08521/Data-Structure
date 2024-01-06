package arrayproblem.java;

import java.util.Scanner;

public class heightprionblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int [] height=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j){
            int weight=j=i;
            int ht=Math.min(height[i],height[j]);
            int area=ht*weight;
            ans =Math.max(ans,area);
            if (height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }
        System.out.println(ans);


    }
}

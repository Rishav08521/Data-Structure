package arrayproblem.java;

import java.util.Scanner;

public class smallestnum {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int[] arr={1,2,-3,-4,0,-5,6,7,8};
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

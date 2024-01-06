package arrayproblem.java;

import java.util.Scanner;

public class positivearray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,-3,-5,0};
        for (int val:arr){
            if (val>=0){
                System.out.println(val);
            }
        }
    }
}

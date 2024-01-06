package arrayproblem.java;

import java.util.Scanner;

public class evennumberdetermine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={1,2,3,4,5,10,6,7,8,9,};
        for (int val:arr){
            if (val%2==0){
                System.out.println(val);
            }
        }
    }
}

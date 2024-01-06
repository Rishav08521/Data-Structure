package arrayproblem.java;

import java.util.Arrays;
import java.util.Scanner;

public class missingnum {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elemets");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i+1);
                return;
            }


        }

    }
}


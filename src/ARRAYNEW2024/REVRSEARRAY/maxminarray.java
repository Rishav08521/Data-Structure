package ARRAYNEW2024.REVRSEARRAY;

import java.util.Arrays;

public class maxminarray {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        System.out.println("min:"+arr[0] + "max:" + arr[arr.length-1]);

    }
}

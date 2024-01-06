package oops;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(4);
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(9);
        arr.add(9);
        arr.set(3,10);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}

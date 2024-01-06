package oops;

import java.util.Arrays;

public class arraylist1 {
    public static class arraylist{
        int[] arr=new int[5];
        int index=0;
        int size=0;
        public void add(int ele){
            if (size==arr.length){
                int[] brr= Arrays.copyOf(arr, arr.length);
                arr =new int[brr.length];
                arr=Arrays.copyOf(brr,brr.length);
                arr=brr;
            }
            arr[index]=ele;
            index++;
            size++;
        }
        public void set(int index,int val){
            arr[index]=val;
        }
        public int size(){
            return index;
        }
    }
    public static void main(String[] args) {
        arraylist arr=new arraylist();
        arr.add(3);
        arr.add(5);
        //System.out.println(arr.add(3););
        arr.add(9);
        arr.set(1,6);
        System.out.println(arr.size);

        //System.out.println(arr.set(0,5));

    }
}

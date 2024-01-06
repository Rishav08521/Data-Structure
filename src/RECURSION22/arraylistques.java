package RECURSION22;

import java.util.ArrayList;

public class arraylistques {
    static ArrayList<Integer> allindics(int[] arr, int target, int index){
        if (index>=arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> ar=new ArrayList<>();
        if (arr[index]>target) {
            ar.add(index);
        }
       ArrayList<Integer> small= allindics(arr,target,index+1);
        ar.addAll(small);
        return ar;

    }
    public static void main(String[] args) {
        int[] arr={2,3,5,3,7,8,9,3};
        int target=3;
        ArrayList<Integer>ar=allindics(arr,target,0);
        for(Integer i : ar){
            System.out.println(i);
        }

    }
}

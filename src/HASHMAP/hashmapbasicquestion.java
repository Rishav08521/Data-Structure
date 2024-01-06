package HASHMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class hashmapbasicquestion {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,2,3,4,4,5,5,3,3};
        Map<Integer,Integer> freq=new HashMap();
        for(int ele:arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }else{
                freq.put(ele,freq.get(ele)+1);
            }
        }
        System.out.println(" ");
        System.out.println(freq.entrySet());
       int maxfreq=0,anskey=-1;
//        for(var e:freq.entrySet()){
//            if(e.getValue()>maxfreq){
//                maxfreq=e.getValue();
//                anskey=e.getKey();
        for(var key: freq.keySet()){
            if(freq.get(key)>maxfreq){
                maxfreq=freq.get(key);
                anskey=key;
            }
        }
        System.out.println("4 has max freq and it occurs " + " : " + anskey);
        //System.out.println();


    }
}

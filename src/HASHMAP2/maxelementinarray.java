package HASHMAP2;

import java.util.*;
import java.util.Map;

public class maxelementinarray {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,1,4,4,6,4,4,4};
        HashMap<Integer,Integer> sh=new HashMap<>();
        for (var el:arr){
            if (!sh.containsKey(el)){
                sh.put(el,1);
            }else{
                sh.put(el,sh.get(el)+1);
            }
        }
        System.out.println("frequency map");
        System.out.println(sh.entrySet());
        int max=0;int ans=-1;
        for( var ee: sh.entrySet() ){
            if (ee.getValue()>max){
                max= ee.getValue();
                ans=ee.getKey();
            }
        }
        System.out.println(ans);
    }
}

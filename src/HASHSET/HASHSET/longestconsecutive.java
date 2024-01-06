package HASHSET.HASHSET;

import java.util.HashSet;

public class longestconsecutive {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums) st.add(num);
        int maxstrak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currnum=num;
                int currsteck=1;
                while(st.contains(currnum+1)){
                    currnum++;
                    currsteck++;

                }
                maxstrak=Math.max(maxstrak,currsteck);
            }
        }
        return maxstrak;
    }
}

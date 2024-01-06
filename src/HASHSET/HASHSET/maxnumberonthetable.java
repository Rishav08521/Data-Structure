package HASHSET.HASHSET;

import java.util.HashSet;

public class maxnumberonthetable {
    static int maxnumontable(int[] bag){
        int maxnum=0;
        HashSet<Integer> table=new HashSet<>();
        for(int i=0;i<bag.length;i++){
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }else {
                table.add(num);
                maxnum=Math.max(maxnum,table.size());
            }
        }
        return maxnum;

    }
    public static void main(String[] args) {
        int[] nums={2,1,1,3,2,3};
        System.out.println(maxnumontable(nums));

    }
}

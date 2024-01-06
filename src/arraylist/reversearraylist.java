package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reversearraylist {
     static void reversedarraylist(ArrayList<Integer> list){
         int i=0;
         int j=list.size()-1;
         while(i<j){
             Integer temp= Integer.valueOf(list.get(i));
             list.set(i,list.get(j));
             list.set(j,temp);


                     i++;
                     j--;

         }

    }
    public static void main(String[] args) {
        ArrayList<Integer> t=new ArrayList<>();
        t.add(34);
        t.add(23);
        t.add(67);
        t.add(98);
        t.add(76);
        System.out.println(t);
        //Collections.reverse(t);
       /// reversedarraylist(t);
       // System.out.println("reversearraylist" + t);
        Collections.reverse(t);
        System.out.println(t);


    }
}

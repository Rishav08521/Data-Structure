package ARRAYLIST2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class reversein {
    static void reverse(ArrayList<Integer> list){
        int n=list.size();
      int i=0;
      int j=n-1;
      while(i<j){
          Integer temp=Integer.valueOf(list.get(i));
          list.set(i,list.get(j));
          list.set(j,temp);
          i++;
          j--;
      }
    }
    public static void main(String[] args) {
        ArrayList st=new ArrayList();
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(7);
        System.out.println(st);
       // reverse(st);
        Collections.reverse(st);
        System.out.println(st);
//        for (int i=0;i<st.size();i++){
//            System.out.print(st.get(i)+" ");
//        }
    }
}

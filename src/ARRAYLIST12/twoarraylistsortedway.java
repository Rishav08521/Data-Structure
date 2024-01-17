package ARRAYLIST12;

import java.util.ArrayList;

public class twoarraylistsortedway {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        st.add(1);
        st.add(3);
        st.add(5);
        st.add(7);
        st.add(39);
        ArrayList<Integer> at=new ArrayList<>();
        at.add(2);
        at.add(4);
        ArrayList<Integer> gt=new ArrayList<>();
        int n1 = st.size();
        int n2 = at.size();
        int st1=0;
        int st2=0;
        while(st1<n1 && st2<n2){
            if(st.get(st1)<at.get(st2)){
                gt.add(st.get(st1));
                st1++;
            }else{
                gt.add(at.get(st2));
                st2++;
            }
        }

        while(st1<n1){
            gt.add(st.get(st1));
            st1++;
        }

        while(st2<n2){
            gt.add(at.get(st2));
            st2++;
        }

        System.out.println(gt);


    }
}

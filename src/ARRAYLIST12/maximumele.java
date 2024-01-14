package ARRAYLIST12;

import java.util.ArrayList;

public class maximumele {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        st.add(23);
        st.add(34);
        st.add(45);
        st.add(56);
        st.add(67);
        st.add(78);
        int max=st.get(0);
        for (int i=0;i<st.size();i++){
            if (st.get(i)>max){
                max=st.get(i);
            }

        }
        System.out.println(max);
    }
}

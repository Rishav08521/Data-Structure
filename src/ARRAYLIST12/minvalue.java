package ARRAYLIST12;

import java.util.ArrayList;

public class minvalue {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        int min=st.get(0);
        for (int i=0;i<st.size();i++){
            if (st.get(i)<min){
                min=st.get(i);
            }
        }
        System.out.println(min);
    }
}

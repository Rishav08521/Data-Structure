package ARRAYLIST12;

import java.util.ArrayList;

public class divisbleby8 {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        for (int i=1;i<=50;i++){
            st.add(i);
        }
        st.add(64);
        for (int i=0;i<st.size();i++){
            if (st.get(i)%8==0){
                st.remove(i);
            }
        }
        System.out.println(st);
    }
}

package ARRAYLIST12;

import java.util.ArrayList;

public class divisibleby5and3 {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(15);
        st.add(30);
        st.add(8);
        st.add(9);
        st.add(10);
        int num=0;
        ArrayList<Integer> at=new ArrayList<>();
        for (int i=0;i<st.size();i++){
            if (st.get(i)%3==0&&st.get(i)%5==0){
                at.add(st.get(i));
            }
        }
        System.out.println(at);
    }
}

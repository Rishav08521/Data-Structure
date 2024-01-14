package ARRAYLIST12;

import java.util.ArrayList;

public class findpositivenegativenum {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        st.add(1);
        st.add(-2);
        st.add(-3);
        st.add(4);
        st.add(-9);
        st.add(-6);
        int postivenum=0;
        int negative=0;
        for (int i=0;i<st.size();i++){
            if (st.get(i)>0){
                postivenum++;

            }else {
                negative++;
            }
        }
        System.out.println("positivenum:"+postivenum);
        System.out.println("negative:"+negative);
    }
}

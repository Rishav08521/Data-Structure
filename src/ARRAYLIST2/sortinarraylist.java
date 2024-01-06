package ARRAYLIST2;

import java.util.ArrayList;
import java.util.Collections;

public class sortinarraylist {
    static void sortarray(ArrayList<Integer> list){

    }
    public static void main(String[] args) {
        ArrayList st=new ArrayList();
        st.add(2);
        st.add(6);
        st.add(4);
        st.add(5);
        st.add(0);
        st.add(7);
        System.out.println(st);
        Collections.reverse(st);
        System.out.println("reverse:" + st);
        Collections.sort(st);
        System.out.println("ascending order" + st);
        Collections.sort(st,Collections.reverseOrder());
        System.out.println("descending order " + st);

    }
}

package ARRAYLIST2;

import java.util.ArrayList;
import java.util.Collections;

public class stringreverse {
    public static void main(String[] args) {
        ArrayList<String> st=new ArrayList<>();
        st.add("rishav");
        st.add("arpana");
        st.add("mariela");
        st.add("yosserty");
        st.add("dumbledore");
        st.add("bumblebee");
        System.out.println("originallist" + st);
        Collections.sort(st);
        System.out.println(" sortedlist " + st);
        Collections.sort(st,Collections.reverseOrder());
        System.out.println("desecinding order " + st);
    }
}

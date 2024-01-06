package arraylist;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st=new LinkedHashSet<>();
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(7);
        st.add(8);
        st.add(9);
        System.out.println(st);
        st.remove(5);
        System.out.println(st.size());
        System.out.println(st.contains(4));
        System.out.println(st);
    }
}

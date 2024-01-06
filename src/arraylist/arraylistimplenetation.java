package arraylist;

import java.util.ArrayList;
import java.util.Stack;

public class arraylistimplenetation {
    static void arraylistexample(){
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        ar.add(9);
        System.out.println(ar);
        System.out.println(ar.get(2));
        ar.set(2,10);
        System.out.println(ar);
        System.out.println(ar.contains(7));

    }
    static void stackexample(){
        Stack<String> st=new Stack<>();
//        st.add(3);
//        st.add(4);
//        st.add(6);
//        st.add(7);
        st.push("arpana");
        st.push("skills");
        st.push("bittu");
        System.out.println(st);
        System.out.println(st.peek());//bittu
        System.out.println(st.pop()); //also bittust
        System.out.println(st);
        System.out.println(st.peek());// skills
        System.out.println(st.pop());//also skills
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println(st);
    }
    public static void main(String[] args) {
        arraylistexample();
        stackexample();

    }
}

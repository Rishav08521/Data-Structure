package ARRAYLIST2;

import java.util.ArrayList;

public class wrapperclass {
    public static void main(String[] args) {
        Integer in=Integer.valueOf(2);
        System.out.println(in);
        Float f= Float.valueOf(2.2f);
        System.out.println(f);
        String s=String.valueOf("rishav");
        System.out.println(s);
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Boolean> l1=new ArrayList<>();
        ArrayList<Float> l2=new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(6);
        l.add(1,10);
        System.out.println(l);
        l.remove(2);
        System.out.println(l.get(0));
        System.out.println(l);
        l.remove(Integer.valueOf(5));

        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        System.out.println(l);
        boolean ans =l.contains(Integer.valueOf(7));
        System.out.println(ans);
        ArrayList st =new ArrayList();
        st.add(2);
        st.add("rishav");
        st.add(2.2);
        System.out.println(st);

        ArrayList a = new ArrayList();


    }
}

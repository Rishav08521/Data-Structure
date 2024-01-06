package arraylist;

import java.util.ArrayList;

public class arrraylist {
    public static void main(String[] args) {
        Integer ip=Integer.valueOf(45);
        //System.out.println(i);
        Float s=Float.valueOf(43);
       // System.out.println(s);
        Boolean d=Boolean.valueOf(true);
       // System.out.println(d);
        ArrayList<Integer> as=new ArrayList<>();
        as.add(45);
        as.add(23);
        as.add(98);
       // System.out.println(as.get(1));
        for (int i=0;i<as.size();i++){
            System.out.println(as.get(i));

        }
//System.out.println(as);
        as.add(1,299);
        System.out.println(as);
        as.set(1,44);
        System.out.println(as);
        as.remove(2);
        System.out.println(as);
        as.remove(Integer.valueOf(98));
        System.out.println(as);
        boolean t= as.contains(Integer.valueOf(45));
        System.out.println(t);
       // ArrayList<Float> rt=new ArrayList<>(34);
       // ArrayList<Double> ut=new ArrayList<>(34);

    }
}

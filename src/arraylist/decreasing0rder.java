package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class decreasing0rder {
    public static void main(String[] args) {
        ArrayList<Integer> t=new ArrayList<>();
        t.add(454);
        t.add(54);
        t.add(22);
        t.add(45452);
        t.add(2222);
        System.out.println(t);
        Collections.reverse(t);
        System.out.println(t);
        Collections.sort(t);
        System.out.println("ascending order"+ t);
        Collections.sort(t,Collections.reverseOrder());
        System.out.println("descending order "+t);
        ArrayList<String> gt=new ArrayList<>();
        gt.add("welcome");
        gt.add("in");
        gt.add("my");
        gt.add("world");
        System.out.println(gt);
        Collections.sort(gt);
        System.out.println(gt);
        Collections.sort(gt,Collections.reverseOrder());
        System.out.println(gt);


    }
}

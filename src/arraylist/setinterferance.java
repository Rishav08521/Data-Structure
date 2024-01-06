package arraylist;

import java.util.HashSet;

public class setinterferance {
    public static void main(String[] args) {
        HashSet<Integer> ht=new HashSet<>();
        ht.add(12);
        ht.add(23);
       // ht.add(11);
        ht.add(34);
        System.out.println(ht);
        ht.add(12);
        ht.add(12);
        System.out.println(ht);
        ht.remove(12);
        System.out.println(ht);
        System.out.println(ht.contains(23));
        System.out.println(ht.size());

    }
}

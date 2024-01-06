package arraylist;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> h=new HashMap<>();
        h.put(1,"arpana");
        h.put(2,"roy");
        h.put(3,"satyam");
        h.put(4,"prashant");
        h.put(5,"mariela");
        //h.put(2,"rupesh");
        h.putIfAbsent(2,"raj");
        System.out.println(h);
        System.out.println(h.get(2));
        System.out.println(h.containsKey(4));
        System.out.println(h.containsValue("mariela"));
        System.out.println(h.entrySet());
        System.out.println(h.keySet());
        System.out.println(h.values());
        for(Integer i:h.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        for(String i:h.values()){
            System.out.print(i+", ");
        }
        System.out.println();
        for(var e:h.entrySet()){
            System.out.println(e);
        }
    }
}

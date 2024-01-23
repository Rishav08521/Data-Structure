package HASHMAP2;

import java.util.HashMap;
import java.util.Map;

public class basichashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Arpana", 20);
        mp.put("rishika", 10);
        mp.put("ishika", 21);
        mp.put("riupesh", 22);
        System.out.println(mp.get("Arpana"));
        System.out.println(mp.get("ishika"));
        System.out.println(mp.get("rahul"));
        mp.put("riupesh", 23);
        System.out.println(mp.get("riupesh"));
        System.out.println(mp.get("riya"));
        System.out.println(mp.containsKey("Arpana"));
        mp.putIfAbsent("rani", 24);
        mp.putIfAbsent("raj", 25);
        System.out.println(mp.values());
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        //System.out.println(mp.remove("raj", 25));
        for (String key : mp.keySet()) {
            System.out.printf("age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();

        for (Map.Entry<String, Integer> m : mp.entrySet()){
            System.out.printf("age of %s is %d\n",m.getKey(),m.getValue());
        }
    }
}

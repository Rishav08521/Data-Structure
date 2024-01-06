package HASHSET.HASHSET.hashset;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("tulika");
        hs.add("arpana");
        hs.add("sweta");
        hs.add("rani");
        hs.add("smriti");
        hs.add("shristy");
        System.out.println(hs);
        System.out.println(hs.contains("sweta"));
        System.out.println(hs.size());
        hs.remove("sweta");
        System.out.println(hs);
        for(String var:hs){
            System.out.print(var+" ");
        }
    }
}


package HASHMAP;

import java.util.HashMap;

public class ismorphic {
    public boolean isIsmorphic(String s,String t){
        HashMap<Character,Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sCh=s.charAt(i);
            Character tCh=t.charAt(i);
            if(mp.containsKey(sCh)){
                if(mp.get(sCh )!= tCh) return false;
            } else if (mp.containsKey(tCh)) {
                return false;
            }else {
                mp.put(sCh,tCh);
            }
        }
        return true;

    }
}

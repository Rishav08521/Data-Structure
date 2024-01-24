package HASHMAP2;

import java.util.HashMap;

public class anagram {
    static HashMap<Character,Integer> makefreq(String str){
      HashMap<Character,Integer> mp=new HashMap<>();
      for (int i=0;i<str.length();i++){
          Character ch=str.charAt(i);
          if (!mp.containsKey(ch)){
              mp.put(ch,1);
          }else{
              int currfreq=mp.get(ch);
              mp.put(ch,currfreq+1);
          }
      }
      return mp;

    }

    public boolean isanagram(String s, String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1=makefreq(s);
        HashMap<Character,Integer> mp2=makefreq(t);
        return mp1.equals(mp2);


    }
    public static void main(String[] args) {

    }
}

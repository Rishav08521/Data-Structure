package recursion;

public class keyboardcombination {
    static void combination(String dig,String[] op,String result) {
        if (dig.length()==0){
            System.out.println(result+" ");
            return;
        }
        int curerentnum=dig.charAt(0)-'0';
        String currentchoice=op[curerentnum];
        for (int i=0;i<currentchoice.length();i++){
            combination(dig.substring(1),op,result+currentchoice.charAt(i));
        }

    }
    public static void main(String[] args) {
        String digit="23";
        String[] op={" "," ","abc "," def","ghi ","jkl ","mno ","pqrs "," tuv","wxyx"};
        String result=" ";
        combination(digit,op,result);


    }
}

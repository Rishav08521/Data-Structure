package recursion;

public class printssq {
    static void printssq(String s, String currans){
        if (s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        printssq(remString,currans+curr);
        printssq(remString,currans);
    }
    public static void main(String[] args) {
        String s="abc";
        String currans=" ";
        printssq(s,currans);
    }
}

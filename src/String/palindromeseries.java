package String;

public class palindromeseries {
    public static void main(String[] args) {
        String sti="abcdcba";
        StringBuilder sup=new StringBuilder(sti);
        sup.reverse();
        //String rs=sup+" ";
        if (sti.equals(sup)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

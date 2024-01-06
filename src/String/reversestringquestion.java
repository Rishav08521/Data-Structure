package String;

public class reversestringquestion {
    public static void main(String[] args) {
        String str=" i am an online educator";
        String ans =" ";
        StringBuilder sab =new StringBuilder(" ");
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if (ch!=' '){
                sab.append(ch);
            }else{
                sab.reverse();
                ans+=sab;
                ans+=" ";
                sab =new StringBuilder(" ");
            }
        }
        sab.append(" ");
        sab.reverse();
        ans+=sab;

        System.out.println(ans);
    }
}

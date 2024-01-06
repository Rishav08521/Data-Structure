package String;

public class reverseinstringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("physics");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);
    }
}

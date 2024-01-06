package String;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        //str.append("world");
        System.out.println(str);
        str.setCharAt(0,'m');
        str.setCharAt(4,'p');
        str.setCharAt(3,'f');
        System.out.println(str);
        str.insert(2,'z');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.insert(3,'s');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
    }
}

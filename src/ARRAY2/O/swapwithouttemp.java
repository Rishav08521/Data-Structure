package ARRAY2.O;

public class swapwithouttemp {
    static void swap(int a, int b){
        System.out.println("before swap");
        System.out.println("before swap a:"+a);
        System.out.println("before swap b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap");
        System.out.println("after swap a:"+a);
        System.out.println("after swap b:"+b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=23;
        swap(a,b);

    }
}

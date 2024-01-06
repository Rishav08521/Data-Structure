package oopsexamview;

public class a {
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;
        System.out.println("sum of two num is"+c);
    }
    void sub(){
        a=30;
        b=20;
        c=a-b;
        System.out.println("difference of two num"+c);
    }
}
class b extends a{
    void multi(){
        a=2;
        b=9;
        c=a*b;
        System.out.println("multiple of two num"+c);
    }
    void divide(){
        a=50;
        b=10;
        c=a/b;
        System.out.println("divide num"+c);
    }
}
class c extends b{
    void rem(){
        a=10;
        b=5;
        c=a%b;
        System.out.println("remainder "+c);
    }

    public static void main(String[] args) {
        c ff=new c();
        ff.add();
        ff.sub();
        ff.multi();
        ff.divide();
        ff.rem();
    }
}


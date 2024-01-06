package oopsexamview;

public class test1 {
    void show(String name, int a){
        System.out.println("1");
    }
    void show(int a, String s){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test1 t=new test1();
        t.show("rishav",92);
    }
}

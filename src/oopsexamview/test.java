package oopsexamview;

public class test {
    void show(int a){
        System.out.println("1");
    }

     void show(int b, int c){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test t=new test();
        t.show(2,8);
    }
}

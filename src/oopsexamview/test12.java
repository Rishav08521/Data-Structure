package oopsexamview;

public class test12 {
    void show(){
        System.out.println("1");
    }
}
class xyz extends test12{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test12 t=new test12();
        t.show();
        xyz t1=new xyz();
        t1.show();
    }
}

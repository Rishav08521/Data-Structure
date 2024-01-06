package oopsexamview;

public class checkexceotion {
    void show() throws RuntimeException{
        System.out.println("1");
    }
}
class cheker extends checkexceotion{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        checkexceotion t=new checkexceotion();
        t.show();
        cheker t1=new cheker();
        t1.show();
    }
}

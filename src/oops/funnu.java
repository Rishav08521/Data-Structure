package oops;

public class funnu {
    void show() {
        System.out.println("funny guys");
    }
    static class xyz extends funnu{
        void show() {
            System.out.println(" not dummy");
        }
    }
    public static void main(String[] args) {
    funnu t=new funnu();
    t.show();
    xyz s=new xyz();
    s.show();
    }
}

package oops;

public class abstarct {
    void start(){
        System.out.println(" key");
    }
    static class xyz extends abstarct{
        void stat(){
            super.start();
            System.out.println(" kicked");
        }
    }
    public static void main(String[] args) {
//        abstarct t=new abstarct();
//        t.start();
        xyz s=new xyz();
        s.stat();

    }
}

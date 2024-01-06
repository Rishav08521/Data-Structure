package oops;

public class abc {
    void showa(){
        System.out.println(" show in class abc");
    }
    static class cde extends abc {
        void showb() {
            System.out.println("show in class cde");
        }
    }
    static class fgh extends abc{
        void showc(){
            System.out.println("show in class fgh");
        }
    }
    public static void main(String[] args) {
        abc obj=new abc();
        obj.showa();

       System.out.println(",,,,,,,,,,,,,,,,,");
        cde id=new cde();
        id.showa();
        id.showb();
        System.out.println(",,,,,,,,,,,,,,,,,");
        fgh sk=new fgh();
        sk.showa();
        sk.showc();


    }
}

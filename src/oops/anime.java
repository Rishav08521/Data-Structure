package oops;

public class anime {
    void show(){
        System.out.println("11");
    }
    static class exx extends anime{
        void show(){
            super.show();
            System.out.println("333");
        }
    }
    public static void main(String[] args) {
//        anime an=new anime();
//        an.show();
        exx s=new exx();
        s.show();

    }
}

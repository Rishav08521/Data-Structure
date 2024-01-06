package oops;

public class animal3 {
    void eating() {
        System.out.println("i am eating");
    }
}
    class dog extends  animal3{

    public static void main(String[] args) {
        //animal3 a=new animal3();
        dog d=new dog();
        d.eating();
    }

}

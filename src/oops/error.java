package oops;

public class error {
    //overloading
    void show(int a, String t){
        System.out.println("10"+ " roy");
    }
    void show(String s){
        System.out.println("arpana");
    }
    public static void main(String[] args) {
        error e=new error();
        e.show(10,"");
        e.show("");

    }
}

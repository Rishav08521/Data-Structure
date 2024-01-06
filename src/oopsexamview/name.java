package oopsexamview;

public class name {
    void input(){
        System.out.println("enter your name");
    }
}
class adress extends name{
    void show(){
        System.out.println("my name is raj");
    }
}
class pata extends name{
    void displ(){
        System.out.println("my name is arun");
    }
}
class demo{
    public static void main(String[] args) {
       // name r1=new name();
        adress r2=new adress();
        pata r3=new pata();
        r2.input();
       // r2.show();
        r2.show();
        r3.input();
        r3.displ();
        //r3.input();
    }
}

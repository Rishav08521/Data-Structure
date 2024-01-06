package oops;

public class animal2 {
    //by method
    String color;
    int age;
    void initobj(String c , int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        animal2 s=new animal2();
        s.initobj("black",10);
        s.display();
    }
}

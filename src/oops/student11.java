package oops;

public class student11 {
    int marks;
    int rollnum;
     String name;
    void input(){
        System.out.println("enter the marks and rollnum");
    }
}
class rishav extends student11{
     void disk(){
         marks=99;
         rollnum=92;
         name="rishav";
         System.out.println(marks+" "+rollnum+" "+name);
     }

    public static void main(String[] args) {
        rishav r=new rishav();
        r.input();
        r.disk();
    }
}

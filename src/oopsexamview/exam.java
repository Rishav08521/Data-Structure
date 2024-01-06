package oopsexamview;

public class exam {
      void show(){
        System.out.println("1");
        //return null;
    }
}
class exam1 extends exam{
      public void show (){
        System.out.println("rishav");
        //return null;
    }

    public static void main(String[] args) {
        exam t=new exam();
        t.show();
        exam1 t1=new exam1();
        t1.show();
    }
}

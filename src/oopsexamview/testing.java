package oopsexamview;

public class testing {
    public static void main(String[] args) {
        try{
            int a=100;int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("i am in finally blocked");
        }
        System.out.println("hello");
    }
}

package oops;

public class throw1 {
    public static void main(String[] args) {
        throw1 t = new throw1();
        t.divide();
    }
        void divide(){
        try {
            int a = 100, b = 4, c;
            c = a / b;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }

    }
}

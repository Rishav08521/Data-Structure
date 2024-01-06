package oops;

public class UderAgeException extends RuntimeException {
    UderAgeException() {
        super("you are undr age");
    }

    UderAgeException(String message) {
        super(message);
    }

}
class votte{
    public static void main(String[] args) {
        int age=19;
        try {
            if (age < 18) {
                throw new UderAgeException("you are not eligible for vote");
            } else {
                System.out.println("you are eligibile for vote");
            }
            //System.out.println("hello");
        }catch (UderAgeException e){
           // e.printStackTrace();
       }
       System.out.println("hello");

    }
}

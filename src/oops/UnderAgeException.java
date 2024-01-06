package oops;

public class UnderAgeException extends Exception {
    UnderAgeException() {
        Super("you are under age");
    }

    private void Super(String youAreUnderAge) {
    }

//    private void Super(String youAreUnderAge) {
//    }

    UnderAgeException(String message) {
        super(message);
    }

}
    class vote {
    public static void main(String[] args) {
        int age = 19;
        try {
            if (age < 18) {
                throw new UnderAgeException();
            }
        }catch (UnderAgeException e){
            e.printStackTrace();
           // System.out.println(e);
    }

    }
}

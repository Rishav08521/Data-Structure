package recursion2;

public class factorial2 {
    static int factorial(int n){
        if (n==0) return 1;
       // int smallfact=factorial(n-1);
        //int fullfact=n*smallfact; return fullfact;
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}

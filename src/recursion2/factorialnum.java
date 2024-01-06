package recursion2;

public class factorialnum {
    static int fact(int n){
        if (n==0){
            //System.out.println(1);
            return 1;
        }
        int num=fact(n-1);
        int fact=n*num;
       // System.out.println(fact);
        return fact;


    }
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
}

package recursion;

public class factorialnuminrecursion {
    static int fact(int n){
        if (n==0) return 1;
        int fact=fact(n-1);
        int factorial=n*fact;
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

package RECURSION22;

public class factorial {
    static int fact(int n){
        if(n==0) return 1;
        int ans=fact(n-1);
        int factorial=ans*n;
        return factorial;

    }
    public static void main(String[] args) {
       int facs= fact(7);
        System.out.println(facs);

    }
}

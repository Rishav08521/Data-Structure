package RECURSION22;

public class fibonacchi {
    static int fibo(int n){
        if(n==0|| n==1) return n;
       // if (n==1) return 1;
        int prev=fibo(n-1);
        int prevtoprev=fibo(n-2);
        int current=prev+prevtoprev;
        return current;
    }
    public static void main(String[] args) {
       // int fi=fibo(7);
        for (int i=0;i<= 10;i++){
            System.out.println(fibo(i));
        }

        //System.out.println(fi);

    }
}

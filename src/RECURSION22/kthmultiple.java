package RECURSION22;

public class kthmultiple {
    static void multilpe(int n,int k){
        if (k==1){
            System.out.println(n);
            return;
        }
        multilpe(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        multilpe(2,8);

    }
}

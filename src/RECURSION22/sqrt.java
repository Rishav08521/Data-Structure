package RECURSION22;

public class sqrt {
    static int sqaure(int p,int q){
        if (q==0) return 1;
        int sq=sqaure(p,q-1)  * p;
        return sq;
    }
    public static void main(String[] args) {
        System.out.println(sqaure(2,3));
    }
}

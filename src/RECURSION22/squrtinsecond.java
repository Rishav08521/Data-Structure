package RECURSION22;

public class squrtinsecond {
    static int squrt(int p, int q) {
        if (q == 0) return 1;
        int ans = squrt(p, q / 2);
        if (q%2==0) {
            return ans * ans;//even
        }
        else{
            return p* ans *ans;//odd
        }
    }
    public static void main(String[] args) {
        System.out.println(squrt(2,9));

    }
}

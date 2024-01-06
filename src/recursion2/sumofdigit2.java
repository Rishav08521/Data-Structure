package recursion2;

public class sumofdigit2 {
    static int sodd(int n){
        if (n>=0&&n<=9) return n;
        return sodd(n/10)+sodd(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sodd(13367));
    }
}

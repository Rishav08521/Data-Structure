package recursion2;

public class sumofdigit {
    static int sod(int n){
        if (n>=0 && n<=9){
            return n;
        }
        int digit=sod(n/10);
        int sumofdigit=sod(n%10);
        return digit+sumofdigit;

    }

    public static void main(String[] args) {
        System.out.println(sod(1754));

    }
}

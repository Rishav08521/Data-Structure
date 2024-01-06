package RECURSION22;

public class naturaknum {
    static int digitsum(int n){
        if(n>=0 && n<=9) return n;
        int sum=digitsum(n/10);
        int sod=sum + n%10;
        return sod;
    }
    public static void main(String[] args) {
        System.out.println(digitsum(123456789));

    }
}

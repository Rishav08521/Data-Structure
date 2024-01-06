package RECURSION22;

public class countnum {
    static int count(int n){
        if (n==0) return 0;
        int ans=1+count(n/10);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(count(789635));

    }
}

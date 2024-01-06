package RECURSION02;

public class alternatesum {
    static int altersum(int n){
        if (n==0) return 0;
        if (n%2==0){
            return altersum(n-1)-n;
        }else{
            return altersum(n-1)+n;
        }

    }
    public static void main(String[] args) {
        System.out.println(altersum(5));

    }
}

package recursion;

public class sumofmthnnaturalnum {
    static int sum(int n,int m){
        if (m==1) return (n*(n+1))/2;
        if (m>1) return sum(sum(n,m-1),1);
        else return sum(n,1);
    }
    public static void main(String[] args) {
        System.out.println(sum(3,3));

    }
}

package RECURSION22;

public class signsumadd {
    static int seriessum(int n){
        if (n==0) return 0;
       // int sum=seriessum(n-1)+n;
        if (n%2==0){
          return   seriessum(n-1)-n; //even

        }else{
            return seriessum(n-1)+n; //odd
        }
    }
    public static void main(String[] args) {
        System.out.println(seriessum(10));

    }
}

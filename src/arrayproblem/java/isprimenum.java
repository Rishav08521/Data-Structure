package arrayproblem.java;

public class isprimenum {
    public static boolean isprime(int x){
        for(int i=2;i*i<=x;i++){
            if(x%i==0)
                return false;
           // return true;
        }
        return true;
    }
    public static void main(String[] args) {
        int l1=2;
        int l3=20;
        for(int i=l1;i<l3;i++){
            if (isprime(i)){
                System.out.println(i);
            }
            return;

        }

    }
}

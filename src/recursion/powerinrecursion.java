package recursion;

public class powerinrecursion {
    static int pow(int p,int q){
        if (q==0){
            return 1;
        }
        int small=pow(p,q-1);
        int power=small*p;
        return power;
    }
    public static void main(String[] args) {
        System.out.println(pow(5,4));

    }
}

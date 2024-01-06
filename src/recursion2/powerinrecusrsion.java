package recursion2;

public class powerinrecusrsion {
    static int pow(int p,int q){
        if (q==0) return 1;
        return pow(p,q-1)*p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
        System.out.println(pow(5,4));

    }
}

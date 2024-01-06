package recursion2;

public class powerin0ddeven {
    static int power(int p,int q){
        if (q==0) return 1;
        int smallpow=power(p,q/2);
        if (q%2==0){

            return smallpow*smallpow;
        }else{
            return p *smallpow*smallpow;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(4,5));

    }
}

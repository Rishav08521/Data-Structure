package recursion;

public class evennumpower {
    static int evenpow(int p,int q){
        if (q==0) return 1;
            int smallpow=evenpow(p,q/2);
           // int power=p*smallpow;
            if (q%2==0){
                return smallpow * smallpow;
            }
            return p*smallpow*smallpow;
        }
    public static void main(String[] args) {
        System.out.println(evenpow(2,4));
        System.out.println(evenpow(2,5));
        System.out.println(evenpow(3,3));

    }
}

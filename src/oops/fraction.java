package oops;

public class fraction {
//    public static fraction add(fraction f1,fraction f2){
//        int numerator=f1.num*f2.deno + f1.deno*f2.num;
//        int denominator=f1.deno*f2.deno;
//        fraction s=new fraction(numerator,denominator);
//        return s;
//    }
    public static int gcd(int num,int deno){
        int min=Math.min(num,deno);
        for (int i=min;i>=1;i--){
            if (num%i==0&&deno %i==0) return i;
        }
        return min;
    }
    public static class fract{
        int num;
        int deno;
        public fract(int num, int deno){
            this.num=num;
            this.deno=deno;
        }
        public void  simplify(){
            int hcf=gcd(num,deno);
                num/=hcf;
                deno/=hcf;


        }
    }
    public static void main(String[] args) {
        fract f1=new fract(35,21);
        System.out.println(f1.num +"/" + f1.deno);
        System.out.println(f1.num / f1.deno);
        System.out.println(f1.num*f1.deno);
        //f1.num=3;
        //f1.deno=5;
        f1.simplify();
        f1.simplify();
        //fraction s=add(f1,f2);

    }
}

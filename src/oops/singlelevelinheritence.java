package oops;

public class singlelevelinheritence {
    public static class shape{
        public void area(){
            System.out.println("display area");
        }
    }
    public static class triangle extends shape{
        public void area(int l,int h){
            System.out.println(1/2*h*l);
        }
    }
    //upto above is single level inheritence
    class equilateral extends triangle{
        public void area(int h,int l){
            System.out.println(1/2*h*l);
        }
    }
    class circle extends shape{  //connected to shape first base inheritence is called hierachiral i
        public void area(int r){
            System.out.println((3.12*r*r));
        }
    }
    public static void main(String[] args) {
        shape s1=new shape();
        s1.area();
        //System.out.println(s1.area());

    }
}

package oops;

    class pen{
    String color;
    String type;
    int price;
    public void write(){
        System.out.println("write somenthing");

    }
    public void priuntcolor(){
        System.out.println(this.color);
    }
    public class oops {
        public static void main(String[] args) {
            pen p1=new pen();
            p1.color="red";
            p1.type="gel";
            p1.price=10;
            p1.write();
            pen p2=new pen();
            p2.color="balck";
            p2.type="ballpoint";
            p2.price=5;
            p1.priuntcolor();
            p2.priuntcolor();
        }

    }
}

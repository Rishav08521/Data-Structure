package oops;

public class animal {
    public void eat() {
        System.out.println("he is eating fast");
    }

    public void run() {
        System.out.println("he is running fast");
    }

    public void useful() {
        System.out.println("he is very useful");
    }

    public static void main(String[] args) {
        animal s = new animal();
        s.eat();
        s.run();
        s.useful();
        s.interset();
        bird b = new bird();
        b.breed();
        b.fly();


    }

    public void interset() {
        System.out.println("he is interset");
    }
}
    class bird{
        void fly(){
            System.out.println(" he is flying so fast");
        }
        void breed(){
            System.out.println("his name is sparrow");
        }
}

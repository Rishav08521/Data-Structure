package oops;

public class oopsinjava {
    public static class carscollection {
        String name;
        String model;
        int price;
        double rating;
    }
//    public static void fun(carscollection x){
//        System.out.println(x.model);
//        System.out.println(x.name);
//        return;
//
//    }
    public static void change(carscollection x1){
         x1.name=" wagonar";
        return;
    }
    public static void main(String[] args) {
       // int x=6;
        //fun(x+5);
       // String ="rishav";
      //  fun(name);
       // System.out.println();

        carscollection x=new carscollection();
        x.name="mahendra thar";
        x.price=250000;
        x.rating=9.5;
        x.model="new version zxt10 vw";
       System.out.println(" name: "+ x.name);
//        System.out.println(" price: " +x.price);
//        System.out.println(" rating: "+x.rating);
//        System.out.println(" model: "+x.model);
        change(x);
        System.out.println(x);
       // fun(x);
        //updating in datatype
       // x.name="rupesh raj";
       // System.out.println(x.name);
//        int x =5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);


    }
}

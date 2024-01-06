package oops;
import java.util.*;

public class car {
    public static class Car{
        int wheel,handle,string,gear,tank,carbetar;
        String carname;
        String model_name;
        double percentage;

    }
    public static void main(String[] args) {
        Car c1=new Car();
        c1.carbetar=2;
        c1.gear=2;
        c1.string=2;
        c1.handle=1;
        c1.tank=1;
        c1.carname="fortiner";
        c1.model_name="wzx100";
        c1.percentage=46.34;
        System.out.println(c1.carbetar);
        System.out.println(c1.tank);
        System.out.println(c1.handle);
        System.out.println(c1.gear);
        System.out.println(c1.model_name);
        System.out.println(c1.percentage);


    }
}

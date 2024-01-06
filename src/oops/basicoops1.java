package oops;
import java.util.*;

public class basicoops1 {
    public static class student{
        int rollnum,pincode;
        String name,address;
        Double percentage,marks;
//        student(int x,String y,Double z){
//            x=rollnum;
//            y=name;
//            z=percentage;
//
//        }
    }
    public static void main(String[] args) {
        student st = new student();
        st.name="rishav";
        st.rollnum=92;
        st.percentage=98.77;
        st.address="bazidpur";
        st.pincode=805108;
        st.marks=65.78;

        System.out.println(st.marks);
        System.out.println(st.pincode);
        System.out.println(st.percentage);
        System.out.println(st.name);
        System.out.println(st.rollnum);
    }
}


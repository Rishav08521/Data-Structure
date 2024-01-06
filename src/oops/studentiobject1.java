package oops;

public class studentiobject1 {
    public static class student{
        String name;
        int rollnum;
        double percentage;
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="rahul";
        s1.percentage=93.5;
        s1.rollnum=92;
        System.out.println(s1.name + " kumar ");
        System.out.println(s1.rollnum);
        System.out.println(s1.percentage+ 2);
    }
}

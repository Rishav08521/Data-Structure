package oops;

public class studentclass {
    public static class student{
        String name;
        int rollno;
        double percentage;

    }
    public static void main(String[] args) {
        student  x=new student();// decalartion
        x.name="rishav";
        x.rollno=2206092;
        x.percentage=9.11;
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percentage);

    }
}

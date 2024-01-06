package oops;

public class studentclass2 {
        public static class studentclass{

        }
        public static void change(student s){
            s.name="rohan";
        }

        public static void main(String[] args) {
            student s1=new student("rishav",92,97.2);
            System.out.println(s1.numberofstudent);
            System.out.println(s1.name);
            System.out.println(s1.rollnum);
            System.out.println(s1.percent);
            s1.name="rishav";
            s1.percent=98.1;
           // s1.rollnum=78;
            System.out.println(s1.getRollnum());
            System.out.println(s1.name);
            s1.setRollnum(75);
            System.out.println(s1.getRollnum());
            student s2=new student("rishavikesh",78,98.2);
            System.out.println(s2.name);
            System.out.println(s2.percent);
            System.out.println(s2.rollnum);
            System.out.println(s1.schoolname);
            //System.out.println(s1.numberofstudent);
            System.out.println(s2.numberofstudent);
          // student s2=new student();
//            System.out.println(s2.);
//            student s3=new student();
//            System.out.println(s3.);


        }
    }


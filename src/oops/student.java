package oops;
public class student{
        String name;
        int rollnum;
        double percent;
        final String schoolname="sadar alam secondRY MEMORY";
        static int numberofstudent;
        public student(String nam,int rolln,double per){
            name=nam;
            rollnum=rolln;
            percent=per;
            numberofstudent++;

        }
        public int getRollnum(){
                return rollnum; // getter
        }
        public void setRollnum(int rollnum){// setter
           this.rollnum=rollnum;

        }
}
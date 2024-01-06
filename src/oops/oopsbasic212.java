package oops;

public class oopsbasic212 {
    static class animal{
        int leg;
        String breed;
        int eye;
        String quality;
        String color;
        int age;
        void intiobj(String c, int a){
            color=c;
            age=a;

        }
        void display(){
            System.out.println(color+" "+ age);
        }
    }
    public static void main(String[] args) {
        animal st=new animal();
        st.leg=4;
        st.eye=2;
        st.breed="husky";
        st.quality="manner is good";
        System.out.println(st.leg);
        System.out.println(st.breed);
        System.out.println(st.eye);
        System.out.println(st.quality);
//        st.age=3;
//        st.color="white";
//        System.out.println(st.age);
//        System.out.println(st.color);
//
        st.intiobj("black",10);
        st.display();

    }
}

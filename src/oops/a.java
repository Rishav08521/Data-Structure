package oops;

public class a {
    //in class a only a call but if call class b then a and b both are called in single inheritence
    void showa() {
        System.out.println(" showing a in class a");
    }
}
    class b extends a {
        void showb() {
            System.out.println("showing b in class b");
        }

        static class c extends b {
            void showc() {
                System.out.println("showing c in class c");
            }

            public static void main(String[] args) {
                a obj = new a();
                b sc = new b();
                sc.showa();
                sc.showb();
                //c sj=new c();
                c sj = new c();
                sj.showc();

            }
        }
    }


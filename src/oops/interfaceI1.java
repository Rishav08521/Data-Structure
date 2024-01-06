package oops;

public class interfaceI1 {
    void show(){

    }
    class interfaceI2{
        void show(){

        }
    }
    static class text extends interfaceI1 {
        public void show(){
            System.out.println("1");
        }

    }
    public static void main(String[] args) {
 text t=new text();
 t.show();
    }
}

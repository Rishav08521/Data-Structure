package oops;

public class employeee1 {
    private int empid;

    public void setEmpid(int empid1) {
        empid = empid1;
    }

    public int getEmpid() {
        return empid;
    }
}
    class company{

    public static void main(String[] args) {
        employeee1 t=new employeee1();
       // t.getEmpid();
        t.setEmpid(101);
        System.out.println( t.getEmpid());
    }
}


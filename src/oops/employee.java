package oops;

public class employee {
    //paramatrized constructor
    String name;
    int emp_id;
    employee(String name, int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    public static void main(String[] args) {
        employee e=new employee("roy",101);
        employee e1=new employee("raj",102);
        System.out.println("employee1:"+e.name+" "+e.emp_id);
        System.out.println("emplpoyee2:"+e1.name+" "+e1.emp_id);

    }
}

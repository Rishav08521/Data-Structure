package oops;

import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        File f= new File("D:\\DBMS");
        if (f.exists()){
            System.out.println("file name:"+f.getName());
            System.out.println("file location"+f.getAbsolutePath());
            System.out.println("file write:"+f.canWrite());
            System.out.println("file readble:"+f.canRead());
            System.out.println("file suze:"+f.length());
            System.out.println("file parent:"+f.getParent());
        }else {
            System.out.println("does not exits");
        }
    }
}

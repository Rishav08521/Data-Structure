package oops;

import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws Exception {
        File f=new File("C:\\Users\\DESKTOP\\raju.txt");
        try {

            if (f.createNewFile()) {
                System.out.println("file create successfully");
            } else {
                System.out.println(" file already exits");

            }
        }catch (IOException i){
            System.out.println("exception handle");
        }
    }
}

package oops;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static javax.print.attribute.standard.MediaSizeName.D;

public class filewriter {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter f=new FileWriter("c:\\users\\rishav\\rl.txt");
           // FileWriter f=new FileWriter();
            try {
                f.write("java is best language in the world");
            } finally {
                f.close();
            }
            System.out.println("successfully wrote in data");
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
}

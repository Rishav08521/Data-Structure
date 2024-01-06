package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {

    void ReadFile() throws FileNotFoundException {
        FileInputStream f1 = new FileInputStream("d:/abc,txt");
    }

    void savefile() throws FileNotFoundException {
        String text = "this is demo file";
        FileOutputStream f2 = new FileOutputStream("d:/bcs.yxt");
    }

    class text {

        public static void main(String[] args) {
            ReadAndWrite rw = new ReadAndWrite();
            try {
                rw.ReadFile();
            } catch (FileNotFoundException e) {
                // System.out.println(e);
                e.printStackTrace();
            }
            try {
                rw.savefile();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            System.out.println("hello");
        }

    }
}


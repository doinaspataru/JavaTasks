package com.intership.task.input_output;
import java.io.*;
import static java.lang.System.*;

public class MainIO {
    public static void main(String[] args) throws IOException {

        // INPUT OUTPUT WITH FILE IO STREAM
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\dospataru\\OneDrive - ENDAVA\\Desktop\\tasks\\input.txt");
            out = new FileOutputStream("C:\\Users\\dospataru\\OneDrive - ENDAVA\\Desktop\\tasks\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }


        //INPUT OUTPUT WITH FILE READER/WRITER
        FileReader in2 = null;
        FileWriter out2 = null;

        try {
            in2 = new FileReader("C:\\Users\\dospataru\\OneDrive - ENDAVA\\Desktop\\tasks\\input.txt");
            out2 = new FileWriter("C:\\Users\\dospataru\\OneDrive - ENDAVA\\Desktop\\tasks\\output.txt");

            int c;
            while ((c = in2.read())!= -1) {
               // out2.write(c);
                out2.write(65);
                System.out.println(c);

            }
        }finally {
            if (in2 != null) {
                in2.close();
            }
            if (out2 != null) {
                out2.close();
            }
        }

        //INPUT OUTPUT WITH InputStreamReader
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}

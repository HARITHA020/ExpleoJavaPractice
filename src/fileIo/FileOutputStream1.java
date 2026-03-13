package fileIo;

import java.io.FileOutputStream;

public class FileOutputStream1 {

    public static void main(String[] args) {

        String data = "Welcome to java portal!!! have a happy learning";

        try {
            FileOutputStream output = new FileOutputStream("D:\\expleo company traning doc\\FilesIO\\FileOutput.txt");

            byte[] array = data.getBytes();

            output.write(array);
            output.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

}
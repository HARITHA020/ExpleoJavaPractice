package handson9;

import java.io.File;

public class Hands_on_9_sum3 {
	public static void main(String args[]) {
		File f = new File("D:\\expleo company traning doc\\FilesIO\\LargestFind.txt");

        if(f.exists()) {
            System.out.println("File or Directory exists.");
        }
        else {
            System.out.println("File or Directory does not exist.");
        }
	}
}

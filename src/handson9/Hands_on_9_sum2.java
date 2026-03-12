package handson9;

import java.io.File;

public class Hands_on_9_sum2 {

	public static void main(String[] args) {
		 File folder = new File("D:\\expleo company traning doc\\FilesIO");

	        File[] files = folder.listFiles();
	        boolean found = false;
	        for(File f : files) {
	        	if(f.getName().endsWith(".bmp")) {
	                System.out.println(f.getName());
	                found = true;
	            }

	        }
	        if(!found) {
	            System.out.println("Specific extension file is not found in the folder.");
	        }
	}
}

package fileIo;

import java.io.FileInputStream;

public class FileInputSteam {

	public static void main(String[] args) {
		try {
			FileInputStream input=new FileInputStream("D:\\expleo company traning doc\\FilesIO\\LargestFind.txt");
			System.out.println("data in the file:");
			int i=input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}

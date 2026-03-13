package fileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamByte {

	public static void main(String[] args) {
		byte[] b=new byte[128];
		try (FileInputStream fis =new FileInputStream("D:\\expleo company traning doc\\FilesIO\\LargestFind.txt");
			FileOutputStream fos=new FileOutputStream("D:\\expleo company traning doc\\FilesIO\\FileOutput.txt")){
			System.out.println("bytees available:" +fis.available());
			int count=0; int read=0;
			while((read=fis.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total count:" +count);
		}
		catch(FileNotFoundException f) {
			System.out.println("file not found:"+f);
		}
		catch(IOException e) {
			System.out.println("IOException:"+e);
		}

	}

}

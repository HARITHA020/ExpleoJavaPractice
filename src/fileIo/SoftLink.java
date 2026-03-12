package fileIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		Path existingFile=Paths.get("C:\\Users\\HARITHA\\OneDrive\\Desktop\\dummy folder");
		/*Path symLinPath=Paths.get("C:\\dummu.txt");
		try {
			Files.createSymbolicLink(symLinPath,existingFile);
		}
		catch(IOException x){
			System.out.println(x);
		}
		catch(UnsupportedOperationException x) {
			System.out.println(x);
		}*/
		
		//boolean result= Files.exists(existingFile);
		//System.out.println("Path"+existingFile+" exists:"+result);
		boolean result= Files.isReadable(existingFile);
		System.out.println("Path"+existingFile+" exists:"+result);

	}

}

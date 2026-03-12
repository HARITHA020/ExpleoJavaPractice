package fileIo;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileSystem_path {
	public static void main(String args[]) {
		Path p1=Paths.get("C:\\Users\\HARITHA\\OneDrive\\Desktop\\git-practice-workspace\\GitPractice\\src");
		Path normalizedPath=p1.normalize();
		Path p2=Paths.get("C:\\Users\\HARITHA\\OneDrive\\Desktop\\git-practice-workspace\\GitPractice\\src");
		System.out.println("Normalized Path:"+normalizedPath);
		Path subPath=p1.subpath(1, 3);
		System.out.println("sub path is:"+subPath);
		
		System.out.println("getFileName: "+p1.getFileName());
		System.out.println("getParent: "+p1.getParent());
		System.out.println("getNameCount: "+p1.getNameCount());
		System.out.println("getRoot: "+p1.getRoot());
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("is to abosulte path: "+p1.toAbsolutePath());
		System.out.println("to uri:"+p1.toUri());
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
	}
}

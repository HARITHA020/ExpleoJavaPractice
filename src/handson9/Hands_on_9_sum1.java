package handson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hands_on_9_sum1 {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("D:\\expleo company traning doc\\FilesIO\\LargestFind.txt");

		if(!Files.exists(path)) {
		    Files.createFile(path);
		}
		String content = Files.readString(path);

        String words[] = content.split(" ");

        String largest = words[0];

        for(String w : words){
            if(w.length() > largest.length()){
                largest = w;
            }
        }

        System.out.println("Largest word: " + largest);

	}

}

package readandwrite;

import java.io.File;
import java.io.IOException;

//Java file handling
//Java has several methods for creating, reading, updating, and deleting files.
//he File class from the java.io package, allows us to work with files.
public class CreateFile {

	public static void main(String[] args) { 
		
		try {
		File myFile = new File("filename.txt");
			if (myFile.createNewFile()) {
			System.out.println("File Created :"+myFile.getName());	
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}



package Aula138_IO;

import java.io.File;
import java.util.Date;

public class FileTest01 {
 public static void main(String[] args)  {
	File file = new File("file.txt");
	try {
	boolean isCreated =	file.createNewFile();
   System.out.println("Created: "+isCreated);	
   System.out.println("Path: "+file.getPath());	
   System.out.println("Path absolute: "+file.getAbsolutePath());
   System.out.println("Is directory: "+file.isDirectory());
   System.out.println("Is file: "+file.isFile());
   System.out.println("Is hidden: "+file.isHidden());
   System.out.println("Last modified: "+new Date(file.lastModified()));
	boolean exist = file.exists();
	if(exist) {
		System.out.println("Deleted: " +file.delete());
		
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

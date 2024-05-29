package Aula138_IO;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest01 {
 public static void main(String[] args) {
	File file = new File("file.txt");
	try(FileReader fr = new FileReader(file)){
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

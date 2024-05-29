package Aula138_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	public static void main(String[] args) {
  File file = new File("file.txt");
  try(FileWriter fw = new FileWriter(file,true)){
	  fw.write("Testando escrever em um arquivo\nhjhggjgjg");
	  fw.flush();//fala pro SI jogar tudo dentro do buffer e depois que acabar o propri java vai chamar o close 
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}

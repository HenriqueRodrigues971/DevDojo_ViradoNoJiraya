package Aula138_IO.pt_02_filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//O método flush() força a gravação de todos os dados que estão no buffer para o arquivo.
// Isso é útil para garantir que nenhum dado seja perdido em caso de fechamento abrupto.

//Se não colocar o boolean true o filewrite não executa apeppend, ele apaga tudo que for escrito e sobreescreve
public class FileWriterTeste01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try (FileWriter fw = new FileWriter(file,true)) {
			fw.write("\nO DevDojo é o melhor canal do brasilllllll \n");
			fw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

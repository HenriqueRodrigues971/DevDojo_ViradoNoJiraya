package Aula138_IO.pt_06_fileparadiretorios;

import java.io.File;
import java.io.IOException;

public class DiretorioTeste01 {
	public static void main(String[] args) {
		/* Criando diretorio */
		File fileDiretorio = new File("pasta");
		fileDiretorio.mkdir();
		System.out.println(fileDiretorio.exists());

		/* Criando um arquivo direcionado a um diretorio */
		File filearquivoDiretorio = new File(
				"/home/henrique/eclipse-workspace/DevDojo_ViradoNoJiraya/pasta/arquivo.txt");
		File fileArquivoDiretorio2 = new File(fileDiretorio, "arquivo2.txt");
		try {
			filearquivoDiretorio.createNewFile();
			fileArquivoDiretorio2.createNewFile();
			System.out.println(filearquivoDiretorio.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}

		/* Renomeando arquivo */
		File fileRenamed = new File(fileDiretorio, "arquivo2_renomeado.txt");
		fileArquivoDiretorio2.renameTo(fileRenamed);

		/* Renomeando diretorio */
		File directorioRenamed = new File("pasta_renomeada");
		boolean renemead = fileDiretorio.renameTo(directorioRenamed);
		System.out.println(renemead);
	}
}

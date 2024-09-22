package Aula97_Excecoes_Exception;

import java.io.File;
import java.io.IOException;

public class test01 {
	public static void main(String[] args) {
		criarNovoArquivo();

	}

	private static void criarNovoArquivo() {
		File file = new File("arquivo/texto3.txt");
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado: " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

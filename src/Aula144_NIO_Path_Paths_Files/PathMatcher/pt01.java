package Aula144_NIO_Path_Paths_Files.PathMatcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class pt01 {
	public static void main(String[] args) {
		// Definindo vários caminhos de arquivo para testar os padrões glob
		Path path1 = Paths.get("pasta/subpasta/file.bkp"); // Caminho de arquivo com extensão .bkp
		Path path2 = Paths.get("pasta/subpasta/file.txt"); // Caminho de arquivo com extensão .txt
		Path path3 = Paths.get("pasta/subpasta/file.java"); // Caminho de arquivo com extensão .java

		// Testa se o arquivo "file.bkp" corresponde ao padrão "*.bkp" (arquivos
		// terminando com .bkp)
		matches(path1, "glob:*.bkp");

		// Testa se o arquivo "file.bkp" em qualquer subdiretório corresponde ao padrão
		// "**/*.bkp"
		// O padrão "**/*.bkp" verifica se o arquivo com extensão .bkp está em qualquer
		// profundidade de diretório
		matches(path1, "glob:**/*.bkp");

		// Testa se o arquivo "file.bkp" corresponde a qualquer arquivo com extensão
		// .bkp, .txt ou .java
		matches(path1, "glob:**/*.{bkp,txt,java}");

		// Testa se o arquivo "file.txt" corresponde ao padrão que inclui arquivos com
		// extensão .bkp, .txt ou .java
		matches(path2, "glob:**/*.{bkp,txt,java}");

		// Testa se o arquivo "file.java" corresponde ao padrão que inclui arquivos com
		// extensão .bkp, .txt ou .java
		matches(path3, "glob:**/*.{bkp,txt,java}");

		// Testa se o arquivo "file.bkp" corresponde a arquivos com exatamente três
		// letras de extensão
		// O padrão "*.???" corresponde a qualquer arquivo com uma extensão de
		// exatamente três letras
		matches(path1, "glob:**/*.???");

		// Testa se o arquivo "file.txt" corresponde ao padrão "*.???"
		matches(path2, "glob:**/*.???");

		// Testa se o arquivo "file.java" corresponde ao padrão "*.???"
		matches(path3, "glob:**/*.???");

		// Testa se o arquivo "file.java" corresponde exatamente ao nome "file" com três
		// letras de extensão
		// O padrão "file.???" corresponde a qualquer arquivo com o nome "file" e uma
		// extensão de três letras
		matches(path3, "glob:**/file.???");
	}

	// Método que faz a correspondência do caminho com o padrão glob fornecido
	private static void matches(Path path, String glob) {
		// Obtém o PathMatcher usando o padrão glob fornecido
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);

		// Verifica se o caminho fornecido corresponde ao padrão glob e imprime o
		// resultado
		System.out.println(glob + ": " + matcher.matches(path));
	}
}

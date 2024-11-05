package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
	public static void main(String[] args) {
		String directorioProjeto = "home/henri/dev";
		String arquivoTxt = "../../arquivo.txt";

		// Cria um Path usando o caminho do projeto e o caminho relativo do arquivo
		Path path1 = Paths.get(directorioProjeto, arquivoTxt);
		System.out.println("Path1: " + path1);
		// O método normalize() remove partes redundantes do caminho, como ".." ou ".".
		System.out.println(path1.normalize()); // Normaliza o caminho, removendo as referências redundantes de pastas

		// Cria um Path com referências redundantes no caminho absoluto
		Path path2 = Paths.get("/home/./henri/./dev/");
		System.out.println("Path2: " + path2);
		// O método normalize() também elimina partes desnecessárias como "./" e retorna
		// o caminho simplificado
		System.out.println(path2.normalize());
	}
}

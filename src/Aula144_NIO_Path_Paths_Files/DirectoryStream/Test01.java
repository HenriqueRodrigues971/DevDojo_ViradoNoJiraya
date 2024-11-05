package Aula144_NIO_Path_Paths_Files.DirectoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01 {
	public static void main(String[] args) {
		// Cria um objeto 'Path' que representa o diretório atual (".")
		Path path = Paths.get(".");

		// Usa um 'try-with-resources' para garantir que o 'DirectoryStream' será
		// fechado automaticamente
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
			// Itera sobre cada caminho (arquivo ou diretório) no 'DirectoryStream'
			for (Path p : stream) {
				// Exibe o nome de cada arquivo/diretório encontrado no console
				System.out.println(p.getFileName());
			}
		} catch (IOException e) {
			// Trata exceções relacionadas a operações de I/O
			e.printStackTrace();
		}
	}
}

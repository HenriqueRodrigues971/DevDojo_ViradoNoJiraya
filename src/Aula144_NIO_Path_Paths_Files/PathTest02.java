package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
	public static void main(String[] args) throws Exception {
		Path pastaPath = Paths.get("arquivo2"); /* Obtendo o Path de um diretório */

		if (Files.notExists(pastaPath)) { /* Verifica se o diretório 'arquivo2' não existe */
			Path pastaDirectory = Files.createDirectory(pastaPath); // Cria o diretório 'arquivo2' se ele não existir
		}

		Path subPastaPath = Paths.get("arquivo2/sub/sub2"); /* Obtendo o Path de uma subpasta dentro do diretório */
		Files.createDirectories(subPastaPath); // Cria o diretório 'sub2' e seus diretórios pais, se ainda não existirem

		/* Criando um arquivo */
		Path filePath = Paths.get(subPastaPath.toString(), "file.txt"); // Definindo o caminho para o arquivo 'file.txt'
																		// dentro de 'sub2'
		if (Files.notExists(filePath)) { // Verifica se o arquivo não existe
			Files.createFile(filePath); // Cria o arquivo 'file.txt' se ele não existir
		}

		/*
		 * Copiando o arquivo 'file.txt' para um novo arquivo chamado 'file_rename.txt'
		 */
		Path origem = filePath;
		Path destino = Paths.get(filePath.getParent().toString(), "file_rename.txt"); // Definindo o caminho de destino
		Files.copy(origem, destino); // Copia o arquivo 'file.txt' para 'file_rename.txt' no mesmo diretório

		/*
		 * O uso de StandardCopyOption.REPLACE_EXISTING sobrescreve o arquivo de destino
		 * se ele já existir. Sem essa opção, será lançada uma exceção se o arquivo de
		 * destino já existir.
		 */
		// Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
	}
}

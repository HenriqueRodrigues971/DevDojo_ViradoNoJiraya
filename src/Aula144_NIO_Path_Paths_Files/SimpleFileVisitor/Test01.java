package Aula144_NIO_Path_Paths_Files.SimpleFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Classe que estende SimpleFileVisitor para customizar a visita a arquivos e diretórios
class ListAllFiles extends SimpleFileVisitor<Path> {

	// Método que é chamado sempre que um arquivo é visitado durante a varredura do
	// sistema de arquivos
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// Se o nome do arquivo terminar com ".java", ele será impresso
		if (file.getFileName().toString().endsWith(".java")) {
			System.out.println(file.getFileName());
		}
		// Continua a varredura para outros arquivos e diretórios
		return FileVisitResult.CONTINUE;
	}
}

public class Test01 {
	public static void main(String[] args) throws IOException {
		// Define o diretório raiz para iniciar a varredura (neste caso, o diretório
		// atual ".")
		Path root = Paths.get(".");

		// Inicia a varredura de arquivos a partir do diretório raiz, usando a classe
		// ListAllFiles para determinar o comportamento ao visitar arquivos
		Files.walkFileTree(root, new ListAllFiles());
	}
}

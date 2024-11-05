package Aula144_NIO_Path_Paths_Files.SimpleFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Classe que estende SimpleFileVisitor para customizar a visita a arquivos e diretórios
class ListJavaFiles extends SimpleFileVisitor<Path> {

	// Método que é chamado sempre que um arquivo é visitado durante a varredura do
	// sistema de arquivos
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// Se o nome do arquivo terminar com ".java", ele será impresso
			System.out.println("Arquivo Java encontrado: " + file.getFileName());
		// Continua a varredura para outros arquivos e diretórios
		return FileVisitResult.CONTINUE;
	}

	// Método chamado após a visita de um diretório
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		// Aqui você pode adicionar algum comportamento após a visita do diretório, se
		// necessário
		System.out.println("Diretório visitado: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	// Método chamado antes de visitar um diretório
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// Aqui você pode adicionar algum comportamento antes de visitar o diretório, se
		// necessário
		System.out.println("Iniciando a visita ao diretório: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	// Método chamado quando ocorre falha ao visitar um arquivo (por exemplo,
	// permissões insuficientes)
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// Trata erros de visita ao arquivo (pode ser devido a permissões, etc.)
		System.err.println("Falha ao acessar o arquivo: " + file.getFileName() + " - " + exc.getMessage());
		// Continua a varredura mesmo após a falha
		return FileVisitResult.CONTINUE;
	}
}

public class Test2 {
	public static void main(String[] args) throws IOException {
		// Define o diretório raiz para iniciar a varredura (neste caso, o diretório
		// chamado "pasta")
		Path root = Paths.get("pasta"); // Certifique-se de que "pasta" existe no caminho especificado

		// Inicia a varredura de arquivos a partir do diretório raiz, usando a classe
		// ListJavaFiles
		// que define o comportamento ao visitar arquivos e diretórios
		Files.walkFileTree(root, new ListJavaFiles());
	}
}

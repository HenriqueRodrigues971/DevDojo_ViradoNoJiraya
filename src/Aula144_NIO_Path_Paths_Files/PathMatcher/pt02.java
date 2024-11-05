package Aula144_NIO_Path_Paths_Files.PathMatcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Classe que estende SimpleFileVisitor para customizar a visita a arquivos e diretórios
// O objetivo é encontrar arquivos que correspondam a um padrão específico usando PathMatcher
class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {

	// Cria um PathMatcher que procura por arquivos que começam com "Test"
	// e que tenham a extensão ".java" ou ".class".
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

	// Método que é chamado sempre que um arquivo é visitado durante a varredura do
	// sistema de arquivos
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// Se o arquivo corresponder ao padrão do matcher (arquivos que começam com
		// "Test" e têm extensão ".java" ou ".class")
		if (matcher.matches(file)) {
			// Imprime o nome do arquivo encontrado que corresponde ao padrão
			System.out.println(file.getFileName());
		}
		// Continua a varredura para outros arquivos e diretórios
		return FileVisitResult.CONTINUE;
	}
}

public class pt02 {
	public static void main(String[] args) throws IOException {
		// Define o diretório raiz a partir do qual iniciar a varredura
		// Aqui usamos "." que representa o diretório atual
		Path root = Paths.get(".");

		// Inicia a varredura de arquivos a partir do diretório raiz, usando a classe
		// FindAllTestJavaOrClass, que define o comportamento de visita a arquivos e
		// diretórios
		Files.walkFileTree(root, new FindAllTestJavaOrClass());
	}
}

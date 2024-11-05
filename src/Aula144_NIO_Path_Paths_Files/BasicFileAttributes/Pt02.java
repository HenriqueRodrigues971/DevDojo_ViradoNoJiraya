package Aula144_NIO_Path_Paths_Files.BasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Este código demonstra como ler e modificar atributos básicos de arquivos
 * utilizando as classes BasicFileAttributes e BasicFileAttributeView da API
 * NIO. O exemplo também mostra como alterar os tempos de criação, modificação e
 * acesso de um arquivo.
 */
public class Pt02 {
	public static void main(String[] args) throws IOException {

		// Cria um Path para o arquivo "new.txt" dentro da pasta "pasta2"
		Path path = Paths.get("pasta2/new.txt");

		// Lê os atributos básicos do arquivo usando BasicFileAttributes
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

		// Obtém os tempos de criação, última modificação e último acesso do arquivo
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

		// Exibe os tempos de criação, modificação e acesso
		System.out.println("Creationtime: " + creationTime);
		System.out.println("lastModifiedTime: " + lastModifiedTime);
		System.out.println("lastAccessTime: " + lastAccessTime);

		System.out.println("----------");

		// Obtém a visão dos atributos básicos do arquivo, que permite modificá-los
		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

		// Cria um novo tempo de criação baseado no tempo atual do sistema
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());

		// Modifica os tempos do arquivo, trocando o tempo de criação pelo tempo atual
		// Mantém a última modificação e o último acesso como estão
		fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

		// Lê novamente os atributos para verificar as alterações feitas
		creationTime = fileAttributeView.readAttributes().creationTime();
		lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
		lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

		// Exibe os novos valores dos tempos de criação, modificação e acesso
		System.out.println("Creationtime: " + creationTime);
		System.out.println("lastModifiedTime: " + lastModifiedTime);
		System.out.println("lastAccessTime: " + lastAccessTime);
	}
}

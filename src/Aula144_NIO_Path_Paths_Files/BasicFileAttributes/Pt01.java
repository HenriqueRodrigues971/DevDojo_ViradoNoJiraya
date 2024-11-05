package Aula144_NIO_Path_Paths_Files.BasicFileAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Este código demonstra o uso de manipulação de atributos de arquivos, como
 * data de criação e modificação, utilizando as classes File e Files do pacote
 * java.nio. O programa também verifica permissões de leitura, escrita e
 * execução de arquivos.
 */
public class Pt01 {
	public static void main(String[] args) throws IOException {
		// BasicFileAttributes, DosFileAttributes, PosixFileAttributes
		// Exemplo para lidar com atributos de arquivo em diferentes sistemas de
		// arquivos

		// Cria um objeto LocalDateTime representando a data/hora de 10 dias atrás
		LocalDateTime date = LocalDateTime.now().minusDays(10);

		// Cria um arquivo usando a classe File
		File file = new File("pasta/novo.txt");
		// Cria o arquivo "novo.txt" dentro da pasta especificada, se ele não existir
		boolean isCreated = file.createNewFile();
		// Define a data/hora de última modificação do arquivo para 10 dias atrás
		boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

		// Cria um Path para o arquivo "novo_path.txt"
		Path path = Paths.get("pasta/novo_path.txt");
		if (!Files.exists(path)) {
			// Cria o arquivo "novo_path.txt" dentro da pasta especificada
			Files.createFile(path);
		}
		// Converte o LocalDateTime para FileTime (necessário para manipular atributos
		// de arquivo)
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		// Define a data/hora de última modificação do arquivo para 10 dias atrás
		Files.setLastModifiedTime(path, fileTime);

		// Verifica e imprime se o arquivo é gravável
		System.out.println(Files.isWritable(path));
		// Verifica e imprime se o arquivo é legível
		System.out.println(Files.isReadable(path));
		// Verifica e imprime se o arquivo é gravável (repetido, mas serve para reforçar
		// a verificação)
		System.out.println(Files.isWritable(path));
		// Verifica e imprime se o arquivo é executável
		System.out.println(Files.isExecutable(path));
	}
}

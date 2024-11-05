package Aula144_NIO_Path_Paths_Files.PosixFileAtrributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		// Definindo o caminho do arquivo ou diretório a ser verificado
		Path path = Paths.get("arquivo.txt"); // Substitua pelo caminho real do arquivo

		try {
			// Obtendo os atributos POSIX do arquivo especificado
			PosixFileAttributes posixAttributes = Files.readAttributes(path, PosixFileAttributes.class);

			// Exibindo informações gerais do arquivo
			System.out.println("Proprietário: " + posixAttributes.owner().getName()); // Mostra o nome do proprietário
																						// do arquivo
			System.out.println("Grupo: " + posixAttributes.group().getName()); // Mostra o grupo do arquivo
			System.out.println("Tamanho do arquivo: " + posixAttributes.size() + " bytes"); // Exibe o tamanho do
																							// arquivo

			// Exibindo permissões do arquivo
			Set<PosixFilePermission> permissions = posixAttributes.permissions();
			System.out.println("Permissões: " + PosixFilePermissions.toString(permissions)); // Converte as permissões
																								// para uma string
																								// legível (ex:
																								// rwxr-xr-x)

			// Verificando se o arquivo é um diretório
			if (posixAttributes.isDirectory()) {
				System.out.println("Este é um diretório.");
			} else {
				System.out.println("Este é um arquivo.");
			}

			// Exibindo os carimbos de tempo do arquivo
			System.out.println("Data de criação: " + posixAttributes.creationTime()); // Exibe a data de criação do
																						// arquivo
			System.out.println("Última modificação: " + posixAttributes.lastModifiedTime()); // Exibe a data da última
																								// modificação
			System.out.println("Último acesso: " + posixAttributes.lastAccessTime()); // Exibe a data do último acesso
																						// ao arquivo

		} catch (IOException e) {
			// Caso haja uma exceção ao tentar acessar os atributos do arquivo, o erro será
			// tratado aqui
			System.out.println("Erro ao ler os atributos POSIX: " + e.getMessage());
		}
	}
}

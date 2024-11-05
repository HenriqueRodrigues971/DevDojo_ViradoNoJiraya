package Aula144_NIO_Path_Paths_Files.ZipOutPuStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class pt01 {
	public static void main(String[] args) {
		// Define o caminho do arquivo ZIP que será criado
		Path arquivoZip = Paths.get("pasta/arquivo.zip");
		// Define o caminho do diretório que contém os arquivos a serem compactados
		Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
		// Chama o método Zip para criar o arquivo ZIP com os arquivos do diretório
		// especificado
		Zip(arquivoZip, arquivosParaZipar);
	}

	private static void Zip(Path arquivoZip, Path arquivosParaZipar) {
		// Tenta criar um ZipOutputStream para o arquivo ZIP e um DirectoryStream para o
		// diretório de origem
		try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

			// Itera sobre cada arquivo no diretório especificado
			for (Path file : directoryStream) {
				// Cria uma nova entrada no ZIP para cada arquivo
				ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
				// Adiciona a entrada ao ZipOutputStream
				zipStream.putNextEntry(zipEntry);
				// Copia o conteúdo do arquivo para a entrada do ZIP
				Files.copy(file, zipStream);
				// Fecha a entrada no ZIP, permitindo a adição de novas entradas
				zipStream.closeEntry();
			}
		} catch (IOException e) {
			// Trata exceções que podem ocorrer durante a criação do ZIP ou a leitura dos
			// arquivos
			e.printStackTrace();
		}
	}
}

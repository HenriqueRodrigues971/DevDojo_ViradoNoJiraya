package Aula138_IO.pt_01_file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTeste01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try {
			file.createNewFile();// cria um arquivo
			System.out.println("file is exist: " + file.exists());
			System.out.println("path: " + file.getPath()); // retorna o nome do arquivo
			System.out.println("path absolute: " + file.getAbsolutePath());
			System.out.println("is derectory: " + file.isDirectory()); // verifica se é um diretorio
			System.out.println("is file: " + file.isFile()); // verifica se é um arquivo
			System.out.println("is hidden: " + file.isHidden());// verifica se o arquivo é oculto
			System.out.println("last modify by date: " + new Date(file.lastModified()));
			System.out.println("last modify by instant: "
					+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());

			if (file.exists()) { // verifica se ja existe um arquivo
				file.delete(); // deleta o arquivo
				System.out.println("file is exist: " + file.exists());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

package Aula144_NIO_Path_Paths_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
	public static void main(String[] args) throws Exception {
		Path pastaPath = Paths.get("arquivo2"); /* pegando um diretorio */

		if (Files.notExists(pastaPath)) {/*Verifico se  o diretorio existe*/
			Path pastaDirectory = Files.createDirectory(pastaPath);//crio caso não exista
		}
		
		Path subPastaPath = Paths.get("arquivo2/sub/sub2"); /*pegamos subpasta dentro de um diretorio*/
		Files.createDirectories(subPastaPath); //criamos
	
	    /*Criando um arquivo*/
		Path filePath = Paths.get(subPastaPath.toString(),"file.txt");
		Files.createFile(filePath);
	}
}

package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
	public static void main(String[] args) {
		/*usaremos essa interface para consultar um Path(arquivo)*/
    Path p1 = Paths.get("file.txt");
    
    System.out.println(p1.getFileName());/*Pegando o nome do arquivo*/
	}
}

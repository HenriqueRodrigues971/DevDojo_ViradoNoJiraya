package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
	public static void main(String[] args) {
		/* Usaremos a classe Paths para criar um Path que representa o arquivo */
		Path p1 = Paths.get("/home/henrique/eclipse-workspace/DevDojo_ViradoNoJiraya/file.txt");

		System.out.println(p1.getFileName()); /* Obtendo o nome do arquivo */
		System.out.println(p1.getFileName().toFile()); /* Convertendo o Path para um objeto File */
		System.out.println(p1.getFileName().toFile().toPath()); /* Convertendo o File de volta para um Path */
	}
}

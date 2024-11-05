package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Este código demonstra o uso do método relativize() da classe Path. O método
 * relativize() calcula o caminho relativo entre dois paths. Isso é útil para
 * calcular a diferença entre dois caminhos, permitindo navegar de um para o
 * outro.
 */
public class RelativeTest01 {
	public static void main(String[] args) {
		// Cria um path absoluto para o diretório "/home/henri"
		Path dir = Paths.get("/home/henri");
		// Cria um path absoluto para o arquivo "OlaMundo.java" no diretório
		// "devdojofoda"
		Path clazz = Paths.get("/home/henri/devdojofoda/OlaMundo.java");
		// Calcula o caminho relativo de 'dir' até 'clazz'
		Path pathToClazz = dir.relativize(clazz);
		// Imprime o caminho relativo: "devdojofoda/OlaMundo.java"
		System.out.println(pathToClazz);

		// Cria vários paths absolutos e relativos para teste
		Path absoluto1 = Paths.get("/home/henri"); // Path absoluto
		Path absoluto2 = Paths.get("/usr/local"); // Outro path absoluto
		Path absoluto3 = Paths.get("/home/henri/devdojofoda/OlaMundo.java"); // Path absoluto para um arquivo
		Path relativo1 = Paths.get("temp"); // Path relativo para um diretório
		Path relativo2 = Paths.get("temp/temp.2021921"); // Path relativo para um arquivo dentro de "temp"

		// Exemplo 1: absoluto1.relativize(absoluto3)
		// Calcula o caminho relativo de '/home/henri' até
		// '/home/henri/devdojofoda/OlaMundo.java'
		// Resultado: "devdojofoda/OlaMundo.java"
		System.out.println("1 " + absoluto1.relativize(absoluto3));

		// Exemplo 2: absoluto3.relativize(absoluto1)
		// Calcula o caminho relativo de '/home/henri/devdojofoda/OlaMundo.java' até
		// '/home/henri'
		// Isso resultará em um caminho que sobe um nível no diretório
		// Resultado: "../.."
		System.out.println("2 " + absoluto3.relativize(absoluto1));

		// Exemplo 3: absoluto3.relativize(absoluto2)
		// Calcula o caminho relativo de '/home/henri/devdojofoda/OlaMundo.java' até
		// '/usr/local'
		// O resultado será um caminho que sobe até a raiz do sistema e depois desce até
		// 'usr/local'
		// Resultado: "../../../usr/local"
		System.out.println("3 " + absoluto3.relativize(absoluto2));

		// Exemplo 4: relativo1.relativize(relativo2)
		// Calcula o caminho relativo entre dois paths relativos
		// Resultado: "temp.2021921"
		System.out.println("4 " + relativo1.relativize(relativo2));

		// Exemplo 5: absoluto1.relativize(relativo1)
		// Isso causará uma exceção (IllegalArgumentException), porque não é possível
		// relativizar
		// um path absoluto com um relativo. Ambos devem ser ou absolutos ou relativos.
		System.out.println("5 " + absoluto1.relativize(relativo1)); // Exceção: IllegalArgumentException
	}
}

package Aula144_NIO_Path_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Este código demonstra o uso do método resolve() da classe Path para resolver
 * caminhos em Java. O método resolve() combina dois paths, onde o segundo path
 * é resolvido em relação ao primeiro. Dependendo se o segundo path é absoluto
 * ou relativo, o resultado pode variar.
 */
public class ResolveTest01 {
	public static void main(String[] args) {
		// Cria um Path relativo para o diretório "home/henri"
		Path diretorio = Paths.get("home/henri");
		// Cria um Path relativo para o arquivo "dv/arquivo.txt"
		Path arquivo = Paths.get("dv/arquivo.txt");
		// Resolve o path do arquivo em relação ao diretório
		Path resolve = diretorio.resolve(arquivo);
		// Imprime o path resultante: "home/henri/dv/arquivo.txt"
		System.out.println(resolve);

		// Cria um Path absoluto para o diretório "/home/henri"
		Path absoluto = Paths.get("/home/henri");
		// Cria um Path relativo para o diretório "dev"
		Path relativo = Paths.get("dev");
		// Cria um Path relativo para o arquivo "file.txt"
		Path file = Paths.get("file.txt");

		// Exemplo 1: absoluto.resolve(relativo)
		// Como 'relativo' é um path relativo, ele é anexado ao 'absoluto'
		// Resultado: "/home/henri/dev"
		System.out.println("1 " + absoluto.resolve(relativo));

		// Exemplo 2: absoluto.resolve(file)
		// Anexa 'file.txt' ao path absoluto
		// Resultado: "/home/henri/file.txt"
		System.out.println("2 " + absoluto.resolve(file));

		// Exemplo 3: relativo.resolve(absoluto)
		// Como 'absoluto' é um path absoluto, o resultado será 'absoluto'
		// Se o path a ser resolvido é absoluto, ele substitui o path base
		// Resultado: "/home/henri"
		System.out.println("3 " + relativo.resolve(absoluto));

		// Exemplo 4: relativo.resolve(file)
		// Anexa 'file.txt' ao path relativo 'dev'
		// Resultado: "dev/file.txt"
		System.out.println("4 " + relativo.resolve(file));

		// Exemplo 5: file.resolve(absoluto)
		// Como 'absoluto' é um path absoluto, o resultado será 'absoluto'
		// Resultado: "/home/henri"
		System.out.println("5 " + file.resolve(absoluto));

		// Exemplo 6: file.resolve(relativo)
		// Anexa 'dev' ao path 'file.txt', resultando em "file.txt/dev"
		// Isso mostra que o primeiro path é tratado como diretório
		System.out.println("6 " + file.resolve(relativo));
	}
}

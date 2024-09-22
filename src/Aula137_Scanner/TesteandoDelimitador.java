package Aula137_Scanner;

import java.util.Scanner;

public class TesteandoDelimitador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva palavras as separando por virgula e add virgula depois da ultima palavra ");
		sc.useDelimiter(",");

		while (sc.hasNext()) {
			String palavras = sc.next().trim();
			if (!palavras.isEmpty()) {
				System.out.println(palavras);
			}
		}
		sc.close();
	}
}

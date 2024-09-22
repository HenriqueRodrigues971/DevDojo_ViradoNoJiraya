package Aula131_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

	public static void main(String[] args) {
		// String regex = "ab";
		String regex2 = "aba";
		// String texto = "abaaba";
		String texto2 = "abababa";
		Pattern pattern = Pattern.compile(regex2);
		// Matcher matcher = pattern.matcher(texto);
		Matcher matcher2 = pattern.matcher(texto2);
		// System.out.println("Texto: " + texto);
		System.out.println("Texto:  " + texto2);
		System.out.println("indice: 0123456789");
		System.out.println("Regex: " + regex2);
		System.out.println("Posições encontradas");
		/*
		 * while (matcher.find()) { System.out.print(matcher.start() + "");
		 * System.out.println(); }
		 */
		while (matcher2.find()) {
			System.out.print(matcher2.start() + "");
		}
	}

}

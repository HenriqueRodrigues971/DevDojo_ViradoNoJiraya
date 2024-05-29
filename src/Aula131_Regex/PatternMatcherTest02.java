package Aula131_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

	public static void main(String[] args) {
		// \d = Todos os digitos
		// \D = Tudo que não for digito
		// \s = Espaços em branco /t /n /f /r
		// \S = todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, digito, _
		// \W = tudo que não for incluso no \w
		String regex = "\\W";
		//String texto = "abaaba";
		String texto = "@#hhj2_ 12gvh21";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		//System.out.println("Texto:  " + texto);
		System.out.println("Texto:  " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("Regex: " + regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.print("Posição :"+matcher.start()+ " caracter:" + matcher.group()+"\n");
		}
	}

}

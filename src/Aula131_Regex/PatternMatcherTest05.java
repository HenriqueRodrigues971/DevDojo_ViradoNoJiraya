package Aula131_Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

	public static void main(String[] args) {
		// \d = Todos os digitos
		// \D = Tudo que não for digito
		// \s = Espaços em branco /t /n /f /r
		// \S = todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, digito, _
		// \W = tudo que não for incluso no \w
		//[]
		// ? zero ou uma
		// *0 ou mais
		// + = uma ou mais
		//{n,m} = de n até m
		//() = agrupamento
		// | = Ou
		// $ = fim da linha
		//String regex = "[a-zA-C]";
		// . 1.3 = 123,133,1A3,1@3
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		//String texto = "abaaba";
		//String texto = "cafeBABE";
		String texto = "Luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail";
		System.out.println("Email valido!");
		System.out.println("zoro@gmail.br".matches(regex));
		System.out.println(Arrays.toString(texto.split(",")));
		System.out.println(texto.split(",")[1].trim());
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

package Aula131_Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

	public static void main(String[] args) {
		// Definição de expressões regulares comuns:
		// \d = Todos os dígitos (0-9)
		// \D = Tudo que não for dígito
		// \s = Espaços em branco (incluindo \t, \n, \f, \r)
		// \S = Todos os caracteres, exceto espaços em branco
		// \w = a-z, A-Z, dígitos e _
		// \W = Tudo que não for incluído em \w
		// [] = Classe de caracteres
		// ? = Zero ou uma ocorrência
		// * = Zero ou mais ocorrências
		// + = Uma ou mais ocorrências
		// {n,m} = De 'n' até 'm' ocorrências
		// () = Agrupamento de padrões
		// | = Operador "ou" (alternativa)
		// $ = Fim da linha

		// Expressão regular para correspondência de e-mails
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

		// Texto contendo múltiplos e-mails (alguns válidos e outros inválidos)
		String texto = "Luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail";

		// Verifica se um e-mail específico corresponde ao padrão regex (válido ou
		// inválido)
		System.out.println("Email válido!");
		System.out.println("zoro@gmail.br".matches(regex)); // Verifica se esse e-mail é válido segundo o regex

		// Imprime a lista de e-mails dividida pela vírgula
		System.out.println(Arrays.toString(texto.split(",")));
		
		// Remove os espaços em branco do segundo e-mail na lista
		System.out.println(texto.split(",")[1].trim());

		// Compilando o padrão (regex)
		Pattern pattern = Pattern.compile(regex);

		// Matcher é usado para verificar a correspondência com o texto
		Matcher matcher = pattern.matcher(texto);

		// Imprime o texto original e detalhes para ajudar no rastreamento das posições
		System.out.println("Texto: " + texto);
		System.out.println("Índice: 0123456789"); // Apenas para visualizar as posições dos caracteres
		System.out.println("Regex: " + regex); // Mostra a expressão regular usada
		System.out.println("Posições encontradas:");

		// Loop para encontrar e-mails que correspondam ao regex
		while (matcher.find()) {
			// Imprime a posição inicial e o e-mail correspondente encontrado
			System.out.print("Posição: " + matcher.start() + " caractere: " + matcher.group() + "\n");
		}
	}
}

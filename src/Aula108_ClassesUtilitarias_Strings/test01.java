package Aula108_ClassesUtilitarias_Strings;
/*
A classe utilitária String em Java fornece métodos para manipular cadeias de caracteres (strings). Ela é uma das classes mais usadas em Java devido à sua versatilidade e às muitas operações que oferece para trabalhar com texto. Abaixo, vamos explorar brevemente por que usar a classe String e, em seguida, fornecer exemplos de seu uso ao longo do código.

Por que usar a classe String:
- A classe String oferece uma ampla gama de métodos para manipular strings, como concatenação, comparação, substituição, busca, extração de substrings, entre outros.
- É imutável, o que significa que uma vez que uma string é criada, ela não pode ser modificada. Isso garante a segurança e a integridade dos dados.
- A imutabilidade das strings torna-as seguras para compartilhamento entre threads em programas concorrentes.
- Strings em Java são objetos, o que permite que você use métodos da classe String para manipular texto de maneira eficiente e eficaz.

Aqui estão alguns exemplos de operações comuns usando a classe String:
*/

public class test01 {
	public static void main(String[] args) {
		// Exemplo de criação de strings
		String texto = "Olá, mundo!";

		// Exemplo de concatenação de strings
		String saudacao = "Olá, ";
		String nome = "Alice";
		String mensagem = saudacao + nome;

		// Exemplo de comparação de strings
		String str1 = "hello";
		String str2 = "world";
		boolean saoIguais = str1.equals(str2); // false

		// Exemplo de conversão de string para maiúsculas
		String textoMinusculo = "java";
		String textoMaiusculo = textoMinusculo.toUpperCase(); // "JAVA"

		// Exemplo de busca de substring
		String frase = "Aprender Java é divertido!";
		String subFrase = frase.substring(9, 12); // "Java"
		System.out.println(subFrase);
		
		// Exemplo de substituição de caracteres
		String textoOriginal = "Hello, world!";
		String novoTexto = textoOriginal.replace('l', 'z'); // "Hezzo, worzd!"

		// Exemplo de quebra de string em tokens usando split
		String frase2 = "Hoje é um belo dia ensolarado";
		String[] palavras = frase2.split(" "); // ["Hoje", "é", "um", "belo", "dia", "ensolarado"]

		// Exemplo de formatação de strings
		String nomeFormatado = String.format("Nome: %s, Idade: %d", "Alice", 30); // "Nome: Alice, Idade: 30"

		// Exemplo de comparação ignorando maiúsculas/minúsculas
		String str3 = "Hello";
		String str4 = "hello";
		boolean saoIguaisIgnoringCase = str3.equalsIgnoreCase(str4); // true
	}
}

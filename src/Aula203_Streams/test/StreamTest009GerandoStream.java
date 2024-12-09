package Aula203_Streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest009GerandoStream {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
		System.out.println();

		IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
		System.out.println();

		/* Gerando stream a partir de uma lista */
		Stream.of("Faça", " elevar", " o cosmo").map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
		System.out.println();

		int[] num = { 1, 2, 3, 4, 5 };
		Arrays.stream(num).forEach(s -> System.out.print(s + " "));
		System.out.println();

		/* Pegando a media */
		Arrays.stream(num).average().ifPresent(System.out::println);
		;

		/* Emprimindo texto de um arquivo com uma Stream */
		try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
			// lines.forEach(System.out::println);
			lines.filter(l -> l.contains("Java")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

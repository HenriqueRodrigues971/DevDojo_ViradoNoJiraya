package Aula203_Streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest010GerandoStreamPt02 {
	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);

		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10)
				.forEach(a -> System.out.println(Arrays.toString(a)));

		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10).map(a -> a[0])
				.forEach(System.out::println);

		/* Gerando um numero aleatorio */
		ThreadLocalRandom random = ThreadLocalRandom.current();
		Stream.generate(() -> random.nextInt(1, 500)).limit(5).forEach(System.out::println);

	}
}
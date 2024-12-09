package Aula203_Streams.test;

import java.util.List;

public class StreamTest007Reduce {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
		/* Esse metodo retorna um optional pois não se vi ser passado algum valor */
		integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
		/* retorna um valor integer pois mesmo sem nada passado ja temos o padrão 0 */
		System.out.println(integers.stream().reduce(0, (x, y) -> x + y));

		integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
		System.out.println(integers.stream().reduce(0, Integer::sum));

		integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
		System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

		/* Como pegar o maior valor */
		integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
		System.out.println(integers.stream().reduce(Integer::max));
	}
}

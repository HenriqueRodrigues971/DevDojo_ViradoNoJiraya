package Aula195_Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
	public static void main(String[] args) {
		List<String> strings = List.of("Paulo", "Henrique", "Rodrigues");
		List<Integer> integers = List.of(24, 05, 2004);
		printList(strings, s -> System.out.println(s));
		printList(integers, i -> System.out.println(i));
	}

	private static <T> void printList(List<T> list, Consumer<T> consumer) {
		for (T e : list) {
			consumer.accept(e);
		}
	}
}

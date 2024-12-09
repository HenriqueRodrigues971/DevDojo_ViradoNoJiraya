package Aula195_Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
	public static void main(String[] args) {
		List<String> strings = List.of("Natsu", "Allucard");

		List<String> strings2 = map(strings, (String s) -> s.toUpperCase());
		List<String> strings3 = map(strings, String::toUpperCase);
		List<Integer> integers = map(strings, s -> s.length());

		System.out.println(integers);
		System.out.println(strings2);
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> resultado = new ArrayList<>();
		for (T e : list) {
			R apply = function.apply(e);
			resultado.add(apply);
		}
		return resultado;
	}
}

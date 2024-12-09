package Aula195_Lambdas.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdasReferenceTest03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
		list.sort(String::compareTo);
		System.out.println(list);

		/* Convertendo um String e int usando lambdas */
		Function<String, Integer> numStringToInteger = Integer::parseInt;
		System.out.println(numStringToInteger.apply("10"));

		/*
		 * Esse metodo predicate faz um teste e retornar u, boolean, no casso testa se
		 * existe na lista
		 */

		BiPredicate<List<String>, String> checkName = List::contains;
		System.out.println(checkName.test(list, "Rimuru"));
	}
}

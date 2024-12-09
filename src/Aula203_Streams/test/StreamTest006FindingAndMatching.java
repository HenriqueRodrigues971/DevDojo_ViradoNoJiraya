package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Aula203_Streams.dominio.LightNovel;

public class StreamTest006FindingAndMatching {
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 10.99),
					new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game no Life", 2.99),
					new LightNovel("FullMetal Alchemist", 5.99), new LightNovel("Kumo Desuga", 1.99),
					new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.00)));

	public static void main(String[] args) {
		System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
		System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
		System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
		/*
		 * Esse nos retorna qualquer elemento de dentro da list que esta de acordo com o
		 * filter
		 */
		lightNovels.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);

		/*
		 * Esse retorna o primeiro que for true de acordo com o filter(esta em ordem
		 * reversa)
		 */
		lightNovels.stream().filter(ln -> ln.getPrice() > 3)
				.sorted(Comparator.comparing(LightNovel::getPrice).reversed()).findFirst()
				.ifPresent(System.out::println);

		/* Retorna o com o maior valor */
		lightNovels.stream().filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice))
				.ifPresent(System.out::println);
	}
}

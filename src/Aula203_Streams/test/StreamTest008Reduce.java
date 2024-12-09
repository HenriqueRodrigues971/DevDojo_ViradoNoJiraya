package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.List;

import Aula203_Streams.dominio.LightNovel;

public class StreamTest008Reduce {
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 10.99),
					new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game no Life", 2.99),
					new LightNovel("FullMetal Alchemist", 5.99), new LightNovel("Kumo Desuga", 1.99),
					new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.00)));

	public static void main(String[] args) {
		/* Somando todos os light novels com preços a cima de três reais */
		lightNovels.stream().map(LightNovel::getPrice).filter(price -> price > 3).reduce(Double::sum)
				.ifPresent(System.out::println);

		double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice).filter(price -> price > 3).sum();
		System.out.println(sum);
	}
}

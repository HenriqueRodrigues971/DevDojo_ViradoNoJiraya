package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import Aula203_Streams.dominio.LightNovel;

public class StreamTest011Summarizing {
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 10.99),
					new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game no Life", 2.99),
					new LightNovel("FullMetal Alchemist", 5.99), new LightNovel("Kumo Desuga", 1.99),
					new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.00)));

	public static void main(String[] args) {
		/* Quantidade de light novels cadastradas */
		System.out.println(lightNovels.stream().count());
		System.out.println(lightNovels.stream().collect(Collectors.counting()));

		/* Pegando o mais caro */
		lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
				.ifPresent(System.out::println);

		/* Voltando a média de todos os valores */
		lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
		System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

		/* Puxando o sumario que é a junção de todas as funções anteriores */
		DoubleSummaryStatistics collect = lightNovels.stream()
				.collect(Collectors.summarizingDouble(LightNovel::getPrice));
		System.out.println(collect);

		/* Separa todos os titulos de LightNovel por virgula */
		String string = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
		System.out.println(string);
	}
}

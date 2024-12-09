package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import Aula203_Streams.dominio.Category;
import Aula203_Streams.dominio.LightNovel;

public class StreamTest014GroupingByPt03 {
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
					new LightNovel("Overlord", 10.99, Category.FANTASY),
					new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
					new LightNovel("No Game no Life", 2.99, Category.FANTASY),
					new LightNovel("FullMetal Alchemist", 5.99, Category.FANTASY),
					new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
					new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
					new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

	public static void main(String[] args) {
		/* Conferindo quanto tem de cada categoria */
		Map<Category, Long> collect = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
		System.out.println(collect);

		/* Pega o mais caro de cada categoria */
		Map<Category, Optional<LightNovel>> collect2 = lightNovels.stream().collect(Collectors
				.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
		System.out.println(collect2);

		/*
		 * Coleta o mais caro de cada categoria e, em seguida, retorna o valor do
		 * Optional diretamente usando a função Optional::get.
		 */
		Map<Category, LightNovel> collect3 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
		System.out.println(collect3);

		/*
		 * Usa Collectors.toMap para construir um mapa onde a chave é a categoria e o
		 * valor é o LightNovel mais caro. Caso haja duplicatas para a mesma chave
		 * (categoria), resolve o conflito usando BinaryOperator.maxBy para manter o
		 * mais caro.
		 */
		Map<Category, LightNovel> collect4 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory,
				Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
		System.out.println(collect4);
	}
}

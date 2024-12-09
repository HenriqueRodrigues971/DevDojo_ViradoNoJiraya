package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import Aula203_Streams.dominio.Category;
import Aula203_Streams.dominio.LightNovel;
import Aula203_Streams.dominio.Promotion;

public class StreamTest015GroupingByPt5 {
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
		/* Pegando um sumario usando o GroupingBy */
		Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(
				Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
		System.out.println(collect);

		/*
		 * Pegando o grupo das categoria e retornando um set dizendo quais tipos de
		 * Promoção tem
		 */
		Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
								Collectors.toSet())));/* toList */
		System.out.println(collect2);

		Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
								Collectors.toCollection(LinkedHashSet::new))));
		System.out.println(collect3);
	}
}

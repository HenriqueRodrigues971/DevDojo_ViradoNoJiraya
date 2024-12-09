package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Aula203_Streams.dominio.Category;
import Aula203_Streams.dominio.LightNovel;
import Aula203_Streams.dominio.Promotion;

public class StreamTest013GroupingByPt02 {
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
		/* Colecanto um grupo e organizando por preço normal e promocional */
		Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(
				Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
		System.out.println(collect);

		/**/
		Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(
				LightNovel::getCategory,
				Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
		System.out.println(collect2);
	}
}
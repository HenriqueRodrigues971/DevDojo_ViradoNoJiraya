package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Aula203_Streams.dominio.LightNovel;

public class StreamTest003 {
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game no Life", 2.99),
					new LightNovel("FullMetal Alchemist", 5.99), new LightNovel("Kumo Desuga", 1.99),
					new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.00)));

	public static void main(String[] args) {
		Stream<LightNovel> stream = lightNovels.stream();
		lightNovels.stream().forEach(System.out::println);

		long count = stream.filter(ln -> ln.getPrice() <= 4).count();
		long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
		System.out.println(count);
		System.out.println(count2);

	}
}

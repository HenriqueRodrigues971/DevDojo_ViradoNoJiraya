package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Aula203_Streams.dominio.LightNovel;

public class StreamTest001 {
	private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99),
			new LightNovel("Overlord", 3.99), new LightNovel("Violet Evergarden", 5.99),
			new LightNovel("No Game no Life", 2.99), new LightNovel("FullMetal Alchemist", 5.99),
			new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.00)));

	public static void main(String[] args) {
		lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
		List<String> title = new ArrayList<>();

		for (LightNovel lightNovel : lightNovels) {
			if (lightNovel.getPrice() <= 4) {
				title.add(lightNovel.getTitle());
			}
			if (title.size() >= 3) {
				break;
			}
		}

		System.out.println(lightNovels);
		System.out.println(title);
	}
}

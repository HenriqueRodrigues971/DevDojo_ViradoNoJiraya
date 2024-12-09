package Aula195_Lambdas.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Aula195_Lambdas.dominio.Anime;
import Aula195_Lambdas.service.AnimeComparators;

public class LambdasReferenceTest02 {
	public static void main(String[] args) {
		AnimeComparators animeComparators = new AnimeComparators();

		List<Anime> animeList = new ArrayList<>(
				List.of(new Anime("Berseker", 23), new Anime("Death Note", 37), new Anime("Naruto", 500)));

		//animeList.sort(animeComparators::compareByTitleNonStatic);
		animeList.sort((a1, a2) -> animeComparators.compareByTitleNonStatic(a1, a2));
		System.out.println(animeList);
	}
}

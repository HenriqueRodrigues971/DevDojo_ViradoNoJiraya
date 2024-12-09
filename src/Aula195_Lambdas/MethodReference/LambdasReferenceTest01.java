package Aula195_Lambdas.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Aula195_Lambdas.dominio.Anime;
import Aula195_Lambdas.service.AnimeComparators;

public class LambdasReferenceTest01 {
	public static void main(String[] args) {
		List<Anime> animeList = new ArrayList<>(
				List.of(new Anime("Berseker", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
		// Collections.sort(animeList, (a1, a2) ->
		// a1.getTitle().compareTo(a2.getTitle()));
		//Collections.sort(animeList, AnimeComparators::compareByTitle);
		Collections.sort(animeList, AnimeComparators::compareByEpisode);
		System.out.println(animeList);
	}
}

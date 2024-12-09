package Aula195_Lambdas.service;

import Aula195_Lambdas.dominio.Anime;

public class AnimeComparators {
	public static int compareByTitle(Anime a1, Anime a2) {
		return a1.getTitle().compareTo(a2.getTitle());
	}
	public  int compareByTitleNonStatic(Anime a1, Anime a2) {
		return a1.getTitle().compareTo(a2.getTitle());
	}

	public static int compareByEpisode(Anime a1, Anime a2) {
		return Integer.compare(a1.getepisodes(), a2.getepisodes());
	}
}

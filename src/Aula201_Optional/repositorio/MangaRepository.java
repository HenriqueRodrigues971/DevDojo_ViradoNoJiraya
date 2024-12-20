package Aula201_Optional.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import Aula201_Optional.dominio.Manga;

public class MangaRepository {
	private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Overlord", 25));

	/*
	 * private static Optional<Manga> findByTitle(String title) { Manga found =
	 * null; for (Manga manga : mangas) { if (manga.getTitle().equals(title)) {
	 * 
	 * found = manga; } } return Optional.ofNullable(found); }
	 * 
	 * private static Optional<Manga> findById(Integer id) { Manga found = null; for
	 * (Manga manga : mangas) { if (manga.getId().equals(id)) { found = manga; } }
	 * return Optional.ofNullable(found); }
	 */

	public static Optional<Manga> findByTitle(String title) {
		return findBy(m -> m.getTitle().equals(title));
	}

	public static Optional<Manga> findById(Integer id) {
		return findBy(m -> m.getId().equals(id));
	}

	private static Optional<Manga> findBy(Predicate<Manga> predicate) {
		Manga found = null;
		for (Manga manga : mangas) {
			if (predicate.test(manga)) {
				found = manga;
			}
		}
		return Optional.ofNullable(found);
	}
}

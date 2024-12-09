package Aula201_Optional;

import java.util.Optional;

import Aula201_Optional.dominio.Manga;
import Aula201_Optional.repositorio.MangaRepository;

public class OptionalTest02 {
	public static void main(String[] args) {

		Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
		mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
		System.out.println(mangaByTitle);

		Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
		System.out.println(mangaById);

		Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga(3, "Drifters", 20));
		System.out.println(newManga);
	}
}

package Aula169_Collections.SortingLists.iterator;

import java.util.ArrayList;
import java.util.List;

import Aula169_Collections.SortingLists.dominio.Manga;

/*Usamos o Iterator para remover elementos de dentro de uma List*/
public class IteratorTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(5L, "Naruto", 17.99, 0));
		mangas.add(new Manga(4L, "Berseker", 22.50, 5));
		mangas.add(new Manga(6L, "Tokyo Ghoul", 15.00, 0));
		mangas.add(new Manga(1L, "Akame ga kill", 12.50, 2));
		mangas.add(new Manga(3L, "Mirai Nikki", 12.49, 10));
		mangas.add(new Manga(2L, "Platinium end", 20.50, 4));
		mangas.add(new Manga(7L, "Bungou stray dogs", 19.00, 2));

		/*
		 * Iterator<Manga> mangaIterator = mangas.iterator(); while
		 * (mangaIterator.hasNext()) { Manga manga = mangaIterator.next(); if
		 * (manga.getQuantidade() == 0) { mangaIterator.remove(); } }
		 */
		mangas.removeIf(manga -> manga.getQuantidade() == 0);
		System.out.println(mangas);
	}
}

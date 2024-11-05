package Aula169_Collections.SortingLists.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Aula169_Collections.SortingLists.dominio.Manga;

public class MangaSortTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(5L, "Naruto", 17.99));
		mangas.add(new Manga(4L, "Berseker", 22.50));
		mangas.add(new Manga(6L, "Tokyo Ghoul", 15.00));
		mangas.add(new Manga(1L, "Akame ga kill", 12.50));
		mangas.add(new Manga(3L, "Mirai Nikki", 12.49));
		mangas.add(new Manga(2L, "Platinium end", 20.50));
		mangas.add(new Manga(7L, "Bungou stray dogs", 19.00));

		for (Manga m : mangas) {
			System.out.println(m);
		}

		System.out.println("-----------");
		Collections.sort(mangas);
		for (Manga m : mangas) {
			System.out.println(m);
		}

	}
}

package Aula169_Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

import Aula169_Collections.SortingLists.dominio.Manga;

/*O set nos impede de ter elementos duplicados dentro dele*/
public class SetTest01 {
	public static void main(String[] args) {
 /*HashSet -> não mantem a ordem de inserção
  * LinkedHashSet -> mantém a ordem de inserção*/
		Set<Manga> mangas = new LinkedHashSet<>();
		mangas.add(new Manga(5L, "Naruto", 17.99, 0));
		mangas.add(new Manga(4L, "Berseker", 22.50, 5));
		mangas.add(new Manga(6L, "Tokyo Ghoul", 15.00, 0));
		mangas.add(new Manga(1L, "Akame ga kill", 12.50, 2));
		mangas.add(new Manga(3L, "Mirai Nikki", 12.49, 10));
		mangas.add(new Manga(2L, "Platinium end", 20.50, 4));
		mangas.add(new Manga(2L, "Platinium end", 20.50, 4));
		mangas.add(new Manga(7L, "Bungou stray dogs", 19.00, 2));

		for(Manga m : mangas) {
			System.out.println(m);
		}
	}
}

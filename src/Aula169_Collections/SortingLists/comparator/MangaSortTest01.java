package Aula169_Collections.SortingLists.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Aula169_Collections.SortingLists.dominio.Manga;

/*Utilizamos esse metodo quando já tivermos um petodo  de comparação na classe objeto 
 * e precisamos customizar ela pra imprimir de outro modo*/
class MangaByIdComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}

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

		System.out.println("------Usando o comaparable da classe Manga-----");
		Collections.sort(mangas);
		for (Manga m : mangas) {
			System.out.println(m);
		}

		System.out.println("-----Usando comparator definido nessa classe------");
		Collections.sort(mangas, new MangaByIdComparator());
		for (Manga m : mangas) {
			System.out.println(m);
		}

	}
}

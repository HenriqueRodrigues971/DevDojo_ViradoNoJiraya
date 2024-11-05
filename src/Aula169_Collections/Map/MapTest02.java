package Aula169_Collections.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Aula169_Collections.SortingLists.dominio.Consumidor;
import Aula169_Collections.SortingLists.dominio.Manga;

public class MapTest02 {
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Williand suane");
		Consumidor consumidor2 = new Consumidor("DevDojo Academy");

		Manga manga1 = new Manga(5L, "Naruto", 17.99, 0);
		Manga manga2 = new Manga(4L, "Berseker", 22.50, 5);
		Manga manga3 = new Manga(6L, "Tokyo Ghoul", 15.00, 0);
		Manga manga4 = new Manga(1L, "Akame ga kill", 12.50, 2);
		Manga manga5 = new Manga(3L, "Mirai Nikki", 7.55, 10);

		List<Manga> mangaCosumidorList1 = List.of(manga1, manga2, manga3);
		List<Manga> mangaCosumidorList2 = List.of(manga4, manga5, manga1);
		Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
		consumidorManga.put(consumidor1, mangaCosumidorList1);
		consumidorManga.put(consumidor2, mangaCosumidorList2);

		for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
			System.out.println("---Historico de pedidos---");
			System.out.println(entry.getKey().getNome());
			for (Manga manga : entry.getValue()) {
				System.out.println("-" + manga.getNome());
			}
		}
	}
}

package Aula169_Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import Aula169_Collections.SortingLists.dominio.Manga;

class MangaPrecoComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}

public class QueueTeste02 {
	public static void main(String[] args) {
		Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

		mangas.add(new Manga(5L, "Naruto", 17.99));
		mangas.add(new Manga(4L, "Berseker", 22.50));
		mangas.add(new Manga(6L, "Tokyo Ghoul", 15.00));
		mangas.add(new Manga(1L, "Akame ga kill", 12.50));
		mangas.add(new Manga(3L, "Mirai Nikki", 12.49));
		mangas.add(new Manga(2L, "Platinium end", 20.50));
		mangas.add(new Manga(7L, "Bungou stray dogs", 19.00));
		
		System.out.println(mangas.peek());//Retorna o elemento que esta no topo da fila
		System.out.println("-----");
		while (!mangas.isEmpty()) {//estamos percorrendo a fila caso ela não esteja vazia
			System.out.println(mangas.poll());//remove o item que esta atualmente no topo da fila
		}
		
	}
}

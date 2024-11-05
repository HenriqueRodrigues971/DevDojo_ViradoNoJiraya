package Aula169_Collections.Set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import Aula169_Collections.SortingLists.dominio.Manga;
import Aula169_Collections.SortingLists.dominio.Smarthphone;

/*
 * Utilizamos o TreeSet quando a classe que estamos passando utiliza Comparable.
 * 
 * O NavigableSet é uma interface que estende a interface Set e fornece métodos
 * adicionais para lidar com operações de navegação em uma coleção ordenada. A
 * principal implementação de NavigableSet é o TreeSet, que mantém os elementos
 * em uma ordem natural ou de acordo com um comparador fornecido.
 * 
 * Entre as vantagens do NavigableSet estão: 1. **Navegação Direcionada**:
 * Permite acessar os elementos de forma ascendente ou descendente. Por exemplo,
 * você pode obter o menor ou o maior elemento facilmente. 2. **Subconjuntos**:
 * Possui métodos que retornam subconjuntos da coleção, como `subSet()`,
 * `headSet()`, e `tailSet()`, permitindo uma manipulação mais refinada dos
 * dados. 3. **Operações de Cópia**: Métodos como `lower()`, `floor()`,
 * `ceiling()` e `higher()` permitem localizar elementos específicos em relação
 * a um valor fornecido.
 * 
 * O uso do NavigableSet é ideal quando se necessita de uma coleção que não
 * apenas armazena elementos em ordem, mas também facilita operações que exigem
 * uma navegação eficiente por esses elementos.
 */
class SmathPhoneMarcaComparator implements Comparator<Smarthphone> {

	@Override
	public int compare(Smarthphone o1, Smarthphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}

class MangaPrecoComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}

public class NavigableSetTest01 {
	public static void main(String[] args) {
		NavigableSet<Smarthphone> set = new TreeSet<>(new SmathPhoneMarcaComparator());
		Smarthphone smathphone = new Smarthphone("123", "Nokia");
		set.add(smathphone);

		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
		mangas.add(new Manga(5L, "Naruto", 17.99, 0));
		mangas.add(new Manga(4L, "Berseker", 22.50, 5));
		mangas.add(new Manga(6L, "Tokyo Ghoul", 15.00, 0));
		mangas.add(new Manga(1L, "Akame ga kill", 12.50, 2));
		mangas.add(new Manga(3L, "Mirai Nikki", 7.55, 10));
		mangas.add(new Manga(2L, "Platinium end", 20.50, 4));
		mangas.add(new Manga(7L, "Bungou stray dogs", 19.00, 2));
		mangas.add(new Manga(7L, "Moriarty", 8, 2));
		/*
		 * se usamor o metodo .descendingSet que ordenar a nossa lista em ordem
		 * descrecente
		 */
		for (Manga m : mangas.descendingSet()) {
			System.out.println(m);
		}

		/*
		 * Metodos de comparação lower < floor <= higher > ceiling >=
		 */
		System.out.println("-------");
		Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8);
		System.out.println(mangas.lower(yuyu));
		System.out.println(mangas.floor(yuyu));
		System.out.println(mangas.higher(yuyu));
		System.out.println(mangas.ceiling(yuyu));

		System.out.println("----------");
		System.out.println(mangas.size());
		System.out.println(mangas.pollFirst());/* retorna o primeiro elementos da lista e o remove */
		System.out.println(mangas.size());
		System.out.println(mangas.pollLast());
		System.out.println(mangas.size());
		

	}

}

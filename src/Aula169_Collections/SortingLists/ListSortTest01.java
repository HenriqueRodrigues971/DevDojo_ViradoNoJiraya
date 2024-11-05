package Aula169_Collections.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Aula169_Collections.SortingLists.dominio.Manga;

/*o metodo sort da classe Collections organiza a lista que for passado para ele, 
 * mas no metodo usado organiza um lista simples de variaveis ,
 *  não orginiza classes ainda*/
public class ListSortTest01 {
	public static void main(String[] args) {

		List<String> mangas = new ArrayList<String>();
		mangas.add("Naruto");
		mangas.add("Berseker");
		mangas.add("Death Note");
		mangas.add("Mirai Nikki");
		mangas.add("Akame ga kill");

		for (String manga : mangas) {
			System.out.println(manga);
		}
		Collections.sort(mangas);
		System.out.println(mangas);

		List<Double> numbers = new ArrayList<Double>();
		numbers.add(4.50);
		numbers.add(420.50);
		numbers.add(4.50);
		numbers.add(3.00);
		numbers.add(22.70);

		Collections.sort(numbers);
		for (double n : numbers) {
			System.out.println(n);
		}
		
		new Manga(null,null, 0);
	}
}

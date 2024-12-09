package Aula189_ClassesInternas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Aula189_ClassesInternas.dominio.Barco;

class BarcoNomeComparator implements Comparator<Barco> {

	@Override
	public int compare(Barco o1, Barco o2) {

		return o1.getNome().compareTo(o2.getNome());
	}

}

public class ClassesAnonimasTest02 {

	public static void main(String[] args) {
		List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
		barcoList.sort(new Comparator<Barco>(){

			@Override
			public int compare(Barco o1, Barco o2) {
				return o2.getNome().compareTo(o1.getNome());
			}
			
		});
		System.out.println(barcoList);
	}
}

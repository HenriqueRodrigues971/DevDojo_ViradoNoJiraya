package Aula183_Generics.WildCard;

import java.util.ArrayList;
import java.util.List;

import Aula183_Generics.Dominio.Animal;
import Aula183_Generics.Dominio.Cachorro;
import Aula183_Generics.Dominio.Gato;

public class WildCardTeste02 {
	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		printConcuslta(cachorros);
		printConcuslta(gatos);

		System.out.println("-----");
		List<Animal> animals = new ArrayList<>();
		printConsultaAnimal(animals);
	}

	/* Nesse tipo curinga aceitamos qualquer tipo de objeto que seja Animal */
	private static void printConcuslta(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
	}

	// Este método utiliza o curinga `<? super Animal>`, que permite receber listas
	// de qualquer tipo que seja
	// um supertipo de `Animal`, incluindo `Animal` e `Object`. Isso possibilita a
	// adição de objetos
	// do tipo `Animal` e suas subclasses (como `Cachorro` e `Gato`) na lista, mas
	// limita o acesso aos
	// elementos da lista como `Object`, já que o tipo específico dos elementos não
	// é conhecido.
	private static void printConsultaAnimal(List<? super Animal> animals) {
		animals.add(new Cachorro());
		animals.add(new Gato());
		/*Não consigo usar os metodos da classe, no caso o .consulta()*/
	
	}

}

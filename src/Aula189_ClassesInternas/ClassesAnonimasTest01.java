package Aula189_ClassesInternas;

// Classe base Animal, com um método som() que imprime "Som do animal".
class Animal {
	public void som() {
		System.out.println("Som do animal");
	}
}

public class ClassesAnonimasTest01 {

	public static void main(String[] args) {
		// Aqui, estamos criando uma classe anônima que estende a classe Animal.
		// Uma classe anônima é uma classe que não tem um nome definido
		// e é utilizada para sobrescrever métodos ou adicionar funcionalidades
		// sem criar uma nova subclasse explicitamente.
		Animal animal = new Animal() {
			// Sobrescrevemos o método som() da classe Animal.
			@Override
			public void som() {
				System.out.println("Cachorro latindo");
			}
		};

		// Chamamos o método som() na instância de Animal.
		// Como usamos uma classe anônima, o método sobrescrito será executado,
		// imprimindo "Cachorro latindo" em vez de "Som do animal".
		animal.som();
	}
}

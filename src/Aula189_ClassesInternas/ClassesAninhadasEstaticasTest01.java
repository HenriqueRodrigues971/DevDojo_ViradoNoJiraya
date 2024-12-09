package Aula189_ClassesInternas;

public class ClassesAninhadasEstaticasTest01 {
	private String nome = "Paulo";

	static class Aninhado {
		private String sobrenome = "Rodrigues";

		void print() {
			System.out.println(new ClassesAninhadasEstaticasTest01().nome + " " + sobrenome);
		}
	}

	public static void main(String[] args) {
		Aninhado aninhado = new Aninhado();
		aninhado.print();

	}
}

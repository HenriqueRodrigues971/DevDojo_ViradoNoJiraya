package Aula189_ClassesInternas;

public class ClassesLocaisTest02 {
	private String nome = "Midoriya";

	void print(final String param) {
		final String sobrenome = "Izuku";

		class LocalClass {
			public void printLocal() {
				System.out.println(param);
				System.out.println(nome + " " + sobrenome);
			}
		}
		new LocalClass().printLocal();
	}

	public static void main(String[] args) {
		ClassesLocaisTest02 outer = new ClassesLocaisTest02();
		outer.print("Teste");
	}
}

package Aula189_ClassesInternas;

public class ClassesLocaisTest01 {
 private String nome = "Monkey D. Luffy";
	class Interna {
		public void imprimaClasseInternaTest01Atributo() {
			System.out.println(nome);
		} 
	}
	public static void main(String[] args) {
		ClassesLocaisTest01 classeInternaTest01 = new ClassesLocaisTest01();
		Interna interna = classeInternaTest01.new Interna();
		interna.imprimaClasseInternaTest01Atributo();
	}
}

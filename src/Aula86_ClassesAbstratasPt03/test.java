package Aula86_ClassesAbstratasPt03;

public class test {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Zoro", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}
}

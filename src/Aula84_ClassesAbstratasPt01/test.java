package Aula84_ClassesAbstratasPt01;

public class test {
	public static void main(String[] args) {
     Gerente gerente = new Gerente("Zoro",5000);
     Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
     System.out.println(gerente);
     System.out.println(desenvolvedor);
	}
}

package Aula39ao42_OrientacaoObjetosIntroducao;

public class Aula42_Exercicio {
 public static void main(String[]args) {
	 Aula42_ExercicioClasse carro = new Aula42_ExercicioClasse();
	 Aula42_ExercicioClasse carro2 = new Aula42_ExercicioClasse();
	 
	 carro.nome="Celta";
	 carro.modelo="Luxo";
	 carro.ano=2003;
	 
	 carro2.nome="Ferrari";
	 carro2.modelo="Lixo";
	 carro2.ano=2024;
	 
	 System.out.println(carro.nome);
	 System.out.println(carro.modelo);
	 System.out.println(carro.ano);

	 System.out.println("-------------------");
	 
	 System.out.println(carro2.nome);
	 System.out.println(carro2.modelo);
	 System.out.println(carro2.ano);
 }
}

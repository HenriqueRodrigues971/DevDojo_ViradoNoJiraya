package Aula90_PoliformismoPt01;

public class Animal {
	public void fazerSom() {
		/*
		 * Neste tipo de polimorfismo, uma classe filha pode substituir um método de sua
		 * classe pai, desde que tenha a mesma assinatura (nome e parâmetros) e retorno.
		 * Isso permite que você chame o mesmo método em diferentes tipos de objetos,
		 * obtendo comportamentos específicos para cada um.
		 */
		System.out.println("Animal fazendo som.....");
	}
}

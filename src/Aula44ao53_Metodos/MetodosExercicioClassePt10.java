package Aula44ao53_Metodos;

public class MetodosExercicioClassePt10 {
	String nome;
	int idade;
	double[] salario;

	public void imprimirFuncionarios() {
		System.out.println("-------------");
		System.out.println("Nome:" + this.nome);
		System.out.println("idade:" + this.idade);
		for (double s : salario) {
			System.out.println(s + "");
		}
		mediaSalario();
	}

	public void mediaSalario() {
		double media= 0;
		for (double num : salario) {
			media += num;
		}
		media /= salario.length;
		System.out.println("A média dos salarios é: " + media);
	}
}

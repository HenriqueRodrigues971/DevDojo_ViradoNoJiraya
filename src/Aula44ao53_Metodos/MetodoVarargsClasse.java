package Aula44ao53_Metodos;

public class MetodoVarargsClasse {
	public void somaArray(double[] numeros) {
		double soma = 0;
		for (double num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}

	public void somaVarargs(double... numeros) {
		double soma = 0;
		for (double num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}

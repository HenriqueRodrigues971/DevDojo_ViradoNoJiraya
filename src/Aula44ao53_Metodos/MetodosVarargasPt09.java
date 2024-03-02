package Aula44ao53_Metodos;

public class MetodosVarargasPt09 {
	public static void main(String[] args) {
		MetodoVarargsClasse calc = new MetodoVarargsClasse();
		double[] numeros = { 1, 2, 3, 4, 5 };
		calc.somaArray(numeros);
		// varargs é tbm um array, mas usando ele não precisamos passar um array,
		// podemos colocar numeros e eles vai adicionando no proprio array que ele é
		calc.somaVarargs(1, 2, 3, 4, 5);
	}
}

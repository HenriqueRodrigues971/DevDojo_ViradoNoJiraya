package Aula98_ExcecoesPt04_LacandoUnchecked;

public class test01 {
	public static void main(String[] args) {
		divisao(1, 0);
	}

	private static int divisao(int a, int b) {
		/*
		 * Sabemos que não pode divisão por zero, então podemos mandar um exceção
		 * avisando que o argumento está errado
		 */
		try {
			return a / b;
		} catch (ArithmeticException e) {
			// também posso usar o RunTimeException, é uma super classe de
			// ArithmeticException
			e.printStackTrace();
		}
		return 0;
	}
}

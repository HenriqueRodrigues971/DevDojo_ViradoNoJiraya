package Aula98_ExcecoesPt04_LacandoUnchecked;

public class test02 {
	public static void main(String[] args) {
		System.out.println(divisao(10, 0));
	}
/**
 * @param a
 * @param b não pode ser zero
 * @return
 * @throws IllegalArgumentException caso b seja zero
 */
	private static int divisao(int a, int b) {
		/*
		 * Sabemos que não pode divisão por zero, então podemos mandar um exceção
		 * avisando que o argumento está errado
		 */
		if (b == 0) {
			//IllegalArgumentException é uma classe filho do RunTimeException
			throw new IllegalArgumentException("Argumento ilegal, não pode ser usado");
			//throw new RuntimeException("Argumento ilegal, não pode ser zero");
		}
		return a/b;
	}
}

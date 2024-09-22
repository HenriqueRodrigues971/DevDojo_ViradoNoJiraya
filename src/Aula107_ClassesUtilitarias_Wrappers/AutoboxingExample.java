package Aula107_ClassesUtilitarias_Wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
	public static void main(String[] args) {
		// Usando autoboxing para adicionar tipos primitivos a uma lista de objetos
		List<Integer> lista = new ArrayList<>();
		lista.add(10); // O autoboxing converte automaticamente o valor inteiro 10 em um objeto Integer

		// Usando autoboxing para recuperar um objeto da lista e atribuí-lo a uma
		// variável primitiva
		int numero = lista.get(0); // O autoboxing converte automaticamente o objeto Integer em um valor inteiro

		System.out.println("Valor recuperado da lista: " + numero); // Saída: Valor recuperado da lista: 10
	}
}

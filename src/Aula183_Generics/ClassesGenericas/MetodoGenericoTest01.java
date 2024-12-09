package Aula183_Generics.ClassesGenericas;

import java.util.List;

import Aula183_Generics.Dominio.Barco;

public class MetodoGenericoTest01 {
	public static void main(String[] args) {
		criarArrayComObjetos(new Barco("Canoa"));
	}

	private static <T> void criarArrayComObjetos(T t) {
		List<T> list = List.of(t);
		System.out.println(list);
	}
}

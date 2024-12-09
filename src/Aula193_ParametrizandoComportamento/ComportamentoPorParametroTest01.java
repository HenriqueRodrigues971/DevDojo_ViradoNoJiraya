package Aula193_ParametrizandoComportamento;

import java.util.ArrayList;
import java.util.List;

import Aula193_ParametrizandoComportamento.dominio.Carro;

public class ComportamentoPorParametroTest01 {
	private static List<Carro> carros = List.of(new Carro("Verde", 2011), new Carro("Preto", 1998),
			new Carro("Prata", 2012));

	public static void main(String[] args) {
		System.out.println(filtrarCarroVerde(carros,"Verde"));
	System.out.println(filtrarCarroPorAno(carros, 1999));
	}

	private static List<Carro> filtrarCarroVerde(List<Carro> carros,String cor) {
		List<Carro> carrosVerde = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getColor().equals(cor)) {
				carrosVerde.add(carro);
			}
		}
		return carrosVerde;
	}
	
	private static List<Carro> filtrarCarroPorAno(List<Carro> carros,int ano) {
		List<Carro> carrosVerde = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getYear() < ano) {
				carrosVerde.add(carro);
			}
		}
		return carrosVerde;
	}
}

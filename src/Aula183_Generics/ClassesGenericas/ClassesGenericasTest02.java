package Aula183_Generics.ClassesGenericas;

import Aula183_Generics.Dominio.Carro;
import Aula183_Generics.service.CarroRentavelService;

public class ClassesGenericasTest02 {
	public static void main(String[] args) {
		CarroRentavelService carroRentavelService = new CarroRentavelService();
		Carro carro = carroRentavelService.buscarCarroDisponivel();
		System.out.println("Usando carro por um mês");
		carroRentavelService.retornarCarroAlugado(carro);

	}
}

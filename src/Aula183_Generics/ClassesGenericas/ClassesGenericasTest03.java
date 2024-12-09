package Aula183_Generics.ClassesGenericas;

import java.util.ArrayList;
import java.util.List;

import Aula183_Generics.Dominio.Barco;
import Aula183_Generics.Dominio.Carro;
import Aula183_Generics.service.RentavelService;

public class ClassesGenericasTest03 {
	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Bote"), new Barco("Canoa")));
		RentavelService<Carro> rentalService = new RentavelService<>(carrosDisponiveis);
		Carro carro = rentalService.buscarObjetoDisponivel();
		System.out.println("Usando carro por um mês");
		rentalService.retornarObjetoAlugado(carro);
		
		System.out.println("\n---------\n");
		RentavelService<Barco> rentalService2 = new RentavelService<>(barcosDisponiveis);
		Barco barco = rentalService2.buscarObjetoDisponivel();
		System.out.println("Usando barco por 1 mês");
		rentalService2.retornarObjetoAlugado(barco);

	}
}

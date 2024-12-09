package Aula183_Generics.ClassesGenericas;

import Aula183_Generics.Dominio.Barco;
import Aula183_Generics.service.BarcoRentavelService;

public class ClassesGenericasTest01 {
	public static void main(String[] args) {
		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco Barco = barcoRentavelService.buscarBarcoDisponivel();
		System.out.println("Usando Barco por um mês");
		barcoRentavelService.retornarBarcoAlugado(Barco);

	}
}

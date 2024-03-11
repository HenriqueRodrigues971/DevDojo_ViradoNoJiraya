package Aula90_PoliformismoPt01;

public class test {
	public static void main(String[] args) {
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();
		
		animal1.fazerSom();
		animal2.fazerSom();
	}
}

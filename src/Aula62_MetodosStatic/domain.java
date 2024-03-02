package Aula62_MetodosStatic;

public class domain {
	public static void main(String[] args) {
		carro c1 = new carro("BMW", 280);
		carro c2 = new carro("Mercedes", 275);
		carro c3 = new carro("Audi", 290);
		carro.setVelocidadeLimite(180);
		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}

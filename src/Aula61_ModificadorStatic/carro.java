package Aula61_ModificadorStatic;

public class carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;
	// Usando o modificador stayico, quando mudar algo em algum objeto ele muda
	// todos que serão intenciado desta classe

	public carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprime() {
		System.out.println("---------");
		System.out.println("Nome:" + this.nome);
		System.out.println("Velocidade Limite:" + this.velocidadeMaxima);
		System.out.println("Velocidade Máxima:" + this.velocidadeLimite);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public void setVelocidadeLimite(double velocidadeLimite) {
		this.velocidadeLimite = velocidadeLimite;
	}

}

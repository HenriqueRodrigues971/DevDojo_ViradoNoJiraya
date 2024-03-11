package Aula86_ClassesAbstratasPt03;

public abstract class Funcionario extends Pessoa {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	calcularBonus();
	}

	public abstract void calcularBonus();

	@Override
	public void imprime() {
		System.out.println("imprimindo...");
		
	} 
  

}


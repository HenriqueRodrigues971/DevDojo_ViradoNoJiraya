package Aula85_ClassesAbstratasPt02;

public abstract class Funcionario {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	calcularBonus();
	}

	public abstract void calcularBonus(); 
}

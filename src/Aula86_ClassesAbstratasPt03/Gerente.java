package Aula86_ClassesAbstratasPt03;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void calcularBonus() {
		this.salario = salario + salario * 0.20;
		
	}
	/*public void calcularBonus(){} posso deixai vazio caso não tenha bônus*/

	
	
}

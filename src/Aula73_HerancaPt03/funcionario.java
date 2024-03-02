package Aula73_HerancaPt03;

public class funcionario extends pessoa {
	private double salario;

	public void imprime() {
		super.imprime();
		System.out.println("Salario: " + this.salario);
	}

	public void relatorioPagamento() {
		System.out.println("Eu "+this.nome+ " recebi o salario de "+this.salario);
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
}

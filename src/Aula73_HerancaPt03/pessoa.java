package Aula73_HerancaPt03;

public class pessoa {
	protected String nome;
	protected String cpf;
	protected endereco Endereco;

	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Endereço: "+this.Endereco.getRua() +", "+ this.Endereco.getCep()+".");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(endereco endereco) {
		Endereco = endereco;
	}

}

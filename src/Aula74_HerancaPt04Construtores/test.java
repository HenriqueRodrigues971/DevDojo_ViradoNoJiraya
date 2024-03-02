package Aula74_HerancaPt04Construtores;

public class test{
	public static void main(String[]args) {
		System.out.println("--------Pessoa--------");
		endereco Endereco = new endereco();
		Endereco.setRua("Rua 3");
		Endereco.setCep("012345-209");
		pessoa Pessoa = new pessoa("Toyohisa Shimazu","345678");
		//Pessoa.setNome();
		//Pessoa.setCpf("123.456.789-10");
		Pessoa.setEndereco(Endereco);
		
		Pessoa.imprime();
		System.out.println("------Funcionario-------");
	 funcionario Funcionario = new funcionario("Oda Nobunaga");
	// Funcionario.setNome();
	 Funcionario.setCpf("234.653.783-90");
	 Funcionario.setEndereco(Endereco);
	 Funcionario.setSalario(2500.40);
	 Funcionario.imprime();
	 Funcionario.relatorioPagamento();
	}
}
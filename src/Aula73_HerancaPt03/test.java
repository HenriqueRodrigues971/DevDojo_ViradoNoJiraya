package Aula73_HerancaPt03;

public class test{
	public static void main(String[]args) {
		endereco Endereco = new endereco();
		Endereco.setRua("Rua 3");
		Endereco.setCep("012345-209");
		pessoa Pessoa = new pessoa();
		Pessoa.setNome("Toyohisa Shimazu");
		Pessoa.setCpf("123.456.789-10");
		Pessoa.setEndereco(Endereco);
		
		Pessoa.imprime();
		System.out.println("-------------");
	 funcionario Funcionario = new funcionario();
	 Funcionario.setNome("Oda Nobunaga");
	 Funcionario.setCpf("234.653.783-90");
	 Funcionario.setEndereco(Endereco);
	 Funcionario.setSalario(2500.40);
	 Funcionario.imprime();
	 Funcionario.relatorioPagamento();
	}
}
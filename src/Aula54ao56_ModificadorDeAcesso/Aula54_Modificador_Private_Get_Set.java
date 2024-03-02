package Aula54ao56_ModificadorDeAcesso;

public class Aula54_Modificador_Private_Get_Set {
	public static void main(String[] args) {
		Aula54_PessoaClasse pessoa = new Aula54_PessoaClasse();
		pessoa.setNome("Paulo");
		pessoa.setIdade(19);
		pessoa.imprime();
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}
}

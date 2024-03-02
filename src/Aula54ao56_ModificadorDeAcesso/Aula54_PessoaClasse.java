package Aula54ao56_ModificadorDeAcesso;

public class Aula54_PessoaClasse {
	//Quando um atributo for privador ele só pode ser acessado dentro de seu proprio objeto
	private String nome;
	private int idade;

	public void imprime() {
		System.out.println(getNome());
		System.out.println(getIdade());
	}
	// Quando o atributo for privado, nós podemos usar os metodos get e set para chamar em outro objeto
	public void setNome(String nome) {
		this.nome = nome;
	}
	//set recebe o que foi passado
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Idade invalida");
			return;
		}
		this.idade=idade;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
}

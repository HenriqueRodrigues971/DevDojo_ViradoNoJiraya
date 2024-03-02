package Aula70_ExercicioAssociacao;

public class aluno {
	private String nome;
	private int idade;
	private seminario Seminario;

	public aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;

	}

	public aluno(seminario seminario) {
		super();
		Seminario = seminario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSeminario(seminario Seminario) {
		this.Seminario = Seminario;
	}

	public seminario getSeminario() {
		return Seminario;
	}

	public void imprime() {
		System.out.println("Aluno: " + this.nome + " Idade:" + this.idade);
		if (Seminario.getTitulo() != null) {
         System.out.println("Titulo do seminario: " +Seminario.getTitulo());
		}else {
			System.out.println("Sem seminario");
		}
	}

}

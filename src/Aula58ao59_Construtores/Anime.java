package Aula58ao59_Construtores;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;

	// isso é um construtor
	public Anime(String nome, String tipo, int episodios, String genero) {
		this();// aqui ele me esta jogando para o construtor sem argumento
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
		// depois de voltar do construtor sem argumento eele executa esse e volta pro
		// que tem estudio
	}

	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);// me jogou para o construtor que tenha somente essas variaveis
		this.estudio = estudio;
	}

	public Anime() {
		System.out.println("Dentro do construtor sem argumento");
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}
}

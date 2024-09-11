package Aula57_SobreCargasDeMetodos;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;

	// mesma coisa que o imprime masestou chamando tudo em um só lugar, aí não uso o
	// set
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}

	// a sobrecarga de metodo é poder dar o mesmo nome a metodos mas eles tem
	// parametros diferentes
	public void init(String nome, String tipo, int episodios, String genero) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
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

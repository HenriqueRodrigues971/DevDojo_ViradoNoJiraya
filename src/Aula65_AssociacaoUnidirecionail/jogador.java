package Aula65_AssociacaoUnidirecionail;

public class jogador {
	private String nome;
	//estou chamando um objeto time no objeto jogador, para adicionar um time ao jogador criado
	private time Time;

	// posso adicionar o time no construtor caso eu queira obrigatoriamente que o
	// jogador tenha time
	public jogador(String nome) {
		this.nome = nome;
	}

	public void setTime(time time) {
		Time = time;
	}
	public time getTime() {
		return Time;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
	    if(Time !=null) {
	    	System.out.println("Time: "+Time.getNome() );
	    }
	}
}

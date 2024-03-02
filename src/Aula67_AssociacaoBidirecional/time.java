package Aula67_AssociacaoBidirecional;

public class time {
	private String nome;
	private jogador[] Jogadores;
	
	public time(String nome) {
		this.nome = nome;
	}
	public time(String nome, jogador[] jogadores) {
		this.nome = nome;
		this.Jogadores = jogadores;
	}
	
	public void imprime() {
		System.out.println("Time: "+this.nome);
		if(Jogadores == null) return;
	
			
			for (jogador jogadores : Jogadores) {
				System.out.println(jogadores.getNome());
			
		}		
	}
	
  public String getNome() {
	return nome;
}
  public void setNome(String nome) {
	this.nome = nome;
}
  public void setJogadores(jogador[] jogadores) {
	Jogadores = jogadores;
}
  public jogador[] getJogadores() {
	return Jogadores;
}
}

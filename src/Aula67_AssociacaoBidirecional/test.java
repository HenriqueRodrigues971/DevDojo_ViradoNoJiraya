package Aula67_AssociacaoBidirecional;

public class test {
	public static void main(String[] args) {
     jogador Jogador = new jogador("Cafú");
     jogador Jogador2 = new jogador("Cristiano Ronaldo");
     jogador Jogador3 = new jogador("Neymar");
     time Time2 = new time("Portugal");
     time Time = new time("Brasil");
     jogador[] Jogadores = {Jogador,Jogador3};
     
     Jogador.setTime(Time);
     Jogador2.setTime(Time2);
     Jogador3.setTime(Time);
     Time.setJogadores(Jogadores);
	
     System.out.println("---Jogador---");
     Jogador.imprime();
     Jogador2.imprime();
     Jogador3.imprime();
     System.out.println("---Time---");
     Time.imprime();
	}
}

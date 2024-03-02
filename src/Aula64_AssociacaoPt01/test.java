package Aula64_AssociacaoPt01;

public class test {
	public static void main(String[] args) {
      jogador j1 = new jogador("Pelé");
      jogador j2 = new jogador("Romário");
      jogador j3 = new jogador("Cafú");
      //criamos objetos e colocamos dentro de um array
	jogador[] jogadores = {j1,j2,j3};
      for(jogador j : jogadores) {
    	  j.imprime();
      }
	}
}

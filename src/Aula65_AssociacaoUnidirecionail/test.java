package Aula65_AssociacaoUnidirecionail;

public class test {
	public static void main(String[] args) {
		/*Aqui estou associando um jogador em um time*/
		jogador j1 = new jogador("Pelé");
		jogador j2 = new jogador("Romário");
        time Time = new time("Seleção Brasileira");
        j1.setTime(Time);
        j1.imprime();
        j2.imprime();
	}
}
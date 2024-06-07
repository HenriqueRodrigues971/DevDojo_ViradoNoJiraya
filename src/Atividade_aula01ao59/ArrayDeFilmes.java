package Atividade_aula01ao59;

public class ArrayDeFilmes {
	public static void main(String[] args) {
		String[] filmes = new String[5];
		filmes[0] = "De volta ao jogo";
		filmes[1] = "Toy Story";
		filmes[2] = "A Fera";
		filmes[3] = "Anjos da lei";
		filmes[4] = "Mulque te doido";

		
		for (int i = 0; i < filmes.length; i++) {
			if (filmes[i].charAt(0) == 'A') {
				System.out.println(filmes[i]);
			}
		}
		System.out.println("---");
		int contFilmeCaracter = 0;
		for(int c = 0; c < filmes.length; c++) {
			if(filmes[c].length() > 10) {
				System.out.println(filmes[c]);
				System.out.println(contFilmeCaracter);
				contFilmeCaracter++;
			}
		}
		
	}
}

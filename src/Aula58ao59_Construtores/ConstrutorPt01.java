package Aula58ao59_Construtores;

public class ConstrutorPt01 {
	public static void main(String[] args) {
		Anime anime = new Anime("Death note", "TV", 33, "Suspense","Atsushi");
		Anime anime2 = new Anime("Death note", "TV", 33, "Suspense");
		anime.imprime();
		anime2.imprime();
	}
}

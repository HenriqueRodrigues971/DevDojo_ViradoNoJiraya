package Aula57_SobreCargasDeMetodos;

public class SobrecargasDeMetodos {
  public static void main(String[]args) {
	  Anime anime = new Anime();
	  anime.setNome("Death Note");
	  anime.setGenero("Suspense");
	  anime.setTipo("TV");
	  anime.setEpisodios(32);
	  anime.imprime();
	  
	  System.out.println("----------------");
	  Anime anime2 = new Anime();
	  anime2.init("Akame ga kill", "Anime", 13, "Terror e romance");
	  anime2.imprime();
	
	  
  }
}
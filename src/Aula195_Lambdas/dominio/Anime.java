package Aula195_Lambdas.dominio;

public class Anime {
	private String title;
	private int episodes;

	public Anime(String title, int episodes) {
		super();
		this.title = title;
		this.episodes = episodes;
	}

	public String getTitle() {
		return title;
	}

	public int getepisodes() {
		return episodes;
	}

	@Override
	public String toString() {
		return "Anime [title=" + title + ", episodes=" + episodes + "]";
	}

}

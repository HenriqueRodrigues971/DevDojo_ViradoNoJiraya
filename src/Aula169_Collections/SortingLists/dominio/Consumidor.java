package Aula169_Collections.SortingLists.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
	private Long id;
	private String nome;

	public Consumidor(String nome) {
		this.id = ThreadLocalRandom.current().nextLong(0, 100_000);/* Gera um valor Long aleatorio */
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Consumidor [id=" + id + ", nome=" + nome + "]";
	}

}

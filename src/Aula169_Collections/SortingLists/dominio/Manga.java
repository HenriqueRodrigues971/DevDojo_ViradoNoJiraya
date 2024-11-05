package Aula169_Collections.SortingLists.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
	private Long id;
	private String nome;
	private double preco;
	private int quantidade;

	public Manga(Long id, String nome, double preco) {
		Objects.requireNonNull(id, "Id não pode ser null");
		Objects.requireNonNull(nome, "Nome não pode ser null");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Manga(Long id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manga other = (Manga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int compareTo(Manga o) {
		/*
		 * if (this.id < o.getId()) { return -1; } else if (this.id.equals(o.getId())) {
		 * return 0;
		 * 
		 * } else { return 1; }
		 */

		return this.nome.compareTo(o.getNome());
		// return Double.compare(preco, o.getPreco());
		// return Double.valueOf(preco).compareTo(o.getPreco());
//		return this.id.compareTo(o.getId());
	}

}

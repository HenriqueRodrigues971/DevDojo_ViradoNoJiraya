package Aula159_Serialization.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private transient String password; // transiente diz que não qur que o objeto seja serializado
	private static final String NOME_ESCOLA = "DevDojo Virado no Jiraya";
	// variaveis estaticas nao sao serializadas, pois pertencem a classe.
	private transient Turma turma;

	public Aluno(Long id, String nome, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + "Nome Escola=" + NOME_ESCOLA
				+ ", Turma=" + turma + "]";

	}

	/* Serializando um obeto que não poderia ser serializado */
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String nomeTurma = ois.readUTF();
			turma = new Turma(nomeTurma);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package Aula159_Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Aula159_Serialization.dominio.Aluno;
import Aula159_Serialization.dominio.Turma;

public class SerializacaoTest01 {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(1L, "Paulo", "123456789");
		Turma turma = new Turma("Maratona java em breve ricos");
		aluno.setTurma(turma);
		serializar(aluno);
		deserializar();
	}

	private static void serializar(Aluno aluno) {
		Path path = Paths.get("pasta/alunos.ser");
		try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
			oos.writeObject(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void deserializar() {
		Path path = Paths.get("pasta/alunos.ser");
		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
			Aluno aluno = (Aluno) ois.readObject();
			System.out.println(aluno);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

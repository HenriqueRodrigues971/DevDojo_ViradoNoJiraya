package Aula102_Excecoes_MultiCatchEmLinha;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class test01 {
	public static void main(String[] args) {

		try {
			throw new ArrayIndexOutOfBoundsException();

		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (RuntimeException e) {
			/*
			 * esta exceção é generica e tbm uma classe pai, onde todas as outras acima são
			 * filhos dele, toda exceção generica deve ser colocado com ultimo catch
			 */
			System.out.println("Dentro do RuntimeException");
		}
		try {
			talvezLanceException();
		} catch (SQLException | FileNotFoundException e ) {
			e.printStackTrace();
		}
	}

	private static void talvezLanceException() throws SQLException, FileNotFoundException {

	}
}

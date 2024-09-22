package Aula104_Excecoes_ExcecoesCustomizadas;

import java.util.Scanner;

import Aula68_LeituraDeDadosDeConsole.leituraDoTecladoTest01;

public class test01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (loginInvalidoException e) {
			e.printStackTrace();
		}

	}

	private static void logar() throws loginInvalidoException {
		Scanner teclado = new Scanner(System.in);
		String usernameDB = "Goku";
		String senhaDB = "ssj";

		System.out.println("Usuario");
		String usernameDigitado = teclado.nextLine();
		System.out.println("Senha");
		String senhaDigitado = teclado.nextLine();
		if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)) {
			throw new loginInvalidoException("Usuario ou senha inválidos");
		}
		System.out.println("usuario logado com sucesso!");
		teclado.close();
	}
}

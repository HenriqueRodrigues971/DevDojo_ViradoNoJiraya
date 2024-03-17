package Aula104_Excecoes_ExcecoesCustomizadas;

public class loginInvalidoException extends Exception {

	public loginInvalidoException() {
		super("Login inválido");
	}

	public loginInvalidoException(String message) {
		super(message);
	}

	
}

package Aula104_Excecoes_ExcecoesCustomizadas;

public class loginInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public loginInvalidoException() {
		super("Login inválido");
	}

	public loginInvalidoException(String message) {
		super(message);
	}

	
}

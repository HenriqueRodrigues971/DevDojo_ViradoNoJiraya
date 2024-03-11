package Aula83_EnumeracaoPt04;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");

	private final int VALOR;
	private String nomeRelatorio;

	TipoCliente(int valor, String nomeRelatorio) {
		this.VALOR = valor;
		this.nomeRelatorio = nomeRelatorio;
	}

	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		/*
		 * values vai retornar um array de todos os tipos clientes, ou seja, de todas as
		 * enumerações
		 */
		for (TipoCliente tipoCliente : values()) {
			if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}
		return null;
	}

	public int getVALOR() {
		return VALOR;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

}

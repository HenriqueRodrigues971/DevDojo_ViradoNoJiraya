package Aula81_EnumeracaoPt02;

public class Cliente {
	/* Conseguimos fazer uma enumeração dentro de uma classe */
	public enum TipoPagamento {
		DEBITO, CREDITO
	}

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + 
				", tipoCliente=" + tipoCliente + 
				", TipoCLienteRelatorio= "+tipoCliente.getNomeRelatorio() +
				", tipoClienteInt=" +tipoCliente.getVALOR() + 
				", tipoPagamento=" + tipoPagamento + "\n";
	}

	

}

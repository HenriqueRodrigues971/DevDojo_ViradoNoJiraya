package Aula83_EnumeracaoPt04;

public class test {
	public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA,Cliente.TipoPagamento.DEBITO);
     Cliente cliente2 = new Cliente("Kaiba",TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.CREDITO);
     
     System.out.println(cliente1);
     System.out.println(cliente2);
     
    TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
	System.out.println(tipoCliente);
	
	TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
	System.out.println(tipoCliente2);
	}
}

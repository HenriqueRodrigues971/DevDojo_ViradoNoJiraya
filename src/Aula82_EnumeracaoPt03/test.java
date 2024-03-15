package Aula82_EnumeracaoPt03;

public class test {
	public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
     Cliente cliente2 = new Cliente("Kaiba",TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
     
     System.out.println(cliente1);
     System.out.println(cliente2);
     System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
     System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
     
	}
}

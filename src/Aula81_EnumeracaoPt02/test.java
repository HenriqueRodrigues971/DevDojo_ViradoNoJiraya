package Aula81_EnumeracaoPt02;

public class test {
	public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA,Cliente.TipoPagamento.DEBITO);
     Cliente cliente2 = new Cliente("Kaiba",TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.CREDITO);
     
     System.out.println(cliente1);
     System.out.println(cliente2);
     
	}
}

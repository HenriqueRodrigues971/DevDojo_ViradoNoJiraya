package Aula80_EnumeracaoPt01;

public class test {
	public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);
     Cliente cliente2 = new Cliente("Kaiba",TipoCliente.PESSOA_FISICA);
     Cliente cliente3 = new Cliente("Yuta",TipoCliente.PESSOA_JURIDICA);
     Cliente cliente4 = new Cliente("Asta",TipoCliente.PESSOA_JURIDICA);
     
     System.out.println(cliente1);
     System.out.println(cliente2);
     System.out.println(cliente3);
     System.out.println(cliente4);
	}
}

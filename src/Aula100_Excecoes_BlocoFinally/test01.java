package Aula100_Excecoes_BlocoFinally;

public class test01 {
	public static void main(String[] args) {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			System.out.println("Fechando o arquivo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

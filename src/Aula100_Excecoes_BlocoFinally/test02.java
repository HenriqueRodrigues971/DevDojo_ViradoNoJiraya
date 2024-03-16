package Aula100_Excecoes_BlocoFinally;

public class test02 {
	public static void main(String[] args) {
		abreConexao2();
	}

	private static String abreConexao() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			return "Conexão aberta";
		} catch (Exception e) {
			e.printStackTrace();
			/* finally sempre vai ser executado */
		} finally {
			System.out.println("Fechando recurso liberado pelo S.O.");
		}
		return null;
	}

	private static String abreConexao2() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			throw new RuntimeException();
		} finally {
			System.out.println("Fechando recurso liberado pelo S.O.");
		}
	}
}

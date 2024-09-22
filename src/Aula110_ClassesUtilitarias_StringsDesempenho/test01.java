package Aula110_ClassesUtilitarias_StringsDesempenho;

public class test01 {
	public static void main(String[] args) {
		// Marca o tempo de início para a concatenação com String
		long inicio = System.currentTimeMillis();
		concatString(30000); // Chama o método que concatena 30.000 números usando String
		long fim = System.currentTimeMillis(); // Marca o tempo de fim
		System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms"); // Calcula e exibe o tempo gasto

		// Marca o tempo de início para a concatenação com StringBuilder
		inicio = System.currentTimeMillis();
		concatStringBuilder(30000); // Chama o método que concatena 30.000 números usando StringBuilder
		fim = System.currentTimeMillis(); // Marca o tempo de fim
		System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms"); // Calcula e exibe o tempo gasto

		// Marca o tempo de início para a concatenação com StringBuffer
		inicio = System.currentTimeMillis();
		concatStringBuffer(30000); // Chama o método que concatena 30.000 números usando StringBuffer
		fim = System.currentTimeMillis(); // Marca o tempo de fim
		System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms"); // Calcula e exibe o tempo gasto
	}

	// Método que concatena números de 0 a "tamanho" utilizando String
	private static void concatString(int tamanho) {
		// Strings são imutáveis, logo, a cada concatenação uma nova String é criada
		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			texto += i; // Isso cria uma nova String a cada iteração, o que é ineficiente
		}
	}

	// Método que concatena números de 0 a "tamanho" utilizando StringBuilder
	private static void concatStringBuilder(int tamanho) {
		// StringBuilder é uma classe mutável, então ela pode modificar o conteúdo sem
		// criar novos objetos
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tamanho; i++) {
			sb.append(i); // A concatenação aqui é feita de maneira eficiente, sem recriar o objeto
		}
	}

	// Método que concatena números de 0 a "tamanho" utilizando StringBuffer
	private static void concatStringBuffer(int tamanho) {
		// StringBuffer é semelhante ao StringBuilder, mas é thread-safe (sincronizado),
		// o que garante segurança em ambientes multi-thread
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tamanho; i++) {
			sb.append(i); // Concatenando de forma eficiente, mas com overhead por conta da sincronização
		}
	}
}

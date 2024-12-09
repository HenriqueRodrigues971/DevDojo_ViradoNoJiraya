package Aula220_Thread.test;

class ThreadExample2 implements Runnable {
	private final char c;

	// Construtor que inicializa o caractere a ser impresso pela thread.
	public ThreadExample2(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		// Imprime o nome da thread em execução.
		System.out.println(Thread.currentThread().getName());

		// Loop que imprime o caractere 'c' 500 vezes.
		for (int i = 0; i < 500; i++) {
			System.out.println(c);
			// Adiciona uma quebra de linha a cada 100 caracteres.
			if (i % 100 == 0) {
				System.out.println();
			}
		}
	}
}

class ThreadExampleRunnable2 implements Runnable {
	private final char c;

	// Construtor que inicializa o caractere a ser impresso pela thread.
	public ThreadExampleRunnable2(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		// Imprime o nome da thread em execução.
		System.out.println(Thread.currentThread().getName());

		// Loop que imprime o caractere 'c' 500 vezes.
		for (int i = 0; i < 500; i++) {
			System.out.print(c);

			// Adiciona uma quebra de linha a cada 100 caracteres.
			if (i % 100 == 0) {
				System.out.println();
			}

			// Thread.yield(): Sugere ao escalonador de threads que ceda a vez para outra
			// thread de prioridade igual ou maior.
			// Isso não garante que a execução será imediatamente interrompida.
			Thread.yield();
		}
	}
}

public class ThreadTest002YeldJoin {
	public static void main(String[] args) throws InterruptedException {
		// Criação de threads com instâncias de Runnable que imprimem caracteres
		// diferentes.
		Thread t1 = new Thread(new ThreadExampleRunnable2('A'), "Thread-A");
		Thread t2 = new Thread(new ThreadExampleRunnable2('B'), "Thread-B");

		// Define a prioridade máxima para a thread t2.
		t2.setPriority(Thread.MAX_PRIORITY);

		// Inicia a execução da primeira thread (t1).
		t1.start();

		// t1.join(): Aguarda a conclusão da execução da thread t1 antes de prosseguir.
		// Isso garante que t1 termine antes que t2 seja iniciada.
		t1.join();

		// Inicia a execução da segunda thread (t2) após t1 ter terminado.
		t2.start();

		// Mensagem final indicando que todas as threads foram concluídas.
		System.out.println("Todas as threads terminaram. Continuando execução no método main.");
	}
}

package Aula220_Thread.test.Concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Classe Printer que implementa Runnable para ser executada em threads
class Printer implements Runnable {
	private final int num;

	public Printer(int num) {
		this.num = num; // Número associado a esta tarefa
	}

	@Override
	public void run() {
		// Mostra o início da execução da thread e o número da tarefa
		System.out.printf("%s início: %s%n", Thread.currentThread().getName(), num);
		try {
			// Simula uma operação demorada, fazendo a thread "dormir" por 3 segundos
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Indica que a execução da thread foi finalizada
		System.out.printf("%s finalizou%n", Thread.currentThread().getName());
	}
}

public class ExecutorsTest01 {
	public static void main(String[] args) {
		// Exibe o número de processadores disponíveis no sistema
		// System.out.println(Runtime.getRuntime().availableProcessors());

		// Cria um ExecutorService com diferentes estratégias de gerenciamento de
		// threads:
		// 1. `newFixedThreadPool(4)`: Cria um pool fixo de 4 threads. Apenas 4 tarefas
		// serão processadas simultaneamente.
		// ExecutorService executor = Executors.newFixedThreadPool(4);

		// 2. `newSingleThreadExecutor()`: Cria um pool de threads com apenas uma única
		// thread. As tarefas são executadas sequencialmente.
		// ExecutorService executor = Executors.newSingleThreadExecutor();

		// 3. `newCachedThreadPool()`: Cria um pool dinâmico de threads. Ele cria novas
		// threads conforme necessário e reutiliza as existentes se possível.
		ExecutorService executor = Executors.newCachedThreadPool();

		// Adiciona tarefas (Printer) ao executor para execução
		executor.execute(new Printer(1)); // Tarefa 1
		executor.execute(new Printer(2)); // Tarefa 2
		executor.execute(new Printer(3)); // Tarefa 3
		executor.execute(new Printer(4)); // Tarefa 4
		executor.execute(new Printer(5)); // Tarefa 5
		executor.execute(new Printer(6)); // Tarefa 6

		// Solicita ao ExecutorService que finalize as tarefas em andamento e não aceite
		// novas tarefas
		executor.shutdown();

		// Aguarda até que todas as tarefas sejam finalizadas antes de continuar
		while (!executor.isTerminated()) {
			// A chamada a `isTerminated()` verifica se todas as threads finalizaram
		}

		// Exibe uma mensagem indicando que todas as tarefas foram concluídas
		System.out.println("Programa finalizado");
	}
}

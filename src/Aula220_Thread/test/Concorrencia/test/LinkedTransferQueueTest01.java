package Aula220_Thread.test.Concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
	public static void main(String[] args) throws InterruptedException {
		// TransferQueue é uma fila especializada que permite transferências de
		// elementos
		// diretamente entre threads produtoras e consumidoras.
		TransferQueue<Object> tq = new LinkedTransferQueue<>();

		// Adiciona o elemento "willian" na fila. Lança uma exceção se a fila estiver
		// cheia.
		System.out.println(tq.add("willian")); // Retorna true se a adição foi bem-sucedida.

		// Tenta adicionar o elemento "willian" na fila. Retorna false se não puder
		// adicionar.
		System.out.println(tq.offer("willian")); // Sem tempo limite.

		// Tenta adicionar "willian" na fila, aguardando até 10 segundos caso a fila
		// esteja cheia.
		System.out.println(tq.offer("willian", 10, TimeUnit.SECONDS)); // Retorna true/false.

		// Insere o elemento "DevDojo" na fila. Bloqueia se a fila não puder aceitar
		// mais elementos.
		tq.put("DevDojo");

		// Verifica se há consumidores esperando por um elemento na fila.
		if (tq.hasWaitingConsumer()) {
			// Transfere diretamente o elemento "DevDojo" para um consumidor que está
			// esperando.
			tq.transfer("DevDojo");
		}

		// Tenta transferir "Academy" diretamente para um consumidor, mas sem bloquear.
		System.out.println(tq.tryTransfer("Academy")); // Retorna true se transferiu.

		// Tenta transferir "Academy" diretamente para um consumidor, esperando até 5
		// segundos.
		System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS)); // Retorna true/false.

		// Retorna, mas não remove o próximo elemento da fila. Lança exceção se a fila
		// estiver vazia.
		System.out.println(tq.element()); // Útil para verificar o elemento no início da fila.

		// Retorna, mas não remove o próximo elemento da fila. Retorna null se a fila
		// estiver vazia.
		System.out.println(tq.peek()); // Alternativa mais segura ao `element()`.

		// Remove e retorna o próximo elemento da fila. Retorna null se a fila estiver
		// vazia.
		System.out.println(tq.poll()); // Sem bloqueio.

		// Remove o próximo elemento da fila. Lança exceção se a fila estiver vazia.
		System.out.println(tq.remove()); // Similar ao `poll()`, mas lança exceção se vazio.

		// Remove e retorna o próximo elemento da fila. Bloqueia até que haja um
		// elemento disponível.
		System.out.println(tq.take()); // Bloqueia se a fila estiver vazia.

		// Retorna a capacidade restante da fila. Para LinkedTransferQueue, sempre
		// retorna Integer.MAX_VALUE.
		System.out.println(tq.remainingCapacity());
	}
}

package Aula220_Thread.test.Concorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	private int count; // Variável inteira simples usada para contar (não é thread-safe).
	// Variável AtomicInteger usada para contagem é thread-safe).
	private AtomicInteger atomicInteger = new AtomicInteger();
	private Lock lock = new ReentrantLock(true);

	// Método que incrementa os dois contadores (count e atomicInteger).
	void increment() {
		lock.lock();
		try {
			// Incremento simples da variável count (não é thread-safe).
			count++;

			// Incremento thread-safe usando AtomicInteger.
			atomicInteger.incrementAndGet();
		} finally {
			lock.unlock();
		}
	}

	// Retorna o valor do contador não thread-safe.
	public int getCount() {
		return count;
	}

	// Retorna o valor do contador thread-safe.
	public AtomicInteger getAtomicInteger() {
		return atomicInteger;
	}
}

public class AtomicIntegerTest01 {
	public static void main(String[] args) throws InterruptedException {
		// Instância da classe Counter para realizar os testes de contagem.
		Counter counter = new Counter();

		// Criação de uma tarefa (Runnable) que incrementa o contador 10.000 vezes.
		Runnable r = () -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		};

		// Criação de duas threads que irão executar a mesma tarefa (incrementar o
		// contador).
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		// Inicia as threads.
		t1.start();
		t2.start();

		// join(): Aguarda a conclusão das threads antes de prosseguir no método main.
		t1.join();
		t2.join();

		// Imprime o valor do contador não thread-safe (pode apresentar resultados
		// incorretos).
		System.out.println(counter.getCount());

		// Imprime o valor do contador thread-safe (sempre apresentará o valor correto).
		System.out.println(counter.getAtomicInteger());
	}
}

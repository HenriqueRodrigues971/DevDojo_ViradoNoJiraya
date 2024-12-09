package Aula220_Thread.test.Concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
	public static void main(String[] args) throws InterruptedException {
		// O BlockingQueue bloqueia a thread enquantp o nq estiver cheio, assim não
		// podendo ser adicionado algo
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		bq.put("Willian");// o peek retorna o valor sem removela da lista
		System.out.printf("%s adicionou o valor %s%n", Thread.currentThread().getName(), bq.peek());
		System.out.println("Adicionando o proximo valor");

		new Thread(new removeFromQueue(bq)).start();

		bq.put("Suane");
		System.out.printf("%s adicionou o valor %s%n", Thread.currentThread().getName(), bq.peek());
	}

	static class removeFromQueue implements Runnable {
		private final BlockingQueue<String> bq;

		public removeFromQueue(BlockingQueue<String> bq) {
			this.bq = bq;
		}

		@Override
		public void run() {
			System.out.printf("%s entrou em estado de sono por 5s %n", Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.printf("%s removendo valor do queue %s%n", Thread.currentThread().getName(), bq.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
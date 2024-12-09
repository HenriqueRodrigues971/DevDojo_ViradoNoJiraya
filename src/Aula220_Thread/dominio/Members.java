package Aula220_Thread.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
	// Fila de emails com capacidade para 10 elementos.
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);

	// Variável de controle para indicar se a fila está aberta para novos emails.
	private boolean open = true;

	// Retorna o estado da fila: aberta ou fechada.
	public boolean isOpen() {
		return open;
	}

	// Retorna o número de emails pendentes na fila.
	public int pendingEmails() {
		synchronized (emails) { // Garante acesso seguro à fila em ambientes multithread.
			return emails.size();
		}
	}

	// Adiciona um email à fila de forma sincronizada.
	public void addMemberEmail(String email) {
		synchronized (this.emails) { // Sincroniza o acesso à fila.
			String threadName = Thread.currentThread().getName(); // Obtém o nome da thread.
			System.out.println(threadName + " Adicionou email na lista");
			this.emails.add(email); // Adiciona o email à fila.
			this.emails.notifyAll(); // Notifica as threads que estão aguardando na fila.
		}
	}

	// Recupera e remove um email da fila, aguardando se a fila estiver vazia.
	public String retrievEmail() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " checando se tem emails");

		synchronized (this.emails) { // Sincroniza o acesso à fila.
			// Aguarda enquanto a fila está vazia e a fila ainda está aberta.
			while (this.emails.size() == 0) {
				if (!open) // Se a fila estiver fechada, retorna null.
					return null;

				System.out.println(Thread.currentThread().getName()
						+ " Não tem email disponível na lista, entrando em modo de espera");
				this.emails.wait(); // Coloca a thread em espera até ser notificada.
			}
			return this.emails.poll(); // Retorna e remove o primeiro email da fila.
		}
	}

	// Fecha a fila de emails e notifica todas as threads aguardando.
	public void close() {
		open = false; // Fecha a fila para novos emails.
		synchronized (this.emails) { // Sincroniza o acesso à fila.
			System.out.println(
					Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais recebendo emails");
			this.emails.notifyAll(); // Notifica todas as threads que estão aguardando.
		}
	}
}

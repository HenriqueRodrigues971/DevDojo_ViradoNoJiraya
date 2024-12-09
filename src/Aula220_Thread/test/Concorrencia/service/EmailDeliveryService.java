package Aula220_Thread.test.Concorrencia.service;

import Aula220_Thread.test.Concorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {
	private final Members members;

	// Construtor que inicializa o serviço com a fila de emails.
	public EmailDeliveryService(Members members) {
		this.members = members;
	}

	@Override
	public void run() {
		// Obtém o nome da thread para identificar quem está processando os emails.
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " starting to deliver emails...");

		// Loop que continua enquanto a fila está aberta ou há emails pendentes.
		while (members.isOpen() || members.pendingEmails() > 0) {
			try {
				// Recupera um email da fila. Se não houver emails, a thread fica aguardando.
				String email = members.retrievEmail();

				// Se não houver email disponível, retorna ao início do loop.
				if (email == null)
					continue;

				// Simula o envio do email.
				System.out.println(threadName + " enviando email para " + email);
				Thread.sleep(2000); // Simula um tempo de envio do email.
				System.out.println(threadName + " enviou email com sucesso para " + email);
			} catch (InterruptedException e) {
				// Trata a interrupção da thread e exibe a mensagem de erro.
				e.printStackTrace();
			}
		}
		// Indica que todos os emails foram enviados.
		System.out.println("Todos os emails foram enviados com sucesso!");
	}
}

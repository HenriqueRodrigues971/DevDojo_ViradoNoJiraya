package Aula220_Thread.test.Concorrencia.test;

import javax.swing.JOptionPane;

import Aula220_Thread.test.Concorrencia.dominio.Members;
import Aula220_Thread.test.Concorrencia.service.EmailDeliveryService;

public class EmailDeliveryTest01 {
	public static void main(String[] args) {
		// Instancia a classe Members, que gerencia a fila de emails.
		Members members = new Members();

		// Cria duas threads que executam o serviço de envio de emails.
		Thread Jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
		Thread Kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");

		// Inicia as threads para processar a fila de emails.
		Jiraya.start();
		Kakashi.start();

		// Loop principal que solicita emails do usuário através de uma caixa de
		// diálogo.
		while (true) {
			// Exibe uma caixa de diálogo para o usuário inserir um email.
			String email = JOptionPane.showInputDialog("Entre com seu email");

			if (email == null || email.isEmpty()) {
				// Se o email for nulo ou vazio, encerra o recebimento de emails e sai do loop.
				members.close();
				break;
			}

			// Adiciona o email inserido pelo usuário na fila.
			members.addMemberEmail(email);
		}
	}
}

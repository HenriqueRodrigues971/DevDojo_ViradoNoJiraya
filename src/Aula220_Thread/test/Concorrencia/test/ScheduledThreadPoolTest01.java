package Aula220_Thread.test.Concorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
	private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1); // Executor com apenas
																									// um thread no pool
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Formato para exibir o
																							// horário no console

	private static void beeper() {
		Runnable r = () -> {
			System.out.println(LocalTime.now().format(formatter) + " beep"); // Exibe o horário atual e a mensagem
																				// "beep"

			try {
				// Simula uma tarefa que demora 9 segundos para ser executada
				TimeUnit.SECONDS.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		// Exemplo comentado de agendamento simples:
		// Agenda a execução da tarefa "r" com um delay inicial de 5 segundos
		// executor.schedule(r, 5, TimeUnit.SECONDS);

		/*
		 * Agendamento com atraso fixo (scheduleWithFixedDelay): - Executa a tarefa "r"
		 * pela primeira vez após 1 segundo. - Após o término de cada execução, espera
		 * um delay fixo de 5 segundos antes de iniciar a próxima.
		 */
//		ScheduledFuture<?> scheduledWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);

		/*
		 * Agendamento com taxa fixa (scheduleAtFixedRate): - Executa a tarefa "r" pela
		 * primeira vez após 1 segundo. - Garante que as execuções seguintes aconteçam a
		 * cada 5 segundos, independente do tempo que a tarefa demorar para ser
		 * executada. - Se a execução de "r" ultrapassar o período, as execuções se
		 * sobrepõem.
		 */
		ScheduledFuture<?> scheduledAtFixedRate = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);

		// Agenda o cancelamento da tarefa e o encerramento do executor após 10 segundos
		executor.schedule(() -> {
			System.out.println("Cancelando o scheduledAtFixedRate");
			scheduledAtFixedRate.cancel(false); // Cancela a tarefa agendada (sem interromper se estiver em execução)
			executor.shutdown(); // Encerra o executor
		}, 10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		System.out.println(LocalTime.now().format(formatter)); // Exibe o horário inicial no console
		beeper(); // Inicia o método que agenda as tarefas
	}
}

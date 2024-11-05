package Aula169_Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
	public static void main(String[] args) {
		// Queue é uma interface que representa uma estrutura de dados do tipo fila,
		// onde os elementos
		// são inseridos no final da fila e removidos do início. Na maioria dos casos,
		// as implementações
		// de Queue seguem uma ordem FIFO (First In, First Out - Primeiro a entrar,
		// primeiro a sair).
		// No entanto, com o PriorityQueue, os elementos são removidos de acordo com uma
		// prioridade
		// natural ou definida por um comparador, e não necessariamente na ordem de
		// inserção.

		Queue<String> fila = new PriorityQueue<>();
		fila.add("C");
		fila.add("A");
		fila.add("B");

		// Exibe e remove os elementos da fila, conforme a prioridade definida (ordem
		// alfabética natural, neste caso).
		while (!fila.isEmpty()) {
			System.out.println(fila.remove());
		}
	}

}

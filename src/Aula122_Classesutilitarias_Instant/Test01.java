package Aula122_Classesutilitarias_Instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class Test01 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3, 1000000000));
		System.out.println(Instant.ofEpochSecond(3, -1000000000));

	}
	// A classe Instant é uma parte do pacote java.time, introduzida no Java 8. Ela
	// representa um ponto específico
	// na linha do tempo, definido como a quantidade de tempo desde o epoch padrão
	// (01 de janeiro de 1970, meia-noite, UTC).
	// É útil para operações de data e hora em um contexto em que precisamos de uma
	// medida de tempo absoluta,
	// independente de fusos horários ou calendários. Podemos usá-la para registrar
	// eventos, calcular diferenças de tempo,
	// realizar comparações entre instantes e muito mais.
}

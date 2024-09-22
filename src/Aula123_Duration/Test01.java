package Aula123_Duration;

import java.time.Duration;
import java.time.Instant;

public class Test01 {
	public static void main(String[] args) {
		// Criando durações a partir de diferentes unidades de tempo
		Duration duration1 = Duration.ofSeconds(60); // 60 segundos
		Duration duration2 = Duration.ofMinutes(2); // 2 minutos
		Duration duration3 = Duration.ofHours(1); // 1 hora
		Duration duration4 = Duration.ofDays(1); // 1 dia

		System.out.println("Duration1: " + duration1);
		System.out.println("Duration2: " + duration2);
		System.out.println("Duration3: " + duration3);
		System.out.println("Duration4: " + duration4);

		// Criando duração entre dois Instantes
		Instant start = Instant.now();
		Instant end = start.plusSeconds(75);
		Duration durationBetween = Duration.between(start, end);
		System.out.println("Duration Between: " + durationBetween);

		// Adicionando e subtraindo tempo
		Duration addedDuration = duration1.plus(Duration.ofMinutes(10)); // 60 segundos + 10 minutos
		Duration subtractedDuration = duration2.minus(Duration.ofSeconds(30)); // 2 minutos - 30 segundos
		System.out.println("Added Duration: " + addedDuration);
		System.out.println("Subtracted Duration: " + subtractedDuration);

		// Convertendo duração para outras unidades de tempo
		long seconds = duration3.getSeconds(); // duração em segundos
		long millis = duration3.toMillis(); // duração em milissegundos
		System.out.println("Duration3 em segundos: " + seconds);
		System.out.println("Duration3 em milissegundos: " + millis);

		// Comparando durações
		boolean isLonger = duration4.compareTo(duration3) > 0; // verifica se duration4 é maior que duration3
		System.out.println("Duration4 é maior que Duration3: " + isLonger);
	}
}

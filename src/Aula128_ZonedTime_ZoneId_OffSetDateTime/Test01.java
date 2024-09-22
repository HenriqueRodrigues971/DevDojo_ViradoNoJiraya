package Aula128_ZonedTime_ZoneId_OffSetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Test01 {
	public static void main(String[] args) {
		// ZonedDateTime: Representa uma data e hora com um fuso horário específico.
		// Obtendo a data e hora atuais no fuso horário padrão do sistema
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		System.out.println("ZonedDateTime atual: " + zonedDateTimeNow);

		// ZoneId: Representa uma região do fuso horário, como 'Asia/Tokyo'.
		// Obtendo a data e hora atuais em um fuso horário específico (Tóquio)
		ZoneId zoneIdTokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zonedDateTimeTokyo = ZonedDateTime.now(zoneIdTokyo);
		System.out.println("ZonedDateTime em Tokyo: " + zonedDateTimeTokyo);

		// Convertendo ZonedDateTime para OffsetDateTime
		// OffsetDateTime: Representa uma data e hora com um deslocamento de tempo
		// (offset) do UTC.
		OffsetDateTime offsetDateTime = zonedDateTimeNow.toOffsetDateTime();
		System.out.println("OffsetDateTime correspondente: " + offsetDateTime);

		// Criando um OffsetDateTime com um deslocamento específico
		// ZoneOffset: Representa um deslocamento de tempo em relação ao UTC, como
		// '-05:00'.
		ZoneOffset zoneOffset = ZoneOffset.of("-05:00");
		OffsetDateTime customOffsetDateTime = OffsetDateTime.now(zoneOffset);
		System.out.println("OffsetDateTime com offset -05:00: " + customOffsetDateTime);

		// Obtendo todos os fusos horários disponíveis
		System.out.println("Fusos horários disponíveis:");
		ZoneId.getAvailableZoneIds().stream().limit(10).forEach(System.out::println);
	}
}

package Aula121_ClassesUtilitarias_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class test01 {
	public static void main(String[] args) {
		// Obtendo a data e hora atuais
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + agora);

		// Criando uma data e hora específica
		LocalDateTime dataHoraEspecifica = LocalDateTime.of(2024, 4, 18, 15, 30);
		System.out.println("Data e hora específica: " + dataHoraEspecifica);

		// Acessando partes individuais da data e hora
		int ano = agora.getYear();
		int mes = agora.getMonthValue();
		int dia = agora.getDayOfMonth();
		int hora = agora.getHour();
		int minuto = agora.getMinute();
		int segundo = agora.getSecond();

		System.out.println("Ano: " + ano);
		System.out.println("Mês: " + mes);
		System.out.println("Dia: " + dia);
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);

		// Adicionando e subtraindo intervalos de tempo
		LocalDateTime futuro = agora.plusDays(7);
		LocalDateTime passado = agora.minusHours(3);

		System.out.println("Daqui a uma semana: " + futuro);
		System.out.println("Três horas atrás: " + passado);

		// Comparando datas
		LocalDateTime outraDataHora = LocalDateTime.of(2024, 5, 1, 12, 0);
		if (outraDataHora.isAfter(agora)) {
			System.out.println("A outra data ocorre após a data atual.");
		} else {
			System.out.println("A outra data ocorre antes ou no mesmo momento que a data atual.");
		}
		// Formatando a data e hora no formato brasileiro
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
		String dataHoraFormatada = agora.format(formatador);
		System.out.println("Data e hora formatadas (formato brasileiro): " + dataHoraFormatada);

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
}

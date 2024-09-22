package Aula129_DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Teste01 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		/* Passando uma sting para localdate */
		LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Uma String para LocalDate: " + parse1);

		/* LocalDateTime para String */
		LocalDateTime now = LocalDateTime.now();
		String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("Um LocalDateTime para String: " + s4);

		/* String para LocalDateTime */
		LocalDateTime parse2 = LocalDateTime.parse("2021-02-19T18:30:34.12");
		System.out.println("String paraa LocalDateTime: " + parse2);

		/* Passando um padrão de datas BR */
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatBR = LocalDate.now().format(formatterBR);
		System.out.println("Data formatada para BR: " + formatBR);

		/* Formato BR para LocalDate */
		LocalDate parseBR = LocalDate.parse("22/07/2023", formatterBR);
		System.out.println("Formato BR para LocalDate: " + parseBR);

		/* Passando um padrão de datas Germany */
		DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		String formatGR = LocalDate.now().format(formatterGR);
		System.out.println("Data formatada para GR: " + formatGR);
		LocalDate parseGR = LocalDate.parse("22.September.2024", formatterGR);
		System.out.println("Formate GR para LocalDate: " + parseGR);
	}
}

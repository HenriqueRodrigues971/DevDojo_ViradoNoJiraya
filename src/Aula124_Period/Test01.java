package Aula124_Period;

import java.time.LocalDate;
import java.time.Period;

public class Test01 {
	public static void main(String[] args) {
		// Criando períodos a partir de diferentes unidades de tempo
		Period period1 = Period.ofDays(10); // 10 dias
		Period period2 = Period.ofMonths(2); // 2 meses
		Period period3 = Period.ofYears(3); // 3 anos
		Period period4 = Period.of(1, 6, 15); // 1 ano, 6 meses e 15 dias

		System.out.println("Period1: " + period1);
		System.out.println("Period2: " + period2);
		System.out.println("Period3: " + period3);
		System.out.println("Period4: " + period4);

		// Criando período entre duas datas
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 5, 20);
		Period periodBetween = Period.between(startDate, endDate);
		System.out.println("Period Between: " + periodBetween);

		// Adicionando e subtraindo tempo
		LocalDate newDate1 = startDate.plus(period1); // Adiciona 10 dias à data inicial
		LocalDate newDate2 = endDate.minus(period2); // Subtrai 2 meses da data final
		System.out.println("New Date after adding Period1: " + newDate1);
		System.out.println("New Date after subtracting Period2: " + newDate2);

		// Convertendo período para outras unidades de tempo
		int years = periodBetween.getYears(); // quantidade de anos no período
		int months = periodBetween.getMonths(); // quantidade de meses no período
		int days = periodBetween.getDays(); // quantidade de dias no período
		System.out.println("Period Between em anos: " + years);
		System.out.println("Period Between em meses: " + months);
		System.out.println("Period Between em dias: " + days);

		// Comparando períodos
		boolean isLonger = period4.getYears() > period3.getYears(); // verifica se period4 tem mais anos que period3
		System.out.println("Period4 tem mais anos que Period3: " + isLonger);
	}
}

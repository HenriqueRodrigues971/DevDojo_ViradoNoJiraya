package Aula119_ClassesUtilitarias_LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class test01 {
	public static void main(String[] args) {
	
		
		System.out.println(Month.JANUARY.getValue());
		System.out.println("---Instanciando---");
		LocalDate date = LocalDate.of(2022,05,12);
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 10);
		System.out.println(date);
		System.out.println(date2);
		
		System.out.println("----Recebendo separadamente----");
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear());
		System.out.println(date.get(ChronoField.YEAR));
		System.out.println(date.get(ChronoField.DAY_OF_MONTH));
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		
		System.out.println("---Pegando data atual---");
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		hoje = hoje.plusWeeks(4);
		System.out.println(hoje);
	}
}

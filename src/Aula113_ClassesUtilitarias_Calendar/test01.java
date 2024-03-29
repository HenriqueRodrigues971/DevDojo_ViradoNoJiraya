package Aula113_ClassesUtilitarias_Calendar;

import java.util.Calendar;

public class test01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getWeekYear());
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domigo");
		}
		
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	
	/*Adicionando horas, dias e etc*/
	c.add(Calendar.DAY_OF_MONTH, 2);
	c.add(Calendar.HOUR, 2);
	
	System.out.println(c.getTime());
	}
}

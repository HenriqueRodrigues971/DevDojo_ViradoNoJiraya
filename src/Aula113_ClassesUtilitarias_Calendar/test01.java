package Aula113_ClassesUtilitarias_Calendar;

import java.util.Calendar;

public class test01 {
	public static void main(String[] args) {
		// Cria uma instância de Calendar com a data e hora atuais
		Calendar c = Calendar.getInstance();

		// Exibe a data e hora atuais
		System.out.println(c.getTime());

		// Exibe o primeiro dia da semana (depende da localidade, geralmente Domingo ou
		// Segunda)
		System.out.println(c.getFirstDayOfWeek());

		// Exibe o ano da semana, útil para calcular em anos com 53 semanas
		System.out.println(c.getWeekYear());

		// Verifica se o primeiro dia da semana é domingo
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingo");
		}

		// Exibe o dia da semana (1 = Domingo, 2 = Segunda, etc.)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		// Exibe o dia do mês
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		// Exibe o dia do ano (quantos dias já se passaram no ano)
		System.out.println(c.get(Calendar.DAY_OF_YEAR));

		// Exibe em qual semana do mês o dia atual está
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		/* Adicionando horas e dias ao calendário atual */

		// Adiciona 2 dias à data atual
		c.add(Calendar.DAY_OF_MONTH, 2);

		// Adiciona 2 horas à data e hora atual
		c.add(Calendar.HOUR, 2);

		// Exibe a nova data e hora após as adições
		System.out.println(c.getTime());
	}
}

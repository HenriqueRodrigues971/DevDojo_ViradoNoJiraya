package Aula117_ClassesUtilitarias_InternacionalizacaoDeMoedasComLocale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localPT = new Locale("pt", "BR");
		Locale localJP = Locale.JAPAN;
		Locale localIT = Locale.ITALY;

		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getCurrencyInstance();
		nfa[2] = NumberFormat.getCurrencyInstance(localJP);
		nfa[1] = NumberFormat.getCurrencyInstance(localPT);
		nfa[3] = NumberFormat.getCurrencyInstance(localIT);
		double valor = 10_000.2130;
		for (NumberFormat numberFormat : nfa) {
			numberFormat.setMaximumFractionDigits(1);
			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}

		String valorString = "1000,2130";
		try {
			NumberFormat formatoBrasil = NumberFormat.getNumberInstance(localPT);
			System.out.println(formatoBrasil.parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}

package Aula116_ClassesUtilitarias_InternacionalizacaoNumerosComLocale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localPT = new Locale("pt", "BR");
		Locale localJP = Locale.JAPAN;
		Locale localIT = Locale.ITALY;
		
		NumberFormat[] nfa = new NumberFormat[4];
	nfa[0] = NumberFormat.getInstance();
	nfa[2] = NumberFormat.getInstance(localJP);
	nfa[1] = NumberFormat.getInstance(localPT);
	nfa[3] = NumberFormat.getInstance(localIT);
	double valor = 10_000.2130;
	for(NumberFormat numberFormat : nfa) {
		System.out.println(numberFormat.getMaximumFractionDigits());
		System.out.println(numberFormat.format(valor));
	}
	}
}

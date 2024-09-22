package Aula116_ClassesUtilitarias_InternacionalizacaoNumerosComLocale;

import java.util.Locale;

public class localeTest02 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();

		for (String isoLanguage : isoLanguages) {
			System.out.print(isoLanguage + " ");
		}
		System.out.println();
		for (String isoCountry : isoCountries) {
			System.out.print(isoCountry + " ");
		}

	}
}

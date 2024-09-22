package Aula130_ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		 // Exibindo formato de data específico da localidade
        System.out.println("Formato de data: " + bundle.getString("date.format"));
    
	}
}

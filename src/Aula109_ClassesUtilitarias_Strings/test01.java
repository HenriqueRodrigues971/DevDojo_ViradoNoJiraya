package Aula109_ClassesUtilitarias_Strings;

public class test01 {
	public static void main(String[] args) {
      String nome = "Luffy";
      String nome2 = "          Asta       ";
      String numeros = "012345";
      System.out.println(nome.charAt(0));
      System.out.println(nome.length());
      System.out.println(nome.replace("f", "L"));
      System.out.println(nome.toLowerCase());
      System.out.println(nome.toUpperCase());
      System.out.println(numeros.substring(0,2));
      System.out.println(numeros.substring(3));
      System.out.println(nome2.trim());
	}
}

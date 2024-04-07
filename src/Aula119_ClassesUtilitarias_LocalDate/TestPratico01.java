package Aula119_ClassesUtilitarias_LocalDate;

import java.time.LocalDate;
import java.util.Scanner;

public class TestPratico01 {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Adicione um dia do mês:");
     int dia = scan.nextInt();
     System.out.println("Adicione o número de um mês do ano:");
     int mes = scan.nextInt();
     System.out.println("Adicione um ano:");
     int ano = scan.nextInt();
     
     LocalDate date = LocalDate.of(ano, mes, dia);
     System.out.println(date);
     
     LocalDate date2 = LocalDate.now();
    int anosDaPessoa = date2.getYear() - date.getYear();
    System.out.println("Sua idade é: "+anosDaPessoa); 
	}
}

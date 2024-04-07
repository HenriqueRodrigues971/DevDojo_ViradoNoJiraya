package Aula120_ClassesUtilitarias_LocalTime;

import java.time.LocalTime;
import java.util.Scanner;

public class TestPratico01 {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Selecione a hora: ");
     int hora = scan.nextInt();
     
     System.out.println("Minutos: ");
     int minuto = scan.nextInt();
     
     System.out.println("Segundos: ");
     int segundos = scan.nextInt();
     
     LocalTime time = LocalTime.of(hora, minuto,segundos);
	System.out.println(time);
	
	int time2 = time.getHour() - LocalTime.now().getHour() ;
	
	System.out.printf("Falta %s Horas para seu compromisso",time2);
	}
}

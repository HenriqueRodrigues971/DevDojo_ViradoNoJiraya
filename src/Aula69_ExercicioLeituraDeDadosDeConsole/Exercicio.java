package Aula69_ExercicioLeituraDeDadosDeConsole;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite sua pergunta e eu responderei sim ou não:");
       String pergunta = input.nextLine();
       if(pergunta.charAt(0) == ' ') {
    	   System.out.println("sim");
       }else {
    	   System.out.println("não");
       }
	}
}

package Aula137_Scanner;

import java.util.Scanner;

public class ScannerTest2 {
 public static void main(String[] args) {
	String texto = "Levi, Eren, Mikasa,true,200";
	Scanner scan = new Scanner(texto);
	scan.useDelimiter(",");
	while(scan.hasNext()) { // verifica se existe algo
		if(scan.hasNextInt()) {
			int i = scan.nextInt();
			System.out.println("Int: "+i);
		}else if(scan.hasNextBoolean()) {
			boolean b = scan.nextBoolean();
			System.out.println("boolean: "+b);
		}else {
			System.out.println(scan.next()); // imprime e pede para verificar o proximo
			
		}
	}
}
}
package Aula32ao35_Array;

public class AtiviadeSomaArray {
 public static void main(String[]args) {
	 int[] numeros = new int[] {1,2,3};
	 int soma = 0;
	 
	 for(int i : numeros) {
	  soma += i;
	 }
	 System.out.println(soma);
	 }
}

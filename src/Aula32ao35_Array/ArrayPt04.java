package Aula32ao35_Array;

public class ArrayPt04 {
	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] numeros2 = { 1, 2, 3 };
		int[] numeros3 = new int[] {1,2,3,4,5};
		
		for(int num : numeros2) {
			System.out.println(num);
		}
		for(int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		}
}

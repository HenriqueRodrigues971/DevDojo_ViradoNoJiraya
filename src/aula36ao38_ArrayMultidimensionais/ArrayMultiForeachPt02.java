package aula36ao38_ArrayMultidimensionais;

public class ArrayMultiForeachPt02 {
	public static void main(String[] args) {
      
		int[][] dias = new int[3][3];

		dias[0][0] = 31;
		dias[0][1] = 21;
		dias[0][2] = 18;

		dias[1][0] = 31;
		dias[1][1] = 21;
		dias[1][2] = 18;

		
		for(int[] arrBase: dias) {
			for(int num: arrBase) {
				System.out.println(num);
			}
			System.out.println("-------------------------------");
		}
		}
}

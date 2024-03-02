package aula36ao38_ArrayMultidimensionais;

public class ArraysMultiPt01 {
	public static void main(String[] args) {

		int[][] dias = new int[3][3];

		dias[0][0] = 31;
		dias[0][1] = 21;
		dias[0][2] = 18;

		dias[1][0] = 31;
		dias[1][1] = 21;
		dias[1][2] = 18;

		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[0].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
	}
}

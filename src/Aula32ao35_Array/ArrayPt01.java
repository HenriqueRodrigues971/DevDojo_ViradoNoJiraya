package Aula32ao35_Array;

public class ArrayPt01 {
	public static void main(String[] args) {
		int[] idades = new int[4];
		idades[0] = 19;
		idades[1] = 20;
		idades[2] = 17;
        idades[3] = 18;
        
        System.out.println("Metodo foreach");
		for (int i : idades) {
			System.out.println(i);
			if (i < 18) {
				System.out.println("Menor de idade");
				break;
			} else {
				System.out.println("tudo certo!");
			}
		}
		System.out.println("------------------");
		System.out.println("Usando for");
		for(int i =0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}
}

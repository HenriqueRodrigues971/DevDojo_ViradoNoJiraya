package Aula32ao35_Array;

public class AtividadeInversaoArray {
	public static void main(String[]args) {
	String[] palavras = {"Java", "é", "uma", "linguagem", "poderosa"};

    System.out.println("Array original:");
    for (String palavra : palavras) {
        System.out.print(palavra + " ");
    }

    // Inverter o array
    for (int i = 0; i < palavras.length / 2; i++) {
        String temp = palavras[i];
        palavras[i] = palavras[palavras.length - 1 - i];
        palavras[palavras.length - 1 - i] = temp;
    }

    System.out.println("\nArray invertido:");
    for (String palavra : palavras) {
        System.out.print(palavra + " ");
    }
}
}

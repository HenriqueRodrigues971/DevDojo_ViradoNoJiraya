package Aula169_Collections.SortingLists.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*O binary search nos retorn o valor da posição que esta o objecto que pesquisamos dentro do array*/
public class BinarySearchTest01 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(20);
		numeros.add(13);
		numeros.add(54);
		Collections.sort(numeros);
		System.out.println(Collections.binarySearch(numeros, 20));
	}
}

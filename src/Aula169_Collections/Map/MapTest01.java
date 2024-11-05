package Aula169_Collections.Map;

import java.util.HashMap;
import java.util.Map;

/*O metodo Map nos permite retornar um valor e partir da chave que passamos*/
public class MapTest01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "você");
		map.put("vc", "você2");/* caso adicionemos uma chave ja existente seu valor mude */
		map.putIfAbsent("vc", "você3");/* Só adiciona caso a chave não exista */
		System.out.println(map);
		System.out.println(map.get("teklado"));
		System.out.println("---Imprimindo as chaves----");
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-----Imprimindo os valores-----");
		for (String values : map.values()) {
			System.out.println(values);
		}

		System.out.println("----Um unico for que temos acesso a os 2 atributos----");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

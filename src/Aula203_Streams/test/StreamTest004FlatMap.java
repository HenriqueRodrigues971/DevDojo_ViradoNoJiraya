package Aula203_Streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest004FlatMap {
	public static void main(String[] args) {
		List<List<String>> devDojo = new ArrayList<>();
		List<String> grapichsDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
		List<String> developers = List.of("Willian", "David", "Harisson");
		List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

		devDojo.add(grapichsDesigners);
		devDojo.add(developers);
		devDojo.add(students);

		for (List<String> people : devDojo) {
			for (String person : people) {
				System.out.println(person);
			}
		}
		System.out.println("-------");
		devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

	}
}

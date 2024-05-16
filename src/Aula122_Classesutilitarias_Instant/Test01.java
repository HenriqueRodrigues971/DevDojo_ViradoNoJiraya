package Aula122_Classesutilitarias_Instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class Test01 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3,1000000000));
		System.out.println(Instant.ofEpochSecond(3,-1000000000));
	}
}

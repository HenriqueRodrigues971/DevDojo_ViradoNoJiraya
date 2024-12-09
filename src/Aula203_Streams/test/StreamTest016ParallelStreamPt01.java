package Aula203_Streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest016ParallelStreamPt01 {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long num = 10_000_000;
		sumFor(num);
		sumStreamIterate(num);
		sumParallelStreamIterate(num);
		sumParallelLongStreamIterate(num);
	}

	public static void sumFor(long num) {
		System.out.println("Sum for");
		long result = 0;
		long init = System.currentTimeMillis();
		for (long i = 1; i <= num; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}

	public static void sumStreamIterate(long num) {
		System.out.println("Sum Stram iterate");
		long init = System.currentTimeMillis();

		long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}

	public static void sumParallelStreamIterate(long num) {
		System.out.println("Sum Parallel Stream iterate");
		long init = System.currentTimeMillis();

		long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);

		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}

	public static void sumLongStreamIterate(long num) {
		System.out.println("Sum Long Stram iterate");
		long init = System.currentTimeMillis();

		long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}

	public static void sumParallelLongStreamIterate(long num) {
		System.out.println("Sum Stram iterate");
		long init = System.currentTimeMillis();

		long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
}

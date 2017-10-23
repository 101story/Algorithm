package jh.algorithm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class StreamSort {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted()
			.forEach(n->System.out.println(n));
		
		System.out.println();
		
	}

}

package jh.algorithm.java8;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("abc", "bcs", "bex", "zeb", "bcs");
		
		names.stream()
			.distinct()
			.forEach(n->System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n->n.startsWith("b"))
			.forEach(n->System.out.println(n));
		System.out.println();

		names.stream()
			.distinct()
			.filter(n->n.startsWith("b"))
			.forEach(n->System.out.println(n));
		System.out.println();
	}

}

package com.jin.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> programing =
				Arrays.asList("Javascript", "C", "C++", "Nodejs", "Java", "Oracle", "MariaDB", "PHP", "ASP");

		int count1 = 0;
		for (String str : programing) {
			if(str.indexOf("Java") > -1){
				count1 += 1;
			}
		}
		System.out.println("1-1.count1 = " + count1);
		
		long count2 = programing.stream()
						.filter(str->str.indexOf("java") > -1)
						.count();
		System.out.println("1-2.count2 = " + count2);
		
		long count3 = programing.parallelStream()
				.filter(str -> str.indexOf("Java") > -1)
				.count();
		System.out.println("1-3.count3 = " + count3);


		// 2.Stream 생성
		// 공백을 붙여서 하나의 스트링으로 만듬
		String contents = programing.stream()
									.collect(Collectors.joining(" "));

		// 공백별로 잘라서 String[]배열을 반환
		Stream<String> splitStr = Stream.of(contents.split(" ")); 
		System.out.print("\n2.splitStr :"); 
		splitStr.forEach(str -> System.out.print("[" + str + "]"));

		
		System.out.print("\n3-2.map(toUpperCase) :"); 
		programing.stream()
					.map(String::toUpperCase)
					.forEach(str -> System.out.print("[" + str + "]"));

		System.out.print("\n3-3.flatMap() :");
		programing.stream()
			.filter(str->str.length()==3)
			.flatMap(str->{
				List<String> result = new ArrayList<>();
				for(int i=0; i<str.length(); i++) {
					result.add(str.substring(i, i+1));
				}
				return result.stream();
			})
			.forEach(str->System.out.println("["+str+"]"));

	}

}

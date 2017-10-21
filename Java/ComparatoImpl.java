package com.jin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatoImpl {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			list.add((int) (Math.random() * 100 + 1));// 1부터 100까지의 정수중 10개를 랜덤으로 입력

		System.out.println("정렬전: ");
		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}

		System.out.println("\r\n");
		System.out.println("오름차순 정렬: ");

		Collections.sort(list); // Collictions.sort 메소드를 이용해 오름차순 정렬

		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}
		Collections.sort(list, new Comp());

		System.out.println("\r\n");

		System.out.println("내림차순 정렬: ");
		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}
	}
}

// Comparator 인터페이스를 구현
class Comp implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) { // compara 메소드를 오버라이드
		/*-- 역순정렬
		if(o1>o2) return -1;
		else if(o1<o2)return 1;
		else return 0;
		*/
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); // 위의 if 문을 조건삼항 연산자로 대체
	}
	/*
	 * equals를 구현하지 않으면 Object의 equals를 사용합니다. equals를 구현했을때 퍼포먼스가 향상된다는 말도 있습니다.
	 */
}
package jh.algorithm.java8;

/* ---------- comparator 인터페이스 구현을 이용한 TreeSet정렬 ---------------*/
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSort {
	public static void main(String[] args) {

		TreeSet<Integer> tree1 = new TreeSet<Integer>();

		for (int i = 0; i < 10; i++) {
			tree1.add((int) (Math.random() * 100 + 1));
		}
		System.out.println("오름차순 정렬: ");

		// TreeSet이나 TreeMap은 자동 정렬기능을 가지고 있습니다.
		// HashSet, TreeSet등은 중복을 허용하지 않습니다.

		for (Integer i : tree1) {
			System.out.print(i + " ");
		}

		TreeSet<Integer> tree2 = new TreeSet<Integer>(new Comp2()); 
		// 새로운 정렬기준으로 TreeSet을 생성
		for (int i = 0; i < 10; i++) {
			tree2.add((int) (Math.random() * 100 + 1));
		}

		System.out.println("\r\n");

		System.out.println("내림차순 정렬: ");
		for (Integer i : tree2) {
			System.out.print(i + " ");
		}
	}
}

// Comparator 인터페이스를 구현
class Comp2 implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) { // compara 메소드를 구현
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1);
	}
	// equals를 구현하지 않으면 Object의 equals를 사용합니다.
	// equals를 구현했을때 퍼포먼스가 향상된다는 말도 있습니다.
}
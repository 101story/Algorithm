package com.jin.algo;

/* ---------- comparator �������̽� ������ �̿��� TreeSet���� ---------------*/
import java.util.*;

public class TreeSetSort {
	public static void main(String[] args) {

		TreeSet<Integer> tree1 = new TreeSet<Integer>();

		for (int i = 0; i < 10; i++) {
			tree1.add((int) (Math.random() * 100 + 1));
		}
		System.out.println("�������� ����: ");

		// TreeSet�̳� TreeMap�� �ڵ� ���ı���� ������ �ֽ��ϴ�.
		// HashSet, TreeSet���� �ߺ��� ������� �ʽ��ϴ�.

		for (Integer i : tree1) {
			System.out.print(i + " ");
		}

		TreeSet<Integer> tree2 = new TreeSet<Integer>(new Comp2()); 
		// ���ο� ���ı������� TreeSet�� ����
		for (int i = 0; i < 10; i++) {
			tree2.add((int) (Math.random() * 100 + 1));
		}

		System.out.println("\r\n");

		System.out.println("�������� ����: ");
		for (Integer i : tree2) {
			System.out.print(i + " ");
		}
	}
}

// Comparator �������̽��� ����
class Comp2 implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) { // compara �޼ҵ带 ����
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1);
	}
	// equals�� �������� ������ Object�� equals�� ����մϴ�.
	// equals�� ���������� �����ս��� ���ȴٴ� ���� �ֽ��ϴ�.
}
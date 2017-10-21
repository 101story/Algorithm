package com.jin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatoImpl {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			list.add((int) (Math.random() * 100 + 1));// 1���� 100������ ������ 10���� �������� �Է�

		System.out.println("������: ");
		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}

		System.out.println("\r\n");
		System.out.println("�������� ����: ");

		Collections.sort(list); // Collictions.sort �޼ҵ带 �̿��� �������� ����

		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}
		Collections.sort(list, new Comp());

		System.out.println("\r\n");

		System.out.println("�������� ����: ");
		for (Object o : list) {
			Integer i = (Integer) o;
			System.out.print(i + " ");
		}
	}
}

// Comparator �������̽��� ����
class Comp implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) { // compara �޼ҵ带 �������̵�
		/*-- ��������
		if(o1>o2) return -1;
		else if(o1<o2)return 1;
		else return 0;
		*/
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); // ���� if ���� ���ǻ��� �����ڷ� ��ü
	}
	/*
	 * equals�� �������� ������ Object�� equals�� ����մϴ�. equals�� ���������� �����ս��� ���ȴٴ� ���� �ֽ��ϴ�.
	 */
}
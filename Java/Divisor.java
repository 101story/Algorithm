package com.jin.algo;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num=�Է¹޴°�, a=�����°�
		int num = 100;
		int a;

		for (a = 1; a <= num; a++) {
			if ((num % a) == 0) {
				System.out.println(a);
			}
		}
	}

}

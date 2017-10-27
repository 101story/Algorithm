package com.jin.algo;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num=입력받는값, a=나누는값
		int num = 100;
		int a;

		for (a = 1; a <= num; a++) {
			if ((num % a) == 0) {
				System.out.println(a);
			}
		}
	}

}

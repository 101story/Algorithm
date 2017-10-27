package com.jin.algo;

public class ChangeBinary {

	public static void main(String[] args) {
		// 10진수를 16진수로 출력: 가장 간단한 방법 ㅎㅎ
		System.out.format("%02X%n", 255); // FF
		System.out.format("%02x%n", 255); // ff
		System.out.format("%X%n", 10); // A

		String s = String.format("%02X%n", 10); // 16진수 문자열로 변환
		System.out.println("문자열로 만들어서 출력: " + s); // 문자열로 만들어서 출력: 0A

		// 10진수를 16진수로: 불편한 방법
		System.out.println(Integer.toHexString(255)); // ff
		System.out.println(Integer.toHexString(255).toUpperCase()); // 대문자로: FF
		System.out.println(Integer.toHexString(10).toUpperCase()); // A

		int i = 100;
		Integer.toBinaryString(i);
		// Java Integer 2진수,8진수,16진수

		// 2진수 변환 :
		System.out.println(Integer.toBinaryString(i));
		// 8진수 변환 :
		System.out.println(Integer.toOctalString(i));
		// 16진수 변환 :
		System.out.println(Integer.toHexString(i));

		// 문자열 2,8,16진수를 숫자로도 변환
		String string = "100";
		// 2진수 변환 :
		System.out.println(Integer.valueOf(string, 2));
		// 8진수 변환 :
		System.out.println(Integer.valueOf(string, 8));
		// 16진수 변환 :
		System.out.println(Integer.valueOf(string, 10));
	}

}

package com.jin.algo;

public class ChangeBinary {

	public static void main(String[] args) {
		// 10������ 16������ ���: ���� ������ ��� ����
		System.out.format("%02X%n", 255); // FF
		System.out.format("%02x%n", 255); // ff
		System.out.format("%X%n", 10); // A

		String s = String.format("%02X%n", 10); // 16���� ���ڿ��� ��ȯ
		System.out.println("���ڿ��� ���� ���: " + s); // ���ڿ��� ���� ���: 0A

		// 10������ 16������: ������ ���
		System.out.println(Integer.toHexString(255)); // ff
		System.out.println(Integer.toHexString(255).toUpperCase()); // �빮�ڷ�: FF
		System.out.println(Integer.toHexString(10).toUpperCase()); // A

		int i = 100;
		Integer.toBinaryString(i);
		// Java Integer 2����,8����,16����

		// 2���� ��ȯ :
		System.out.println(Integer.toBinaryString(i));
		// 8���� ��ȯ :
		System.out.println(Integer.toOctalString(i));
		// 16���� ��ȯ :
		System.out.println(Integer.toHexString(i));

		// ���ڿ� 2,8,16������ ���ڷε� ��ȯ
		String string = "100";
		// 2���� ��ȯ :
		System.out.println(Integer.valueOf(string, 2));
		// 8���� ��ȯ :
		System.out.println(Integer.valueOf(string, 8));
		// 16���� ��ȯ :
		System.out.println(Integer.valueOf(string, 10));
	}

}

package jh.algorithm.java8;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		
		int[] A = {1,2,4,5};
		
        Arrays.sort(A);
		System.out.println(A.length);
		for (int i = 1; i <= A.length+1; i++) {
			System.out.println(i);
			if(Arrays.binarySearch(A, i)<0) {
				System.out.println(Arrays.binarySearch(A, i));
			}
		}
		
	}

}

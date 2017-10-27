package com.jin.algo;

import java.util.*;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {3,8,1,2};
		int k = 3;
		
		LinkedList<Integer> mylist = new LinkedList<Integer>(); 
		for (int i = 0; i < A.length; i++) {
			mylist.add(A[i]);
		}
		
//		System.out.println(mylist);
//		System.out.println(mylist.pollLast());
//		System.out.println(mylist);
//		mylist.addFirst(2);
//		System.out.println(mylist);
		
		for (int j = 0; j < k; j++) {
			mylist.addFirst(mylist.pollLast());
		}
		System.out.println(mylist);
		int[] newL = mylist.stream().mapToInt(i->i).toArray();
		
		for(int n: newL) {
			System.out.println(n);
		}
	}

}

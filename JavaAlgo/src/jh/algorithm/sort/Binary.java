package jh.algorithm.sort;

public class Binary {
	
	public static void search(int[] arr, int target) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
 
        while (right >= left) {
            mid = (right + left) / 2;
 
            if (target == arr[mid]) {
                System.out.println(target + " is " + mid);
                break;
            }
 
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
 
        }
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3};
		Binary.search(a, 2);
		System.out.println(3);
	}

}

package array;

import java.util.Arrays;

public class MergeSortedArray {
	public void mergeSortedArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int cIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		for (int i = 0; i < c.length; i++) {
			if (a[aIndex] < b[bIndex]) {
				c[i] = a[aIndex++];
				System.out.println("Value: "+c[i]+ " Index:"+i);
				//System.out.println("Arr: " + a[i] + " " + b[i]);
			} else {
				c[i] = b[bIndex++];
				System.out.println("Value: "+c[i]+ " Index:"+i);
			}
		}
		System.out.println(Arrays.toString(c));
	}
	//prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 10, 11, 15 };
		int[] b = { 1, 5, 8, 12, 14, 19 };
		// int a[] = { 5, 8, 9};
		// int b[] = {4, 7, 8};
		MergeSortedArray obj = new MergeSortedArray();
		obj.mergeSortedArray(a, b);
	}

}

package array;

import java.util.Arrays;

public class SortArray {
	public int[] sortArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int cIndex = 0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			c[cIndex++] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[cIndex++] = b[j];
		}
		for (int k = 0; k < c.length; k++) {
			for (int l = k + 1; l < c.length; l++) {
				if (c[k] > c[l]) {
					temp = c[k];
					c[k] = c[l];
					c[l] = temp;
				}
			}
		}
		return c;
	}

	public static void main(String args[]) {
		int[] a = { 5, 2, 0, 9, 3 };
		int[] b = { 8, 4, 1, 7, 6, 6 };
		SortArray obj = new SortArray();
		int[] arr = obj.sortArray(a, b);
		System.out.println("Array 1: " + Arrays.toString(a));
		System.out.println("Array 2: " + Arrays.toString(b));
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}

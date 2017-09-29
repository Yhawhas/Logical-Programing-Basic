package array;

import java.util.Arrays;

public class SortedUnionArray {
	public static void main(String args[]) {
		int[] a = { 3, 6, 9 };
		int[] b = { 5, 7, 8 };
		int[] c = new int[a.length+b.length];
		int cIndex =0;
		for(int i=0;i<a.length;i++){
			c[cIndex]=a[i];
			c[++cIndex] = b[i];
			cIndex++;
			System.out.println(cIndex);
		}
		System.out.println("Array: "+Arrays.toString(c));
	}

}

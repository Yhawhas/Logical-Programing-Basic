package Array;

import java.util.Arrays;

public class OddNumberIndex {
	public int oddNumber(int[] a){
		int count = 0;
		for(int i=1; i<a.length; i++){
			if(a[i]%2 !=0){
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		int[] arr={0,1,2,3,4,6,8,9};
		OddNumberIndex obj = new OddNumberIndex();
		int n =obj.oddNumber(arr);
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Number of Odd numbers at Odd Index: "+n);
	}

}

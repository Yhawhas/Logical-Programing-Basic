package array;

import java.util.Arrays;

public class UnionArray {
	public static void main(String args[]) {
		int[] a = { 3, 6, 9, 9 };
		int[] b = { 3, 5, 7, 8, 9, 10 };
		int[] c = new int[a.length+b.length];
		int cIndex = 0;
		boolean flag = true;
		//add a array value
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (a[i] == c[j]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (!flag) {
				c[cIndex++] = a[i];
			}
		}
		//add b array value
		for(int i=0;i<b.length;i++){
			for(int j=0; j<c.length;j++){
				if(b[i] == c[j]){
					flag=true;
					break;
				}else{
					flag=false;
				}
			}
			if(!flag){
				c[cIndex++] = b[i];
			}
		}
		//To eliminate default initialized '0' value in c array
		int d[] = new int[cIndex];
		for(int i=0;i<cIndex; i++){
			if(i == cIndex-1){
				d[i]=c[i];
				break;
			}
			d[i]=c[i];
		}
		Arrays.sort(d);
		System.out.println("Array A: " + Arrays.toString(a));
		System.out.println("Array B: " + Arrays.toString(b));
		System.out.println("Union Array: "+ Arrays.toString(d));
	}
}

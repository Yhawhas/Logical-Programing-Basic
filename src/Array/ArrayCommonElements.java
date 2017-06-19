package Array;

public class ArrayCommonElements {
	public static void main (String args[]){
		System.out.println("Common elements in two Arrays!!!");
		
		int[] a ={0,1,2,3,4,5,6};
		int[] b ={6,5,7,9,2,1,4};
		int[] c =new int[5];
		int cIndex=0;
		System.out.print("Array a: {");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.print("Array b: {");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+", ");
		}
		System.out.println("}");
		for(int j=0; j<a.length; j++ ){
			for(int k=0; k<b.length; k++){
				if(a[j] == b[k]){
					c[cIndex++]= a[j];
				}
			}
		}
		System.out.print("Array common elements of a&b: {");
		for(int i=0; i<c.length; i++){
			if(i == c.length-1){
				System.out.print(c[i]); 
				break;
			}
			System.out.print(c[i]+", ");
		}
		System.out.println("}");
	}
}

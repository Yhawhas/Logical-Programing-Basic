package array;

public class ArrayCommonElements {
	int cIndex;

	public int[] commonElements(int[] a, int[] b) {
		int[] c;
		cIndex = 0;
		if (a.length < b.length) {
			c = new int[a.length];
		} else {
			c = new int[b.length];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[cIndex++] = a[i];
				}
			}
		}
		// Copy common elements to new array to avoid default initialize '0'
		int[] d = new int[cIndex];
		for (int i = 0; i < d.length; i++) {
			d[i] = c[i];
		}

		return d;
	}

	public int[] sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public String printArray(int[] arr, int length) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				sb.append(arr[i]);
				break;
			}
			sb.append(arr[i] + ", ");
		}
		sb.append("}");
		return sb.toString();
	}

	public static void main(String args[]) {
		int[] a = { 5, 1, 6, 3, 0, 2, 4 };
		int[] b = { 6, 5, 7, 9, 2, 1, 4 };
		ArrayCommonElements obj = new ArrayCommonElements();
		int[] arr = obj.commonElements(a, b);
		int[] sortArr = obj.sortArray(arr);
		System.out.println("Array A: " + obj.printArray(a, a.length));
		System.out.println("Array B: " + obj.printArray(b, b.length));
		System.out.println("Common Elements in Array A&B: " + obj.printArray(sortArr, obj.cIndex));
	}

}

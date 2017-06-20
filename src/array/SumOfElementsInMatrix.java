package array;

public class SumOfElementsInMatrix {

	public int matrixSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		int[][] a = new int[3][3];
		int row1 = 1;
		int row2 = -4;
		int row3 = 7;

		// Initialize array
		for (int j = 0; j < a[0].length; j++) {
			a[0][j] = row1++;
		}
		for (int j = 0; j < a[1].length; j++) {
			a[1][j] = row2--;
		}
		for (int j = 0; j < a[2].length; j++) {
			a[2][j] = row3++;
		}

		// Print Array Values
		System.out.println("Matrix: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		SumOfElementsInMatrix obj = new SumOfElementsInMatrix();
		int sum = obj.matrixSum(a);
		System.out.println("Sum of elements in Matrix: " + sum);
	}
}

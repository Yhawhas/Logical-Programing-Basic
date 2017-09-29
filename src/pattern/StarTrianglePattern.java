package pattern;

public class StarTrianglePattern {
	public void printPattern(int starCount) {
		int space = starCount;
		for (int i = 0; i < starCount; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int star= 6;
		StarTrianglePattern obj = new StarTrianglePattern();
		obj.printPattern(star);
	}

}

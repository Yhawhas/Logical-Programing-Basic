package pattern;

public class NumberPattern {
	public void numberPattern(int number) {
		int maxNumber = number;
		for (int i = 0; i < number; i++) {
			int iterateNumber = (number + (number - 1)) - (2 * i);
			int printNumber = 1;
			for (int j = 1; j <= iterateNumber; j++) {
				if (j >= maxNumber) {
					System.out.print(printNumber--);
				} else
					System.out.print(printNumber++);
			}
			maxNumber--;
			System.out.println();
			for (int k = 0; k < i+1; k++) {
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		int number = 4;
		NumberPattern obj = new NumberPattern();
		obj.numberPattern(number);
	}

}

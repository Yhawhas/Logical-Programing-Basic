package array;

import java.util.Arrays;

public class RemoveRepeatedNumber {
	public void removeRepeatedNumber(int[] inp) {
		System.out.print("Non-Repeated Numbers: [");
		for (int i = 0; i < inp.length; i++) {
			int num = inp[i];
			int length = String.valueOf(num).length();
			if (length <= 1) {
				System.out.print(num);
			} else if (length == 2) {
				int secondNumber = num % 10;
				int firstNumber = (num - secondNumber) / 10;
				if (firstNumber == secondNumber) {
					continue;
				} else {
					System.out.print(num);
				}
			} else {
				int thirdNumber = num % 10;
				int secondNumber = ((num - thirdNumber) / 10) % 10;
				int firstNumber = (((num - thirdNumber) / 10) - secondNumber) / 10;
				if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
					continue;
				} else {
					System.out.print(num);
				}
			}
			if (i == inp.length - 1) {
				System.out.print("]");
				break;
			}
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 22, 45, 999, 121, 122, 123, 112, 126, 127 };
		System.out.println("Input: "+Arrays.toString(input));
		RemoveRepeatedNumber obj = new RemoveRepeatedNumber();
		obj.removeRepeatedNumber(input);
	}

}

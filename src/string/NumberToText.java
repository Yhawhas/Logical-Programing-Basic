package string;

public class NumberToText {
	String numberToText(int number) {
		int length = String.valueOf(number).length();
		String str = "";
		int onesNum = number % 10;
		int tensNum = ((number - onesNum) / 10) % 10;
		int hundreds = ((((number - onesNum) / 10) - tensNum) / 10) % 10;
		int thousands = ((((((number - onesNum) / 10) - tensNum) / 10) - hundreds) / 10) % 10;
		int tenThousands = (((((((number - onesNum) / 10) - tensNum) / 10) - hundreds) / 10) - thousands) / 10;
		switch (length) {
		case 1:
			// One Digit Text Generation
			str = ones(number);
			break;
		case 2:
			// Two Digits Text Generation
			if (onesNum == 0) {
				str = tens(tensNum);
			} else if (tensNum == 1) {
				str = elevens(tensNum, onesNum);
			} else {
				str = tens(tensNum) + ones(onesNum);
			}
			break;
		case 3:
			// Three Digits Text Generation
			if (tensNum == 0 && onesNum == 0)
				str = ones(hundreds) + " Hundred";
			else if (tensNum == 1)
				str = ones(hundreds) + " Hundred and " + elevens(tensNum, onesNum);
			else if (onesNum == 0)
				str = ones(hundreds) + " Hundred and " + tens(tensNum);
			else
				str = ones(hundreds) + " Hundred and " + tens(tensNum) + ones(onesNum);
			break;
		case 4:
			// Four Digits Text Generation
			if (hundreds == 0 && tensNum == 0 && onesNum == 0)
				str= ones(thousands) + " Thousand";
			else if(tensNum == 0 && onesNum == 0)
				str = ones(thousands)+ " Thousand "+ ones(hundreds) +" Hundred";
			else if (tensNum == 1)
				str =ones(thousands)+" Thousand " + ones(hundreds) + " Hundred and " + elevens(tensNum, onesNum);
			else if (onesNum == 0)
				str =ones(thousands)+" " + ones(hundreds) + " Hundred and " + tens(tensNum);
			else
				str =ones(thousands) + " Thousand "+ ones(hundreds) +" Hundred and " + tens(tensNum) + ones(onesNum);
			break;
		case 5:
			// Five Digits Text Generation			
			if (thousands == 0 && hundreds == 0 && tensNum == 0 && onesNum == 0)
				str= tens(tenThousands) + " Thousand";
			else if(tensNum == 0 && onesNum == 0)
				str =tens(tenThousands)+ " "+ones(thousands)+ " Thousand "+ ones(hundreds) +" Hundred";
			else if(tenThousands == 1  && tensNum ==1)
				str = elevens(tenThousands, thousands)+ " Thousand "+ ones(hundreds) + " Hundred and "+elevens(tensNum, onesNum);
			else if(tenThousands == 1)
				str = elevens(tenThousands, thousands)+ " Thousand "+ ones(hundreds) + " Hundred and "+tens(tensNum) + " "+ ones(onesNum);
			else
				str= tens(tenThousands)+ " "+ ones(thousands)+ " Thousand "+ ones(hundreds)+ " Hundred "+ tens(tensNum) +" "+ ones(onesNum);
			break;
		default:
			str = "Invalid Number";
			
		}
		return str;
	}

	String ones(int num) {
		String str = "";
		switch (num) {
		case 0:
			str = "zero";
			break;
		case 1:
			str = "one";
			break;
		case 2:
			str = "two";
			break;
		case 3:
			str = "three";
			break;
		case 4:
			str = "four";
			break;
		case 5:
			str = "five";
			break;
		case 6:
			str = "six";
			break;
		case 7:
			str = "seven";
			break;
		case 8:
			str = "eight";
			break;
		case 9:
			str = "nine";
			break;
		default:
			str = "NaN";
		}
		return str;
	}

	String tens(int num) {
		String str = "";
		switch (num) {
		case 0:
			str = "";
			break;
		case 1:
			str = "ten";
			break;
		case 2:
			str = "twenty";
			break;
		case 3:
			str = "thrity";
			break;
		case 4:
			str = "fourty";
			break;
		case 5:
			str = "fifty";
			break;
		case 6:
			str = "sixty";
			break;
		case 7:
			str = "seventy";
			break;
		case 8:
			str = "eighty";
			break;
		case 9:
			str = "ninty";
			break;
		default:
			str = "NaN";
		}
		return str;
	}

	String elevens(int twos, int ones) {
		String str = "";
		int num = (twos * 10) + ones;
		switch (num) {
		case 10:
			str = "ten";
			break;
		case 11:
			str = "eleven";
			break;
		case 2:
			str = "twelve";
			break;
		case 3:
			str = "thriteen";
			break;
		case 4:
			str = "fourteen";
			break;
		case 5:
			str = "fifteen";
			break;
		case 6:
			str = "sixteen";
			break;
		case 7:
			str = "seventeen";
			break;
		case 8:
			str = "eighteen";
			break;
		case 9:
			str = "ninteen";
			break;
		default:
			str = "NaN";
		}
		return str;
	}

	public static void main(String args[]) {
		NumberToText obj = new NumberToText();
		int num = 11484;
		String text = obj.numberToText(num);
		System.out.println("Number: "+num);
		System.out.println("Text: "+text);
	}
}

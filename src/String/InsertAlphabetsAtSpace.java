package string;

public class InsertAlphabetsAtSpace {
	public String alphabetAtSpace(String str) {
		char alphabet = 'a';
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				charArray[i] = alphabet;
				if (alphabet == 'z') {
					alphabet = 'a';
					continue;
				}
				alphabet++;
			}
		}
		return new String(charArray);
	}

	public static void main(String args[]) {
		String strSeq = "a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f ";
		InsertAlphabetsAtSpace obj = new InsertAlphabetsAtSpace();
		String str = obj.alphabetAtSpace(strSeq);
		System.out.println("Old String: " + strSeq);
		System.out.println("New String: " + str);
	}
}

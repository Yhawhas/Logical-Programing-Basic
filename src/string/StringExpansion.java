package string;

public class StringExpansion {
	public void expand(String str) {
		for (int i = 0; i < str.length(); i = i + 2) {
			int printLength = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 0; j < printLength; j++) {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		String str = "a2b3c4g7";
		StringExpansion obj = new StringExpansion();
		obj.expand(str);
	}
}

package string;

public class StringCompression {
	void compress(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				System.out.print(str.charAt(i) + "1");
				return;
			}
			while (str.charAt(i) == str.charAt(i + 1)) {
				if (i == str.length() - 2) {
					if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i + 1)) {
						count++;
						System.out.print(str.charAt(i) + "" + count);
						return;
					} else if (str.charAt(i) != str.charAt(i - 1) && str.charAt(i) == str.charAt(i + 1)) {
						System.out.print(str.charAt(i) + "2");
						return;
					}
				}
				count++;
				i++;
			}
			System.out.print(str.charAt(i) + "" + count);
			count = 1;
		}
	}

	public static void main(String args[]) {
		StringCompression obj = new StringCompression();
		String stra = "aabbbccdeeeeeef";
		obj.compress(stra);
	}
}

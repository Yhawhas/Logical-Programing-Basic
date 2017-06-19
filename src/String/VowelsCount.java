package String;

public class VowelsCount {
	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else
			return false;
	}

	public int nonConsecutive(String str) {
		String s = str.toLowerCase();
		int count = 0;
		int firstIndex = 0;
		int lastIndex = str.length() - 1;
		for (int i = 0; i < s.length(); i++) {

			if (isVowel(s.charAt(i))) {
				if (i == firstIndex) {
					if (isVowel(s.charAt(i + 1))) {
						continue;
					}
				} else if (i == lastIndex) {
					if (isVowel(s.charAt(i - 1))) {
						continue;
					} else {
						count++;
						continue;
					}
				} else if (isVowel(s.charAt(i + 1)) || isVowel(s.charAt(i - 1))) {
					continue;
				}
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		String str = "eWelcome Good Moriniing aeiou";
		VowelsCount obj = new VowelsCount();
		int vowelCount = obj.nonConsecutive(str);
		System.out.println("String: \""+str+ "\"");
		System.out.println("No. Of Non Consecutive Vowel: " + vowelCount);
	}

}

package String;

public class VowelsCount {
	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else
			return false;
	}
	
	public int nonConsecutive(String str){
		String s = str.toLowerCase();
		int count = 0;
		int firstIndex = 0;
		int lastIndex = str.length()-1;
		for(int i=0; i<s.length(); i++){
			
			if(isVowel(s.charAt(i))){
				
				if(i == firstIndex){
					if(isVowel(s.charAt(i+1))){
						continue;
					}
				}
				else if(i == lastIndex){
					System.out.println(s.charAt(i)+ " i:" +i);
					if(isVowel(s.charAt(i-1))){
						continue;
					}else{
					count++;
					continue;
					}
				}
				else if(isVowel(s.charAt(i+1)) || isVowel(s.charAt(i-1))){
					System.out.println("check: "+isVowel(s.charAt(i-1)));
					System.out.println("aa: "+s.charAt(i));
					continue;
				}
				System.out.println(s.charAt(i)+ " i:" +i);
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		String str = "eWelcome Good Moriiniing aeiou";
		VowelsCount obj = new VowelsCount();
		int vowelCount =obj.nonConsecutive(str);
		System.out.println("Vowel: "+vowelCount);
	}
	
}


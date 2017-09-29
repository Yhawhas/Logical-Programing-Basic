package pattern;

public class AlphabetPattern {
	public void alphabetPattern(char lastCharacter){
		char firstCharacter ='A';
		
		int length = Character.getNumericValue(lastCharacter)-9;
		for(int i=0; i<length; i++){
			char printCharacter = firstCharacter;
			for(int j=0; j<i+1; j++){
				System.out.print(printCharacter++);
			}
			firstCharacter++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char lastCharacter = 'h';
		AlphabetPattern obj = new AlphabetPattern();
		obj.alphabetPattern(lastCharacter);
	}

}

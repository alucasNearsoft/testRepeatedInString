public class RepeatedInString {

	public static boolean repeatedChars(String theChain) {
		int indexInASCIIChecked = 0;
		int theChar = 0;
		for (int i = 0 ; i < theChain.length() ; i++ ) {
			theChar = theChain.charAt(i) - 'a';
			// Check the char in the index (mask) we're keeping the duplicates
			if (((1 << theChar) & indexInASCIIChecked) > 0) {
				return true;
			}
			indexInASCIIChecked |= theChar;
		}
		return false;
	}

	public static void main(String[] args) {
		String myCharsRepeated = "abcdefgh";
		System.out.println(myCharsRepeated);
		if (repeatedChars(myCharsRepeated)) {
			System.out.println("Such string above has repeated chars");
		}
		else {
			System.out.println("Such string above does not have repeated chars");
		}
	}

}

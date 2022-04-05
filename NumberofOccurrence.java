package week3.day1;

public class NumberofOccurrence {

	public static void main(String[] args) {
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char[] charArray = str.toCharArray();
		// get the length of the array
		int length = charArray.length;
		// traverse from 0 till the array length
		for (int i = 0; i < length; i++) {
			// Check the char array has the particular char in it
			if (charArray[i] == 'e') {
				// if is has increment the count
				count++;
			}
		}
		System.out.println(count);

	}

}

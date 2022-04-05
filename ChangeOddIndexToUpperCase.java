package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";

		char[] charArray = test.toCharArray();

		System.out.println(charArray);

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);

			}
		}

	}

}

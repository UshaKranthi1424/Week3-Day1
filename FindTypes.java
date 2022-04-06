package week3.day1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		char[] charArr = test.toCharArray();
		System.out.println(charArr);
		for (int i = 0; i < test.length(); i++) {

			if (Character.isLetter(charArr[i])) {
				letter++;
			} else if (Character.isDigit(charArr[i])) {
				num++;
			} else if (Character.isSpace(charArr[i])) {
				space++;
			} else {
				specialChar++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}
}

package week3.day1;

public class ReverseEvenWord {

	public static void main(String[] args) {

		String test = "I am a software tester";

		String[] revword = test.split(" ");

		for (int i = 0; i < revword.length; i++) {
			if (i % 2 == 1) {
				for (int j = revword[i].length() - 1; j >= 0; j--) {
					System.out.print(revword[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(revword[i] + " ");
			}
		}

	}

}

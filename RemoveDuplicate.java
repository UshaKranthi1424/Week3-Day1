package week3.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;
		String finalString = " ";
		String[] Array = text.split(" ");
		for (int i = 0; i < Array.length; i++) {

			System.out.println(Array[i]);
			for (int j = 0; j <= i; j++) {

				if (Array[i].equalsIgnoreCase(Array[j])) {
					count++;
				}
			}

			if (count > 1) {

				finalString = finalString + "     ";

			} else {
				finalString = finalString + Array[i] + " ";
			}

			count = 0;

		}

		System.out.println(finalString);
	}
}
